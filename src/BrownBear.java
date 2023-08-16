
public class BrownBear extends Animal implements Walkable{
	
	private String subSpecies;

	public BrownBear() throws InvalidCoordinateException {
		super();
		this.subSpecies = "Alaskan";
	}//end constructor

	public BrownBear(int simID, Location l, String subSpecies) throws InvalidSimIDException {
		super(simID, l);
		try {
			if (subSpecies.equals("Alaskan")||subSpecies.equals("Asiatic")||subSpecies.equals("European")||
					subSpecies.equals("Grizzly")||subSpecies.equals("Kodiac")||subSpecies.equals("Siberian")) {
				this.subSpecies = subSpecies;
			}
			else 
				throw new InvalidSubspeciesException("Invalid subspecies!");
		}
		catch(InvalidSubspeciesException e) {
			System.out.println(e);
		}
	}//end constructor

	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies) {
		try {
			if (subSpecies.equals("Alaskan")||subSpecies.equals("Asiatic")||subSpecies.equals("European")||
					subSpecies.equals("Grizzly")||subSpecies.equals("Kodiac")||subSpecies.equals("Siberian")) {
				this.subSpecies = subSpecies;
			}
			else 
				throw new InvalidSubspeciesException("Invalid subspecies!");
		}
		catch(InvalidSubspeciesException e) {
			System.out.println(e);
		}
	}

	public void walk(int direction) {
		int[] currentCoordinates = this.location.getCoordinates();
        int newX = currentCoordinates[0] + direction; // Move 3 units in the specified direction
        int newY = currentCoordinates[1] + direction; // Move 3 units in the specified direction

        Location newLocation = new Location(newX, newY);
        this.location = newLocation; // Update the bear's location
        
	}
	
	public void swim(int direction) {
		int[] currentCoordinates = this.location.getCoordinates();
        int newX = currentCoordinates[0] + direction; 
        int newY = currentCoordinates[1] + direction; 

        Location newLocation = new Location(newX, newY);
        this.location = newLocation; 
	}
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + "]";
	}
	
}
