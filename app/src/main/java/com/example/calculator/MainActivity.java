package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button calc;
private Button equals;
private EditText Field1, Field2, Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = findViewById(R.id.button1);
        equals = findViewById(R.id.button2);
        Field1 = findViewById(R.id.Field1);
        Field2 = findViewById(R.id.Field2);
        Result = findViewById(R.id.Result);
    }
    public void modechange(View view)
    {
        String operand = calc.getText().toString();
        if(operand.equals("+"))
        {
            calc.setText("-");
        }
        else if(operand.equals("-"))
        {
            calc.setText("*");
        }
        else if(operand.equals("*"))
        {
            calc.setText("/");
        }
        else if(operand.equals("/"))
        {
            calc.setText("+");
        }
    }
    public void calculate(View view)throws Exception
    {
        int res = 0;
        String val1 = Field1.getText().toString();
        int a = Integer.parseInt(val1);
        String val2 = Field2.getText().toString();
        int b = Integer.parseInt(val2);
        String calculate = calc.getText().toString();
        if (calculate.equals("+"))
        {
            res = a+b;
        }
        else if (calculate.equals("-"))
        {
            if(a>b)
                res = a-b;
            else
                res = b-a;
        }
        else if (calculate.equals("*"))
        {
            res = a*b;
        }
        else
        {
            if(b!=0)
                res = a/b;
            else
                Toast.makeText(this, "division by 0 not allowed", Toast.LENGTH_SHORT).show();
        }

         Result.setText(String.valueOf(res));
    }

}
