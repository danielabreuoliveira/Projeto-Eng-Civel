package com.example.danieloliveira.calculo_viga;

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


    public void calcularActivity(View view) {


        EditText valores_q = (EditText) findViewById(R.id.editText_q);
        EditText valores_l  =  (EditText) findViewById(R.id.editText_l);

        float q = Float.parseFloat((valores_q.getText().toString()));
        float l =  Float.parseFloat((valores_l.getText().toString()));

        float vb = (q*(l/2))/l;
        float va = q-vb;
        float mx =  (vb*l)-(q*(l/2));


        Intent intent = new Intent(this, TerceiraActivity.class);

        Bundle params = new Bundle();
        params.putFloat("vb", vb);
        params.putFloat("va", va);
        params.putFloat("mx", mx);
        intent.putExtras(params);

        startActivity(intent);

    }
}
