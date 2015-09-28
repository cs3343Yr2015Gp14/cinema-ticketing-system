package cinemaTicket;

public class MNotMember implements Membership{
  private float discount = (float)1.0;
  private String membership = "Not Member";
  
  @Override
  public float getDiscount(){
    return discount;
  }
  @Override
  public String getMembership(){
    return membership;
  }
}