package tp.service.impl;

import tp.lib.MyLib;
import tp.lib.impl.MyLibImpl;
import tp.service.MyService;

public class MyServiceImpl implements MyService {
	
	MyLib myLib = new MyLibImpl();

	public double calculerTva(double ht, double taux){
		return myLib.mult(ht, taux/100);
	}

	public double calculerTtc(double ht, double taux) {
		return myLib.add(ht, calculerTva(ht,taux));
	}

}
