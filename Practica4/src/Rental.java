import java.util.Date;

public abstract class Rental {
    private Date startDate;
    private Date endDate;
    private Car car;
    private Customer customer;
    private RentalOffice pickUpOffice;
    // Ejercicio 3
    private Promocion promocion;

    public Rental(Date startDate, Date endDate, Car car, Customer customer, RentalOffice pickUpOffice, Promocion promocion){

            this.startDate = startDate;
            this.endDate = endDate;
    
            this.car = car;
            this.customer = customer;
            this.pickUpOffice = pickUpOffice;

            this.promocion = promocion; 
        
        
    }

    public Date getStartDate(){
        return this.startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getEndDate(){
        return this.endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    // Car
    public Car getCar(){
        return this.car;
    }

    public void setCar(Car car){
        this.car = car;
    }

    // Customer
    public Customer getCustomer(){
        return this.customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    // Restriccion 1
    protected boolean customerWithoutOverlap(){
        boolean overlap = false;
        for (Rental r : customer.getRentals()){
            if (this.startDate.after(r.getStartDate()) && this.startDate.before(r.getEndDate()))
                overlap = true;
        }
        return overlap;
    }

    // RentalOffice
    public RentalOffice getRentalOffice(){
        return this.pickUpOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice){
        this.pickUpOffice = rentalOffice;
    }

    //Restriccion 2
    protected boolean startDateBeforeEndDate(){
        return this.startDate.before(this.endDate);
    }

    // Restriccion 3
    protected boolean correctPickUpOffice(){
        RentalOffice carOffice = car.getRentaloffice();
        return (carOffice.equals(pickUpOffice)) ? true : false;
    }
    

    // Ejercicio3
    public void setPromocion(Promocion promocion){
        this.promocion = promocion;
    }

    public int getPrice(){
        
        return
    }
}