package com.example.yuktigoswami.vowelconsonant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView t;
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView);
        b=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String c;
        c=e.getText().toString();
        switch(c){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                t.setText("Vowel");
                break;
            default:
                t.setText("Consonant");
        }
        e.setText(null);
    }
}
