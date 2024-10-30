
abstract class Reservation implements Reservable {
    protected String guestName;
    protected String roomNumber;
    protected Boolean isCheckedIn;
    
    public Reservation(String name,String number){
        this.guestName=name;
        this.roomNumber=number;
        this.isCheckedIn=false;
    }
    public abstract void Reserve();
   
    public abstract void checkIn();
            
    public abstract void checkOut();
    
    public abstract String getDetails();
}
