package com.example.damnbigcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML public TextField display;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private DamnBigNumber a = DamnBigNumber.DBN_ZERO;
    private DamnBigNumber b = DamnBigNumber.DBN_ZERO;
    private char operation = '+';

    public void handleAddClick(ActionEvent actionEvent) {
        String displayNumStr = display.getText();
        a = new DamnBigNumber(displayNumStr);
        operation = '+';
    }

    public void handleEqualsClick(ActionEvent actionEvent) {
        String displayNumStr = display.getText();
        b = new DamnBigNumber(displayNumStr);

        switch (operation) {
            case '+':
                DamnBigNumber c = DamnBigNumbers.add(a, b);
                display.setText(c.getNumStr());
                break;
            case '-':

                break;
            case '*':

                break;
            case '/':

                break;
        }
    }

    public void handleDigitClick(ActionEvent actionEvent) {
        // System.out.println(actionEvent);
        Button source = (Button) actionEvent.getSource();
        String value = source.getText();
        int digit = Integer.parseInt(value);

        display.setText(display.getText()+value);
    }
}