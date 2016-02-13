package abstractDecorator;

import component.Component;

public abstract class AbstractDecorator extends Component {
	protected Component c;
	
	public void setComponent(Component c){
		this.c=c;
	}
	public void doJob(){
		if(c!=null){
			c.doJob();
		}
		
	}
}
