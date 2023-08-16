import java.util.*;

public abstract class Animal {

	protected int simID;
	protected Location location;
	protected boolean full, rested;
	
	public Animal() throws InvalidCoordinateException  {
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
		
	}//end constructor
	
	public Animal(int simID, Location l)throws InvalidSimIDException {
		try {
		if (simID <= 0) {
			throw new InvalidSimIDException("ID must be greater than 0.");
		}
		this.simID = simID;
		this.location= l;
		full = false;
		rested = true;
		}
		catch (InvalidSimIDException e) {
			System.out.println(e);
		}
	}//end constructor

	public boolean eat() {
		Random rand = new Random();
		double randNum = rand.nextDouble();
		if(randNum <= 0.5) {
			full = false;
		}
		else {
			full = true;
		}
		return full;	
	}// end eat
	
	public boolean sleep() {
		Random rand = new Random();
		double randNum = rand.nextDouble();
		if(randNum <= 0.5) {
		rested = false;
		}
		else {
		rested = true;
		}
		return rested;
	}//end sleep()

	public int getSimID() {
		return simID;
	}//end getSimID

	public void setSimID(int simID) {
		this.simID = simID;
	}//end setSimID

	public Location getLocation() {
		return location;
	}//end getLocation

	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation

	public boolean isFull() {
		return full;
	}//end isFull

	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	public boolean isRested() {
		return rested;
	}//end isRested

	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested
	
}
