package com.koznem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareRootTest {

    @Test
    public void testGoForNoRealRoots(){
        // given
        double a = 5, b=1, c=1;
        SquareRoot squareRoot = new SquareRoot();
        String result = "";

        // when
        result = squareRoot.go(a,b,c);

        // then

        assertEquals(result,"No real roots");

    }

    @Test
    public void testGoForOneRoot(){
        // given
        double a = 1, b=-4, c=4;
        SquareRoot squareRoot = new SquareRoot();
        String result = "";

        // when
        result = squareRoot.go(a,b,c);

        // then

        assertEquals(result,"1 root : 2.0");
    }

    @Test
    public void testGoForTwoRoots(){
        // given
        double a = 1, b=-4, c=3;
        SquareRoot squareRoot = new SquareRoot();
        String result = "";

        // when
        result = squareRoot.go(a,b,c);

        // then

        assertEquals(result,"2 roots : x1 = 3.0; x2 = 1.0");
    }

}