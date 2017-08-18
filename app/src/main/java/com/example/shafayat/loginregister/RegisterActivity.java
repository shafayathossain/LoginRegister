package com.example.shafayat.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText registerName;
    EditText registerUserName;
    EditText registerEmail;
    EditText RegisterPassword;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerName = (EditText) findViewById(R.id.registerNameField);
        registerUserName = (EditText) findViewById(R.id.registerUserNameField);
        registerEmail = (EditText) findViewById(R.id.registerEmailField);
        RegisterPassword= (EditText) findViewById(R.id.registerPasswordField);
        registerButton = (Button) findViewById(R.id.registerButton);

    }
}
