package com.example.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView textView1;
    TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      setContentView(R.layout.alphabets);
//      setContentView(R.layout.calculator);
        btn = findViewById(R.id.button);
        textView1 = findViewById(R.id.Inputalphabet);
        textView2 = findViewById(R.id.outputtype);


        public void myFunction (View v){
        char[] sky = {'b', 'd', 'f', 'h', 'k', 'l', 't'};
        char[] grass = {'a', 'c', 'e', 'i', 'm', 'n', 'o', 'r', 's', 'u', 'v', 'w', 'x', 'z'};
        char[] root = {'g', 'j', 'q', 'p', 'y'};
        String inputText = textView1.getText().toString();
        char[] input = inputText.toCharArray();
        System.out.println(input[0]);
        try {
            for (int i = 0; i < sky.length; i++) {
                if (input[0] == sky[i]) {
                    textView2.setText("Sky letter");
                    return;
                }
            }
            for (int i = 0; i < grass.length; i++) {
                if (input[0] == grass[i]) {
                    textView2.setText("Grass letter");
                    return;
                }
            }
            for (int i = 0; i < root.length; i++) {
                if (input[0] == root[i]) {
                    textView2.setText("Root letter");
                    return;
                }
            }
        } catch (Exception e) {
            textView2.setText(e.getMessage());
        }
        textView2.setText("Not a small letter");

        }

    }
}