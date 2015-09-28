package cinemaTicket;
import java.util.ArrayList;

public class PaymentController {
	//Eva
	/*public float getPrice(float discount, int price){
		return price*discount;
	}
	
	public float getTotal(boolean memberState, Movie movie, ArrayList<User> ticket){
		//Assume that array list have stored the number of tickets the user want to buy.(using user represent a ticket) (the first user = the user who buy the ticket)
		float memberDis;
		if (memberState == true){
			memberDis = (float) ticket.get(0).getMemD();
		}
		else
			memberDis=1;
		int total =0;
		for (int i=0; i< ticket.size(); i++){
			if(ticket.get(i).getAgeD()<memberDis)
				total+=(float) getPrice(ticket.get(i).getAgeD(), movie.getPrice());
			else
				total+=(float) getPrice(memberDis, movie.getPrice());
		}
		return total;
	}*/

	//Connie
	/*public static float payTotal(Movie movie,Identity[] id,Membership member,PayMethod pMethod){
		int price=movie.getPrice();
		float oriPrice=(float)0;
		for(Identity i:id){
			oriPrice+=price*i.getDiscount();
		}
		if(oriPrice*member.getDiscount() < oriPrice*pMethod.getDiscount())
			return oriPrice*member.getDiscount();
		else return oriPrice*pMethod.getDiscount();
		
	}*/

}
