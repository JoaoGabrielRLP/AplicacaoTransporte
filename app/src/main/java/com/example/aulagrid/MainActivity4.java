package com.example.aulagrid;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    private CalendarView calendario;
    private Button voltar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);


        calendario = findViewById(R.id.calendario);
        voltar = findViewById(R.id.tela);

        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                month++;
                Toast.makeText(getBaseContext(), "Ano:"+year+" Mes: "+month+" Dia: "+dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void voltarTela(View view)
    {
        Intent b = new Intent(MainActivity4.this,MainActivity.class);
        startActivity(b);
    }
}