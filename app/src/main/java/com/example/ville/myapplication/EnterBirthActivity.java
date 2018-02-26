package com.example.ville.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnterBirthActivity extends AppCompatActivity {

    public static final String EXTRA_BIRTH = "com.example.ville.myapplication.BIRTH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_birth);
    }

    /** Called when the user tapes the Send button */
    public void submitBirth(View view) {
        // Get the values from the "old" intent and put it in the new one.
        Intent oldIntent = getIntent();
        String name = oldIntent.getStringExtra(MainActivity.EXTRA_NAME);
        String address = oldIntent.getStringExtra(EnterAddressActivity.EXTRA_ADDRESS);

        Intent intent = new Intent(this, DisplaySummaryActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText3);
        String birth = editText.getText().toString();
        intent.putExtra(EXTRA_BIRTH, birth);
        intent.putExtra(MainActivity.EXTRA_NAME, name);
        intent.putExtra(EnterAddressActivity.EXTRA_ADDRESS, address);
        startActivity(intent);
    }
}
