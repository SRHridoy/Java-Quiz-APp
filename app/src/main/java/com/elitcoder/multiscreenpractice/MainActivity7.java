package com.elitcoder.multiscreenpractice;

import androidx.appcompat.app.AppCompatActivity;
import static com.elitcoder.multiscreenpractice.MainActivity.score;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    TextView sc;
    Button again;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        sc = findViewById(R.id.score);
        String txt = "You got "+score + " Marks!";
        sc.setText(txt);
        again = findViewById(R.id.again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity.class);
                score=0;
                startActivity(intent);
            }
        });
    }
}