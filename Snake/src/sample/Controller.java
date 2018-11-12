package sample;

import javafx.event.ActionEvent;

public class Controller{

    //Nacisniecie przycisku exit
    public void btnExit(ActionEvent event){
        System.exit(0);
    }

    //Nacisniecie przycisku start
    public void btnStart(ActionEvent event) throws InterruptedException {
        Apple apple = new Apple();
        apple.generate();
        apple.draw();
        Thread.sleep(1500);
        apple.delete();
    }
}
