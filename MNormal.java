package cinemaTicket;

public class MNormal implements Membership{
  private float discount = (float)0.95;
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
