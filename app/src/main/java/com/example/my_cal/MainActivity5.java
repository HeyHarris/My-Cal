package com.example.my_cal;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.my_cal.databinding.ActivityMain5Binding;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainActivity5 extends AppCompatActivity {

    private MaterialButton SearchButton;
    public static String food;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMain5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        EditText text = (EditText) findViewById(R.id.foodSearch);
        food = text.getText().toString();

        SearchButton = (MaterialButton) findViewById(R.id.ButtonSearch);
        SearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openFoodSearch();}
        });

    }

    private void openFoodSearch() {
        Intent intentFoodSearch = new Intent(this, MainActivity6.class);
        startActivity(intentFoodSearch);
    }

    public static String getSearchedFood() {
        return food;
    }

}



