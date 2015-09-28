package cinemaTicket;

import java.util.*;

public class Main {
	
	public static void main(String [] args){
		ArrayList<Identity> ticket= new ArrayList<Identity>(); //
		
		Scanner in = new Scanner(System.in);
		boolean buy=true;
		do{
		System.out.println("Please choose a movie: ");
		MovieOffice.listMovie();
		Movie movie=new Movie(in.nextInt());
		in.nextLine();
		
		System.out.println("Please choose time: ");
		movie.getAllSchedule();
		Schedule schedule=new Schedule(movie,in.nextLine());
		
		System.out.println("Number of seats: ");
		int numOfSeat=in.nextInt();
		
		System.out.println("Please choose seats: ");
		SeatAllocation.listAllSeat();
		String[] seats=new String[numOfSeat];
		boolean avail=true;
		do{
		for(int i=0;i<numOfSeat;i++){
				seats[i]=in.next();
		}
		in.nextLine();
		avail=SeatAllocation.checkAvail(schedule,seats);
		}while (!avail);
		
		for(String s:seats){
			Seat seat=new Seat(s,false);
			SeatAllocation.allocateSeat(schedule,seat);
		}		
			
		System.out.println("Please enter the number of tickets you want for each type. 1-Student/Elderly 2-Adult");
		System.out.print("1 -Student/Elderly: ");
		int sNum=in.nextInt();
		in.nextLine();
		System.out.print("2 -Adult: ");
		int aNum=in.nextInt();
		in.nextLine();
		
		Identity[] id=new Identity[numOfSeat];
		for (int i=0; i< sNum; i++){
			id[i]=new IStudentElderly();
			SeatAllocation.getSeat(schedule,seats[i]).setId(id[i]);
		}
		for (int i=sNum; i< numOfSeat; i++){
			id[i]=new IAdult();
			SeatAllocation.getSeat(schedule,seats[i]).setId(id[i]);
		}
		
		System.out.println("Please choose member type: 1-Not Member 2-Normal 3-Gold 4-Silver");
		int mType=in.nextInt();
		in.nextLine();
		Membership member;
		if (mType==2)
			member=new MNormal();
		else if (mType==3)
			member=new MGold();
		else if (mType==4)
			member=new MSilver();
		else
			member=new MNotMember();
		
		System.out.println("Please choose pay method: 1-Cash 2-Credit Card");
		int pay=in.nextInt();
		in.nextLine();
		PayMethod pMethod;
		if (pay==1)
			pMethod=new PCash();
		else
			pMethod=new PCreditCard();
		
		System.out.print("Summary:\nMovie: "+movie.getName()+"\nTime: "+schedule.getSchedule()+"\nSeat: ");
		for(String s:seats){
			System.out.print(SeatAllocation.getSeat(schedule,s).getSeatName()+" ");
		}
		System.out.println("\nTotal: $"+PaymentController.payTotal(movie,id,member,pMethod));
		
		System.out.println("\nBuy ticket?");
		String buyAns=in.nextLine();
		if(buyAns.equals("y"))
			buy=true;
		else
			buy=false;
		
		}while (buy);
		in.close();
	}
}
