package com.example.ville.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnterAddressActivity extends AppCompatActivity {

    public static final String EXTRA_ADDRESS = "com.example.ville.myapplication.ADDRESS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_address);
    }

    /** Called when the user tapes the Send button */
    public void submitAddress(View view) {
        // Get the name-value from the "old" intent and put it in the new one.
        Intent oldIntent = getIntent();
        String name = oldIntent.getStringExtra(MainActivity.EXTRA_NAME);

        Intent newIntent = new Intent(this, EnterBirthActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String address = editText.getText().toString();
        newIntent.putExtra(EXTRA_ADDRESS, address);
        newIntent.putExtra(MainActivity.EXTRA_NAME, name);
        startActivity(newIntent);
    }
}
