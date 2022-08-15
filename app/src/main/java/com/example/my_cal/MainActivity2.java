package com.example.my_cal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {
    private MaterialButton completeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        completeButton = (MaterialButton) findViewById(R.id.completeButton);
        completeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View views) {
                openActivityMain3();
            }
        });

    }
    public void openActivityMain3() {
        Intent intentActivityThree = new Intent(this, MainActivity3.class);
        startActivity(intentActivityThree);
    }
}