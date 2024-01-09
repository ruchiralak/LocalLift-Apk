package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    DBHelper myDb;
    EditText editName,editPassword;
    Button btnLoginData;
    TextView signupRedirectText;
    TextView forgetRedirectText;

    //In the onCreate method,
    // the layout for the activity is set using setContentView with the layout file activity_login.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //An instance of DBHelper is created to handle database operations.
        myDb = new DBHelper(this);
        btnLoginData = findViewById(R.id.login_button);
        editName = findViewById(R.id.login_username);
        editPassword = findViewById(R.id.login_password);

        signupRedirectText=findViewById(R.id.signupRedirectText);
        signupRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });

        forgetRedirectText=findViewById(R.id.forgetRedirectText);
        forgetRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,Resetpw.class));
            }
        });

        //A click listener is set on btnLoginData to handle the login button click event.

        btnLoginData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user =editName.getText().toString();
                String pass = editPassword.getText().toString();

                if(TextUtils.isEmpty(user)|| TextUtils.isEmpty(pass))
                    Toast.makeText(LoginActivity.this,"All fileds Required",Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass = myDb.checkusernamepassword(user,pass);
                    if (checkuserpass==true){
                        Toast.makeText(LoginActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(LoginActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}