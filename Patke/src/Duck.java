
public class Duck {
	
	DuckBehavior dBeh;
	
	protected void display() {
		
	}
	
	protected void performFly() {
		dBeh.fly();
	}
	
	protected void performQuack() {
		dBeh.quack();		
	}
	
	protected void performSupply(){
		dBeh.supply();
	}
	
}
