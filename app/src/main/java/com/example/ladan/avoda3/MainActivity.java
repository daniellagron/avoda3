package com.example.ladan.avoda3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    int i=1,x=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =(Button)findViewById(R.id.btn1);


    }


    public void count(View view) {
        i++;
        btn1.setText("this is click number: "  + i);
            if (i == 6) {
                btn1.setText("enough, go to new start!");
                i=0;
            }
            }
     }

