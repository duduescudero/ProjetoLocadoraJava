package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    void testCustoComDesconto() {
        Veiculo v = new Veiculo("Onix", 100);
        assertEquals(630, v.calcularCusto(7));
    }

    @Test
    void testCustoSemDesconto() {
        Veiculo v = new Veiculo("Onix", 100);
        assertEquals(300, v.calcularCusto(3));
    }

    @Test
    void testMulta() {
        Veiculo v = new Veiculo("Onix", 100);
        assertEquals(150, v.calcularMulta(1));
    }

    @Test
    void testValorNegativoOuZero() {
        Veiculo v = new Veiculo("Onix", -100);
        assertEquals(0, v.calcularCusto(5));
        assertEquals(0, v.calcularCusto(0));
    }
}
