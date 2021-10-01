package calculator.controller;

import calculator.Calculate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CalculatorController {

    @FXML
    private TextField display;

    private String input = "";
    private double result = 0.0;
    private boolean lastButtonWasOperator = true;

    @FXML
    private void initialize() {
        drawOnDisplay(input);
    }

    @FXML
    public void numberPressed(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        input = input.concat(value);
        lastButtonWasOperator = false;
        drawOnDisplay(input);
    }
    @FXML
    public void operatorPressed(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if(!lastButtonWasOperator){
            input =input.concat(value);
            lastButtonWasOperator = true;
        } else{
            System.out.println("Érvénytelen szintaxis!");
        }
        drawOnDisplay(input);
    }

    @FXML
    public void equalsPressed(ActionEvent event) {
        result = Calculate.solve(input);
        input = Double.toString(result);
        drawOnDisplay(input);
    }

    @FXML
    public void clearPressed(ActionEvent actionEvent) {
        input = "";
        drawOnDisplay(input);
    }

    private void drawOnDisplay(String content){
        display.setText(content);
    }
}
