/*
By: Ahmed Moustafa (a.k.a geekahmed)
Email: geekahmed1@gmail.com
linkedIn: https://www.linkedin.com/in/geekahmed
*/
package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox hBox = new HBox(5);
        ArrayList<Integer> cards = getCards();
        hBox.setPadding(new Insets(5, 5, 5, 5));
        for (int i = 0 ; i < 3 ; i++){
            hBox.getChildren().add(new ImageView(new Image("image/card/" + cards.get(i) + ".png")));
        }
        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 03");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    private ArrayList<Integer> getCards() {
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(i + 1);
        }
        java.util.Collections.shuffle(cards);
        return cards;
    }
}


