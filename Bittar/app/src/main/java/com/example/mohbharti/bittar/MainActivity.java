package com.example.mohbharti.bittar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Resources;

import org.w3c.dom.Text;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        try {
            View button;
             button = (Button)findViewById(R.id.button);
            EditText editText =(EditText) findViewById(R.id.editText);

            Integer cont;
            cont = Integer.parseInt(editText.getText().toString());


            final CharSequence q = bit(cont);
           // final int d=Integer.parseInt(q);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView textView=((TextView)findViewById(R.id.bitt));
                    CharSequence f="hoalla hello";
                    textView.setText("Hello World !");
                    textView.setText(R.string.Avatar);
                   // System.out.println("hello");
                }
            });
        }
        catch(NumberFormatException e){

        }
    }

    public static CharSequence bit(Integer a){
        String b= "";
       if(a==0 || a==1){
            b = String.valueOf(a);
       }else {
           while (a > 1) {
               if (a % 2 == 0) {
                   b += "0";
               } else {
                   b += "1";
               }
               a = a / 2;
           }
       }
       CharSequence b1=b;
       return b1;
    }
}
