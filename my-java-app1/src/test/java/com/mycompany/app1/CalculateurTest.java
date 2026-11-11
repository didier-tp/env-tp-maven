package com.mycompany.app1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


public class CalculateurTest
{
    //private static Logger log = LoggerFactory.getLogger(CalculateurTest.class);//comme avec @Slf4j de lombok
    private Calculateur c;


    @BeforeEach
    public void init() {
        c = new Calculateur();
    }

    @Test
    public void testAdd()
    {
        double res =c.add(5,6);
        //log.debug("5+6="+res);
        Assertions.assertEquals(  11, res , 0.000001 );
    }

    @Test
    public void testMult()
    {
        double res =c.mult(5,6);
        //log.debug("5*6="+res);
        Assertions.assertEquals( 30  , res , 0.000001 );
    }
}
