package GUI;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Field extends Rectangle {

    Rectangle goal;
    Rectangle player;
    Rectangle opponent;
    Line midField;

    public Field(Stage stage) {
        stage.setTitle("Hello World!");
        GridPane root = new GridPane();

        Scene scene = new Scene(root, 1000, 500);
        root.getChildren().add(new Rectangle(scene.getWidth(), scene.getHeight(), Color.BLACK));
        stage.setScene(scene);

        stage.show();
    }
}