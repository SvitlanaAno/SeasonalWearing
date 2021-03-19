package com.example.perlovina.seasonalwearing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailsViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_view);

        Intent intent = getIntent();
        ImageView imageDetail = (ImageView) findViewById(R.id.image_details);
        imageDetail.setImageResource(intent.getIntExtra("image", R.drawable.close_rain_8));
    }
}
