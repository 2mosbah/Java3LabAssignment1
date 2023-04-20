/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab.assign2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button login;
    @FXML
    private ImageView image;
    @FXML
    private Label invalidLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void txtUserNameHandle(ActionEvent event) {

    }

    @FXML
    private void txtPasswordHandle(ActionEvent event) {
    }

    @FXML
    private void loginHandle(ActionEvent event) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("mosbah")
                && txtPassword.getText().equalsIgnoreCase("123456")) {
            ViewManager.closeLoginPage();
            ViewManager.openSystemPage();
        } else {
            invalidLabel.setText("Invalid username or Password");
        }
    }

}
