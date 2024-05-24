package com.example.intentbasedsimpleapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cats extends AppCompatActivity {
    ImageView imgCat1,imgCat2,imgCat3,imgCat4,imgDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats);
        initViews();
        initListner();
    }
    private void initViews(){
         imgCat1 = findViewById(R.id.imgCat1);
         imgCat2 = findViewById(R.id.imgCat2);
         imgCat3 = findViewById(R.id.imgCat3);
         imgCat4 = findViewById(R.id.imgCat4);
         imgDisplay = findViewById(R.id.imgDisplay);
    }
    private void initListner(){
        imgCat1.setOnClickListener(new btnImageCat1ClickListner());
        imgCat2.setOnClickListener(new btnImageCat2ClickListner());
        imgCat3.setOnClickListener(new btnImageCat3ClickListner());
        imgCat4.setOnClickListener(new btnImageCat4ClickListner());
    }

    class btnImageCat1ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.cat1);
            setResult(1,intent);
            finish();
        }
    }
    class btnImageCat2ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.cat2);
            setResult(1,intent);
            finish();
        }
    }
    class btnImageCat3ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.cat3);
            setResult(1,intent);
            finish();
        }
    }
    class btnImageCat4ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.cat4);
            setResult(1,intent);
            finish();
        }
    }
}