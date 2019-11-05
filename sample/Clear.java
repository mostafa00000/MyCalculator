package sample;

class ClearButton extends CalculatorButton {

    public ClearButton(String txt){
        super(txt);

    }

    @Override
    public void doAction() {


        field.deleteText(0, field.textProperty().get().length());



    }


}