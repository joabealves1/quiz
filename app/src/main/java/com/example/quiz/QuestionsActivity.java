package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "Quantos paises tem na america do sul?",
            "Quantos municípios tem alagoas?",
            "Qual o menor estado do brasil?",
            "Em que ano Alagoas foi emancipada?",
    };
    String answers[] = {"12, 102, Sergipe, 1817"};
    String opt[] = {
            "12","10","14","20",
            "102","115","201","98",
            "Sergipe","Alagoas","Amapá","Pernambuco",
            "1817","1891","1816","1813"
    };
