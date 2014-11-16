import junit.framework.TestCase;


public class AccountTest extends TestCase {
	
	private Account account;
	
	protected void setUp() throws Exception {
		
		super.setUp();
		account = new Account();
	}

	public void testRedPlate() {
		
		account.addRedPlate();
		assertEquals(100,account.getTotalPrice());
		
		account.addRedPlate();
		assertEquals(200,account.getTotalPrice());
	}
	
	public void testBulePlate() {

		account.addBluePlate();
		assertEquals(300,account.getTotalPrice());
	}
	
	public void testRedOneAndBuleTwo() {
		
		account.addRedPlate();
		account.addBluePlate();
		account.addBluePlate();
		assertEquals(700,account.getTotalPrice());
	}
	
	public void testYellow() {
		
		account.addYellowPlate();
		assertEquals(450,account.getTotalPrice());
	}
	
	public void testBlueOneAndYellowTwo() {
		
		account.addBluePlate();
		account.addYellowPlate();
		account.addYellowPlate();
		assertEquals(1200,account.getTotalPrice());
	}
	
	public void testRed5AndBule10AndYellow4() {
		
		for(int i = 0; i < 5; i++) {
			account.addRedPlate();
		}
		
		for(int i = 0; i < 10; i++) {
			account.addBluePlate();
		}
		
		for(int i = 0; i < 4; i++) {
			account.addYellowPlate();
		}
		
		assertEquals(5300,account.getTotalPrice());
	}
}
