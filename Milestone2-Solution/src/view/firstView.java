package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



import javax.print.attribute.standard.Media;
import java.io.File;
import java.io.IOException;

public class firstView extends Application {

    public static Stage window ;

    private secondView secondViewScene = new secondView();



    public firstView() throws Exception {
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        window = primaryStage ;
        Group root = new Group();
        Scene s = new Scene(root,1000,600);
        primaryStage.setScene(s);
        primaryStage.getIcons().add(new Image("view/icon.png"));
        primaryStage.setTitle("The Last Of Us - Legacy");
        ImageView imgview = new ImageView();
        Image img =new Image(getClass().getResourceAsStream("image22 (1).jpg"));
        imgview.setFitWidth(1000);
        imgview.setFitHeight(600);
        imgview.setImage(img);
        s.setFill(Color.BLACK);
        Button b1= new Button("START GAME");
        b1.setOnAction(e -> window.setScene(secondViewScene.getSecondView()));
        b1.setLayoutX(100);
        b1.setLayoutY(200);
        b1.setMinHeight(70);
        b1.setMinWidth(250);
        b1.setTextFill(Paint.valueOf("Black"));
        DropShadow shadow =new DropShadow(10,Color.BLACK);
        b1.setStyle("-fx-background-color: Maroon; ");
        b1.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent e) -> {
            b1.setEffect(shadow);
        });
        b1.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent e) -> {
            b1.setEffect(null);
        });
        b1.setFont(Font.font("Impact",20));
        Button b2= new Button("EXIT");
        b2.setLayoutX(100);
        b2.setLayoutY(300);
        b2.setMinHeight(70);
        b2.setMinWidth(250);
        b2.setStyle("-fx-background-color: Maroon; ");
        b2.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent e) -> {
            b2.setEffect(shadow);
        });
        b2.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent e) -> {
            b2.setEffect(null);
        });
        b2.setFont(Font.font("Impact",20));
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
            primaryStage.close();
        });
        b2.setTextFill(Paint.valueOf("Black"));



        root.getChildren().addAll(imgview,b1,b2);
        primaryStage.show();
    }

    public void stop() throws Exception {
    }
}
