package cinemaTicket;

public class MSilver implements Membership{
  private float discount = (float)0.85;
  private String membership = "Silver";
  
  @Override
  public float getDiscount(){
    return discount;
  }
  @Override
  public String getMembership(){
    return membership;
  }
}
