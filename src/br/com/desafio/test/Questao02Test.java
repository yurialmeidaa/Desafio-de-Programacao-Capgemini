package br.com.desafio.test;

import br.com.desafio.Questao02;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Questao02Test {

    @Test
    public void testarSenha(){

        String senha = "Yur1#$";
String expResult = "Senha com o tamanho minimo";
String result = "Senha com o tamanho minimo";


        Questao02.senhaMinima(senha);
        assertEquals(expResult, result);
    }

}
