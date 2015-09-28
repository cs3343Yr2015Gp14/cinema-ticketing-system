package cinemaTicket;

public class Movie {
	String movie;
	int code;
	int price;
	
	private String[] allschedule={"11:00","15:00","18:00"};
	
	public Movie (int aCode) {
			movie=MovieOffice.getMovieName(aCode);
			code=aCode;
			price=100;
	}
	
	public void getAllSchedule(){
		for(String s:allschedule){
			System.out.println(s);
		}
	}
	
	public int getCode(){
		return code;
	}
	
	public String getName(){
		return movie;
	}
	
	public int getPrice(){
		return price;
	}
}
