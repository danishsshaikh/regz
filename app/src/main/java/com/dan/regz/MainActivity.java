package com.dan.regz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt1,txt2,txt3;
    EditText first, second, third;
    Button button;
    //String firstN, secondN, thirdN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);

        button = findViewById(R.id.button);
    }

    public void btnClick (View view){

        txt1.setText(first.getText().toString());
        txt2.setText(second.getText().toString());
        txt3.setText(third.getText().toString());

    }
}
