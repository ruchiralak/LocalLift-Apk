package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.database.Cursor;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Objects;



public class MainActivity extends AppCompatActivity {

    DBHelper myDb;
    EditText editName, editEmail, editPassword, editConfirmPassword;
    Button btnReg;
    TextView loginRedirectText,NameError,EmailError,PasswordError,cPwError;
    CardView cardOne,cardTwo,cardThree,cardFour;
    private boolean isAtLeast8 = false, hasUppercase = false, hasNumber = false, hasSymbol = false, isRegistrationClickable = false;


    //In the onCreate method, the layout for the activity is set using setContentView with the layout file activity_main.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //An instance of DBHelper is created to handle database operations.
        myDb = new DBHelper(this);

        editName = findViewById(R.id.signup_username);
        editEmail = findViewById(R.id.signup_email);
        editPassword = findViewById(R.id.signup_password);
        editConfirmPassword = findViewById(R.id.signup_confirm);

        NameError = findViewById(R.id.NameError);
        EmailError = findViewById(R.id.EmailError);
        PasswordError = findViewById(R.id.PasswordError);
        cPwError = findViewById(R.id.cPwError);
        cardOne =findViewById(R.id.cardOne);
        cardTwo =findViewById(R.id.cardTwo);
        cardThree =findViewById(R.id.cardThree);
        cardFour =findViewById(R.id.cardFour);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        btnReg = findViewById(R.id.signup_button);

        //login redirrect
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        regData();
    }

    //The regData method is called to set up the registration button click listener and input change listeners.
    //The regData method contains the logic for handling registration data.
    public void regData() {
        btnReg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                try {
                    String userName = editName.getText().toString();
                    String email = editEmail.getText().toString();
                    String password = editPassword.getText().toString();
                    String confirmPassword = editConfirmPassword.getText().toString();


                    //Registration Part
                    if (userName.length() > 0 && email.length() > 0 && password.length() > 0 && confirmPassword.length() >0) {
                       // if (Objects.equals(password, confirmPassword)) {
                        if (password.equals(confirmPassword))
                        {
                            boolean checkuser = myDb.checkusername(userName);
                            if (checkuser==false)
                            {

                                boolean isInserted = myDb.insertData(userName, email, password, confirmPassword);
                                if (isInserted == true)
                                {
                                    Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_LONG).show();
                                    Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                                    startActivity(i);
                                } else {
                                    Toast.makeText(MainActivity.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                                }

                            }else {
                                Toast.makeText(MainActivity.this,"User already Exist",Toast.LENGTH_SHORT).show();
                            }

                        } else {
                                Toast.makeText(MainActivity.this, "Password are Not matching", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            if (userName.length() == 0) {
                                NameError.setVisibility(View.VISIBLE);
                            }
                            if (email.length() == 0) {
                                EmailError.setVisibility(View.VISIBLE);
                            }
                            if (password.length() == 0) {
                                PasswordError.setVisibility(View.VISIBLE);
                            }
                            if (confirmPassword.length() == 0) {
                                cPwError.setVisibility(View.VISIBLE);
                            }

                        }



                } catch (Exception e) {

                    Toast.makeText(MainActivity.this, e.getMessage().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
        inputChange();
    }

    //The checkEmptyFields method is used to check if any previously shown error views should be hidden.
    private void checkEmptyFields(String userName, String email, String password,String confirmPassword) {
        if (userName.length() > 0 && NameError.getVisibility() == View.VISIBLE) {
            NameError.setVisibility(View.GONE);
        }
        if (email.length() > 0 && EmailError.getVisibility() == View.VISIBLE) {
            EmailError.setVisibility(View.GONE);
        }
        if (password.length() > 0 && PasswordError.getVisibility() == View.VISIBLE) {
            PasswordError.setVisibility(View.GONE);
        }
        if (confirmPassword.length() > 0 && cPwError.getVisibility() == View.VISIBLE) {
            cPwError.setVisibility(View.GONE);
        }

    }
    //The passwordCheck method is called to validate the password against the specified criteria (at least 8 characters, uppercase letters, numbers, and symbols).
    @SuppressLint("ResourceType")
    private void passwordCheck(){
        String userName = editName.getText().toString();
        String email = editEmail.getText().toString();
        String password = editPassword.getText().toString();
        String confirmPassword = editConfirmPassword.getText().toString();

        checkEmptyFields(userName,email,password,confirmPassword);
        //for 8 characters
        if (password.length()>=8){
            isAtLeast8 = true;
            cardOne.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
        }else {
            isAtLeast8 =false;
            cardOne.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));

        }
        //for uppercases
        if (password.matches("(.*[A-Z].*)")){
            hasUppercase = true;
            cardTwo.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
        }else {
            hasUppercase =false;
            cardTwo.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));
        }
        //for numbers
        if (password.matches("(.*[0-9].*)")){
            hasNumber = true;
            cardThree.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
        }else {
            hasNumber =false;
            cardThree.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));
        }

        //For symbol
        if (password.matches("^(?=.*[_!@#$%^&*()]).*$")){
            hasSymbol = true;
            cardFour.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
        }else {
            hasSymbol =false;
            cardFour.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));
        }

    }

    //The inputChange method sets up the text change listeners for the input fields (username, email, password, confirm password) to trigger the passwordCheck method.
    private void inputChange() {
        editName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passwordCheck();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passwordCheck();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passwordCheck();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editConfirmPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passwordCheck();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }



}