package Controllers;


import aaplication.Main;
import boundary.DataInitializable;
import aaplication.*;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


/**
 * The Class PagingController.
 *
 * @author Itay Ziv
 */
@SuppressWarnings("serial")
public class PagingController {

    /**
     * Load boundary.
     *
     * @param path the path
     */
    @SuppressWarnings("static-access")
    public void loadBoundary(String path) {
        FXMLLoader loader = new FXMLLoader();
        Pane root;
        try {
            root = loader.load(getClass().getResource(path));
            Scene scene = new Scene(root);
            Main.mainStage.setScene(scene);
            Main.mainStage.centerOnScreen();
            Main.mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Load boundary.
     *
     * @param path the path
     * @param obj  the obj
     */
    public void loadBoundary(String path, Object obj) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        Pane root;
        try {
            root = loader.load();
            DataInitializable boundary = loader.getController();
            boundary.initData(obj);
            Scene scene = new Scene(root);
            Main.mainStage.setScene(scene);
            Main.mainStage.centerOnScreen();
            Main.mainStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Pane loadBoundaryInPane(String path,Object obj) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        Pane root = null;
        try {
            root = loader.load();
            DataInitializable boubdary = loader.getController();
            boubdary.initData(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return root;
    }
    /**
     * Load additional stage.
     *
     * @param path the path
     * @return the stage
     */
    public Stage loadAdditionalStage(String path) {
        Stage stage = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Parent root;
            root = (Parent) loader.load();
            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stage;
    }

    /**
     * Load additional stage.
     *
     * @param path the path
     * @param data the data
     * @return the stage
     */
    public Stage loadAdditionalStage(String path, Object data) {
        Stage stage = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Parent root;
            root = (Parent)loader.load();
            stage = new Stage();
            stage.setScene(new Scene(root));
            DataInitializable boundary = loader.getController();
            stage.centerOnScreen();
            stage.show();
            boundary.initData(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stage;
    }

    /**
     * Load boundary in pane.
     *
     * @param path the path
     * @return the pane
     */
    public Pane loadBoundaryInPane(String path) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        Pane root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return root;
    }





}
