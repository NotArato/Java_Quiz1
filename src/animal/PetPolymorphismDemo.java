package animal;

public class PetPolymorphismDemo {
    public static void main(String[] args) {
        // Create an array of Pet objects
        Pet[] pets = new Pet[4];
        
        // Fill the array with Pet and Dog objects
        pets[0] = new Dog("Shiro", "White");
        pets[1] = new Dog("Kiro", "Yellow");
        pets[2] = new Pet("Max");
        pets[3] = new Dog("Yami", "Black");
        
        // Use a for-each loop to call writeOutput() on every object
        System.out.println("Pet Information:");
        for (Pet pet : pets) {
            pet.writeOutput();
            System.out.println();
        }
        
        // check if a Pet is actually a Dog
        System.out.println("Checking if a pet is actually a Dog");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                // call bark()
                Dog dog = (Dog) pet;
                dog.bark();
            } else {
                System.out.println(pet.getName() + " is not a Dog.");
            }
        }
    }
}
