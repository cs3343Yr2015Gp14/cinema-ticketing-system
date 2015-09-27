package cinemaTicket;

public class IStudentElderly implements Identity{
  private float discount=0.9;
  
  @Override
  public float getDiscount(){
    return discount;
  }
}
