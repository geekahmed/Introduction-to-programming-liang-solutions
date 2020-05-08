/*
By: Ahmed Moustafa (a.k.a geekahmed)
Email: geekahmed1@gmail.com
linkedIn: https://www.linkedin.com/in/geekahmed
*/
package sample;

import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane pane = new GridPane();
        pane.add(new ImageView(new Image("image/uk.gif")), 0, 0);
        pane.add(new ImageView(new Image("image/ca.gif")), 1, 0);
        pane.add(new ImageView(new Image("image/china.gif")), 0, 1);
        pane.add(new ImageView(new Image("image/us.gif")), 1, 1);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 01");
        primaryStage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

