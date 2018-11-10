package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Apple{
    private int x, y;
    Scene scena;
    Rectangle rectangle;

    public Apple(){}

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    //generator jablek
    public void generate(){
       Random random = new Random();
       this.setX(random.nextInt(30) * 20);
       this.setY(random.nextInt(30) * 20);
    }

    //rysowanie jablek
    public void draw(){
        Main main = new Main();
        Rectangle rectangle = new Rectangle(this.getX(),this.getY(),20,20);
        rectangle.setFill(new ImagePattern(new Image("sample/apple.png")));
        this.rectangle=rectangle;
        Group root = new Group(rectangle);
        Scene scene_game = new Scene(root,600,600);
        //po nacisnieciu przycisku start
        scena=scene_game;
        main.getStage().setScene(scene_game);
        main.getStage().show();
    }
    //usuwanie jablek
    public void delete(){
        Main main = new Main();
        rectangle.setFill(Color.WHITE);
        main.getStage().setScene(scena);
        main.getStage().show();
    }
}


