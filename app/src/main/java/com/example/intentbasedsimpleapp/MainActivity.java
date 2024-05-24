package com.example.intentbasedsimpleapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imgDisplay;
    Button btnCats,btnDogs,btnTigers,btnPeacock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListners();


    }
    private void initViews(){
        imgDisplay = findViewById(R.id.imgDisplay);
        btnCats = findViewById(R.id.btnCats);
        btnDogs = findViewById(R.id.btnDogs);
        btnTigers = findViewById(R.id.btnTigers);
        btnPeacock = findViewById(R.id.btnPeacock);
    }
    private void initListners(){
        btnCats.setOnClickListener(new btnCatsClickListner());
        btnDogs.setOnClickListener(new btnDogsClickListner());
        btnTigers.setOnClickListener(new btnTigersClickListner());
        btnPeacock.setOnClickListener(new btnPeacockClickListner());
    }
    class btnCatsClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Cats.class);
            startActivityForResult(intent,1);
        }
    }
    class btnDogsClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Dogs.class);
            startActivityForResult(intent,2);
        }
    }
   class btnTigersClickListner implements View.OnClickListener{
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(MainActivity.this,Tigers.class);
           startActivityForResult(intent,3);
       }
   }
    class btnPeacockClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Peacock.class);
            startActivityForResult(intent,4);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1) {
            int imgResId = data.getIntExtra("imgResId", R.drawable.cat1);
            imgDisplay.setImageResource(imgResId);
        } else if (requestCode == 2) {
            int imgResId = data.getIntExtra("imgResId",R.drawable.dog1);
            imgDisplay.setImageResource(imgResId);
        }else if (requestCode == 3) {
            int imgResId = data.getIntExtra("imgResId",R.drawable.dog1);
            imgDisplay.setImageResource(imgResId);
        }else if (requestCode == 4) {
            int imgResId = data.getIntExtra("imgResId",R.drawable.dog1);
            imgDisplay.setImageResource(imgResId);
        }
    }
}