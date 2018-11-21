package com.neha.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButtonClick (View view) {
        // Convert dollars to pounds
        EditText currencyEditText = (EditText) findViewById(R.id.currencyEditText);
        Double currencyInDollars = Double.parseDouble(currencyEditText.getText().toString());
        Double currencyInPounds = currencyInDollars*0.78217;
        Toast.makeText(MainActivity.this, "Currency In Pound " + String.format("%.2f",currencyInPounds), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
