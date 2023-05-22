package view;

import engine.Game;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.characters.Hero;
import java.io.IOException;

public class secondView {


    private  Scene secondView;


    public Scene getSecondView() {
        return secondView;
    }

    public secondView() throws IOException {
        Group root =new Group();
        Text t= new Text("PICK YOUR HERO");
        t.setFont(Font.font("Impact",40));
        t.setLayoutX(260);
        t.setLayoutY(70);
        root.getChildren().addAll(t);
        secondView=new Scene(root,800,600, Paint.valueOf("Bisque") );
        TilePane heroesPane = new TilePane() ;
        heroesPane.setHgap(10);
        heroesPane.setVgap(150);
        heroesPane.setLayoutY(200);
        root.getChildren().addAll(heroesPane);
        Game.loadHeroes("E:/CS 4/Milestone2-Solution/Milestone2-Solution/Heroes.csv");
        System.out.println(Game.heroes.size());
        for (int i = 0 ; i< Game.availableHeroes.size() ; i++){
            Hero h = Game.availableHeroes.get(i) ;
            h.getName();
            h.getActionsAvailable() ;
            h.getAttackDmg() ;
            Button heroSpecs = new Button("Name : " + h.getName() + "\n" +
                                        "Actions available : " + h.getMaxActions() + "\n" +
                                        "Attack Damage : "+ h.getAttackDmg()) ;

            heroesPane.getChildren().addAll(heroSpecs) ;
        }
    }

}
