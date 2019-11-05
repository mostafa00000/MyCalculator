package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public abstract class CalculatorButton extends Button{

    public static TextField field;

    public CalculatorButton(String txt){
        setText(txt);
        setMinHeight(30);
        setMinWidth(30);
        setVisible(true);
        setOnAction(event -> {
           doAction();
        });
    }

    public abstract void doAction();
    {



    }

}
