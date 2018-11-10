package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private static Stage stage;
    public static Stage getStage() { return stage; }

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        //----------------------------------------SCENE-WELCOME----------------------------------
        //scene-welcome.fxml to scena przy wlaczeniu programu, odpowiednio rootWelcome
        Parent rootWelcome = FXMLLoader.load(getClass().getResource("scene-welcome.fxml"));
        stage.setScene(new Scene(rootWelcome));
        stage.setTitle("Snake");
        //mozna przesuwac i mozna zamknac okno (prawy gorny rog)
        stage.initStyle(StageStyle.UTILITY);
        stage.show();
        //----------------------------------------SCENE-GAME----------------------------------
            Apple apple = new Apple();
            Thread.sleep(1500);
            apple.generate();
            apple.draw();
            Thread.sleep(1500);
            apple.delete();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
