package com.calculetor.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private String name;
    private ImageView sakibIV,masrafeeIV,tamimIV,musfiqIV,mahmudullahIV,mominulIV;
    private TextView nameTv,ageTv,homeTv,battingTV,roleTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name=getIntent().getStringExtra("name");


         init();
        nameTv.setText(name);

        setData();
        
    }

    private void setData() {

        if(name.equals("Sakib")){

            sakibIV.setVisibility(View.VISIBLE);
            nameTv.setText("Shakib Al Hasan");
            ageTv.setText("32");
            homeTv.setText("Magura");
            battingTV.setText("Left-handed");
            roleTV.setText("All-rounder");


        }

        else if(name.equals("Masfrafee")){

            masrafeeIV.setVisibility(View.VISIBLE);
            nameTv.setText("Mashrafe Bin Mortaza");
            ageTv.setText("35");
            homeTv.setText("Norail");
            battingTV.setText("Right-handed");
            roleTV.setText("Bowler");


        }

        else  if(name.equals("Tamim")){

            tamimIV.setVisibility(View.VISIBLE);
            nameTv.setText("Tamim Iqbal Khan");
            ageTv.setText("30");
            homeTv.setText("Chittagong");
            battingTV.setText("Left-handed");
            roleTV.setText("Opening batsman");


        }

        else if(name.equals("Musfiq")){

            musfiqIV.setVisibility(View.VISIBLE);
            nameTv.setText("Mushfiqur Rahim");
            ageTv.setText("32");
            homeTv.setText("Bogura");
            battingTV.setText("Right-handed");
            roleTV.setText("Wicket-keeper & Batsman");


        }

        else if(name.equals("Mahmudullah")){

            mahmudullahIV.setVisibility(View.VISIBLE);
            nameTv.setText("Mahmudullah Riyad");
            ageTv.setText("33");
            homeTv.setText("Mymensingh");
            battingTV.setText("Right-handed");
            roleTV.setText("All-rounder");


        }

        else if(name.equals("Mominul")){

           mominulIV.setVisibility(View.VISIBLE);
            nameTv.setText("Mominul Haque");
            ageTv.setText("27");
            homeTv.setText("Cox-Bazar");
            battingTV.setText("Left-handed");
            roleTV.setText("Top-order Batsman");


        }


    }

    private void init() {
        musfiqIV=findViewById(R.id.musfiqIV);
        nameTv=findViewById(R.id.nameTV);
        ageTv=findViewById(R.id.ageTV);
        homeTv=findViewById(R.id.homeTV);
        battingTV=findViewById(R.id.battingTV);
        roleTV=findViewById(R.id.roleTV);
        sakibIV=findViewById(R.id.sakibIVp);
        masrafeeIV=findViewById(R.id.masrafeeIVp);
        tamimIV=findViewById(R.id.taminIVp);

        mahmudullahIV=findViewById(R.id.mahmudullahIVp);
        mominulIV=findViewById(R.id.mominulIVp);
    }
}
