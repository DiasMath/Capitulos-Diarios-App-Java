package com.example.capitulosdiarios;

import static com.example.capitulosdiarios.CalculadoraLeitura.showToast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capitulosdiarios.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerLivros;
    private EditText editTextDias;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupLivrosSpinner();
        setupCalcularButton();
    }

    private void initViews() {
        spinnerLivros = findViewById(R.id.spinnerLivros);
        editTextDias = findViewById(R.id.editTextDias);
        buttonCalcular = findViewById(R.id.btnCalcular);
        textViewResultado = findViewById(R.id.textResultado);
    }

    private void setupLivrosSpinner() {
        List<LivroNovoTestamento> livros = LivroNovoTestamento.obterLivrosNovoTestamento();
        LivroAdapter livroAdapter = new LivroAdapter(this, livros);
        spinnerLivros.setAdapter(livroAdapter);
    }

    private void setupCalcularButton() {
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularLeitura();
            }
        });
    }

    private void calcularLeitura() {
        LivroNovoTestamento livroSelecionado = (LivroNovoTestamento) spinnerLivros.getSelectedItem();
        String inputDias = editTextDias.getText().toString();

        if (inputDias.isEmpty()) {
            showToast(this, "Digite a quantidade de dias.");
            return;
        }

        int diasParaTerminar;

        try {
            diasParaTerminar = Integer.parseInt(inputDias);
        } catch (NumberFormatException e) {
            showToast(this, "Digite um número válido para a quantidade de dias.");
            return;
        }

        String resultado = CalculadoraLeitura.calcularLeitura(this, livroSelecionado, diasParaTerminar);

        // Verificar se a string de retorno não está vazia antes de exibir
        if (!resultado.isEmpty()) {
            textViewResultado.setText(resultado);
        }
    }
}

