package cinemaTicket;

public class IAdult extends Identity{
	String id="Adult";
	private float discount = 1;
	
	@Override
	public String getId(){
		return id;
	}
	
	@Override
	public float getDiscount(){
		return discount;
	}
}
