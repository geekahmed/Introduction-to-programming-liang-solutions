/*
By: Ahmed Moustafa (a.k.a geekahmed)
Email: geekahmed1@gmail.com
linkedIn: https://www.linkedin.com/in/geekahmed
*/
package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.ArrayList;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane pane = new GridPane();
        int count = 64 ;
        int sideLength = 50;
        for (int i = 0 ; i < 8 ; i++){
            count++;
            for (int j = 0 ; j < 8 ; j++){
                Rectangle r = new Rectangle(sideLength, sideLength, sideLength, sideLength);
                if (count % 2 == 0){
                    r.setFill(Color.WHITE);
                }
                pane.add(r, i, j);
                count++;

            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 06");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


