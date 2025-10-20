/*
INSTRUCTIONS: 
1. Create a class Fruit with good OOP
2. Implement the Comparable interface to allow fruit to be sorted by weight in grams
3. Extend the Fruit class into a Berry class and a Pear class. See the comments next to the fields below for which class should have which fields. 
4. Complete the toString methods to match the output in the unit tests.
5. Implement good OOP practices as discussed in class (as best as you can while passing the unit tests)
6. Keep track of the number of fruit without relying on a separate method
7. Compile against and pass all the tests (your solution no longer needs to work with the code below); you will only earn points for tests passed.


*/

public class FruitStand {

	int [] grams; // fruits have a weight in grams
    boolean [] hasSeeds; //only berries have seeds on the outside or not
    String [] shapes; //only pears have a shape 
	String [] types; //each fruit will either be a berry or a pear

	public void cook(int sugar){
		for(int i = 0; i < types.length; i++){
			if (types[i].equals("berry"))
				grams[i] = grams[i] * 2 + sugar;
			if (types[i].equals("pear"))
				grams[i] = grams[i] * 5 + sugar;
		}
	}

	public void slice(){
		for(int i = 0; i < types.length; i++){
			grams[i] = grams[i] / 2;
		}
	}

	public String roster(){
		String result = "Here are all the fruits in the fruit stand: ";
		for(int i = 0; i < types.length; i++) 
			result += types[i] + "\n";
		result += "There are " + types.length + " items total.\n";
		return result;
	}

} 
