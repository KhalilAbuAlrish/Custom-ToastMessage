package com.example.toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.muddz.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.show_toast);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast(v);
            }
        });

    }



    public void showToast(View view){
        StyleableToast.makeText(this,"kahlil",R.style.exampleToast).show();
    }


}