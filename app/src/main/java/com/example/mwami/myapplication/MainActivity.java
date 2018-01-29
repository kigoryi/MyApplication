package com.example.mwami.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button student,teacher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        student= (Button) findViewById(R.id.student_btn);
        teacher= (Button) findViewById(R.id.teacher_btn);

        student.setOnClickListener(this);
        teacher.setOnClickListener(this);



    }

    public void onClick(View view ){

        switch (view.getId()){

            case R.id.student_btn:
                Intent i=new Intent(this,StudentLogin.class);

                view.getContext().startActivity(i);
                break;
            default:
                break;
        }

    }


}
