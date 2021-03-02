package ru.geekbrains.gb;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomFrame {
    private final JPanel panel;

    public BottomFrame(JTextField inputField) {
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        DigitButtonListener buttonListener = new DigitButtonListener(inputField);
        EqualButtonListener equalListerner = new EqualButtonListener(inputField);
        //ScriptEngineButtonListener scriptEngineListerner = new ScriptEngineButtonListener(inputField);

        //===========
        JButton btnLeftBracket = new JButton("Calc");
        panel.add(btnLeftBracket);

        //===========
        JButton btnRightBracket = new JButton("ulator");
        panel.add(btnRightBracket);

        //===========
        JButton btnSQRT = new JButton("SQRT");
        btnSQRT.addActionListener(buttonListener);
        panel.add(btnSQRT);

        //===========
        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        panel.add(btnC);

        //===========
        JButton btn7 = new JButton("7");
        btn7.addActionListener(buttonListener);
        panel.add(btn7);

        //===========
        JButton btn8 = new JButton("8");
        btn8.addActionListener(buttonListener);
        panel.add(btn8);

        //===========
        JButton btn9 = new JButton("9");
        btn9.addActionListener(buttonListener);
        panel.add(btn9);

        //===========
        JButton btnDiv = new JButton("/");
        btnDiv.addActionListener(buttonListener);
        panel.add(btnDiv);

        //===========
        JButton btn4 = new JButton("4");
        btn4.addActionListener(buttonListener);
        panel.add(btn4);

        //===========
        JButton btn5 = new JButton("5");
        btn5.addActionListener(buttonListener);
        panel.add(btn5);

        //===========
        JButton btn6 = new JButton("6");
        btn6.addActionListener(buttonListener);
        panel.add(btn6);

        //===========
        JButton btnMul = new JButton("*");
        btnMul.addActionListener(buttonListener);
        panel.add(btnMul);

        //===========
        JButton btn1 = new JButton("1");
        btn1.addActionListener(buttonListener);
        panel.add(btn1);

        //===========
        JButton btn2 = new JButton("2");
        btn2.addActionListener(buttonListener);
        panel.add(btn2);

        //===========
        JButton btn3 = new JButton("3");
        btn3.addActionListener(buttonListener);
        panel.add(btn3);

        //===========
        JButton btnSub = new JButton("-");
        btnSub.addActionListener(buttonListener);
        panel.add(btnSub);

        //===========
        JButton btn0 = new JButton("0");
        btn0.addActionListener(buttonListener);
        panel.add(btn0);

        //===========
        JButton btnDec = new JButton(".");
        btnDec.addActionListener(buttonListener);
        panel.add(btnDec);

        //===========
        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(equalListerner);
        panel.add(btnEqual);

        //===========
        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(buttonListener);
        panel.add(btnAdd);

    }
        public JPanel getPanel () {
            return panel;
        }
    }

