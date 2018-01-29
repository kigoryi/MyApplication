package com.example.mwami.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class LoginActivity extends Activity implements View.OnClickListener {

EditText username,motDpasse;
    Button login,register,forget;
    Spinner univChoice;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_activity);

        username= (EditText) findViewById(R.id.regNum);
        motDpasse= (EditText) findViewById(R.id.pw);
        login= (Button) findViewById(R.id.logBtn);
        register= (Button) findViewById(R.id.regBtn);
        forget= (Button) findViewById(R.id.forgotPw);
        univChoice= (Spinner) findViewById(R.id.university);


        login.setOnClickListener( this);
        register.setOnClickListener( this);
        forget.setOnClickListener( this);


    }

    public void onClick(View view){

        switch (view.getId()){

            case R.id.logBtn:
                Intent logInt=new Intent(view.getContext(),StudentPortal.class);
                logInt.putExtra("registrationNumber",username.getText().toString());
                logInt.putExtra("university",univChoice.getSelectedItem().toString());
                startActivity(logInt);
                break;
            case R.id.regBtn:
                Intent regInt=new Intent(view.getContext(),Register.class);
                startActivity(regInt);
                break;
            case R.id.forgotPw:
                Intent forgetInt=new Intent(view.getContext(),ForgotPassword.class);
                startActivity(forgetInt);
                break;
            default:
                break;
        }

    }

}
