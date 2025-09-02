package week4;

import java.util.Arrays;

public class Collections {
	public static void main(String[] args) {
		// 1. Create array of ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        // a. Subtract last - first (programmatically)
        System.out.println("Step 1.a: " + (ages[ages.length - 1] - ages[0]));
        
        // b. Create a new array ages2 with 9 elements
        int[] ages2 = {4, 10, 25, 65, 3, 9, 29, 94, 11};
        System.out.println("Step 1.b: " + (ages2[ages2.length - 1] - ages2[0]));
        
        // c. Average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = (double) sum / ages.length;
        System.out.println("Step 1.c: Average age = " + averageAge);
		
        // 2. Array of names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        // a. Average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double avgLetters = (double) totalLetters / names.length;
        System.out.println("Step 2.a: Average letters per name = " + avgLetters);
        
        // b. Concatenate names separated by spaces
        StringBuilder allNames = new StringBuilder();
        for (String name : names) {
            allNames.append(name).append(" ");
        }
        System.out.println("Step 2.b: " + allNames.toString().trim());
        
        
        // 3. Access last element of array
        System.out.println("Step 3: Last element = " + ages[ages.length - 1]);
        
        // 4. Access first element of array
        System.out.println("Step 4: First element = " + ages[0]);
        
     // 5. Create nameLengths array
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        System.out.println("Step 5: nameLengths = " + Arrays.toString(nameLengths));
        
        
        // 6. Sum of nameLengths
        int sumLengths = 0;
        for (int length : nameLengths) {
            sumLengths += length;
        }
        System.out.println("Step 6: Sum of nameLengths = " + sumLengths);
        
        
        // 7. Repeat word method
        System.out.println("Step 7: " + repeatWord("Hello", 3));
        
        // 8. Full name method
        System.out.println("Step 8: " + getFullName("John", "Doe"));
        
        // 9. Sum greater than 100
        int[] nums = {20, 30, 40, 15};
        System.out.println("Step 9: " + isSumGreaterThan100(nums));
        
        // 10. Average of doubles
        double[] numbers = {10.5, 20.5, 30.0};
        System.out.println("Step 10: " + calculateAverage(numbers));
        
        // 11. Compare averages of two arrays
        double[] arr1 = {10, 20, 30};
        double[] arr2 = {5, 10, 15};
        System.out.println("Step 11: " + isFirstAverageGreater(arr1, arr2));
        
        // 12. Will buy drink
        System.out.println("Step 12: " + willBuyDrink(true, 11.00));
        
        // 13. My own method
        System.out.println("Step 13: Factorial of 5 = " + factorial(5));
    }
    
    
    // 7. Repeat word method
    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }
    
    // 8. Full name method
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    
    // 9. Sum greater than 100
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum > 100;
    }
    
    // 10. Average of doubles
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    
    // 11. Compare averages of two arrays
    public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
        return calculateAverage(arr1) > calculateAverage(arr2);
    }
    
    // 12. Will buy drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
    
    // 13. My own method: factorial of a number
    // This method calculates the factorial of a number (useful in math problems)
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }	
	}
