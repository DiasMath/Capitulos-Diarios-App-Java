package com.example.capitulosdiarios;

import java.util.ArrayList;
import java.util.List;

public class LivroNovoTestamento {
    private final String nome;
    private final int quantidadeCapitulos;

    public LivroNovoTestamento(String nome, int quantidadeCapitulos) {
        this.nome = nome;
        this.quantidadeCapitulos = quantidadeCapitulos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeCapitulos() {
        return quantidadeCapitulos;
    }

    public static List<LivroNovoTestamento> obterLivrosNovoTestamento() {
        List<LivroNovoTestamento> livros = new ArrayList<>();

        // Adiciona "Selecione o Livro" como a primeira entrada
        LivroNovoTestamento livroDica = new LivroNovoTestamento("Selecione o Livro", 0);
        livros.add(livroDica);

        livros.add(new LivroNovoTestamento("Novo Testamento Completo ----------------- 260", 260));
        livros.add(new LivroNovoTestamento("Mateus ---------------------------------------------------- 28", 28));
        livros.add(new LivroNovoTestamento("Marcos ---------------------------------------------------- 16", 16));
        livros.add(new LivroNovoTestamento("Lucas ------------------------------------------------------- 24", 24));
        livros.add(new LivroNovoTestamento("João --------------------------------------------------------- 21", 21));
        livros.add(new LivroNovoTestamento("Atos ---------------------------------------------------------- 28", 28));
        livros.add(new LivroNovoTestamento("Romanos -------------------------------------------------- 16", 16));
        livros.add(new LivroNovoTestamento("1 Coríntios ------------------------------------------------ 16", 16));
        livros.add(new LivroNovoTestamento("2 Coríntios ------------------------------------------------ 13", 13));
        livros.add(new LivroNovoTestamento("Gálatas ------------------------------------------------------- 6", 6));
        livros.add(new LivroNovoTestamento("Efésios -------------------------------------------------------- 6", 6));
        livros.add(new LivroNovoTestamento("Filipenses ---------------------------------------------------- 4", 4));
        livros.add(new LivroNovoTestamento("Colossenses ------------------------------------------------ 4", 4));
        livros.add(new LivroNovoTestamento("1 Tessalonicenses --------------------------------------- 5", 5));
        livros.add(new LivroNovoTestamento("2 Tessalonicenses --------------------------------------- 3", 3));
        livros.add(new LivroNovoTestamento("1 Timóteo ---------------------------------------------------- 6", 6));
        livros.add(new LivroNovoTestamento("2 Timóteo ---------------------------------------------------- 4", 4));
        livros.add(new LivroNovoTestamento("Tito -------------------------------------------------------------- 3", 3));
        livros.add(new LivroNovoTestamento("Filemom ------------------------------------------------------ 1", 1));
        livros.add(new LivroNovoTestamento("Hebreus ----------------------------------------------------- 13", 13));
        livros.add(new LivroNovoTestamento("Tiago ----------------------------------------------------------- 5", 5));
        livros.add(new LivroNovoTestamento("1 Pedro -------------------------------------------------------- 5", 5));
        livros.add(new LivroNovoTestamento("2 Pedro -------------------------------------------------------- 3", 3));
        livros.add(new LivroNovoTestamento("1 João --------------------------------------------------------- 5", 5));
        livros.add(new LivroNovoTestamento("2 João --------------------------------------------------------- 1", 1));
        livros.add(new LivroNovoTestamento("3 João --------------------------------------------------------- 1", 1));
        livros.add(new LivroNovoTestamento("Judas ---------------------------------------------------------- 1", 1));
        livros.add(new LivroNovoTestamento("Apocalipse ------------------------------------------------ 22", 22));


        return livros;
    }
}
