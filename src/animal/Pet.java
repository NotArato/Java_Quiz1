package animal;

public class Pet {
    private String name;
    
    // Default constructor
    public Pet() {
        name = "No name yet";
    }
    
    // Constructor that accepts a String
    public Pet(String initialName) {
        name = initialName;
    }

    // Set Name
    public void setName(String newName) {
        name = newName;
    }
    
    // Get Name
    public String getName() {
        return name;
    }
      
    // writeOutput method
    public void writeOutput() {
        System.out.println("Name: " + name);
    }
}
