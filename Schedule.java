package cinemaTicket;

public class Schedule implements Comparable<Schedule>{
	Movie movie;
	String schedule;
	
	public Schedule(Movie m,String aSchedule){
		movie=m;
		schedule=aSchedule;
	}
	
	@Override
	public int compareTo(Schedule another){
		if (this.hashCode()==another.hashCode()){
			return 0;
			}
		else if (this.hashCode()>another.hashCode()) return 1;
		else return -1;
	}
	
	@Override
	public int hashCode(){
		return movie.getCode()*10000+schedule.charAt(0)*1000+schedule.charAt(1)*100+schedule.charAt(3)*10+schedule.charAt(4);
	}
	
}
