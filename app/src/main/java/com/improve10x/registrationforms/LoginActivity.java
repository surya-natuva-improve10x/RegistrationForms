package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button signupBtn = findViewById(R.id.signup_btn);
        signupBtn.setOnClickListener(view ->{
            Intent intent = new Intent(this,SignupActivity.class);
            startActivity(intent);
        } );
    }
}