package com.subhanrzayev.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView resultNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         number1 = findViewById(R.id.number1);
         number2 = findViewById(R.id.number2);
         resultNumber = findViewById(R.id.resultNumber);


    }

    public void sum(View view) {

        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultNumber.setText("Enter Number!");
        } else {
            int number1Text = Integer.parseInt(number1.getText().toString());
            int number2Text = Integer.parseInt(number2.getText().toString());

            int result = number1Text + number2Text;

            resultNumber.setText("Result :" + result);
        }


    }

    public void deduct(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultNumber.setText("Enter Number!");
        } else {
            int number1Text = Integer.parseInt(number1.getText().toString());
            int number2Text = Integer.parseInt(number2.getText().toString());

            int result = number1Text - number2Text;

            resultNumber.setText("Result :" + result);
        }
    }

    public void multiply(View view) {

        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultNumber.setText("Enter Number!");
        } else {
            int number1Text = Integer.parseInt(number1.getText().toString());
            int number2Text = Integer.parseInt(number2.getText().toString());

            int result = number1Text * number2Text;

            resultNumber.setText("Result :" + result);
        }

    }
    public void divide(View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultNumber.setText("Enter Number!");
        } else {
            int number1Text = Integer.parseInt(number1.getText().toString());
            int number2Text = Integer.parseInt(number2.getText().toString());

            int result = number1Text / number2Text;

            resultNumber.setText("Result :" + result);
        }
    }
}