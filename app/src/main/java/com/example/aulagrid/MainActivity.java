package com.example.aulagrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView cadastro, estrada, calendario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       cadastro = findViewById(R.id.cadastro);
       estrada = findViewById(R.id.estrada);
       calendario = findViewById(R.id.calendario);


    }
        public void abrirCliente(View view)
        {
            Intent a = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(a);
        }

        public void openEmpresa(View view)
        {
            Intent a = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(a);
        }

        public void abrirProduto(View view)
        {
            Intent a = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(a);
        }
        public void abrirEstoque(View view)
        {
            Intent a = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(a);
        }






}