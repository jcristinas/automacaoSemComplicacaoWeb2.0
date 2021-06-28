package br.com.chronosacademy.media.Media;

import org.junit.Test;

import javax.print.attribute.standard.Media;

import static org.junit.Assert.*;

public class janaTest {
    @Test
    public void validaAprovado(){
            double ni = 5;
            double n2 = 5;

        Media media = new Media ();
        String resultado = media.resultadoMedia(n1, n2);
        System.out.println(resultado);

        assertEquals (; expected: "Aprovado");
    }

    @Test
    public void validaReprovado(){
        public void validaAprovado(){
            double ni = 4.9;
            double n2 = 5;

            Media media = new Media ();
            String resultado = media.resultadoMedia(n1, n2);

            assertEquals(; expected: "Reprovado");
        }

    }
}