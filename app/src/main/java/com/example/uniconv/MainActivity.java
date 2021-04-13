package com.example.uniconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        EditText editText = (EditText) findViewById(R.id.number);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                System.out.println(input);
//                int km = Integer.parseInt(input);
                double km = Double.parseDouble(input);

                if((editText.getText().toString()) == "") {
                    km = Integer.parseInt(input);
                    Toast.makeText(MainActivity.this, "Pls enter some value", Toast.LENGTH_SHORT).show();
                }
                double mile = 1.609 * km;
                double roundOff = Math.round(mile * 100.0) / 100.0;
                textView.setText("The corresponding value in miles is " + roundOff);
            }
        });
    }
}