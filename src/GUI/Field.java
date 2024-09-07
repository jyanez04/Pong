package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class Field extends Rectangle {

    Rectangle goal;
    Rectangle player;
    Rectangle opponent;
    Line midField;

    public Field(Stage stage) {
        stage.setTitle("Hello World!");
        GridPane root = new GridPane();

        Scene scene = new Scene(root, 1000, 500);
        scene.setFill(Color.BLACK);
        //root.getChildren().add(new Rectangle(scene.getWidth(), scene.getHeight(), Color.BLACK));
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        root.add(button1, 0, 0, 1, 2);
        root.add(button2, 1, 0, 1, 1);
        root.add(button3, 2, 1, 1, 2);
        root.setGridLinesVisible(true);
        stage.setScene(scene);

        stage.show();
    }
}