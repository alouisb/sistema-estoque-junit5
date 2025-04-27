package com.example.danhpaiva;

<<<<<<< HEAD
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class SistemaEstoqueTest {

    private SistemaEstoque sistemaEstoque;

    @Before
    public void setUp() {
        sistemaEstoque = new SistemaEstoque();
    }

    // Testes de adicionarProduto

    @Test
    public void deveAdicionarProdutoComSucesso() {
        sistemaEstoque.adicionarProduto("Caneta", 10);
        assertEquals(10, sistemaEstoque.consultarEstoque("Caneta"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAdicionarProdutoComNomeNulo() {
        sistemaEstoque.adicionarProduto(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAdicionarProdutoComNomeVazio() {
        sistemaEstoque.adicionarProduto("   ", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAdicionarProdutoComQuantidadeZero() {
        sistemaEstoque.adicionarProduto("Caneta", 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAdicionarProdutoComQuantidadeNegativa() {
        sistemaEstoque.adicionarProduto("Caneta", -5);
    }

    // Testes de removerProduto

    @Test
    public void deveRemoverProdutoComSucesso() {
        sistemaEstoque.adicionarProduto("Lápis", 10);
        sistemaEstoque.removerProduto("Lápis", 5);
        assertEquals(5, sistemaEstoque.consultarEstoque("Lápis"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveRemoverProdutoInexistente() {
        sistemaEstoque.removerProduto("Borracha", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveRemoverQuantidadeMaiorQueDisponivel() {
        sistemaEstoque.adicionarProduto("Caderno", 2);
        sistemaEstoque.removerProduto("Caderno", 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveRemoverProdutoComNomeNulo() {
        sistemaEstoque.removerProduto(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveRemoverProdutoComNomeVazio() {
        sistemaEstoque.removerProduto("   ", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveRemoverProdutoComQuantidadeZero() {
        sistemaEstoque.removerProduto("Caderno", 0);
    }

    @Test
    public void deveRemoverProdutoTodoEDepoisExcluirDoEstoque() {
        sistemaEstoque.adicionarProduto("Borracha", 5);
        sistemaEstoque.removerProduto("Borracha", 5);
        assertEquals(0, sistemaEstoque.consultarEstoque("Borracha"));
    }

    // Testes de consultarEstoque

    @Test
    public void deveConsultarEstoqueProdutoExistente() {
        sistemaEstoque.adicionarProduto("Caneta", 3);
        assertEquals(3, sistemaEstoque.consultarEstoque("Caneta"));
    }

    @Test
    public void deveConsultarEstoqueProdutoInexistente() {
        assertEquals(0, sistemaEstoque.consultarEstoque("ProdutoInexistente"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveConsultarEstoqueComNomeNulo() {
        sistemaEstoque.consultarEstoque(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveConsultarEstoqueComNomeVazio() {
        sistemaEstoque.consultarEstoque("   ");
    }

    // Testes de obterHistoricoTransacoes

    @Test
    public void deveObterHistoricoTransacoes() {
        sistemaEstoque.adicionarProduto("Caneta", 10);
        sistemaEstoque.removerProduto("Caneta", 5);
        List<String> historico = sistemaEstoque.obterHistoricoTransacoes();
        assertEquals(2, historico.size());
    }

    // Testes de verificarDisponibilidade

    @Test
    public void deveVerificarDisponibilidadeComSucesso() {
        sistemaEstoque.adicionarProduto("Caneta", 10);
        assertTrue(sistemaEstoque.verificarDisponibilidade("Caneta", 5));
    }

    @Test
    public void deveRetornarFalseParaProdutoIndisponivel() {
        sistemaEstoque.adicionarProduto("Caneta", 2);
        assertFalse(sistemaEstoque.verificarDisponibilidade("Caneta", 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveVerificarDisponibilidadeComNomeNulo() {
        sistemaEstoque.verificarDisponibilidade(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveVerificarDisponibilidadeComNomeVazio() {
        sistemaEstoque.verificarDisponibilidade("   ", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveVerificarDisponibilidadeComQuantidadeInvalida() {
        sistemaEstoque.verificarDisponibilidade("Caneta", 0);
    }

    @Test
    public void deveRetornarTrueQuandoProdutoDisponivel() {
        sistemaEstoque.adicionarProduto("Mouse", 10);
        boolean disponibilidade = sistemaEstoque.verificarDisponibilidade("Mouse", 5);
        assertTrue(disponibilidade);
    }

    @Test
    public void deveRetornarFalseQuandoProdutoIndisponivel() {
        sistemaEstoque.adicionarProduto("Teclado", 2);
        boolean disponibilidade = sistemaEstoque.verificarDisponibilidade("Teclado", 5);
        assertFalse(disponibilidade);
    }

    @Test
    public void deveRetornarFalseQuandoProdutoNaoExisteNoEstoque() {
        boolean disponibilidade = sistemaEstoque.verificarDisponibilidade("ProdutoInexistente", 5);
        assertFalse(disponibilidade);
    }
=======
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SistemaEstoqueTest {
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }
>>>>>>> 5605f556f591c1e8452f4d18e47fa326e45c74c6
}
