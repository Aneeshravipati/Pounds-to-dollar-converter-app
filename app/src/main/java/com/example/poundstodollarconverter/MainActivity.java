package com.example.poundstodollarconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =(EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);

    }

    public void convertCurrency(View view){
        String amountInPounds =editText.getText().toString();
        Double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        Double amountInDollars = amountInPoundsDouble * 1.3;
        String amountInDollarsString = Double.toString(amountInDollars);
        amountInDollarsString = String.format("%.2f",amountInDollars);

        Toast.makeText(this, amountInPounds +"pounds is"+amountInDollarsString + "$", Toast.LENGTH_SHORT).show();

    }

}