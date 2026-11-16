package com.mycompany.app1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * App
 *
 */
public class App
{
    private static Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        log.info("Calculateur (mode texte)");
        //System.out.println( "Calculateur (mode texte)" );
        App objApp = new App();
        objApp.interactive_calcul();
    }

    private Calculateur calc = new Calculateur();
    Scanner reader = new Scanner(System.in);

    public void interactive_calcul(){
        double x,y,resAdd,resMult;
        System.out.print("\nx: "); x = Double.parseDouble(reader.next());
        System.out.print("\ny: "); y = Double.parseDouble(reader.next());
        resAdd = calc.add(x,y);
        resMult = calc.mult(x,y);
        System.out.println(x+" + "+y+" = "+resAdd);
        System.out.println(x+" * "+y+" = "+resMult);
    }
}
