package cinemaTicket;

public class User
{
	private String name;
    private String password;
    private Age age;
    private Membership membership;
    
    public User(String name, String password, int age, boolean student, float totalpaid){
        this.name=name;
        this.password=password;
        if (student == true)
        	this.age= new IStudentElderly();
        else if (age <12){
        	this.age = new IChild();
        }
        else if (age >= 12 && age < 65){
        	this.age = new IAdult();
        }
        else this.age= new IStudentElderly();
        if (totalpaid == 0)
        	this.membership = MNormal();
        else
        	assignMem(totalpaid);
    }
    
    public void assignMem(float totalpaid){
    	if (totalpaid > 200 && totalpaid <500)
    		this.membership = MSilver();
    	else if (totalpaid > 500)
    		this.membership = MGold();
    	else
    		this.membership = MNormal();
    }
    
    public User(int age){
        if (age <12){
        	this.age = new Child();
        }
        else if (age >= 12 && age < 65){
        	this.age = new Adult();
        }
        else this.age= new Elderly();
    }
    
    public boolean vaild(String name, String password){
        if (name.equals(this.name) && password.equals(this.password)){
            return true;
        }
        return false;
    }
    
    public String toString(){
    	return "user: " + this.name;
    }

	public float getAgeD() {
		return age.getDiscount();
	}

	public float getMemD() {
		return membership.getDiscount();
	}
}
