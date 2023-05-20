package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class secondView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root =new Group();
        primaryStage.getIcons().add(new Image("view/icon.png"));
        primaryStage.setTitle("The Last Of Us - Legacy");
        Scene s=new Scene(root,800,600, Paint.valueOf("Bisque") );
        Text t= new Text("PICK YOUR HERO");
        t.setFont(Font.font("Impact",40));
        t.setLayoutX(260);
        t.setLayoutY(70);
        primaryStage.setScene(s);
        root.getChildren().addAll(t);
        primaryStage.show();
    }
}
