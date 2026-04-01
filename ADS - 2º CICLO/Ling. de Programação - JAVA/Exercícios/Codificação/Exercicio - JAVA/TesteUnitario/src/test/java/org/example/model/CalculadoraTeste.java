package org.example.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {

    @Test
    public void somarDoisNumeros(){
        Calculadora cal = new Calculadora();
        int resultado = cal.somarDoisNumeros( 2, 5 );
        assertEquals( 7 , resultado );

        System.out.print(resultado);
    }

}
