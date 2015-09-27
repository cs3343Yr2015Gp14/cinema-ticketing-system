package cinemaTicket;
import java.util.ArrayList;

public class PaymentController {
	
	public float getPrice(float discount, int price){
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
	}
}
