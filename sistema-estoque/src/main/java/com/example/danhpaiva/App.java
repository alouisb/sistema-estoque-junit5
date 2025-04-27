package com.example.danhpaiva;

public class App {
<<<<<<< HEAD
    public App() {
        // Construtor vazio
    }

    public static void main(String[] args) {
        SistemaEstoque sistemaEstoque = new SistemaEstoque();
=======
    public static void main(String[] args) {
        SistemaEstoque sistemaEstoque = new SistemaEstoque();

>>>>>>> 5605f556f591c1e8452f4d18e47fa326e45c74c6
        sistemaEstoque.adicionarProduto("Iphone 16e", 5);
        System.out.println(sistemaEstoque.obterHistoricoTransacoes());
    }
}
