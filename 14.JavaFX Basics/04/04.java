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
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.ArrayList;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setAlignment(Pos.CENTER);
        for (int i = 0 ; i < 5 ; i++){
            Label label = new Label();
            label.setText("Java");
            label.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 22));
            label.setTextFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
            label.setRotate(90);
            hBox.getChildren().add(label);
        }
        Scene scene = new Scene(hBox, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 04");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


