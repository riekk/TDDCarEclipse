
public class Car {

	public int velocity;

	public void acelerate(int aceleration) {
		velocity += aceleration;
		
	}

	public void desacelerate(int desaceleration) {
		velocity -= desaceleration;
		if (velocity < 0) {
			velocity = 0;
		}
		
	}

}
