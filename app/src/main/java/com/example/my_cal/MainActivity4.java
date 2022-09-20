package com.example.my_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity4 extends AppCompatActivity {
    private MaterialButton foodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        foodButton = (MaterialButton) findViewById(R.id.add_food);
        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivityMain5();}
        });
    }

    private void openActivityMain5() {
        Intent intentActivityFive = new Intent(this, MainActivity5.class);
        startActivity(intentActivityFive);
    }
}