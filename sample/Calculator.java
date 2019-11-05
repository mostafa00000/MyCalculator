package sample;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    public int SUM;


    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt0;
    Button btdot;
    Button btcal;
    Button btadd;
    Button btsub;
    Button btdiv;
    Button btmul;
    Button btcom;
    Button btclr;
    TextField screen;



    @Override
    public void start(Stage arg0) throws Exception {
        Group root = new Group();

        screen = new TextField();
        screen.setMinHeight(30);
        screen.setMinWidth(90);

        CalculatorButton.field = screen;
        screen.setEditable(false);

        bt1 = new NumberButton("1");
        bt2 = new NumberButton("2");
        bt3 = new NumberButton("3");
        bt4 = new NumberButton("4");
        bt5 = new NumberButton("5");
        bt6 = new NumberButton("6");
        bt7 = new NumberButton("7");
        bt8 = new NumberButton("8");
        bt9 = new NumberButton("9");
        bt0 = new NumberButton("0");
        btdot = new NumberButton(".");
        btadd = new NumberButton("+");
        btsub = new NumberButton("-");
        btmul = new NumberButton("*");
        btdiv = new NumberButton("/");

        btclr = new ClearButton("C");
        btcal = new Results("=");

        HBox row1 = new HBox(bt7,bt8,bt9,btadd,btdot);
        HBox row2 = new HBox(bt4,bt5,bt6,btsub);
        HBox row3 = new HBox(bt1,bt2,bt3,btmul);
        HBox row4 = new HBox(btcal,bt0,btclr,btdiv);
        GridPane gp = new GridPane();

        gp.add(screen,1,0);
        gp.add(row1,1,1);
        gp.add(row2,1,2);
        gp.add(row3,1,3);
        gp.add(row4,1,4);

        root.getChildren().addAll(gp);

        Scene scene = new Scene(root, 140, 140);
        arg0.setScene(scene);
        arg0.show();
        arg0.setResizable(false);
    }

    public static void main(String[] args)  {


        launch();
    }





    }



