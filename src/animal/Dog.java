package animal;

public class Dog extends Pet {
    private String color;
    
    // Constructor with name and color
    public Dog(String initialName, String initialcolor) {
        super(initialName);
        color = initialcolor;
    }
    
    public void reset(String newName, String newColor) {
		setName(newName);        
		color = newColor;
	}

    // Get Color
    public String getcolor() {
        return color;
    }
    
    // Set Color
    public void setcolor(String newcolor) {
        color = newcolor;
    }
    
    public void writeOutput() {
        System.out.println("name: " + getName());
        System.out.println("color: " + this.color);
    }
    
    // Dog-specific method
    public void bark() {
        System.out.println(this.getName() + " says: Woof");
    }
}
