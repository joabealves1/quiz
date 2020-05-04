package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView acertos, erros;
    Button reiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        acertos = findViewById(R.id.txtcorreto);
        erros = findViewById(R.id.txterros);
        reiniciar =findViewById(R.id.btnReniciar);

        Bundle bd=getIntent().getExtras();
        int acerto = bd.getInt("Acertos");
        int erro = bd.getInt("Erros");

        acertos.setText(String.valueOf(acerto));
        erros.setText(String.valueOf(erro));

        reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
