package com.example.ville.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.example.ville.myapplication.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user tapes the Send button */
    public void submitName(View view) {
        Intent intent = new Intent(this, EnterAddressActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String name = editText.getText().toString();
        intent.putExtra(EXTRA_NAME, name);
        startActivity(intent);
    }
}
