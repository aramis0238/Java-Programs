/*
    Input:
        - UserName and password for login/signup
        - Selected menu options for the main menu
        - Content to write into a file (if chosen)

    Process:
    1. Prompt the user to log in or sign up.
    2. If logging in:
        - Ask for the username and password.
        - Check if the credentials match the entries in the "login_info.txt" file.
        - If a match is found, display a welcome message and proceed to the main menu.
        - If no match is found, display the login credentials not found message.
    3. If signing up:
        - Ask the user to enter a new username and password.
        - Write the username and password to the "login_info.txt" file.
        - Display a thank you message for signing up.
    4. Main Menu:
        - Display options for the user to choose from (e.g., explain SDK, variables, data types, if-else statements, loops, arrays, write log entries, read log entries, or exit).
        - Based on the selected option, display relevant information or perform specific actions.
        - Repeat until the user chooses to exit.
    5. Write Log Entries:
        - Allow the user to write log entries into a text file.
    6. Read Log Entries:
        - Allow the user to read log entries from a text file.
    7. Terminate the program and display a goodbye message.
 */

// Imports
import java.util.Scanner; // user input
import java.io.BufferedReader; // file reading
import java.io.File; // file identification
import java.io.FileReader; // file reading
import java.io.FileWriter; // file writing
import java.io.IOException; // file writing error handler
import java.io.PrintWriter; // file writing

public class FinalProject {

    // Main Function 
    public static void main(String[] args) throws IOException {
        
        // Menu Options (constants)
        final int SIGNUP = 1, LOGIN = 2, EXIT = 3;
        int option;

        // Login screen loop
        do {
            // Initialize Scanner object
            Scanner input = new Scanner(System.in);

            // Login screen
            System.out.println("\n\n******** Program Tutor Login ********");
            System.out.println("*                                   *");
            System.out.println("*    1. Sign-up                     *");
            System.out.println("*    2. Log-in                      *");
            System.out.println("*    3. Exit                        *");
            System.out.println("*                                   *");
            System.out.println("*************************************");
            System.out.print("Select an option: ");
            option = input.nextInt();
            
            // Switch/case to drive menu options
            switch (option) {
                // Run Sign-up function
                case SIGNUP:
                    System.out.println("Sign-up");
                    signup();
                    break;

                // Run Login function
                case LOGIN:
                    System.out.println("Log-in");
                    login();
                    break;

                // Exit
                case EXIT:
                    System.out.println("Goodbye...");
                    break;
            }
        } while (option != EXIT);
        
    }

    // Main menu Function 
    public static void mainMenu() throws IOException {
        
        // Menu option (constants)
        final int SDK = 1, VARIABLES = 2, DATA_TYPES = 3, IF_ELSE = 4, LOOPS = 5, ARRAYS = 6,
                LOG_ENTRIES = 7, READ_ENTRIES = 8, EXIT = 9;

        // Initialize Scanner object
        Scanner input = new Scanner(System.in);
        int option;

        // Main Menu loop
        do {
            
            // Main menu screen
            System.out.println("\n\n***********************************************");
            System.out.println("************ Program Tutor Main Menu **********");
            System.out.println("***********************************************");
            System.out.println("*    1. Explain SDK.                            *");
            System.out.println("*    2. Explain variables.                      *");
            System.out.println("*    3. Explain Data types.                     *");
            System.out.println("*    4. Explain if..else statements.            *");
            System.out.println("*    5. Explain Loops.                          *");
            System.out.println("*    6. Explain Arrays.                         *");
            System.out.println("*    7. Write log entries into a text file.     *");
            System.out.println("*    8. Read log entries from a text file.      *");
            System.out.println("*    9. Exit                                    *");
            System.out.println("***********************************************");
            System.out.print("Select an option: ");
            option = input.nextInt();

            // Switch/case to drive menu options
            switch (option) {

                // Module to explain SDK
                case SDK:
                    System.out.println("SDK");
                    displaySdkModule();
                    break;

                // Module to explain variables
                case VARIABLES:
                    System.out.println("Variables");
                    displayVariablesModule();
                    break;
                
                // Module to explain Data types
                case DATA_TYPES:
                    System.out.println("Data Types");
                    displayDataTypesModule();
                    break;
                
                // Module to explain if..else statements
                case IF_ELSE:
                    System.out.println("If Else");
                    displayIfElseModule();
                    break;
                
                // Module to explain Loops
                case LOOPS:
                    System.out.println("Loops");
                    displayLoopsModule();
                    break;
                
                // Module to explain Arrays
                case ARRAYS:
                    System.out.println("Arrays");
                    displayArraysModule();
                    break;
                
                // Module to write log entries
                case LOG_ENTRIES:
                    System.out.println("Write Log Entries...");
                    logEntries();
                    break;
                
                // Module to read log entries
                case READ_ENTRIES:
                    System.out.println("Reading Entries...");
                    readEntries();
                    break;
                
                // Exit
                case EXIT:
                    System.out.println("Returning to main menu...");
                    break;

                // Invalid choice
                default:
                    System.out.println("Invalid menu option");
                    break;
            }
        } while (option != EXIT);
    }


