package Classes;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public String getModel() {
		return model;
		// return this.model does the same but isn't needed since we
		// aren't passing parameters that can be confused with the 
		// local variable inside
	}
	
	public void setModel(String model) {
		// if we have a setter instead of accessing the field directly
		// we can introduce validation of data before manipulating data
		
		// upper case validation example - model name must be in lower case
		
		// create flag since we can't have returns in void setter
		boolean flag = true;
		
		// store characters of the passed arguments in a char array
		char arr[] = model.toCharArray();
		
		// iterate over it to check if upper cases exist
		for(int i = 0; i < arr.length; i++) {
			if(Character.isUpperCase(arr[i])) {
				
				// if a single upper case exists break
				flag = true;
				break;
			}
			else flag = false;
		}
		
		if(flag == false) {
			this.model = model;
		} else {
			System.out.println("Provide a lower case model name please");
		}

	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
