package Problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HeartRates {

    final double RHR = 70;
    final double LB = 0.5;
    final double UB = 0.85;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today).getYears(); // Return periods in Years
    }
    public int calculateMaximumHeartRate() {
       return 220 - calculateAge();
    }

    public void calculateTargetHeartRateRange() {
        double ahr = calculateMaximumHeartRate() - RHR;
        double lbthr =  (ahr*LB) + RHR;
        double ubthr =  (ahr*UB) + RHR;
        System.out.println("The target heart rate range is between " + lbthr +" and "+ ubthr);

    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        return "First Name : " + firstName + "\nLast Name : " + lastName + "\nAge : " + calculateAge()
                + "\nDate of Birth : " + dateOfBirth.format(formatter) + "\nMaximum Heart Rate: " + calculateMaximumHeartRate();
    }

}
