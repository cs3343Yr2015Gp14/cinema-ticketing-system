package cinemaTicket;

public class IMember implements Identity{
  private float discount = 0.95;
  private String membership = "Normal";
  
  @Override
  public float getDiscount(){
    return discount;
  }
  @Override
  public String getMembership(){
    return membership;
  }
}
