package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,addop,subop,mulop,divop,equalop,clearop;
    TextView input,output;


    double ans =0;
    double firstHalf=0;
    double secondHalf =0;
    int choice=0;
    String num="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);

        addop = findViewById(R.id.addop);
        mulop = findViewById(R.id.mulop);
        divop = findViewById(R.id.divop);
        subop = findViewById(R.id.subop);
        equalop = findViewById(R.id.equalop);
        clearop = findViewById(R.id.clearop);

        input = findViewById(R.id.textView1);
        output = findViewById(R.id.textView2);






        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"0";
                input.setText(num);


            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"1";
                input.setText(num);


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"2";
                input.setText(num);


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"3";
                input.setText(num);


            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"4";
                input.setText(num);


            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"5";
                input.setText(num);



            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"6";
                input.setText(num);



            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"7";
                input.setText(num);



            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"8";
                input.setText(num);



            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num=num+"9";
                input.setText(num);



            }
        });

        clearop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                num="";
            }
        });


        addop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstHalf = Double.parseDouble(input.getText().toString());

                input.setText("+");
                choice=1;
                num="";

//
            }
        });

        subop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstHalf = Double.parseDouble(input.getText().toString());

                input.setText("-");
                choice=2;
                num="";

//
            }
        });


        mulop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstHalf = Double.parseDouble(input.getText().toString());

                input.setText("x");
                choice=3;
                num="";

//
            }
        });

        divop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstHalf = Double.parseDouble(input.getText().toString());

                input.setText("/");
                choice=4;
                num="";

//
            }
        });

        equalop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondHalf = Double.parseDouble(input.getText().toString());

                String op="";


                switch (choice)
                {
                    case 1:ans=firstHalf+secondHalf;
                           op="+";
                            break;

                    case 2: ans=firstHalf-secondHalf;
                            op="-";
                            break;

                    case 3: ans=firstHalf*secondHalf;
                         op="x";
                        break;

                    case 4: ans=firstHalf/secondHalf;
                            op="/";
                            break;




                }

                String finalAns = String.valueOf((int)ans);

                output.setText("= "+finalAns);
//                firstHalf = (int)firstHalf;
//                secondHalf=(int)secondHalf;
                input.setText((int)firstHalf+" "+op+" "+(int)secondHalf);


            }
        });









    }
}