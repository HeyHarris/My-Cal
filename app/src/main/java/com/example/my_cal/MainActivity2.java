package com.example.my_cal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {
    private MaterialButton centerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        centerButton = (MaterialButton) findViewById(R.id.centerButton);
        centerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain3();
            }
        });

    }
    public void openActivityMain3() {
        Intent intent3 = new Intent(this, MainActivity3.class);
        startActivity(intent3);
    }
}