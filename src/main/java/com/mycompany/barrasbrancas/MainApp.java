package com.mycompany.barrasbrancas;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("Barras Brancas");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.getIcons().add(new Image("logoEsep.png")); 
    }

    
    public static void main(String[] args) {
        launch(args);
    }

}
