import java.util.ArrayList;
public class Application {

	public static void main(String[] args) {
		System.out.println("***********************\nLocation Tests\n***********************");
		 try {
	            // Testing the constructors
	            Location defaultLocation = new Location();
	            Location customLocation = new Location(5, 10);
	            System.out.println("Default Location Coordinates: (" + defaultLocation.getCoordinates()[0] + ", " + defaultLocation.getCoordinates()[1] + ")");
	            System.out.println("Custom Location Coordinates: (" + customLocation.getCoordinates()[0] + ", " + customLocation.getCoordinates()[1] + ")");

	            // Testing update method
	            defaultLocation.update(-1, 3);//prints invalid coordinate exception
	            customLocation.update(8, 15);
	            
	            // Testing getCoordinates method
	            int[] defaultCoords = defaultLocation.getCoordinates();
	            int[] customCoords = customLocation.getCoordinates();
	            
	            System.out.println("Custom Location Coordinates: (" + customCoords[0] + ", " + customCoords[1] + ")");
	        } catch (InvalidCoordinateException e) {
	            System.out.println(e);
	        }
		 
		System.out.println();
		System.out.println("***********************\nAnimal Tests\n***********************");
		
		//Animal animal1 = new Animal();//Cannot instantiate
		
		

		System.out.println();
		System.out.println("***********************\nGoldfinch Tests\n***********************");

		 try {
	            // Testing constructors
	            Goldfinch defaultGoldfinch = new Goldfinch();
	            Location customLocation = new Location(12, 20);
	            Goldfinch Goldfinch1 = new Goldfinch(123, customLocation, 7.5);
	            
	            // Testing getters and setters
	            System.out.println("Default Goldfinch Wing Span: " + defaultGoldfinch.getWingSpan());
	            System.out.println("Goldfinch 1 Wing Span: " + Goldfinch1.getWingSpan());
	            
	            Goldfinch1.setWingSpan(3.5);
	            System.out.println(Goldfinch1.getWingSpan());//prints invalid wing span exception
	            
	            Goldfinch1.setWingSpan(8.0);
	            System.out.println(Goldfinch1.getWingSpan());

	            //Testing walk method
	            Goldfinch1.walk(1);
	            System.out.println("Goldfinch Location after walking: " + Goldfinch1.getLocation().getCoordinates()[0] +
	            ", " + Goldfinch1.getLocation().getCoordinates()[1]);
	            
	            // Testing fly method
	            Location newLocation = new Location(7, 8);
	            Goldfinch1.fly(newLocation);
	            
	            // Testing toString method
	            System.out.println("Default Goldfinch: " + defaultGoldfinch);
	            System.out.println("Goldfinch 1: " + Goldfinch1);
	            
	        } catch (InvalidCoordinateException | InvalidSimIDException e) {
	            System.out.println(e);
	        }
		
		System.out.println();
		System.out.println("***********************\nBrownBear Tests\n***********************");
		try {
            // Testing constructors
            BrownBear defaultBear = new BrownBear();
            Location customLocation = new Location(3,7);
            BrownBear bear1 = new BrownBear(789, customLocation, "Grizzly");
            BrownBear bear2 = new BrownBear(-12345, customLocation, "Black");
            System.out.println(bear2.toString());//prints invalid sub species exception and invalid sim ID
            
            // Testing getters and setters
            System.out.println("Default Bear Subspecies: " + defaultBear.getSubSpecies());
            System.out.println("Bear 1 Subspecies: " + bear1.getSubSpecies());
            
            bear1.setSubSpecies("Kodiac");
            
            // Testing walk method
            bear1.walk(3);
            System.out.println("Bear 1 Location after walking: " + bear1.getLocation().getCoordinates()[0] +
            ", " + bear1.getLocation().getCoordinates()[1]);
            
            // Testing swim method
            bear1.swim(2);
            System.out.println("Bear 1 Location after swimming: " + bear1.getLocation().getCoordinates()[0] +
            ", " + bear1.getLocation().getCoordinates()[1]);
            
            // Testing toString method
            System.out.println("Default Bear: " + defaultBear);
            System.out.println("Bear 1: " + bear1);
            
            //Test invalid Sim ID
            //BrownBear bear2 = new BrownBear(-12345, customLocation, "Black");
            //System.out.println(bear2.toString());//prints invalid sub species exception

            
        } catch (InvalidCoordinateException | InvalidSimIDException e) {
            System.out.println(e);
        }
				
		System.out.println();
		System.out.println("***********************\nGenerics Tests\n***********************");
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		try {
			Goldfinch gf1 = new Goldfinch(345, new Location(45,78),8.5);
			Goldfinch gf2 = new Goldfinch(567,new Location (83,12),6.2);
			BrownBear bb1 = new BrownBear(871, new Location(67,90),"Kodiac");
			BrownBear bb2 = new BrownBear(128, new Location(45,25),"Siberian");
			
			animalList.add(gf1);
			animalList.add(gf2);
			animalList.add(bb1);
			animalList.add(bb2);
			
			for (Animal animal : animalList) {
				System.out.println(animal.toString());
			}
		} catch (InvalidCoordinateException | InvalidSimIDException e) {
            System.out.println(e);
        }
					
	}
}

