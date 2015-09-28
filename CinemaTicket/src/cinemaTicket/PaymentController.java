package cinemaTicket;

public class PaymentController {

	public static float payTotal(Movie movie,Identity[] id,Membership member,PayMethod pMethod){
		int price=movie.getPrice();
		float oriPrice=(float)0;
		for(Identity i:id){
			oriPrice+=price*i.getDiscount();
		}
		if(oriPrice*member.getDiscount() < oriPrice*pMethod.getDiscount())
			return oriPrice*member.getDiscount();
		else return oriPrice*pMethod.getDiscount();
		
	}

}
