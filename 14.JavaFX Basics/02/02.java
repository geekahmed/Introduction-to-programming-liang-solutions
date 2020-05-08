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
import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane pane = new GridPane();
        String[] imagesArray = new String[]{"o.gif", "x.gif", ""};
        for (int i = 0 ; i < 3; i++){
            for (int j = 0 ; j < 3 ; j++){
                pane.add(new ImageView(new Image("image/" + imagesArray[new Random().nextInt(3)])), i, j);
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 02");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

