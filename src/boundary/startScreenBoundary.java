package boundary;

import Controllers.PagingController;
import Entities.ClientController;
import assets.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class startScreenBoundary implements DataInitializable {


    @FXML
    private Button viewPurchaseBtn;

    @FXML
    private Button CarInsBtn;

    @FXML
    private Button HealthInsBtn;

    @FXML
    private Button ApartmentInsBtn;

    @FXML
    private Button LifeInsBtn;

    @FXML
    private Label jsonLabel;

    @Override
    public void initData(Object data) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        jsonLabel.setText("Version "+ ClientController.createClientIfNotExist().configuration.getVersion() + "\nDesigned & Developed by:\n" + ClientController.createClientIfNotExist().configuration.getStudentName1() + " & " + ClientController.createClientIfNotExist().configuration.getStudentName2());

    }



    @FXML
    void carInsClicked(MouseEvent event) {
        PagingController pc = new PagingController();
        pc.loadBoundary(ProjectPages.CUSTOMER_DETAILS_PAGE.getPath(),insuranceType.CARINSURANCE_TYPE.getInsuranceTypeString());
    }

    @FXML
    void ApartmentInsClicked(MouseEvent event) {
        PagingController pc = new PagingController();
        pc.loadBoundary(ProjectPages.CUSTOMER_DETAILS_PAGE.getPath(),insuranceType.APARTMENTYPEINSURANCE_TYPE.getInsuranceTypeString());
    }

    @FXML
    void HealthInsClicked(MouseEvent event) {
        PagingController pc = new PagingController();
        pc.loadBoundary(ProjectPages.CUSTOMER_DETAILS_PAGE.getPath(),insuranceType.HEALTHINSURANCE_TYPE.getInsuranceTypeString());
    }

    @FXML
    void LifeInsClicked(MouseEvent event) {
        PagingController pc = new PagingController();
        pc.loadBoundary(ProjectPages.CUSTOMER_DETAILS_PAGE.getPath(),insuranceType.LIFEINSURANCE_TYPE.getInsuranceTypeString());
    }

    @FXML
    void ViewAllClicked(MouseEvent event) {
        PagingController pc = new PagingController();
        pc.loadBoundary(ProjectPages.VIEW_PURCHASES_PAGE.getPath(),insuranceType.LIFEINSURANCE_TYPE.getInsuranceTypeString());
    }


}
