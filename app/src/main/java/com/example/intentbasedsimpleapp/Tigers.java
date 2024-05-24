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

public class Tigers extends AppCompatActivity {

    ImageView imgTiger1,imgTiger2,imgTiger3,imgTiger4,imgDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tigers);
        initViews();
        initListner();
    }
    private void initViews(){
        imgTiger1 = findViewById(R.id.imgTiger1);
        imgTiger2 = findViewById(R.id.imgTiger2);
        imgTiger3 = findViewById(R.id.imgTiger3);
        imgTiger4 = findViewById(R.id.imgTiger4);
        imgDisplay = findViewById(R.id.imgDisplay);
    }
    private void initListner(){
        imgTiger1.setOnClickListener(new btnImageTiger1ClickListner());
        imgTiger2.setOnClickListener(new btnImageTiger2ClickListner());
        imgTiger3.setOnClickListener(new btnImageTiger3ClickListner());
        imgTiger4.setOnClickListener(new btnImageTiger4ClickListner());
    }

    class btnImageTiger1ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.tiger1);
            setResult(3,intent);
            finish();
        }
    }
    class btnImageTiger2ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.tiger2);
            setResult(3,intent);
            finish();
        }
    }
    class btnImageTiger3ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.tiger3);
            setResult(3,intent);
            finish();
        }
    }
    class btnImageTiger4ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.tiger4);
            setResult(3,intent);
            finish();
        }
    }
}