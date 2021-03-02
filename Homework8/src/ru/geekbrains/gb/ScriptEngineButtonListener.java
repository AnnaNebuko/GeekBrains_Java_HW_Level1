package ru.geekbrains.gb;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScriptEngineButtonListener implements ActionListener {
    private final JTextField inputField;

    public ScriptEngineButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        Object expResult = null;

        try {
            expResult = scriptEngine.eval(inputField.getText());
        } catch (ScriptException scriptException) {
            scriptException.printStackTrace();
        }
        inputField.setText(expResult.toString());
    }
}
