package lk.ijse.dinermore.controller;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import lk.ijse.dinermore.main.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainLoginController implements Initializable {


    @FXML
    private VBox Vbox;


    private Parent fxml;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TranslateTransition t= new TranslateTransition(Duration.seconds(1),Vbox);
        t.setToX(Vbox.getLayoutX() * 25);
        t.play();
        t.setOnFinished((e)->{

            try {
                fxml= FXMLLoader.load(getClass().getResource("/lk/ijse/dinermore/view/cashier_login.fxml"));
                Vbox.getChildren().removeAll();
                Vbox.getChildren().setAll(fxml);
            } catch (IOException ex) {
                Logger.getLogger(MainLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
    }
    @FXML
    void adminlogin(ActionEvent event) {
        TranslateTransition t= new TranslateTransition(Duration.seconds(1),Vbox);
        t.setToX(18);
        t.play();
        t.setOnFinished((e)->{

            try {
                fxml= FXMLLoader.load(getClass().getResource("/lk/ijse/dinermore/view/admin_login.fxml"));
                Vbox.getChildren().removeAll();
                Vbox.getChildren().setAll(fxml);
            } catch (IOException ex) {
                Logger.getLogger(MainLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
    }

    @FXML
    void cashierlogin(ActionEvent event) {
        TranslateTransition t= new TranslateTransition(Duration.seconds(1),Vbox);
        t.setToX(Vbox.getLayoutX() * 25);
        t.play();
        t.setOnFinished((e)->{

            try {
                fxml= FXMLLoader.load(getClass().getResource("/lk/ijse/dinermore/view/cashier_login.fxml"));
                Vbox.getChildren().removeAll();
                Vbox.getChildren().setAll(fxml);
            } catch (IOException ex) {
                Logger.getLogger(MainLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
    }

    @FXML
    void btnclose(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnminimize(ActionEvent event) {
        Main.stage.setIconified(true);
    }


}
