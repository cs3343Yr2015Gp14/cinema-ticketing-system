package cinemaTicket;

public class Seat{
	boolean allocated;
	String seat;
	SeatStatus status;
	
	public Seat(String aSeat,boolean aAllocated) {
		seat=aSeat;
		allocated=aAllocated;
	}
	
	public SeatStatus getStatus(){
		return status;
	}
	
}
