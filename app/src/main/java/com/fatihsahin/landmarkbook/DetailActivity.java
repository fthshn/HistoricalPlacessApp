package com.fatihsahin.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView countryNameText;
    TextView landmarkNameText;
    TextView detailedDescriptionText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageView);
        countryNameText = findViewById(R.id.countryNameText);
        landmarkNameText = findViewById(R.id.landmarkNameText);
        detailedDescriptionText = findViewById(R.id.detailedDescriptionText);

        Intent intent = getIntent();
        String landmarkName = intent.getStringExtra("name");
        landmarkNameText.setText(landmarkName);
        String countryName = intent.getStringExtra("name2");
        countryNameText.setText(countryName);
        String description = intent.getStringExtra("name3");
        detailedDescriptionText.setText(description);
        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());
    }
}