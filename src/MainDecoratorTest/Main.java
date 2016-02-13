package MainDecoratorTest;

import abstractDecorator.AbstractDecorator;
import abstractDecorator.FirtsDecorator;
import abstractDecorator.SecondDecorator;
import component.Component;
import component.ComponentImp;

public class Main {
	public static void main(String r[]){
		
		ComponentImp c = new ComponentImp();
		FirtsDecorator a = new FirtsDecorator();
		a.setComponent(c);
		a.doJob();
		SecondDecorator s = new SecondDecorator();
		s.setComponent(c);
		s.doJob();
	}
	
}
