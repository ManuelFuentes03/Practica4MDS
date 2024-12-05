import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.Enumeration;

public class Car{

    private String licensePlate;
    private Model model;
    private RentalOffice rentalOffice;
    private List<Rental> rentals;
    //private Estado estado = new EnServicio();//Inicialmente el coche esta EN servicio

    public Car(String licensePlate, Model model, RentalOffice rentalOffice){
        this.licensePlate = licensePlate;

        this.model = model;
        this.rentalOffice = rentalOffice;
        this.rentals = new ArrayList<Rental>();
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePLate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public Model getModel(){
        return this.model;
    }

    public void setModel(Model model){
        this.model = model;
    }

    public RentalOffice getRentaloffice(){
        return this.rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice){
        this.rentalOffice = rentalOffice;
    }

    // Rental
    public Enumeration<Rental> getwebRentals(){
        return java.util.Collections.enumeration(this.rentals);
    }

    protected void addRental(Rental rental){
        this.rentals.add(rental);
    }

    protected void rmRental(Rental rental){
        this.rentals.remove(rental);
    }

    public void takeOutOfService(Date backToService){
        //Comprobar estado
        //Si estado == SinServicio, no hacemos nada
        //Si estado == EnServicio, cambiamos a SinServicio
    }
}