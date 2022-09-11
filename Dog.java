package poly;

/**
 * Represent a Dog.
 * @author YJCheng1210
 *
 */

public class Dog {
	
	//static variables
	
	/**
	 * Default name for a dog.
	 */
	
	static String DEFAULT_NAME = "Generic dog";
	
	/**
	 * Default age for a dog.
	 */
	static double DEFAULT_AGE = .5;
	
	/**
	 * Default weight for a dog.
	 */
	static double DEFAULT_WEIGHT = 1.75;
	
	/**
	 * Default food for dog to eat.
	 */
	static String DEFAULT_FOOD = "Generic dog food";
	
	/**
	 * Default sound for dog to make.
	 */
	static String DEFAULT_BARK = "Bark!";
	
	/**
	 * Default number of times for dog to bark.
	 */
	static int DEFAULT_NUM_TIME_BARK = 1;
	
	/**
	 * Constant weight gain value.
	 */
	static final double WEIGHT_GAIN_INCREASE = 0.01;
	
	//instance variables
	
	/**
	 * Name of dog.
	 */
	String name;
	
	/**
	 * Age of dog.
	 */
	double age;
	
	/**
	 * Owner of dog.
	 */
	String owner;
	
	/**
	 * Weight of dog.
	 */
	double weight;
	
	/**
	 * Create a dog with given name, age, owner, and weight
	 * @param name of dog
	 * @param age of dog
	 * @param owner of dog
	 * @param weight of dog
	 */
	public Dog(String name, double age, String owner, double weight) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.weight = weight;
	}
	
	/**
	 * Create a dog with given name and age.
	 * @param name of dog.
	 * @param age of dog.
	 */
	public Dog(String name, double age) {
		//call first constructor with 2 given values and 2 default values.
		this(name, age, null, Dog.DEFAULT_WEIGHT);
	}
	
	public Dog() {
		//calls second constructor with 2 default values
		this(Dog.DEFAULT_NAME, Dog.DEFAULT_AGE);
	}

	/**
	 * Dog eats given amount of given food.
	 * @param amount of food.
	 * @param food to eat.
	 * @return new weight
	 */
	public double eat(double amount, String food) {
		System.out.println(this.name + " is eating " + amount + " of " + food);
		
		//calculate weight gain
		double weightGained = Dog.WEIGHT_GAIN_INCREASE * amount;
		
		//add weight to current weight
		this.weight += weightGained;
		
		return this.weight;
	}
	
	/**
	 * Dog eats given amount of generic dog food
	 * @param amount of food
	 * @return new weight
	 */
	public double eat(double amount) {
		//calls the first version of eat method, with given amount and default dog food
		return this.eat(amount, Dog.DEFAULT_FOOD);
	}
	
	/**
	 * Dog eats given amount of food.
	 * Parses given amount as a double.
	 * @param amount to eat
	 * @return new weight
	 */
	public double eat(String amount) {
		
		double returnVal = 0.0;
		
		//try the following code, but we could get an exception
		try {
			//parse given amount as a double
			double amountAsDouble = Double.parseDouble(amount);
			
			//call second version of eat method amount as double
			//and gets return return value
			returnVal = this.eat(amountAsDouble);
		} catch(NumberFormatException e) {
			//print friendly message
			System.out.println(amount + ": can't be parsed as double.");
		}
		
		return returnVal;
	}
	
	/**
	 * Dog makes given bark sound given number of times.
	 * @param numTimes to make bark sound
	 * @param barkSound to make
	 */
	public void bark(int numTimes, String barkSound) {
		
		//print dog's name
		System.out.println(this.name + " says: ");
		
		//iterate based on given number of times
		for (int i = 0; i < numTimes; i++) {
			System.out.println(barkSound);
		}
		
		System.out.println();
	}
	
	/**
	 * Dog makes given bark sound given number of times.
	 * @param numTimes to make bark sound
	 * @param barkSound to make
	 */
	public void bark(String barkSound, int numTimes) {
		
		//call first bark method with given number of times and given bark sound
		this.bark(numTimes, barkSound);
	}
    
	/**
	 * Dog makes generic bark sound default number of times.
	 */
	public void bark( ) {
		
		//call first bark method with default number of times and default bark sound
		this.bark(Dog.DEFAULT_NUM_TIME_BARK, Dog.DEFAULT_BARK);
	}
	
	/**
	 * Returns current weight of dog.
	 * @return weight
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/**
	 * Set new name for dog.
	 * @param name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Set dog's owner
	 * @param owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String toString() {
		return this.name + "," + this.weight + "," + this.age + ", " + this.owner;
	}
	
	public static void main(String[] args) {
		
		//create dog using first constructor
		Dog dog1 = new Dog("Princess", 12.7, "Brandon", 9.3);
		
		//create dog using second constructor
		Dog dog2 = new Dog("Fido", 5.5);
		
		//create dog using third constructor
		Dog dog3 = new Dog();
		
		//print dogs
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		System.out.println("\n");
		
		//set new name for dog3
		dog3.setName("Samantha");
		System.out.println(dog3);
		
		System.out.println("\n");
		
		//call first eat method
		//print new weight
		System.out.println(dog1.eat(2.1, "Beneful"));
		
		//call second eat method
		//print new weight
		System.out.println(dog2.eat(1.1));
		
		//call second eat method with int (widening)
		//print new weight
		System.out.println(dog3.eat(1));
		
		//call third eat method with string that can be parsed as double
		System.out.println(dog3.eat("12.3"));
		
		//call third eat method with string that can't be parsed as double
		dog3.eat("twelve");
		
		//print dog's weight
		//should be the same
		System.out.println(dog3.getWeight());
		
		//call the first bark method
		dog1.bark(2, "Woof!");
		
		//call the second bark method
		dog1.bark("Help me!", 1);
		
		//call third bark method
		dog1.bark();
	}
}
