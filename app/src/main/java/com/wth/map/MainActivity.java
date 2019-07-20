package com.wth.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image_4, R.drawable.image_2, R.drawable.image_1, R.drawable.image_3};
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button stor = findViewById(R.id.button_stor);
        stor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(MainActivity.this, MapsActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button tarik = findViewById(R.id.button_tarik);
        tarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, MapsTarikActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button lain = findViewById(R.id.button_lain);
        lain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Not implemented yet", Toast.LENGTH_SHORT).show();
            }
        });

        carouselView = findViewById(R.id.carouselView);
        carouselView.setImageListener(imageListener);
        carouselView.setPageCount(sampleImages.length);

    }

    public void showChat(View view) {
        Intent myIntent = new Intent(MainActivity.this, MessageListActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
