/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */


 import java.util.Random;
 import java.util.Scanner;
 
 public class EventSimulator {
 
     public static void main(String[] args) {
         Random myRandomGenerator = new Random(123456789);
         Scanner scanner = new Scanner(System.in);
 
         int Length = getValidSimulationLength(scanner);
 
         double mean = 5.0;  
 
         int lastArrivalTime = 0;  
 
         for (int i = 0; i < 30; i++) {
             int intertime = (int) (-1 * mean * Math.log(myRandomGenerator.nextDouble()));
 
             // make the random arrival time 
             int arrivalTime = (i == 0) ? intertime : lastArrivalTime + intertime;
 
             int floor = myRandomGenerator.nextInt(59) + 2;
 
             Person person = new Person(arrivalTime, floor);
 
             int elevatorGoTime = arrivalTime + myRandomGenerator.nextInt(10);
             int leaveTime = elevatorGoTime + myRandomGenerator.nextInt(10);
 
             person.setElevatorGoTime(elevatorGoTime);
             person.setLeaveTime(leaveTime);
 
             System.out.println("Event " + (i + 1) + ": " + person);
             validateAttributes(person);
 
             lastArrivalTime = arrivalTime;  
         }
     }
 
     private static int getValidSimulationLength(Scanner scanner) {
         int simulation = 0;
 
         while (true) {
             try {
                 System.out.print("How many minutes long is the simulation? ");
                 simulation = Integer.parseInt(scanner.nextLine());
 
                 if (simulation <= 0) {
                     throw new NumberFormatException();
                 }
 
                 break; 
             } catch (NumberFormatException e) {
                 System.err.println("Invalid input. Please enter a positive integer.");
             }
         }
 
         return simulation;
     }
     
 
     private static void validateAttributes(Person person) {
         if (person.getArriveTime() <= 0 || person.getArriveTime() > person.getElevatorGoTime()) {
             System.err.println("Invalid arrival time for " + person);
         }
 
         if (person.getFloor() <= 0) {
             System.err.println("Invalid floor for " + person);
         }
 
         if (person.getElevatorGoTime() <= 0 || person.getElevatorGoTime() < person.getArriveTime());
     }
 }
 
 