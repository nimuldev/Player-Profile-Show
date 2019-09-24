package com.calculetor.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView sakibIV,masrafeeIV,tamimIV,musfiqIV,mahmudullahIV,mominulIV;
    private String sakib,masrafee,tamim,musfiq,mahmudullah,mominul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        sakibIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name","Sakib");
                startActivity(intent);
            }
        });
        masrafeeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name","Masfrafee");
                startActivity(intent);
            }
        });
        tamimIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name","Tamim");
                startActivity(intent);
            }
        });
        musfiqIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name","Musfiq");
                startActivity(intent);
            }
        });
        mahmudullahIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name","Mahmudullah");
                startActivity(intent);
            }
        });
        mominulIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name","Mominul");

                startActivity(intent);

            }
        });

    }

    private void init() {
        sakibIV=findViewById(R.id.sakibIV);
        masrafeeIV=findViewById(R.id.mmashrafeeIV);
        musfiqIV=findViewById(R.id.musfiqIV);
        tamimIV=findViewById(R.id.taminIV);
        mahmudullahIV=findViewById(R.id.mahmudullahIV);
        mominulIV=findViewById(R.id.mominulIV);
    }
}
