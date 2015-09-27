package cinemaTicket;

public class Movie {
	String movie;
	int code;
	
	private String[] allschedule={"11:00","15:00","18:00"};
	
	public Movie (int aCode) {
			movie=MovieOffice.getMovieName(aCode);
			code=aCode;
	}
	
	public void getAllSchedule(){
		for(String s:allschedule){
			System.out.println(s);
		}
	}
	
	public int getCode(){
		return code;
	}
}
