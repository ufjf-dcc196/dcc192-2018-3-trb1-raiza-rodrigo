package com.example.raiza.semanacomputacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_LISTAPTC = 1;
    private Button btnListarPtc;
    private Button btnListarEvt;
    private Button btnCadastrarPtc;
    private Button btnCadastrarEvt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListarPtc = (Button) findViewById(R.id.btn_lista_ptc);
        btnListarPtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListarPtcActivity.class);
                startActivity(intent);
            }
        });

        btnListarEvt = (Button) findViewById(R.id.btn_lista_evt);
        btnListarEvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListarEvtActivity.class);
                startActivity(intent);
            }
        });

        btnCadastrarPtc = (Button) findViewById(R.id.btn_cadastra_ptc);
        btnCadastrarPtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CadastrarParticipanteActivity.class);
                startActivity(intent);
            }
        });

        btnCadastrarEvt = (Button) findViewById(R.id.btn_cadastra_evt);
        btnCadastrarEvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CadastrarEventoActivity.class);
                startActivity(intent);
            }
        });






    }
}



