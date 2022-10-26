package com.example.aulagrid;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText nome,numero;
    private Button imprimir,voltar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        nome = findViewById(R.id.nome);
        numero = findViewById(R.id.numero);
        voltar = findViewById(R.id.tela);
        imprimir = findViewById(R.id.imprimir);
    }
    public void mostrarRotas(View view)
    {
        String a = nome.getText().toString();
        String b = numero.getText().toString();

        if(a.equals("Pedro da Rosa") && b.equals("154469")){

            Toast.makeText(getBaseContext(),"Olá: "+a+" Sua rota é: São Paulo - Guarulhos, Tenha uma ótima Viajem"+"\nNumero caminhão: "+b,Toast.LENGTH_LONG).show();

            nome.setText("");
            numero.setText("");

        }else{
            Toast.makeText(getBaseContext(),"Preencha os dados acima corretamente",Toast.LENGTH_LONG).show();

        }
    }

    public void voltarTela(View view)
    {
        Intent b = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(b);
    }
}