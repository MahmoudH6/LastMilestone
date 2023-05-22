package view;
import engine.Game;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class StartGame extends Exception{

    private Scene startGameScene ;

    public Scene getstartGameScene() {
        return startGameScene;
    }

    public StartGame(){
        Group root =new Group();
        startGameScene =new Scene(root,1800,900, Paint.valueOf("Bisque") );
    }
}
