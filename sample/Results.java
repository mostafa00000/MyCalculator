package sample;

public class Results extends CalculatorButton {

    public Results(String txt) {
        super(txt);

    }

    @Override
    public void doAction() {


        if (field.textProperty().get().contains("+")) {

            String[] operator = field.textProperty().get().split("[+]");
            Double operator1 = Double.parseDouble(operator[0]);
            Double operator2 = Double.parseDouble(operator[1]);
            field.deleteText(0, field.textProperty().get().length());
            field.textProperty().set(field.textProperty().get() + (operator1 + operator2));
        }


        if (field.textProperty().get().contains("-")) {

            String[] operator = field.textProperty().get().split("[-]");
            Double operator1 = Double.parseDouble(operator[0]);
            Double operator2 = Double.parseDouble(operator[1]);
            field.deleteText(0, field.textProperty().get().length());
            field.textProperty().set(field.textProperty().get() + (operator1 - operator2));
        }


        if (field.textProperty().get().contains("*")) {

            String[] operator = field.textProperty().get().split("[*]");
            Double operator1 = Double.parseDouble(operator[0]);
            Double operator2 = Double.parseDouble(operator[1]);
            field.deleteText(0, field.textProperty().get().length());
            field.textProperty().set(field.textProperty().get() + (operator1 * operator2));
        }


        if (field.textProperty().get().contains("/")) {

            String[] operator = field.textProperty().get().split("[/]");
            Double operator1 = Double.parseDouble(operator[0]);
            Double operator2 = Double.parseDouble(operator[1]);
            field.deleteText(0, field.textProperty().get().length());
            field.textProperty().set(field.textProperty().get() + (operator1 / operator2));
        }


    }

}


