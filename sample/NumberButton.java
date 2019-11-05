package sample;

public class NumberButton extends CalculatorButton {

    public NumberButton(String txt){
        super(txt);

    }

    @Override
    public void doAction() {
        field.textProperty().set(field.textProperty().get() + getText());
    }
}
