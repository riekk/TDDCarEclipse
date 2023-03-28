
public class Car {

	public int velocity;

	public void acelerate_ChristianTM(int aceleration) {
		velocity += aceleration;
		
	}

	public void desacelerate_ChristianTM(int desaceleration) {
		velocity -= desaceleration;
		if (velocity < 0) {
			velocity = 0;
		}
		
	}

}
