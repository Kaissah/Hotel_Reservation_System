
public class SingleRoom extends Reservation implements Reservable{
    int reservation_num;
   
    public SingleRoom(String name, String number){
        super(name, number);
    }
    
//    public void Reserve(String name,String number){
//        this.guestName=name;
//        this.roomNumber=number;
//        this.isCheckedIn=false;
//        System.out.println("reservation number : "+ reservation_num);
//        reservation_num++;        
//    }
   
    @Override
    public void checkIn() {
        
    }

    @Override
    public void checkOut() {
        
        
        
    }
    @Override
    public String getDetails() {
        return guestName;
        
    }

    @Override
    public void Reserve() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    

    

   
    

    
}
