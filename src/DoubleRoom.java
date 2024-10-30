

public class DoubleRoom extends Reservation{
    int reservation_num;
    
    public DoubleRoom(String name, String number){
        super();
    }
    
    public void Reserve(String name, String number) {
        this.guestName=name;
        this.roomNumber=number;
        this.isCheckedIn=false;
        System.out.println("reservation number : "+ reservation_num);
        reservation_num++;
    }

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
