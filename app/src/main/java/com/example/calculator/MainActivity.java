package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstval, secondval;
    TextView sol;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstval = findViewById(R.id.firstValue);
        secondval = findViewById(R.id.secondValue);
        sol = findViewById(R.id.ans);
    }

    public void add(View view) {
        String fstring = firstval.getText().toString();
        String sstring = secondval.getText().toString();
        if(fstring.isEmpty() || sstring.isEmpty())
            Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
        else {
            try {
                float fint = Float.parseFloat(fstring);
                float sint = Float.parseFloat(sstring);
                float sol_int = fint + sint;
                String sol_str = String.valueOf(sol_int);
                sol.setText(sol_str);
            }catch (Exception e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void sub(View view) {
        String fstring = firstval.getText().toString();
        String sstring = secondval.getText().toString();
        if(fstring.isEmpty() || sstring.isEmpty())
            Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
        else {
            try {
                float fint = Float.parseFloat(fstring);
                float sint = Float.parseFloat(sstring);
                float sol_int = fint - sint;
                String sol_str = String.valueOf(sol_int);
                sol.setText(sol_str);
            }catch (Exception e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void mul(View view) {
        String fstring = firstval.getText().toString();
        String sstring = secondval.getText().toString();
        if(fstring.isEmpty() || sstring.isEmpty())
            Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
        else {
            try {
                float fint = Float.parseFloat(fstring);
                float sint = Float.parseFloat(sstring);
                float sol_int = fint * sint;
                String sol_str = String.valueOf(sol_int);
                sol.setText(sol_str);
            }catch (Exception e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void div(View view) {
        String fstring = firstval.getText().toString();
        String sstring = secondval.getText().toString();
        if(fstring.isEmpty() || sstring.isEmpty())
            Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
        else {
            try {
                float fint = Float.parseFloat(fstring);
                float sint = Float.parseFloat(sstring);
                float sol_int = fint / sint;
                String sol_str = String.valueOf(sol_int);
                sol.setText(sol_str);
            }catch (Exception e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
            }
        }
    }
}