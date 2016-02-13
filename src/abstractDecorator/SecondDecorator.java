package abstractDecorator;

public class SecondDecorator extends AbstractDecorator{
	
	public void doJob(){
		
		super.doJob();
		System.out.println("from second");
	}

}
