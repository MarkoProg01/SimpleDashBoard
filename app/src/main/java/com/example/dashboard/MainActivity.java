package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cardViewClick(View view) {
        String id = view.getTag().toString();

        switch (id){
            case "1":
                Toast.makeText(this, "KLIKNUO SI PRVI ELEMENT", Toast.LENGTH_SHORT).show();
                break;
            case "2":
                Toast.makeText(this, "KLIKNUO SI DRUGI ELEMENT", Toast.LENGTH_SHORT).show();
                break;

        }


    }
}