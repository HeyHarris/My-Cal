package com.example.my_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        String food = MainActivity5.getSearchedFood();

        try {
            //URL = https://api.nal.usda.gov/fdc/v1/foods/search?api_key=EVdiamGbLkdmrzaHmmAUr9v4eZ1jpnKMVq3SH4Da&query=Cheddar%20Cheese
            URL url = new URL("https://api.nal.usda.gov/fdc/v1/foods/search?api_key=EVdiamGbLkdmrzaHmmAUr9v4eZ1jpnKMVq3SH4Da&query=Cheddar%20Cheese");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connection made (code should be 200)
            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpsResponseCode: "+ responseCode);
            }else {
                StringBuilder infoString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}