package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    String amaliat="";
    TextView  input , output ;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnjam,btnmosavi,btnmenha,btntaqsim,btnclear,btnzarb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnjam = findViewById(R.id.btnjam);
        btnmosavi = findViewById(R.id.btnmosavi);
        btnmenha = findViewById(R.id.btnmenha);
        btntaqsim = findViewById(R.id.btntaqsim);
        btnclear = findViewById(R.id.btnclear);
        btnzarb = findViewById(R.id.btnzarb);
        input = findViewById(R.id.inputNumbers);
        output = findViewById(R.id.outputNumbers);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"0";
                input.setText(amaliat);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"1";
                input.setText(amaliat);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"2";
                input.setText(amaliat);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"3";
                input.setText(amaliat);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"4";
                input.setText(amaliat);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"5";
                input.setText(amaliat);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"6";
                input.setText(amaliat);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"7";
                input.setText(amaliat);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"8";
                input.setText(amaliat);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"9";
                input.setText(amaliat);
            }
        });


        btnzarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"x";
                input.setText(amaliat);
            }
        });

        btnmenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"-";
                input.setText(amaliat);
            }
        });

        btnjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"+";
                input.setText(amaliat);
            }
        });

        btntaqsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = amaliat+"÷";
                input.setText(amaliat);
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = "";
                input.setText(amaliat);

            }
        });


        btnmosavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amaliat = input.getText().toString();
                amaliat = amaliat.replace("÷" , "/");
                amaliat = amaliat.replace("x" , "*");
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);


                String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable ,amaliat ,"javaScript",1 , null).toString();
                    input.setText(finalResult);
                }
                catch (Exception e){
                    finalResult = "0";
                    input.setText(finalResult);


                }
            }
        });

    }
    
}