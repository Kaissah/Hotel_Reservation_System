
import java.util.Scanner;

public class Hotel_Reservation_System {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String[] reserveperson = new String[10];
      String[] reserveroom = new String[10];
      Reservation reservations = new Reservation[10];
      
      String name;
      String number;
      String ans;
      int reservation = 0;
      
      while(true){
        System.out.println("==Welcome to 5 Star Hotel==");
        System.out.println("Select an Option");
        System.out.println("[1] Single Room Reservation");
        System.out.println("[2] Double Room Reservation");
        System.out.println("[3] Check In");
        System.out.println("[4] Check Out");
        System.out.println("[5] View Reservation Details");
        System.out.println("[6] Exit");
        int choice = scanner.nextInt();
            
            switch(choice){
                case 1://Single Room Reservation
                    System.out.print("Enter Guest Name: ");
                    name = scanner.next();
                    System.out.print("Enter Room Number: ");
                    number = scanner.next();
                    Reservation single = new Reservation;
                    single.Reserve(name, number);
                    //reserveation index
                    
                    System.out.println("Comfirm Your Choices? (yes/no)");
                    ans = scanner.next();
                    System.out.println("Guest: "+name+" Room: "+number+" Resevation number: "+reservation );
                    reserveperson[reservation]=name;
                    reserveroom[reservation]=number;
                    reservation++;
                    
                    
                    break;
                case 2://Double Room Resrvation
                    System.out.print("Enter Guest Name: ");
                    name = scanner.next();
                    System.out.print("Enter Room Number: ");
                    number = scanner.next();
                    DoubleRoom doub = new DoubleRoom();
                    doub.Reserve(name, number);
                    //reserveation index
                    
                    System.out.println("Comfirm Your Choices? (yes/no)");
                    ans = scanner.next();
                    System.out.println("Guest: "+name+" Room: "+number+" Resevation number: "+reservation );
                    
                    reserveperson[reservation]=name;
                    reserveroom[reservation]=number;
                    reservation++;
                    
                    break;
                case 3://Check In
                    
                    break;
                case 4://Check Out
                    
                    break;
                case 5://View Reservation Details
                    SingleRoom sing = new SingleRoom();
                    sing.getDetails();
                    break;
                case 6://exit
                    for (int i = 0; i < 10; i++) {
                        System.out.print(reserveperson[i]+" ");
                        System.out.print(reserveroom[i]);
                        System.out.println("");
                    }
                    System.out.println("Thank You Come Again!");
                    return;
                    
                default:
                    System.out.println("Invalid input!");
                    scanner.close();
                    return;
                    
            }
//        if (transactionCount >= transactions.length){
//            System.out.println("Transaction log is full ");
//            scanner.close();
//            return;
        
      }
    }
    
}
