package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(3, 2);
        assertEquals(5, resultado);  // Verifica se 3 + 2 é igual a 5
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(5, 3);
        assertEquals(2, resultado);  // Verifica se 5 - 3 é igual a 2
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(3, 2);
        assertEquals(6, resultado);  // Verifica se 3 * 2 é igual a 6
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(6, 2);
        assertEquals(3.0, resultado, 0.0001);  // Verifica se 6 / 2 é igual a 3.0
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(6, 0));
    }
}

