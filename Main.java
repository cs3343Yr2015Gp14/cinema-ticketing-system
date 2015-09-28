package cinemaTicket;

import java.util.*;

public class Main {
	private ArrayList<Identity> ticket= new ArrayList<Identity>();	//Eva
	
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
		
		//Some Edition-Eva
		/*int seatType;
		Identity id;
		while (true){
			System.out.println("Please choose ticket type: 1 -Student/Elderly 2 -Adult");
			seatType=in.nextInt();
			if (seatType != 1 && seatType != 2)
				System.out.print("Not vaild type");
			else
				break;
		}
		if(numOfSeat==1){
			if(seatType==1){
				id=new IStudentElderly();
				ticket.add(id);
			}
			else if(seatType==2){
				id=new IAdult();
				ticket.add(id);
			}
		}
		else{
			while(numOfSeat>1){
				do{
					System.out.println("How many tickets you want for this type?");
					int num=in.nextInt();
					for (int i=0; i< num; i++){
						if(seatType==1){
							id=new IStudentElderly();
							ticket.add(id);
						}
						else if(seatType==2){
							id=new IAdult();
							ticket.add(id);
						}
					}
					numOfSeat-=num;
				}while(numOfSeat==1);
			}
		}//end of the Edition
		in.nextLine();
		
		System.out.println();
		*/
		
		//Connie
		/*
		System.out.println("Please enter the number of tickets you want for each type. 1-Student/Elderly 2-Adult");
		System.out.print("1 -Student/Elderly: ");
		int sNum=in.nextInt();
		in.nextLine();
		System.out.print("2 -Adult: ");
		int aNum=in.nextInt();
		in.nextLine();
		
		Identity id;
		for (int i=0; i< sNum; i++){
			id=new IStudentElderly();
			SeatAllocation.getSeat(schedule,seats[i]).setId(id);
		}
		for (int i=sNum; i< numOfSeat; i++){
			id=new IAdult();
			SeatAllocation.getSeat(schedule,seats[i]).setId(id);
		}//end of the Edition
		*/
		
		System.out.println("Member type: 1-Not Member 2-Normal 3-Gold 4-Silver");
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
		System.out.println("\nTotal: $"+PaymentController.payTotal());
		
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
