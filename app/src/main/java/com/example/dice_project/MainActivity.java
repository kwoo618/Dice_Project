package com.example.dice_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView = findViewById(R.id.imageView1);

    }

    public void changeimage(View view) {
        Random random = new Random();
        int rand =random.nextInt(6);
        if (rand == 0){
            imageView.setImageResource(R.drawable.dice1);
        }
        if (rand == 1){
            imageView.setImageResource(R.drawable.dice2);
        }
        if (rand == 2){
            imageView.setImageResource(R.drawable.dice3);
        }
        if (rand == 3){
            imageView.setImageResource(R.drawable.dice4);
        }
        if (rand == 4){
            imageView.setImageResource(R.drawable.dice5);
        }
        if (rand == 5){
            imageView.setImageResource(R.drawable.dice6);
        }
    }

}