package cinemaTicket;


public class MovieOffice {
	
	private static String[] allmovie =new String[]{"1-movie a","2-movie b","3-movie c"};
	
	public static void listMovie(){
		for(String m: allmovie){
				System.out.println(m);
			}
	} 
	
	public static String getMovieName(int aCode){
		for (String m:allmovie){
			if (Integer.parseInt(m.substring(0,1))==aCode)
				return m;
		}
		return null;
	}
}
