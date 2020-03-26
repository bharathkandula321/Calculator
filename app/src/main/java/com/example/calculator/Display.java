package com.example.calculator;
import java.util.*;

public class Display extends MainActivity {

    private String input1;

    void output(String input1) {
        //input1 = input;

        if (input1.indexOf('+') != -1) {

            resultText.setText(String.valueOf(Double.parseDouble(input1.substring(0, input1.indexOf("+"))) + Double.parseDouble(input1.substring(input1.indexOf("+")+1))));
            input = "";
            //operatorAndOperandText.setText(input);

        }
        else if (input1.indexOf('-') != -1) {

            resultText.setText(String.valueOf(Double.parseDouble(input1.substring(0, input1.indexOf("-"))) - Double.parseDouble(input1.substring(input1.indexOf("-")+1))));
            input = "";
            //operatorAndOperandText.setText(input);
        }
        else if (input1.indexOf('*') != -1) {



            resultText.setText(String.valueOf(Double.parseDouble(input1.substring(0, input1.indexOf("*"))) * Double.parseDouble(input1.substring(input1.indexOf("*")+1))));
            input = "";
            //operatorAndOperandText.setText(input);
        }
        else if (input1.indexOf('/') != -1) {

            resultText.setText(String.valueOf(Double.parseDouble(input1.substring(0, input1.indexOf("/"))) / Double.parseDouble(input1.substring(input1.indexOf("/")+1))));
            input = "";
            //operatorAndOperandText.setText(input);
        }

    }
}
