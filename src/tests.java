import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class tests {

	@Test
	public void createCarVelocity0() {
		Car newCar = new Car();
		newCar.acelerate(30);
		Assert.assertEquals(30, newCar.velocity);
		
	}
	
	@Test
	public void carDesaceleration() {
		Car newCar = new Car();
		newCar.velocity = 50;
		newCar.desacelerate(30);
		Assert.assertEquals(20, newCar.velocity);
		
	}
	
	@Test
	public void carDesacelerationCantBeLower0() {
		Car newCar = new Car();
		newCar.velocity = 50;
		newCar.desacelerate(80);
		Assert.assertEquals(0, newCar.velocity);
		
	}

}
