package view;
import engine.Game;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class StartGame extends Component {

    private Scene startGameScene ;

    public Scene getstartGameScene() {
        return startGameScene;
    }

    public StartGame(){
        try {
            Game.loadHeroes("C:/Users/ISD/OneDrive/Desktop/Eng. Ali/LastMilestone/Milestone2-Solution/Heroes.csv");
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(this,"Error,There are no available Heroes");
            return;
        }
        Group root =new Group();
        startGameScene =new Scene(root,1800,900, Paint.valueOf("Bisque") );
    }
}
