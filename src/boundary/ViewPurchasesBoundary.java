package boundary;

import Controllers.PagingController;
import Controllers.ViewPurchasesContoller;
import Controllers.costumerDetailsController;
import Entities.ClientController;
import Entities.Configuration;
import Entities.Insurance;
import assets.ProjectPages;
import assets.insuranceType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewPurchasesBoundary implements DataInitializable {

    private ViewPurchasesContoller myController = new ViewPurchasesContoller(this);
    private ArrayList<Insurance> allInsurances = new ArrayList<>();
    @FXML
    private TableView<Insurance> purchasesTable;

    @FXML
    private TableColumn<Insurance, String> FnameCol;

    @FXML
    private TableColumn<Insurance, String> LnameCol;

    @FXML
    private TableColumn<Insurance, String> DateCol;

    @FXML
    private TableColumn<Insurance, String> remarksCol;

    @FXML
    private Label jsonLabel;

    @FXML
    private Button backButton;
    @Override
    public void initData(Object data) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        jsonLabel.setText("Version "+ ClientController.createClientIfNotExist().configuration.getVersion() + "\nDesigned & Developed by:\n" + ClientController.createClientIfNotExist().configuration.getStudentName1() + " & " + ClientController.createClientIfNotExist().configuration.getStudentName2());

        allInsurances = myController.getAllInsurancesFromDB();
        FnameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        LnameCol.setCellValueFactory(new PropertyValueFactory<>("familyName"));
        DateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        remarksCol.setCellValueFactory(new PropertyValueFactory<>("remarks"));
        ObservableList<Insurance> data = FXCollections.observableArrayList(allInsurances);
        purchasesTable.setItems(data);
        purchasesTable.refresh();

    }


    @FXML
    void backBtn(MouseEvent event) {

        PagingController pc = new PagingController();
        pc.loadBoundary(ProjectPages.START_PAGE.getPath());

    }


}
