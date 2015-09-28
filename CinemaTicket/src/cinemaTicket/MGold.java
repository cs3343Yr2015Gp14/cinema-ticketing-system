package cinemaTicket;

public class MGold implements Membership{
  private float discount = (float)0.8;
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