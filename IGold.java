package cinemaTicket;

public class IGold implements Identity{
  private float discount = 0.8;
  private String membership = "Gold";
  
  @Override
  public float getDiscount(){
    return discount;
  }
  @Override
  public String getMembership(){
    return membership;
  }
}
