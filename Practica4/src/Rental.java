import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Rental {
    private Date startDate;
    private Date endDate;
    private Car car;
    private Customer customer;
    private RentalOffice pickUpOffice;

    public Rental(Date startDate, Date endDate, Car car, Customer customer, RentalOffice pickUpOffice){
        this.startDate = startDate;
        this.endDate = endDate;

        this.car = car;
        this.customer = customer;
        this.pickUpOffice = pickUpOffice;
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

    protected boolean customerWithoutOverlap(){
        boolean overlap = false;
        List<Rental> rentals = new ArrayList<>();
        for (Rental r : rentals){
            if (r.getStartDate() == this.startDate || r.getE) //Terminar, no esta completo
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
}