    //Variable function
    private static void displayVariablesModule() throws IOException {
        System.out.println("---- Variables ----");
        System.out.println("Variables are containers for storing data values.");
        System.out.println("In Java, there are different types of variables, for example:");
        System.out.println("String - stores text, such as \"Hello\". String values are surrounded by double quotes.");
        System.out.println("int - stores integers (whole numbers), without decimals, such as 123 or -123");
        System.out.println("float - stores floating point numbers, with decimals, such as 19.99 or -19.99");
        System.out.println("char - stores single characters, such as 'a' or 'B'. Char values are surrounded by double quotes.");
        System.out.println("boolean - stores values with two states: true or false");

        System.out.println("\nTo create a variable, you must specify the type and assign it a value. Here's an example of the syntax:");
        System.out.println("type variableName = value;");
        System.out.println("Where type is one of Java's types (such as int or String), and variableName is the name of the variable (such as x or name). The equal sign is used to assign values to the varibale.");
        System.out.println("\nTo create a variable that should store text, look at the following example:");
        System.out.println("String name = \"John\";");
        System.out.println("System.out.println(name);");
        System.out.println("\nTo create a variable that should store a number, look at the following example:");
        System.out.println("int myNum = 15;");
        System.out.println("System.out.println(myNum);");
    }

    // Data Types function 
    private static void displayDataTypesModule() throws IOException {
        System.out.println("---- Data Types ----");
        System.out.println("Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:");
        System.out.println("Primtive data types: The primitive data types include boolean, char, byte, short, int, long, float, and double.");
        System.out.println("Non-primitive data types: The non-primitve data types include Classes, interfaces, and Arrays.");
    }

    // SDK function 
    private static void displaySdkModule() throws IOException{
        System.out.println("---- SDK ----");
        System.out.println("In Java, a Software Development Kit is the basic tools or building blocks for building an application.");
        System.out.println("Think of it kind of like a toolkit, or the plastic bag of tools that comes packaged with the parts of a dresser you've bought to assemble yourself-only for app development.");
        System.out.println("Typically, a basic SDK will include a compiler, debugger, and application programming interface(APIs).");
        System.out.println("Some examples of SDKs are the Java development kit(JDK), the Windows 7 SDK, the MacOs X SDK, and the iPhone SDK.");
    }

    // If-Else Statements function
    private static void displayIfElseModule() throws IOException {
    	System.out.println("---- If - Else Statements ----");
        System.out.println("In Java, an If-Else statement allows you to perform different actions ");
        System.out.println("based on certain conditions.\n");
        
        // Example of working with an if-else statement
        System.out.println("For example, this is what it would look like:");
        System.out.println("if (condition) {");
        System.out.println("    // code to execute if the condition is true");
        System.out.println("} else {");
        System.out.println("    // code to execute if the condition is false");
        System.out.println("}\n"); 
        System.out.println("So in this sense, lets say the condition is '2+3 = 6'.");
        System.out.println("If this were true, then the top part of code would run. Since it is false, ");
        System.out.println("the bottom block of code will execute if this condition was used.");
        System.out.println("\n");
     
    }
    
    // Loops function 
    private static void displayLoopsModule() throws IOException{
    	System.out.println("---- Loops ----");
		System.out.println("In Java, loops allow you to execute a block of code repeatedly until a ");
		System.out.println("certain condition is met.");
		System.out.println("There are different types of loops in Java, such as for loops, while loops, ");
		System.out.println("and do-while loops.");
		System.out.println("In this example, we'll demonstrate a for loop.\n");

		// Example of working with a for loop
		System.out.println("Example: This is what a for loop would look like if you wanted to count \nfrom 1 to 5.\n ");
		System.out.println("for (int i = 1; i <= 5; i++) {");
		System.out.println("     System.out.print(i + \"\");");	
		System.out.println("}\n");
		System.out.println("This code would output as: "); 
		for (int i = 1; i <= 5; i++) {
	        System.out.print(i + " ");
	    }
	    System.out.println("\n");
	
	}
    
