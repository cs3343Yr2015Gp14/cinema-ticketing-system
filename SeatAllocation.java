package cinemaTicket;

import java.util.Map;
import java.util.TreeMap;

public class SeatAllocation {
	private static String[] allSeats={"A1","A2","A3","A4","A5","A6","B1","B2","B3","B4","B5","B6","C1","C2","C3","C4","C5","C6"};
	private static Map<Schedule,Seat[]> SeatControllers = new TreeMap<>();
	
	public static String[] listAllSeat(){
		return allSeats;
	}
	
	public static boolean checkAvail(Schedule s,String[] seats){
		if(SeatControllers.get(s)!=null){
			for(int i=0;i<seats.length;i++)
				for(int j=0;j<SeatControllers.get(s).length;j++){
					if((SeatControllers.get(s))[j].getSeatName().equals(seats[i]))
						if ((SeatControllers.get(s))[j].getStatus().getStatus().equals("Available"))
							return false;
				}
			}
		return true;
	}
	
	public static void allocateSeat(Schedule aSch,Seat aSeat){
		if(SeatControllers.get(aSch)==null){
			Seat[] seats=new Seat[allSeats.length];
			int idx=0;
			for(String s:allSeats){
				Seat seat=new Seat(s,false);
				seats[idx]=seat;
				idx++;
			}
			SeatControllers.put(aSch,seats);
		}
		for(int i=0;i<SeatControllers.get(aSch).length;i++)
			if((SeatControllers.get(aSch))[i].getSeatName().equals(aSeat.getSeatName()))
				(SeatControllers.get(aSch))[i]=aSeat;
	}
	
	public static Seat getSeat(Schedule aSch,String aSeat){
		for(int j=0;j<SeatControllers.get(aSch).length;j++){
			if((SeatControllers.get(aSch))[j].getSeatName().equals(aSeat))
				return (SeatControllers.get(aSch))[j];
		}
		return null;
	}
}
