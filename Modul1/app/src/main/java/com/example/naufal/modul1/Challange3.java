package com.example.naufal.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Challange3 extends AppCompatActivity {
    private TextView tvCount;
    private Button btnToast, btnCount;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challange3);

        tvCount = findViewById(R.id.tv_count);
        btnToast = findViewById(R.id.btn_toast);
        btnCount = findViewById(R.id.btn_count);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.toast_message, Toast.LENGTH_SHORT).show();
            }
        });

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                tvCount.setText(String.valueOf(i));
            }
        });
    }
}
