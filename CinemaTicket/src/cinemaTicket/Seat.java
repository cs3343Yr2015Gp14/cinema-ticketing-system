package cinemaTicket;

public class Seat{
	boolean allocated;
	String seat;
	SeatStatus status;
	Identity id;
	
	public Seat(String aSeat,boolean aAllocated) {
		seat=aSeat;
		allocated=aAllocated;
	}
	
	public SeatStatus getStatus(){
		return status;
	}
	
	public void setId(Identity aId){
		id=aId;
	}

	public String getSeatName(){
		return seat;
	}
}
