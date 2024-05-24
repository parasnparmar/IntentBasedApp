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

public class Peacock extends AppCompatActivity {

    ImageView imgPeacock1,imgPeacock2,imgPeacock3,imgPeacock4,imgDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);
        initViews();
        initListner();
    }
    private void initViews(){
        imgPeacock1 = findViewById(R.id.imgDog1);
        imgPeacock2 = findViewById(R.id.imgDog2);
        imgPeacock3 = findViewById(R.id.imgDog3);
        imgPeacock4 = findViewById(R.id.imgDog4);
        imgDisplay = findViewById(R.id.imgDisplay);
    }
    private void initListner(){
        imgPeacock1.setOnClickListener(new btnImagePeacock1ClickListner());
        imgPeacock2.setOnClickListener(new btnImagePeacock2ClickListner());
        imgPeacock3.setOnClickListener(new btnImagePeacock3ClickListner());
        imgPeacock4.setOnClickListener(new btnImagePeacock4ClickListner());
    }

    class btnImagePeacock1ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.peacock1);
            setResult(4,intent);
            finish();
        }
    }
    class btnImagePeacock2ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.peacock2);
            setResult(4,intent);
            finish();
        }
    }
    class btnImagePeacock3ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.peacock3);
            setResult(4,intent);
            finish();
        }
    }
    class btnImagePeacock4ClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("imgResId",R.drawable.peacock4);
            setResult(4,intent);
            finish();
        }
    }
}