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
	
	public String getSchedule(){
		return schedule;
	}
	@Override
	public int hashCode(){
		return movie.getCode()*10000+Integer.parseInt(schedule.substring(0,1))*1000+Integer.parseInt(schedule.substring(1,2))*100
				+Integer.parseInt(schedule.substring(3,4))*10+Integer.parseInt(schedule.substring(4));
	}
	
}
