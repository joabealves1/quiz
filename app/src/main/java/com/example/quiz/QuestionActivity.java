package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {
    TextView question, txtPtn;
    Button btnPrx, btnsair;
    RadioGroup rdgrupo;
    RadioButton rb1,rb2,rb3,rb4;

    String perguntas[] = {
            "Quantos países tem na América do Sul?",
            "Quantos municípios tem o estado de Alagoas?",
            "Qual o menor estado do Brasil?",
            "Em que ano Alagoas foi emancipada?",
    };
    String respostas[] = {"12", "102", "Sergipe", "1817"};
    String opcoes[] = {
            "12","10","14","20",
            "201","115","102","98",
            "Alagoas","Sergipe","Amapá","Pernambuco",
            "1890","1891","1817","1813"
    };

    int contador = 0, acerto = 0, erro = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        question = findViewById(R.id.txtquestao);
        btnPrx = findViewById(R.id.btnPrx);
        btnsair = findViewById(R.id.btnsair);
        rdgrupo = findViewById(R.id.rdgrupo);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        txtPtn = findViewById(R.id.txtPtn);

        loop(contador);

        btnPrx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificar();
                contador++;
                loop(contador);
                rdgrupo.clearCheck();
            }
        });

    }

    public void loop(int contador){
        if (contador==0){
            question.setText(perguntas[contador]);
            for (int i=0; i<4; i++){
                if (i==0){
                    rb1.setText(opcoes[i]);
                }
                if (i==1){
                    rb2.setText(opcoes[i]);
                }
                if (i==2){
                    rb3.setText(opcoes[i]);
                }
                if (i==3){
                    rb4.setText(opcoes[i]);
                }
            }
            txtPtn.setText(String.valueOf(contador+1));
        }

        if (contador==1){
            question.setText(perguntas[contador]);
            for (int i=4; i<8; i++){
                if (i==4){
                    rb1.setText(opcoes[i]);
                }
                if (i==5){
                    rb2.setText(opcoes[i]);
                }
                if (i==6){
                    rb3.setText(opcoes[i]);
                }
                if (i==7){
                    rb4.setText(opcoes[i]);
                }
            }
            txtPtn.setText(String.valueOf(contador+1));
        }
        if (contador==2){
            question.setText(perguntas[contador]);
            for (int i=8; i<12; i++){
                if (i==8){
                    rb1.setText(opcoes[i]);
                }
                if (i==9){
                    rb2.setText(opcoes[i]);
                }
                if (i==10){
                    rb3.setText(opcoes[i]);
                }
                if (i==11){
                    rb4.setText(opcoes[i]);
                }
            }
            txtPtn.setText(String.valueOf(contador+1));
        }
        if (contador==3){
            question.setText(perguntas[contador]);
            for (int i=12; i<16; i++){
                if (i==12){
                    rb1.setText(opcoes[i]);
                }
                if (i==13){
                    rb2.setText(opcoes[i]);
                }
                if (i==14){
                    rb3.setText(opcoes[i]);
                }
                if (i==15){
                    rb4.setText(opcoes[i]);
                }
            }
            txtPtn.setText(String.valueOf(contador+1));
        } if (contador==4){
            Intent intent = new Intent(QuestionActivity.this,ResultActivity.class);
            intent.putExtra("Acertos", acerto);
            intent.putExtra("Erros", erro);
            startActivity(intent);
        }

    }

    public void verificar(){
        if (rb1.isChecked()){
            if (rb1.getText().toString().equals(respostas[contador])){
                acerto++;
            } else {
                erro++;
            }
        }
        if (rb2.isChecked()){
            if (rb2.getText().toString().equals(respostas[contador])){
                acerto++;
            } else {
                erro++;
            }
        }
        if (rb3.isChecked()){
            if (rb3.getText().toString().equals(respostas[contador])){
                acerto++;
            } else {
                erro++;
            }
        }
        if (rb4.isChecked()){
            if (rb4.getText().toString().equals(respostas[contador])){
                acerto++;
            } else {
                erro++;
            }
        }
    }

}
