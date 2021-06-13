package Controllers;

import Entities.Configuration;
import Entities.JsonConfigurationInput;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class startScreenController {

    private static startScreenController singletoneInstance = null;
    public Configuration configuration;

    public File logger;

    public static startScreenController createObjectIfNotExist()
    {
        if (singletoneInstance == null)
            singletoneInstance = new startScreenController();
        return singletoneInstance;
    }

    private startScreenController()
    {
        //insuranceDao = new InsuranceDaoImpl();
        configuration = new Configuration(new JsonConfigurationInput(new File("").getAbsolutePath()+"/src/input.json"));

        try {
            createLogger();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createLogger() throws IOException
    {
        try
        {
            logger = new File("logger.txt");
            if (logger.createNewFile())
            {
                System.out.println("File created: " + logger.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        FileWriter fileWriter = new FileWriter(logger);
        fileWriter.write("Name\tFamily Name\tDate\t\tType\t\tRemarks\n");
        fileWriter.close();
    }



}
