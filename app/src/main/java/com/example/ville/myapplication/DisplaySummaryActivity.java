package com.example.ville.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplaySummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_summary);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String address = intent.getStringExtra(EnterAddressActivity.EXTRA_ADDRESS);
        String birth = intent.getStringExtra(EnterBirthActivity.EXTRA_BIRTH);

        // Capture the layout's TextView and set the string as its text
        TextView nameTextView = findViewById(R.id.textView);
        nameTextView.setText(name);

        TextView addressTextView = findViewById(R.id.textView2);
        addressTextView.setText(address);

        TextView birthTextView = findViewById(R.id.textView3);
        birthTextView.setText(birth);
    }
}
