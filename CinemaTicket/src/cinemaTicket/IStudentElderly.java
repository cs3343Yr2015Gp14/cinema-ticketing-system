package cinemaTicket;

public class IStudentElderly extends Identity{
	String id="Student/Elderly";
	private float discount=(float) 0.85;
	
	
	
	@Override
	public String getId(){
		return id;
	}
	
	@Override
	  public float getDiscount(){
	    return discount;
	  }
}
