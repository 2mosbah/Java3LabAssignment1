/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.assign2;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class LoginPage extends Stage{

    public LoginPage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass()
                .getResource("login.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        this.setTitle("login Page");
        this.setScene(scene);
        this.show();
    }
}
