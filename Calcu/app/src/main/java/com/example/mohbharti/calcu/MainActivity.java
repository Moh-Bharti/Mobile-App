package com.example.mohbharti.calcu;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View Yolo;
        Yolo = (Button) findViewById(R.id.Yolo);
        Yolo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                goToYoda();
            }
        }) ;
    }



    private void goToYoda(){
    Intent intent=new Intent(this,Yoda.class);
        startActivity(intent);
    }
}
