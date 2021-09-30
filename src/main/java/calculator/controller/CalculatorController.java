package calculator.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CalculatorController {

    @FXML
    private TextField display;

    private long num1, currentValue;
    private String operator = "";


    @FXML
    private void initialize() {
        drawOnDisplay();
    }

    @FXML
    public void numberPressed(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        currentValue = currentValue * 10 + Long.parseLong(value);
        drawOnDisplay();
    }

    @FXML
    public void operatorPressed(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        operator = value;
        num1 = currentValue;
        currentValue = 0;
        drawOnDisplay();
    }

    public void equalsPressed(ActionEvent event) {
        //output.setText(String.valueOf(model.calculate(cuccok)));
        display.setText(num1 + operator + currentValue);
    }

    public void clearPressed(ActionEvent actionEvent) {
        num1 = 0;
        currentValue = 0;
        operator = "";
        display.setText("");
    }

    public void drawOnDisplay(){
        if(num1 == 0){
            display.setText(currentValue + "");
        } else {
            display.setText(num1 + operator + currentValue);
        }
    }
}
