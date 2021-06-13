package boundary;

import Controllers.PagingController;
import Entities.Customer;
import assets.ProjectPages;
import assets.insuranceType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewPurchasesBoundary implements DataInitializable {


    @FXML
    private TableView<Customer> purchasesTable;

    @FXML
    private TableColumn<String, String> FnameCol;

    @FXML
    private TableColumn<String, String> LnameCol;

    @FXML
    private TableColumn<String, String> DateCol;

    @FXML
    private TableColumn<String, String> remarksCol;

    @FXML
    private Button backButton;

    @Override
    public void initData(Object data) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    void backBtn(MouseEvent event) {

        PagingController pc = new PagingController();
        pc.loadBoundary(ProjectPages.START_PAGE.getPath());

    }


}
