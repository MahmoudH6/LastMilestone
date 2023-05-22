package view;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;

public class StartGame {
    private Scene startGameScene ;

    public Scene getstartGameScene() {
        return startGameScene;
    }

    public StartGame(){
        Group root =new Group();
        startGameScene =new Scene(root,1800,900, Paint.valueOf("Bisque") );
    }
}
