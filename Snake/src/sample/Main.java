package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //----------------------------------------SCENE-WELCOME----------------------------------
        //scene-welcome.fxml to scena przy wlaczeniu programu, odpowiednio rootWelcome
        Parent rootWelcome = FXMLLoader.load(getClass().getResource("scene-welcome.fxml"));

        primaryStage.setScene(new Scene(rootWelcome));
        primaryStage.setTitle("Snake");
        //mozna przesuwac i mozna zamknac okno (prawy gorny rog)
        primaryStage.initStyle(StageStyle.UTILITY);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
