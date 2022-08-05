package com.example.my_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton loginButton;
    private TextView signUpLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (MaterialButton) findViewById(R.id.signinbutton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        signUpLink = (TextView) findViewById(R.id.signuplink);
        signUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intentActivityTwo = new Intent(this, MainActivity2.class);
        startActivity(intentActivityTwo);
    }
}