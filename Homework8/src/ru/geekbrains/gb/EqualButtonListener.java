package ru.geekbrains.gb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EqualButtonListener implements ActionListener {
    private final JTextField inputField;

    public EqualButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] statement;
        String strNum1 = "";
        String strNum2 = "";
        String strTotal;
        if (inputField.getText().contains("+")) {
            statement = inputField.getText().split("\\+");

            strNum1 = statement[0];
            strNum2 = statement[1];

            strTotal = Double.toString(Double.parseDouble(strNum1) +
                    Double.parseDouble(strNum2));

            inputField.setText(strTotal);
        } else if (inputField.getText().contains("-")) {
            statement = inputField.getText().split("\\-");

            strNum1 = statement[0];
            strNum2 = statement[1];

            strTotal = Double.toString(Integer.parseInt(strNum1) -
                    Integer.parseInt(strNum2));

            inputField.setText(strTotal);
        } else if (inputField.getText().contains("/")) {
            statement = inputField.getText().split("\\/");

            strNum1 = statement[0];
            strNum2 = statement[1];

            strTotal = Double.toString(Double.parseDouble(strNum1) /
                    Double.parseDouble(strNum2));

            inputField.setText(strTotal);
        } else if (inputField.getText().contains("*")) {
            String s = inputField.getText();
            statement = inputField.getText().split("\\*");

            strNum1 = statement[0];
            strNum2 = statement[1];

            strTotal = Double.toString(Double.parseDouble(strNum1) *
                    Double.parseDouble(strNum2));

            inputField.setText(strTotal);
        } else if (inputField.getText().contains("SQRT")) {
            String s = inputField.getText();
            Pattern p = Pattern.compile("SQRT\\d+");
            Matcher mather = p.matcher(s);
            if (mather.find()) {
                String newMather = mather.group();
                s = newMather.replaceAll("[^0-9]+", "");
                double num = Double.parseDouble(s);
                num = Math.sqrt(num);
                inputField.setText(String.valueOf(num));

            }
        }
    }
}