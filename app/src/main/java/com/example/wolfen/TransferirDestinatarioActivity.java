package com.example.wolfen;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TransferirDestinatarioActivity extends AppCompatActivity {

    private ImageButton btnFechar;
    private Button btnContinuar;
    private EditText edtDestinatario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferirdestinatario);

        btnFechar = findViewById(R.id.btnFechar);
        btnContinuar = findViewById(R.id.btnContinuar);
        edtDestinatario = findViewById(R.id.edtDestinatario);

        btnFechar.setOnClickListener(v -> finish());

        btnContinuar.setOnClickListener(v -> {
            String destinatario = edtDestinatario.getText().toString().trim();

            if (destinatario.isEmpty()) {
                edtDestinatario.setError("Informe o nome, CPF ou CNPJ");
            } else {
                // Depois aqui vocês podem abrir a próxima tela
            }
        });
    }
}