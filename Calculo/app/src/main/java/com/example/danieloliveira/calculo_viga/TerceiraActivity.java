package com.example.danieloliveira.calculo_viga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

    Intent intent= getIntent();

        if(intent != null){
        Bundle params = intent.getExtras();

        if(params != null){

            String vb = String.valueOf(params.getFloat("vb"));
            String va = String.valueOf(params.getFloat("va"));
            String mx = String.valueOf(params.getFloat("mx"));

            TextView vbView = (TextView) findViewById(R.id.textView_vb);
            TextView vaView = (TextView) findViewById(R.id.textView_va);
            TextView mxView = (TextView) findViewById(R.id.textView_mx);


            vbView.setText(vb);
            vaView.setText(va);
            mxView.setText(mx);

        }
    }

    }

}

