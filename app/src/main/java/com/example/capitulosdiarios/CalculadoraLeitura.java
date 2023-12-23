package com.example.capitulosdiarios;
import android.content.Context;
import android.widget.Toast;

public class CalculadoraLeitura {

    public static String calcularLeitura(Context context, LivroNovoTestamento livro, int diasParaTerminar) {
        if (livro == null || diasParaTerminar <= 0 || diasParaTerminar > livro.getQuantidadeCapitulos()) {
            showToast(context, "Tente novamente.");
            return "Selecione um livro e insira uma quantidade de dias válida.";
        }

        // Calcular a quantidade de capítulos por dia e arredondar para cima
        double quantidadeCapitulosPorDiaDouble = (double) livro.getQuantidadeCapitulos() / diasParaTerminar;
        int quantidadeCapitulosPorDia = (int) Math.ceil(quantidadeCapitulosPorDiaDouble);

        // Mensagem informativa sobre o arredondamento
        String mensagemArredondamento = "";
        if (quantidadeCapitulosPorDiaDouble != quantidadeCapitulosPorDia) {
            mensagemArredondamento = " (Número de capítulos arredondado para cima. " +
                    "Portanto, você acabará antes!)";
        }

        // Remover hifens e números no final do nome do livro
        String nomeLivro = livro.getNome().replaceAll("-+\\s*\\d+$", "").trim();

        // Construir a mensagem final

        return "Para ler " + nomeLivro + " em " + diasParaTerminar +
                " dias, você precisa ler " + quantidadeCapitulosPorDia + " capítulo(s) por dia." + mensagemArredondamento;
    }

    public static void showToast(Context context, String message) {
        // Exibir a Toast message
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}

