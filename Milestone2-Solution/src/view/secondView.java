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

public class secondView {


    private  Scene secondView;


    public Scene getSecondView() {
        return secondView;
    }

    public secondView(){
        Group root =new Group();
        Text t= new Text("PICK YOUR HERO");
        t.setFont(Font.font("Impact",40));
        t.setLayoutX(260);
        t.setLayoutY(70);
        root.getChildren().addAll(t);
        secondView=new Scene(root,800,600, Paint.valueOf("Bisque") );
    }

}
