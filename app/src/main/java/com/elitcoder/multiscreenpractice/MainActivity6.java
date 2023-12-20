package com.elitcoder.multiscreenpractice;

import androidx.appcompat.app.AppCompatActivity;
import static com.elitcoder.multiscreenpractice.MainActivity.score;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    CheckBox chk1,chk2,chk3,chk4;
    Button chk,next;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        init();

        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chk1.isChecked() && !(chk4.isChecked() || chk3.isChecked()|| chk2.isChecked())){
                    Toast.makeText(MainActivity6.this, "You got Right!", Toast.LENGTH_SHORT).show();
                    ans.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                    score++;

                }else if(chk3.isChecked() || chk4.isChecked()|| chk2.isChecked()){
                    Toast.makeText(MainActivity6.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    ans.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity7.class);
                startActivity(intent);
            }
        });
    }
    @SuppressLint("WrongViewCast")
    public void init(){
        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);
        chk4 = findViewById(R.id.chk4);

        chk = findViewById(R.id.chk);

        ans = findViewById(R.id.ans);

        next = findViewById(R.id.next);
    }
}