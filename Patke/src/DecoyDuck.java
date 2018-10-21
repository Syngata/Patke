
public class DecoyDuck extends Duck{

	@Override
	protected void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a decoy duck");
	}
	
	public DecoyDuck() {
		
		display();
		dBeh = new SupplyEl();
		performSupply();
		dBeh= new FlyNoWings();
		performFly();
		dBeh = new iSqueek();
		performQuack();
		
	}
	
}
