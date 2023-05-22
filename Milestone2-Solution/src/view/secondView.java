package view;

import engine.Game;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import model.characters.Fighter;
import model.characters.Hero;
import model.characters.Medic;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

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
        secondView=new Scene(root,1000,600, Paint.valueOf("Bisque") );
        TilePane heroesPane = new TilePane() ;
        heroesPane.setHgap(10);
        heroesPane.setVgap(150);
        heroesPane.setLayoutY(200);
        root.getChildren().addAll(heroesPane);
        Game.loadHeroes("E:/CS 4/Milestone2-Solution/Milestone2-Solution/Heroes.csv");
        Button [] heroesButtons = new Button[Game.availableHeroes.size()] ;
        for (int i = 0 ; i< Game.availableHeroes.size() ; i++){
            Hero h = Game.availableHeroes.get(i) ;
            h.getName();
            h.getActionsAvailable() ;
            h.getAttackDmg() ;
            String type = (h instanceof Fighter)? "Fighter" :(h instanceof Medic)? "Medic" : "Explorer" ;
            Button heroSpecs = new Button("Name : " + h.getName() + "\n" +
                    "Type : " + type + "\n" +
                    "Actions available : " + h.getMaxActions() + "\n" +
                    "Attack Damage : "+ h.getAttackDmg()) ;
            heroesButtons[i] = heroSpecs ;
            heroesPane.getChildren().addAll(heroSpecs) ;
        }

        heroesButtons[0].addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
           Hero chosenHero = Game.availableHeroes.get(0) ;
            System.out.println(chosenHero.getMaxActions() + " " + chosenHero.getName() + " " + chosenHero.getMaxHp());
        });
        heroesButtons[1].addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
            Hero chosenHero = Game.availableHeroes.get(1) ;
            System.out.println(chosenHero.getMaxActions() + " " + chosenHero.getName() + " " + chosenHero.getMaxHp());
        });
        heroesButtons[2].addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
            Hero chosenHero = Game.availableHeroes.get(2) ;
            System.out.println(chosenHero.getMaxActions() + " " + chosenHero.getName() + " " + chosenHero.getMaxHp());
        });
        heroesButtons[3].addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
            Hero chosenHero = Game.availableHeroes.get(3) ;
            System.out.println(chosenHero.getMaxActions() + " " + chosenHero.getName() + " " + chosenHero.getMaxHp());
        });
        heroesButtons[4].addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
            Hero chosenHero = Game.availableHeroes.get(4) ;
            System.out.println(chosenHero.getMaxActions() + " " + chosenHero.getName() + " " + chosenHero.getMaxHp());
        });
        heroesButtons[5].addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
            Hero chosenHero = Game.availableHeroes.get(5) ;
            System.out.println(chosenHero.getMaxActions() + " " + chosenHero.getName() + " " + chosenHero.getMaxHp());
        });
        heroesButtons[6].addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
            Hero chosenHero = Game.availableHeroes.get(6) ;
            System.out.println(chosenHero.getMaxActions() + " " + chosenHero.getName() + " " + chosenHero.getMaxHp());
        });
        heroesButtons[7].addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent e) ->{
            Hero chosenHero = Game.availableHeroes.get(7) ;
            System.out.println(chosenHero.getMaxActions() + " " + chosenHero.getName() + " " + chosenHero.getMaxHp());
        });

    }

}

