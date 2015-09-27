package cinemaTicket;

public class ISilver implements Membership{
  private float discount = 0.85;
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
