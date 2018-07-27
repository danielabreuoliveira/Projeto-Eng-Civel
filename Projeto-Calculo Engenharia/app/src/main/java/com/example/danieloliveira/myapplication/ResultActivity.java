package com.example.danieloliveira.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        if(intent != null){
            Bundle params = intent.getExtras();

            if(params != null){
                String valores_q1 = String.valueOf(params.getFloat("valores_q1"));
                String valores_q2 = String.valueOf(params.getFloat("valores_q2"));
                String valores_l = String.valueOf(params.getFloat("valores_l"));
                String vb = String.valueOf(params.getFloat("vb"));
                String va = String.valueOf(params.getFloat("va"));
                String mx1 = String.valueOf(params.getFloat("mx1"));
                String mx2 = String.valueOf(params.getFloat("mx2"));

                TextView q1View = (TextView) findViewById(R.id.text_q1);
                TextView q2View = (TextView) findViewById(R.id.text_q2);
                TextView lView = (TextView) findViewById(R.id.text_l);
                TextView q21View = (TextView) findViewById(R.id.text_q21);
                TextView vbView = (TextView) findViewById(R.id.text_vb);
                TextView vaView = (TextView) findViewById(R.id.text_va);
                TextView mx1View = (TextView) findViewById(R.id.text_mx1);
                TextView mx2View = (TextView) findViewById(R.id.text_mx2);

                q1View.setText(valores_q1);
                q2View.setText(valores_q2);
                lView.setText(valores_l);
                q21View.setText(valores_q2);
                vbView.setText(vb);
                vaView.setText(va);
                mx1View.setText(mx1);
                mx2View.setText(mx2);

            }
        }


    }
}
