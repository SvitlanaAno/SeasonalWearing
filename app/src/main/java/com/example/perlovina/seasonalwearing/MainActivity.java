package com.example.perlovina.seasonalwearing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }


    private void addListenerOnButton() {

        TextView summer = (TextView) findViewById(R.id.summer);
        TextView autumn = (TextView) findViewById(R.id.autumn);
        TextView winter = (TextView) findViewById(R.id.winter);
        TextView spring = (TextView) findViewById(R.id.spring);

        summer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity.this, SeasonalAutumnActivity.class);
                i.putExtra("season", 0);
                startActivity(i);

            }

        });
        autumn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity.this, SeasonalAutumnActivity.class);
                i.putExtra("season", 1);
                startActivity(i);
            }
        });
        winter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity.this, SeasonalAutumnActivity.class);
                i.putExtra("season", 2);
                startActivity(i);
            }
        });

        spring.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity.this, SeasonalAutumnActivity.class);
                i.putExtra("season", 3);
                startActivity(i);
            }
        });
    }
}
