package Problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please, enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd)-Example 1989-4-14: ");
        String dateOfBirthStr = sc.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);

        HeartRates hrs = new HeartRates(firstName, lastName, dateOfBirth);
        hrs.calculateTargetHeartRateRange();
        System.out.println(hrs.toString());
    }
}
