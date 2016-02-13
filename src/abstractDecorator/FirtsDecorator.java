package abstractDecorator;

public class FirtsDecorator extends AbstractDecorator{
	
	public void doJob(){
		super.doJob();
		System.out.println("from first");
	}

}
