package com.example.lebronjames;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lebronjames.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private int punkty;

    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(R.layout.activity_main);
        setContentView(view);
        if (savedInstanceState != null){
            punkty = savedInstanceState.getInt("PUNKTY");
        }

        binding.textviewPunkty.setText(String.valueOf(punkty));
        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        binding.textviewPunkty.setText(String.valueOf(punkty));

                    }
                }
        );

        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty+=2;
                        binding.textviewPunkty.setText(String.valueOf(punkty));

                    }
                }
        );

        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty += 3;
                        binding.textviewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("PUNKTY",punkty);
    }
}