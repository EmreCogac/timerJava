package com.example.timerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button timerBtn;
    private TextView timerTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerBtn = findViewById(R.id.timerButton);
        timerTxt = findViewById(R.id.timerText);

        timerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timerBtn.setEnabled(false);
                new CountDownTimer(60000,1000){
                    @Override
                    public void onTick(long l){
                        timerTxt.setText(""+l/1000);

                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "sayım bitti", Toast.LENGTH_SHORT).show();
                        timerBtn.setEnabled(true);
                    }


                }.start();
            }
        });
    }
}