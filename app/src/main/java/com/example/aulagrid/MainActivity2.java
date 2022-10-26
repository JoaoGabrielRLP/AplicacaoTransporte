package com.example.aulagrid;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText nome,cep,fone,endereco;
    private Button imprimir,voltar;
    private RadioButton alimento,construcao, encomenda;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        nome = findViewById(R.id.nome);
        cep = findViewById(R.id.cep);
        fone = findViewById(R.id.fone);
        endereco = findViewById(R.id.endereco);
        alimento = findViewById(R.id.alimento);
        construcao = findViewById(R.id.construcao);
        encomenda = findViewById(R.id.encomenda);
        voltar = findViewById(R.id.voltar);
        imprimir = findViewById(R.id.imprimir);
    }
    public void imprimirCliente(View view)
    {
        String a = nome.getText().toString();
        String b = cep.getText().toString();
        String c = fone.getText().toString();
        String d = endereco.getText().toString();

        if(alimento.isChecked() == true){
            Toast.makeText(getBaseContext(),""+a + ", "+ b + ", "+c + ", "+d + "\nTransporte de alimentação" ,Toast.LENGTH_LONG).show();
        }
        else if(construcao.isChecked() == true){
            Toast.makeText(getBaseContext(),""+a + ", "+ b + ", "+c + ", "+d + "\nTransporte de construção" ,Toast.LENGTH_LONG).show();
        }
        else if(encomenda.isChecked() == true){
            Toast.makeText(getBaseContext(),""+a + ", "+ b + ", "+c + ", "+d + "\nTransporte de encomenda" ,Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getBaseContext(),"\nSelecione seu tipo de transporte" ,Toast.LENGTH_LONG).show();
        }


    }

    public void voltarTela(View view)
    {
        Intent b = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(b);
    }
}