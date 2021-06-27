package boundary;

import Controllers.PagingController;
import Controllers.costumerDetailsController;
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


    private Insurance currInsurance;
    private costumerDetailsController myController = new costumerDetailsController(this);



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

    @FXML
    private Label jsonLabel;

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
        jsonLabel.setText("Version "+ ClientController.createClientIfNotExist().configuration.getVersion() + "\nDesigned & Developed by:\n" + ClientController.createClientIfNotExist().configuration.getStudentName1() + " & " + ClientController.createClientIfNotExist().configuration.getStudentName2());

    }

    @FXML
    private void saveClicked(MouseEvent event) {
        if(validateFields()){
            Insurance insurance = new Insurance.Builder().setName(fNametxt.getText()).setFamilyName(lNametxt.getText()).setDate(Datetxt.getValue().toString()).setRemarks(Remarkstxt.getText()).setType(insuranceTypeLabel.getText()).build();
            currInsurance = insurance;

            Toast.makeText(Main.mainStage,"Details has been successfully saved.",1000,1500, 1500, 250, 400);
            clearFields();
        }
        myController.setInsuranceIntoDB(currInsurance);


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

    public Insurance getCurrCustomer() {
        return currInsurance;
    }

    public void setCurrCustomer(Insurance currCustomer) {
        this.currInsurance = currCustomer;
    }


}
