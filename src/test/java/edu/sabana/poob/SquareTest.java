package edu.sabana.poob;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private static Square s1;
    private static Square s2;
    private static Square s3;
    private static Square s4;

    @BeforeAll
    public static void setUp() {
        s1 = new Square(5,5);
        s2 = new Square("Canela Pasión",3,3);
        s3 = new Square("Aguacate");
        s4 = new Square();
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(25, (int) s1.getArea());
        assertEquals(9, (int) s2.getArea());
        assertEquals(1, (int) s3.getArea());
        assertEquals(1, (int) s4.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(20, (int) s1.getPerimeter());
        assertEquals(12, (int) s2.getPerimeter());
        assertEquals(4, (int) s3.getPerimeter());
        assertEquals(4, (int) s4.getPerimeter());
    }

    @Test
    public void ShouldCalculateDiagonal(){
        assertEquals(7, (int) s1.getDiagonal());
        assertEquals(4, (int) s2.getDiagonal());
        assertEquals(1, (int) s3.getDiagonal());
        assertEquals(1, (int) s4.getDiagonal());
    }

    @Test
    public void shouldPrintSquare() {

        assertEquals("This is a Square with color NONE , width 5 and length 5", s1.toString());
        assertEquals("This is a Square with color Canela Pasión , width 3 and length 3", s2.toString());
        assertEquals("This is a Square with color Aguacate , width 1 and length 1", s3.toString());
        assertEquals("This is a Square with color NONE , width 1 and length 1", s4.toString());
    }

}
