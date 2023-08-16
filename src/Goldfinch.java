
public class Goldfinch extends Animal {
	
	private double wingSpan;
	
	public Goldfinch() throws InvalidCoordinateException {
		super();
		this.wingSpan=9;
	}//end constructor

	public Goldfinch(int simID, Location l, double wingSpan) throws InvalidSimIDException {
		super(simID, l);
		setWingSpan(wingSpan);
	}//end constructor

	//getters & setters
	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		try {
			if(wingSpan <5.0 || wingSpan >11.0){
				throw new InvalidWingspanException("Wing span should be between 5.0 and 11.0");
			}
			else {
				this.wingSpan = wingSpan;
			}
		}
		catch(InvalidWingspanException e) {
			System.out.println(e);
		}
	
	}

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + "]";
	}
	
	public void walk(int direction) {
		int[] currentCoordinates = this.location.getCoordinates();
        int newX = currentCoordinates[0] + direction; // Move 1 units 
        int newY = currentCoordinates[1] + direction; // Move 1 units 

        Location newLocation = new Location(newX, newY);
        this.location = newLocation; // Update location
        
	}
	
	public void fly(Location l) {
		this.location = l;
		System.out.println("Location after flying: (" +getLocation().getCoordinates()[0] + ", " + getLocation().getCoordinates()[1]+")");
	}
	
	

}
