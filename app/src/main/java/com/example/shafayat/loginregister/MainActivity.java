package com.example.shafayat.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText loginUserName;
    EditText loginPassword;
    Button loginButton;
    TextView registerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginUserName = (EditText) findViewById(R.id.loginUserNameField);
        loginPassword = (EditText) findViewById(R.id.loginPasswordField);
        loginButton = (Button) findViewById(R.id.loginButton);
        registerHere = (TextView) findViewById(R.id.registerLink);

        registerHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    }
}
