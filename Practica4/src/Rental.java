import java.util.Date;

public class Rental {
    private Date startDate;
    private Date endDate;
    private Car car;
    private Customer customer;
    private RentalOffice pickUpOffice;

    public Rental(Date startDate, Date endDate, Car car, Customer customer, RentalOffice rentalOffice){
        this.startDate = startDate;
        this.endDate = endDate;

        this.car = car;
        this.customer = customer;
        this.pickUpOffice = rentalOffice;
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

    // RentalOffice
    public RentalOffice getRentalOffice(){
        return this.pickUpOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice){
        this.pickUpOffice = rentalOffice;
    }
}