package com.example.rec.buttons;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int x=0;
    private int ran;
     LinearLayout mylayout;
    String s;
    String s2;
    EditText et1;
    TextView mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button5 = findViewById(R.id.button5);
        Button button10 = findViewById(R.id.button10);
        Button buttonReset = findViewById(R.id.buttonReset);
        et1 = (EditText) findViewById(R.id.edittext);
        mytext = (TextView) findViewById(R.id.TEXT2);
        mylayout= (LinearLayout)findViewById(R.id.activity_main);


        Random r=new Random();
        ran=r.nextInt(100);
        s2=String.valueOf(ran);
        mytext.setText(s2);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button5.setOnClickListener(this);
        button10.setOnClickListener(this);
        buttonReset.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:

                x=x+1;
                s= Integer.toString(x);
                et1.setText(s);
                bac();
                break;
            case R.id.button2:

                x=x+2;
                s= Integer.toString(x);
                et1.setText(s);
                bac();
                break;
            case R.id.button5:

                x=x+5;
                s= Integer.toString(x);
                et1.setText(s);
                bac();
                break;
            case R.id.button10:

                x=x+10;
                s= Integer.toString(x);
                et1.setText(s);
                bac();
                break;
            case R.id.buttonReset:

                x=0;
                s= Integer.toString(x);
                et1.setText(s);
                bac();
                break;
        }

    }
    public void bac(){
        if(x==ran)
        {

            mylayout.setBackgroundColor(Color.BLUE);
        }
        else{
            mylayout.setBackgroundColor(Color.WHITE);
        }
    }

}