    // Arrays function
    private static void displayArraysModule() throws IOException{
    	System.out.println("---- Arrays ----");
        System.out.println("In Java, an array is a data structure that allows you to store a fixed-size ");
        System.out.println("collection of elements of the same data type.\n");
        System.out.println("You can access individual elements in an array using their index which is");
        System.out.println("the location of each element in an array, starting with '0'.\n");

        // Example of working with an array
        System.out.println("This is how you would initialize an array in java code: ");
        System.out.println("int[] numbers = { 10, 20, 30, 40, 50 }; ");
        System.out.println("so at index 0 you have 10, at index 1 you have 20, etc. \n");
        System.out.println("Example: Initializing an array and printing its elements:");
        int[] numbers = { 10, 20, 30, 40, 50 };
        
        System.out.println("To view the elements in an array, you can use a for loop to print \neach element individually.\n");
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n"); 
      
    }


    // Log entries function 
    public static void logEntries() throws IOException {
        

        
        Scanner keyboard = new Scanner(System.in); // This line Initializes the scanner object

     
        FileWriter fw = new FileWriter("entries.txt",true); // This line establishes a connection or creates a file

        PrintWriter pw = new PrintWriter(fw); // This line lets you write to connected file

        System.out.println("File created, you may now start typing below\n" + 
                        "-------------------------------------------"); // This line prints a prompt

        pw.write(keyboard.nextLine() + "\n"); // This line writes to the file

        fw.close(); // This line closes the file

        System.out.println("\nEntries logged!!!");
        System.out.println("-----------------------------------------");
    }

    // Read entries function 
    public static void readEntries() throws IOException {
       
        System.out.println("Entries read from file" + 
                        "\n-------------------------------------------");
        // Read data from a file
        File file = new File("entries.txt");

        // Open file
        Scanner infile = new Scanner(file);

        // Read file
        while(infile.hasNext()) {

        System.out.println(infile.nextLine());

        }

        // Close file
        infile.close();

        System.out.println("-----------------------------------------");
    }

    // Read from file function 
    public static void readFile(String userName, String password) throws IOException {

        // Try/catch block for file reading
        try (BufferedReader fileReader = new BufferedReader(new FileReader("login_info.txt"))) {

            // Declare variables
            String login_string;
            boolean loginFound = false;

            // Read file (check if username and password exist in file)
            while ((login_string = fileReader.readLine()) != null) {
                if (login_string.trim().equals(userName + " " + password)) {
                    System.out.println("Welcome " + userName);
                    loginFound = true;
                    break;
                }
            }

            // If username and password exists in file, open main menu
            if (loginFound) {
                mainMenu();
            } 

            // If username and password does not exist in file, throw error
            else {
                System.out.println("Login credentials not found...");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Write to file function 
    public static void writeFile(String userName, String password) throws IOException {

        // Create fileWriter object
        FileWriter fileWriter = new FileWriter("login_info.txt", true);

        // Write to file
        fileWriter.write(userName + " " + password + "\n");

        // Close fileWriter object
        fileWriter.close();
    }

    // Sign-up Function 
    public static void signup() throws IOException {

        // Initialize Scanner object
        Scanner input = new Scanner(System.in);
        
        // Sign-up screen
        System.out.println("*-------------- SIGN UP ----------------*\n");

        // Prompt user to enter username
        System.out.print("* Please Enter Your New Username: ");
        String userName = input.nextLine();

        // Prompt user to enter password
        System.out.print("* Please Enter Your New Password: ");
        String password = input.nextLine();

        // Check if username and password are empty
        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("Please enter a username and password");
        } else {
            writeFile(userName, password);
            System.out.println("Thank you for signing up!");
        }
    }

    // Login Function 
    public static void login() throws IOException {

        // Initialize Scanner object
        Scanner input = new Scanner(System.in);

        // Login screen
        System.out.println("* --------------LOGIN SECTION----------*\n");

        // Prompt user to enter username
        System.out.print("* Please Enter Your Username: ");
        String userName = input.nextLine();

        // Prompt user to enter password
        System.out.print("* Please Enter Your Password: ");
        String password = input.nextLine();

        // Check if username and password are empty
        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("Please enter a username and password");
        } else {
            System.out.println("Logging in...");
            readFile(userName, password);
        }
    }
}
