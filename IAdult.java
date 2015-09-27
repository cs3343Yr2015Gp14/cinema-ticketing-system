package cinemaTicket;

public class IAdult implements Identity{
  private float discount = 1;
  
  @Override
  public float getDiscount(){
    return discount;
  }
}
