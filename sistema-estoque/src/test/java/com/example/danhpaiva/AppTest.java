package com.example.danhpaiva;

import static org.junit.Assert.assertTrue;

<<<<<<< HEAD
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest {

    @Test
    public void deveInstanciarClasseApp() {
    new App(); // Só para cobrir o construtor
}


    @Test
    public void deveExecutarMainEValidarSaidaConsole() {
        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Executa o main
        App.main(new String[]{});

        // Pega o conteúdo que foi impresso
        String output = outContent.toString().trim();

        // Verifica se o histórico contém o texto esperado
        assertTrue(output.contains("Adicionado 5 unidade(s) de Iphone 16e"));
=======
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
>>>>>>> 5605f556f591c1e8452f4d18e47fa326e45c74c6
    }
}
