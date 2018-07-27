package com.example.danieloliveira.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void abrirSegundaActivity(View view) {

        EditText valores_q1 = (EditText) findViewById(R.id.edit_q1);
        EditText valores_q2 = (EditText) findViewById(R.id.edit_q2);
        EditText valores_l  =  (EditText) findViewById(R.id.edit_l);


        float q1 = Float.parseFloat((valores_q1.getText().toString()));
        float q2 = Float.parseFloat((valores_q2.getText().toString()));
        float l =  Float.parseFloat((valores_l.getText().toString()));

        float vb = q2*(l/2);
        float va = q1+q2-vb;
        float mx = (-q1*l/4)+(va*l/4);


        Intent intent = new Intent(this, ResultActivity.class);

        Bundle params = new Bundle();
        params.putFloat("valores_q", Float.parseFloat(valores_q1.getText().toString()));
        params.putFloat("valores_l", Float.parseFloat(valores_l.getText().toString()));
        params.putFloat("vb", vb);
        params.putFloat("va", va);
        params.putFloat("mx", mx);
        intent.putExtras(params);

        startActivity(intent);
    }

}



