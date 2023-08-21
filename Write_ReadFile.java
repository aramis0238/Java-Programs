import java.io.*;
import java.util.Scanner;

public class Write_ReadFile {
    public static void main(String[] args) throws IOException {
        
        // Declare variables
        Scanner input = new Scanner(System.in);
        int[] user_numbers = new int[5];
        int[] file_numbers = new int[5];
        int total = 0;
        // Declare write/print objects
        FileWriter fileWriter = new FileWriter ("C:\\Users\\Aramis M. Figueroa\\Desktop\\testFolder\\numbers.txt", true);
        PrintWriter filePrinter = new PrintWriter(fileWriter);

        // Prompt user
        System.out.println("Enter 5 numbers to get the average of those numbers!");

        // Get 5 numbers from user
        int i = 1;
        while (i < 6){
            
            System.out.print("Enter number " + (i) + ": ");
            int number = input.nextInt();
            user_numbers[i-1] = number;
            i++;

        }

        // close input object
        input.close();

        // Write numbers from array to file
        for (int j = 0; j < user_numbers.length; j++) {
            filePrinter.write(user_numbers[j] + "\n");
        }

        // close file object
        fileWriter.close();

        // Read numbers from file
        File myFile = new File("C:\\Users\\Aramis M. Figueroa\\Desktop\\testFolder\\numbers.txt");
        Scanner inFile = new Scanner(myFile);

        // Read numbers and append them to total
        for (int j = 0; j < user_numbers.length; j++) {
            file_numbers[j] = inFile.nextInt();
            total += file_numbers[j];
        }

        // Print total
        System.out.println("The total of the numbers read from the file is: " + total);

        // Close input (for file) object
        inFile.close();
    }
}