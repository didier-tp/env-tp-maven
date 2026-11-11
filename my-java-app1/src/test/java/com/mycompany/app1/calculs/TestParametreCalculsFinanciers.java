package com.mycompany.app1.calculs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;



public class TestParametreCalculsFinanciers {

	//private static Logger log = LoggerFactory.getLogger(TestParametreCalculsFinanciers.class);

	private CalculsFinanciers calculsFinanciers;//à tester

	@BeforeEach
	public void init() {
		calculsFinanciers = new CalculsFinanciers();
	}

	@ParameterizedTest
	@CsvSource(delimiter = ';',
			value= { "24;10000.0;2.5;427.60" ,
					"48;50000.0;3.0;1106.72" ,
					"60;60000;2.0;1051.67" ,
					"120;80000;2.5;754.16" ,
			}
	)
	void testMensualiteSelonCsvSource(int nbMois,double montant, double tauxAnnuelPct , double expectedMensualite) {
		double mensualite = this.calculsFinanciers.mensualite(montant, nbMois, tauxAnnuelPct);
		assertEquals(expectedMensualite , mensualite,  0.01);
		/*log.trace("testMensualiteSelonCsvSource nbMois="+nbMois
				+ " montant="+montant
				+ " tauxAnnuelPct="+tauxAnnuelPct
				+ " mensualite="+mensualite
				+ " expectedMensualite="+expectedMensualite );*/

	}

}
