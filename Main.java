import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("What is your name?");
    String MyName = myObj.nextLine();
    System.out.println("Hello, " + MyName);
  }
}