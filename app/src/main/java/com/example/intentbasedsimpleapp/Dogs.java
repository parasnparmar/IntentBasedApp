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

public class Dogs extends AppCompatActivity {
    ImageView imgDog1,imgDog2,imgDog3,imgDog4,imgDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);
        initViews();
        initListner();
    }
    private void initViews(){
        imgDog1 = findViewById(R.id.imgDog1);
        imgDog2 = findViewById(R.id.imgDog2);
        imgDog3 = findViewById(R.id.imgDog3);
        imgDog4 = findViewById(R.id.imgDog4);
        imgDisplay = findViewById(R.id.imgDisplay);
    }
    private void initListner(){
        imgDog1.setOnClickListener(new btnImageDog1ClickListner());
        imgDog2.setOnClickListener(new btnImageDog2ClickListner());
        imgDog3.setOnClickListener(new btnImageDog3ClickListner());
        imgDog4.setOnClickListener(new btnImageDog4ClickListner());
    }

    class btnImageDog1ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.dog1);
            setResult(2,intent);
            finish();
        }
    }
    class btnImageDog2ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.dog2);
            setResult(2,intent);
            finish();
        }
    }
    class btnImageDog3ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.dog3);
            setResult(2,intent);
            finish();
        }
    }
    class btnImageDog4ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.dog4);
            setResult(2,intent);
            finish();
        }
    }
}