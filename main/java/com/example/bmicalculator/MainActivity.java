package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText height,weight;
    Button calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        calculate=(Button)findViewById(R.id.calc);
        result=(TextView)findViewById(R.id.res);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true); // <-- added
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightstr=height.getText().toString();
                String weightstr=weight.getText().toString();
                if (heightstr != null && weightstr != null && !(heightstr.equals("")) && !(weightstr.equals(""))) {
                    Float h=Float.parseFloat(heightstr);
                    Float w=Float.parseFloat(weightstr);
                    Float bmi=w/(h*h);
                    result.setText("Your BMI is "+bmi);

                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter the values of height and weight", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}