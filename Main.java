package cinemaTicket;

import java.util.*;

public class Main {
	
	public static void main(String [] args){
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
		
		System.out.println("Please choose ticket type: 1 -Student/Elderly 2 -Adult");
		int i=in.nextInt();
		Identity id;
		if(i==1)
			id=new IStudentElderly();
		else if(i==2)
			id=new IAdult();
		in.nextLine();
		
		System.out.println();
		
		
		System.out.println("Buy ticket?");
		String buyAns=in.nextLine();
		if(buyAns.equals("y"))
			buy=true;
		else
			buy=false;
		
		}while (buy);
		in.close();
	}
}
