package boundary;

import Controllers.PagingController;
import Controllers.startScreenController;
import aaplication.Main;
import assets.*;
import Entities.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class costumerDetailsBoundary implements DataInitializable {


    private Customer currCustomer;
    private ArrayList<Customer> cosArray;
    public static startScreenController SsController;



    @FXML
    private Label insuranceTypeLabel;

    @FXML
    private Button saveBtn;

    @FXML
    private Button backBtn;

    @FXML
    private DatePicker Datetxt;

    @FXML
    private TextField Remarkstxt;

    @FXML
    private TextField lNametxt;

    @FXML
    private TextField fNametxt;

    @Override
    public void initData(Object data) {

        if(data instanceof String)
            switch ((String)data){
                case "Car insurance":
                    insuranceTypeLabel.setText("Car insurance");
                    break;
                case "Life insurance":
                    insuranceTypeLabel.setText("Life insurance");
                    break;
                case "Health insurance":
                    insuranceTypeLabel.setText("Health insurance");
                    break;
                case "Apartment insurance":
                    insuranceTypeLabel.setText("Apartment insurance");
                    break;
                default:
                    break;

            }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void saveClicked(MouseEvent event) {
        if(validateFields()){
            //TODO: here we have to build that objects with builder pattern
            Customer tempCustomer = new Customer().firstName(fNametxt.getText()).lastName(lNametxt.getText()).remarks(Remarkstxt.getText());
            insurance tempcosInsurance = new insurance(insuranceTypeLabel.getText(),Datetxt.getValue(),tempCustomer);
            tempCustomer.withInsurance(tempcosInsurance);
            currCustomer = tempCustomer;
            Toast.makeText(Main.mainStage,"Details has been successfully saved.",1000,1500, 1500, 250, 400);
            clearFields();
        }
        //TODO: Save costomer into DB.


    }
    private void clearFields(){
        fNametxt.clear();
        lNametxt.clear();
        Remarkstxt.clear();
    }
    private boolean validateFields(){

        if(lNametxt.getText().isEmpty() || fNametxt.getText().isEmpty() || Remarkstxt.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR, "one of the fields is empty." , ButtonType.OK);
            alert.showAndWait();
            return false;
        }
        return true;
    }

    @FXML
    void backClicked(MouseEvent event) {
        PagingController pc = new PagingController();
        pc.loadBoundary(ProjectPages.START_PAGE.getPath());
    }

    public Customer getCurrCustomer() {
        return currCustomer;
    }

    public void setCurrCustomer(Customer currCustomer) {
        this.currCustomer = currCustomer;
    }

    public ArrayList<Customer> getCosArray() {
        return cosArray;
    }

    public void setCosArray(ArrayList<Customer> cosArray) {
        this.cosArray = cosArray;
    }
}
