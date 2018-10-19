package com.example.nikhi.multimedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private CardView cardView1 , cardView2 , cardView3 , cardView4 , cardView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        /*cardView5 = (CardView) findViewById(R.id.card5);*/


        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        /*cardView5.setOnClickListener(this);*/


    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId())
        {
            case R.id.card1 :  intent = new Intent(getApplicationContext(), song_player.class);
                                startActivity(intent);
                                break;


            case R.id.card2 :   Toast.makeText(getApplicationContext(),"Card View 2 selected",Toast.LENGTH_SHORT).show();
                                break;



            case R.id.card3 :   Toast.makeText(getApplicationContext(),"Card View 3 selected",Toast.LENGTH_SHORT).show();
                                break;



            case R.id.card4 :   Toast.makeText(getApplicationContext(),"Card View 4 selected",Toast.LENGTH_SHORT).show();
                                break;



            /*case R.id.card5 :   Toast.makeText(getApplicationContext(),"Card View 5 selected",Toast.LENGTH_SHORT).show();
                                break;
*/
            default: Toast.makeText(getApplicationContext(),"Default selected",Toast.LENGTH_SHORT).show();
        }
    }
}
