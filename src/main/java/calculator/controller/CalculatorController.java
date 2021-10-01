package calculator.controller;

import calculator.model.Calculate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CalculatorController {

    @FXML
    private TextField display;

    private String input = "";
    private boolean isResult = false;

    @FXML
    private void initialize() {
        drawOnDisplay(input);
    }

    @FXML
    public void numberPressed(ActionEvent event) {
        if(isResult){
            input = "";
            drawOnDisplay(input);
            isResult = false;
        }
        String value = ((Button)event.getSource()).getText();
        input = input.concat(value);
        drawOnDisplay(input);
    }

    @FXML
    public void operatorPressed(ActionEvent event) {
        isResult = false;
        String value = ((Button)event.getSource()).getText();
        input = input.concat(value);
        drawOnDisplay(input);
    }

    @FXML
    public void equalsPressed() {
        try {
            double result = Calculate.solve(input);
            input = Double.toString(result);
            drawOnDisplay(input);
            isResult = true;
        } catch (UnsupportedOperationException e) {
            input = "";
            drawOnDisplay("Szintaktikai hiba!");
        }
    }

    @FXML
    public void clearPressed() {
        input = "";
        drawOnDisplay(input);
    }

    @FXML
    public void backspacePressed() {
        input = display.getText();
        if (input.length() > 0)
            input =  input.substring(0, input.length() - 1);
        drawOnDisplay(input);
    }

    private void drawOnDisplay(String content){
        display.setText(content);
    }
}
