package com.example.vsvll.intentimpicit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.EditText);
        button = findViewById(R.id.Button);
    }

    public void Visit(View view) {

        //String URL = "https://www.google.co.in/";
        //the below code will get the text and convert to string and store in the URL.
        String URL = editText.getText().toString();

        //The below code will open the browser and pass the url in to the browser, however it needs to be formatted perfectly.
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(URL));
        startActivity(i);

    }
}
