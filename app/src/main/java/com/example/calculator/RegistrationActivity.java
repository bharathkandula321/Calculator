package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText firstName,lastName,emailID,phoneNumber,password,confirmPassword;
    Button submitButton;
    String firstNameInString,lastNameInString,emailidInString,phoneNumberInString,passwordInString,confirmPasswordInString;



    VerficationUtil validation = new VerficationUtil();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initializeViews();
    }

    public void initializeViews() {

        firstName = (EditText) findViewById(R.id.first_name);
        lastName = (EditText) findViewById(R.id.last_name);
        emailID = (EditText) findViewById(R.id.email_id_edit_text);
        phoneNumber = (EditText) findViewById(R.id.phone_number_edit_text);
        password = (EditText) findViewById(R.id.password_edit_text);
        confirmPassword = (EditText) findViewById(R.id.confirm_password_edit_text);
        submitButton = (Button) findViewById(R.id.submit_button);

    }


    public void listeners() {

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textsInStrings();

                String returnedString = validation.verfication(firstNameInString,lastNameInString,emailidInString,phoneNumberInString,passwordInString,confirmPasswordInString);

                if (returnedString.equals("valid")) {

                    Intent mySuperIntent = new Intent(RegistrationActivity.this, MainActivity.class);
                    startActivity(mySuperIntent);

                    finish();
                }
                else {

                    Toast.makeText(getApplicationContext(), returnedString, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    void textsInStrings() {

        firstNameInString = firstName.getText().toString().trim();
        lastNameInString = lastName.getText().toString().trim();
        emailidInString = emailID.getText().toString().trim();
        phoneNumberInString = phoneNumber.getText().toString().trim();
        passwordInString = password.getText().toString().trim();
        confirmPasswordInString = confirmPassword.getText().toString().trim();

    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Life-Cycle","onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        listeners();
        Log.d("Life-Cycle","onResume");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("Life-Cycle","onPause");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d("Life-Cycle","onStop");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d("Life-Cycle","OnCreate");
    }
}
