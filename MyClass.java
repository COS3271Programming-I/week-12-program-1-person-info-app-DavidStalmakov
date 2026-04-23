package projectdavid;
import java.util.Scanner;

///// Person Class
class Person {
	String firstName;
	String lastName;
	String gender;
	int age;
	double weight;
	double height;
	String ethnicGroup;
	String religion;
}

public class MyClass {
    
	static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	Person person1 = new Person();
    	System.out.println("Enter first name: ");
    	person1.firstName = input.nextLine();
    	
        System.out.println("Enter last name:");
        person1.lastName = input.nextLine();

        System.out.println("Enter gender:");
        person1.gender = input.nextLine();

        System.out.println("Enter age:");
        person1.age = input.nextInt();

        System.out.println("Enter weight (lbs):");
        person1.weight = input.nextDouble();

        System.out.println("Enter height (inches):");
        person1.height = input.nextDouble();
        input.nextLine();
        
        System.out.println("Enter ethnic group:");
        person1.ethnicGroup = input.nextLine();

        System.out.println("Enter religion:");
        person1.religion = input.nextLine();
        
        // Output
        System.out.println("\n--- Person 1 Information ---");
        System.out.println("Name: " + person1.firstName + " " + person1.lastName);
        System.out.println("Gender: " + person1.gender);
        System.out.println("Age: " + person1.age);
        System.out.println("Weight: " + person1.weight + " lbs");
        System.out.println("Height: " + person1.height + " inches");
        System.out.println("Ethnic Group: " + person1.ethnicGroup);
        System.out.println("Religion: " + person1.religion);
    }
}
    
    