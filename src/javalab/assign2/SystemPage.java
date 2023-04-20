/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class SystemPage extends Stage {

    public SystemPage() throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("systemPage.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        this.setTitle("Currency Convertion System");
        this.setScene(scene);
        this.show();
    }

}
