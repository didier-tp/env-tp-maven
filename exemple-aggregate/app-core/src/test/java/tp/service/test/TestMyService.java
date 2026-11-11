package tp.service.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tp.service.MyService;
import tp.service.impl.MyServiceImpl;

public class TestMyService {
	
private static MyService myService;
	
	@BeforeAll
	public static void setUp(){
		myService=new MyServiceImpl();
	}
	
	@Test
	public void testTva(){
		double res= myService.calculerTva(200,20);
		Assertions.assertEquals(40,res,0.0001);
	}
	
	@Test
	public void testTtc(){
		double res= myService.calculerTtc(200, 20);
		Assertions.assertEquals(240,res,0.0001);
	}


}
