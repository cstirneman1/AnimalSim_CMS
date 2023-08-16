
public class Location {

	private int xCoord;
	private int yCoord;
	
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}//end constructor

	public Location(int x, int y) throws InvalidCoordinateException{
		try {
			if (x <0 || y < 0) {
				throw new InvalidCoordinateException("Coordinates cannot be less than 0.");
			}
			else 
				xCoord = x;
				yCoord = y;
			}
			catch(InvalidCoordinateException e) {
				System.out.println(e);
			}
	}//end constructor
	
	public void update(int x, int y) throws InvalidCoordinateException{
		try {
		if (x <0 || y < 0) {
			throw new InvalidCoordinateException("Coordinates cannot be less than 0.");
		}
		else {
			xCoord = x;
			yCoord = y;}
		}
		catch(InvalidCoordinateException e) {
			System.out.println(e);
		}//end try/catch block
	}//end update
	
	public int[] getCoordinates() {
		int[] coordinates = {xCoord,yCoord};
		return coordinates;
	}//end getCoordinates
}
