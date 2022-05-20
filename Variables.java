/*ATHUL BABU
A00244116

Lab 1 - Variables and Logic
Convertion App*/

import java.util.Scanner; // Import the Scanner class

public class Variables {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // Creating an object of scanner object
    while (true) { // repeat the application continuously
      System.out.println("Enter a value to convert:"); // Message to the user
      Double convertvalue = input.nextDouble(); // Storing the user input data to a variable
      System.out.println("Enter the current unit of measure:"); // Message to the user
      String symbol =
          input.nextLine() + input.nextLine(); // Storing the user input data to a variable

      switch (symbol
          .toLowerCase()) { // using switch to compare different conditions || using toLowerCase to
          // make this function not case sensitive
        case "kg":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 2.2 + " lb");
          break;
        case "lb":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 0.45 + " kg");
          break;
        case "km":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 0.62 + " mi");
          break;
        case "mi":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue / 0.62 + " km");
          break;
        case "cm":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 0.39 + " in");
          break;
        case "in":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 2.54 + " cm");
          break;
        case "g":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 0.04 + " oz");
          break;
        case "oz":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 28.35 + " g");
          break;
        case "l":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 4.17 + " cups");
          break;
        case "cup": // to run in both condition
        case "cups":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + convertvalue * 0.24 + " l");
          break;
        case "c":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + (convertvalue * 1.8 + 32) + " F");
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + (273.15 + convertvalue) + " K");
          break;
        case "f":
          System.out.println(
              convertvalue + " " + symbol + " is equal to " + ((convertvalue - 32) * 5) / 9 + " C");
          System.out.println(
              convertvalue
                  + " "
                  + symbol
                  + " is equal to "
                  + ((((convertvalue - 32) * 5) / 9) + 273.15)
                  + " K");
          break;

        default:
          System.out.println("Invalid Entry"); // if entry doesnt match the above conditions
      }
    }
  }
}
