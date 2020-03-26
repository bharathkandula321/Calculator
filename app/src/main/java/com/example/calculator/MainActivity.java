package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;
/*import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;*/

public class MainActivity extends AppCompatActivity {


    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button fourButton;
    Button fiveButton;
    Button sixButton;
    Button sevenButton;
    Button eightButton;
    Button nineButton;
    Button zeroButton;
    Button dotButton;
    Button clearButton;
    Button additionButton;
    Button subtractionButton;
    Button multiplicationButton;
    Button divisionButton;
    Button equalButton;
    TextView operatorAndOperandText;
    TextView resultText;

    String input = "";
    int minusCounter = 0;
    int dotCounter = 0;
    String result = "";
    String input1 = "";
    int resultCounter = 0;

    //int counter1,counter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();

        Log.d("Life-Cycle","onCreate");
    }

    public void initializeViews() {


        oneButton = (Button) this.findViewById(R.id.button_1);
        twoButton = (Button) this.findViewById(R.id.button_2);
        threeButton = (Button) this.findViewById(R.id.button_3);
        fourButton = (Button) this.findViewById(R.id.button_4);
        fiveButton = (Button) this.findViewById(R.id.button_5);
        sixButton = (Button) this.findViewById(R.id.button_6);
        sevenButton = (Button) this.findViewById(R.id.button_7);
        eightButton = (Button) this.findViewById(R.id.button_8);
        nineButton = (Button) this.findViewById(R.id.button_9);
        zeroButton = (Button) this.findViewById(R.id.button_zero);
        additionButton = (Button) this.findViewById(R.id.button_add);
        subtractionButton = (Button) this.findViewById(R.id.button_substract);
        multiplicationButton = (Button) this.findViewById(R.id.button_multiply);
        divisionButton = (Button) this.findViewById(R.id.button_division);
        equalButton = (Button) this.findViewById(R.id.button_equal);
        dotButton = (Button) this.findViewById(R.id.button_dot);
        clearButton = (Button) this.findViewById(R.id.button_clear);
        operatorAndOperandText = (TextView) this.findViewById(R.id.text_Operators_Operands);
        resultText = (TextView) this.findViewById(R.id.result);

    }

    public void setListeners() {

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = input + "1";
                operatorAndOperandText.setText(input);
                minusCounter = 0;
                dotCounter = 0;
                resultCounter = 0;

            }
        });


        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = input + "2";
                operatorAndOperandText.setText(input);
                minusCounter = 0;
                dotCounter = 0;
                resultCounter = 0;

            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = input + "3";
                operatorAndOperandText.setText(input);
                minusCounter = 0;
                dotCounter = 0;
                resultCounter = 0;
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = input + "4";
                operatorAndOperandText.setText(input);
                minusCounter = 0;
                dotCounter = 0;
                resultCounter = 0;
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = input + "5";
                operatorAndOperandText.setText(input);
                minusCounter = 0;
                dotCounter = 0;
                resultCounter = 0;
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = input + "6";
                operatorAndOperandText.setText(input);
                minusCounter = 0;
                dotCounter = 0;
                resultCounter = 0;
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = input + "8";
                operatorAndOperandText.setText(input);
                minusCounter = 0;
                dotCounter = 0;
                resultCounter = 0;
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fillUI("9");
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = input + "0";
                operatorAndOperandText.setText(input);
                minusCounter = 0;
                dotCounter = 0;
                resultCounter = 0;
            }
        });

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (resultCounter == 1) {

                    input = result;
                    resultCounter = 0;
                }

                if (dotCounter == 0) {

                    input = input + "+";
                    operatorAndOperandText.setText(input);
                    //dotCounter = 1;

                }
            }
        });

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (resultCounter == 1) {

                    input = result;
                    resultCounter = 0;
                }
                if (dotCounter == 0) {

                    if (minusCounter == 0) {

                        input = input + "-";
                        operatorAndOperandText.setText(input);
                        minusCounter = 1;
                        //dotCounter = 1;
                        //dotCounter = 0;
                    }
                }
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (resultCounter == 1) {

                    input = result;
                    resultCounter = 0;
                }

                if (dotCounter == 0) {

                    input = input + "*";
                    operatorAndOperandText.setText(input);
                    //dotCounter = 0;
                    //dotCounter = 1;
                }
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (resultCounter == 1) {

                    input = result;
                    resultCounter = 0;
                }
                if (dotCounter == 0) {

                    input = input + "/";
                    operatorAndOperandText.setText(input);
                    //dotCounter = 0;
                    //dotCounter = 1;
                }
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = "";
                resultText.setText("Result");
                operatorAndOperandText.setText("Input");
                dotCounter = 0;
                minusCounter = 0;
                resultCounter = 0;

            }
        });

        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dotCounter == 0) {

                    input = input + ".";
                    operatorAndOperandText.setText(input);
                    dotCounter = 1;
                }
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dotCounter == 0) {

                operation();
                //dotCounter = 0;
                }
            }
        });

    }

    private void fillUI(String buttonValue){
        input = input + buttonValue;
        operatorAndOperandText.setText(input);
        minusCounter = 0;
        dotCounter = 0;
        resultCounter = 0;
    }

    public void operation() throws NullPointerException {

        Checking check = new Checking();

        if (input.charAt(0) == '-')
        {
            input1 = input.substring(1);
        }
        else {
            input1 = input;
        }



        if (check.validation(input1)) {
            double result1 = 0;
            if (input.contains("+")) {
                result1 = performOperation("+");
            } else if (input.lastIndexOf('-') > 0) {
                result1 = performOperation("-");
            } else if (input.indexOf('*') != -1) {
                result1 = performOperation("*");
            } else if (input.indexOf('/') != -1) {
                result1 = performOperation("/");
            }

            resultText.setText(String.valueOf(result1));
            result = String.valueOf(result1);
            input = "";
            resultCounter = 1;
        }
        else {
            resultText.setText("Invalid Input");
            operatorAndOperandText.setText("");
            input = "";
        }
    }

    private double performOperation(String operator){
        switch (operator){
            case "+" :
                return Double.parseDouble(input.substring(0, input.indexOf(operator))) + Double.parseDouble(input.substring(input.indexOf(operator) + 1));
            case "-" :
                return Double.parseDouble(input.substring(0, input.indexOf(operator))) - Double.parseDouble(input.substring(input.indexOf(operator) + 1));
            case "*":
                return Double.parseDouble(input.substring(0, input.indexOf(operator))) * Double.parseDouble(input.substring(input.indexOf(operator) + 1));
            case "/" :
                return Double.parseDouble(input.substring(0, input.indexOf(operator))) / Double.parseDouble(input.substring(input.indexOf(operator) + 1));
        }
        return 0;
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Life-Cycle","onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        setListeners();
        Log.d("Life-Cycle","onResume");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("Life-Cycle","onPause");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d("Life-Cycle","onStop");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d("Life-Cycle","OnCreate");
    }

}
