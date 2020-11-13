package com.example.listenerfernandolagunas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnSaludo1;
    private Button btnSaludo2;
    private TextView txtVistaSaludos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaludo1 = (Button)findViewById(R.id.Saludo1);
        btnSaludo2 = (Button)findViewById(R.id.Saludo2);
        txtVistaSaludos = (TextView)findViewById(R.id.VistaSaludos);

        btnSaludo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVistaSaludos.setText("Este es el saludo del primer botón");
            }
        });
        btnSaludo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVistaSaludos.setText("Este es el saludo del segundo botón");
            }
        });
    }
}