package com.vimal.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView res ;
    private Button clear,back,modulus,divide,seven,eight,nine,multiply,four,five,six,minus,one,two,three,plus,swap,zero,dot,equal ;

    public Integer a ;
    public Integer b ;
    public Integer c ;
    public Integer len ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=0 ;
        b=0 ;
        c=0 ;
        res = findViewById(R.id.result) ;
        clear=findViewById(R.id.clear);
        back=findViewById(R.id.backspace);
        modulus=findViewById(R.id.modulus);
        divide=findViewById(R.id.divide);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        multiply=findViewById(R.id.multiply) ;
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        minus=findViewById(R.id.minus);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        plus=findViewById(R.id.plus);
        swap=findViewById(R.id.swap);
        zero=findViewById(R.id.zero);
        dot=findViewById(R.id.dot);
        equal=findViewById(R.id.equal);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("0");
                a=0 ;
                b=0;

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString().substring(0,res.getText().toString().length()-1));


            }
        });
        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(res.getText().toString()) ;
                res.setText(res.getText().toString()+"%");
                len = res.getText().toString().length() ;

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 b = Integer.parseInt(res.getText().toString().substring(len)) ;
                String operator = res.getText().toString().substring(len-1,len) ;
                if(operator.equals("%")) {
                    c = a % b;
                    res.setText(""+c.toString());
                }
                else if(operator.equals("+"))
                {

                    c=a+b;
                    res.setText(""+c.toString() );
                }
                else if(operator.equals("-"))
                {

                    c=a-b;
                    res.setText(""+c.toString() );
                }
                else if(operator.equals("*"))
                {

                    c=a*b;
                    res.setText(""+c.toString() );
                }
                else if(operator.equals("/"))
                {

                    c=a/b;
                    res.setText(""+c.toString() );
                }
                else
                    res.setText(""+"0");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"9");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"8");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"7");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"6");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"5");
            }
        });
        four.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"4");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"3");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"2");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"1");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(res.getText().toString()) ;
                res.setText(res.getText().toString()+"+");
                len = res.getText().toString().length() ;

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(res.getText().toString()) ;
                res.setText(res.getText().toString()+"-");
                len = res.getText().toString().length() ;

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(res.getText().toString()) ;
                res.setText(res.getText().toString()+"*");
                len = res.getText().toString().length() ;

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(res.getText().toString()) ;
                res.setText(res.getText().toString()+"/");
                len = res.getText().toString().length() ;

            }
        });






    }
}

