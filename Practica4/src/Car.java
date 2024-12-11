import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.Enumeration;

public class Car{

    private String licensePlate;
    private Model model;
    private RentalOffice rentalOffice;
    private List<Rental> rentals;
    public Estado estado; //Inicialmente el coche esta EN servicio
    private Date dateBackToService;
    private Car cocheSustituto;

    public Car(String licensePlate, Model model, RentalOffice rentalOffice){
        this.licensePlate = licensePlate;

        this.model = model;
        this.rentalOffice = rentalOffice;
        this.rentals = new ArrayList<Rental>();
        this.estado = new EnServicio();
        this.cocheSustituto = null;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePLate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public Estado getEstado(){
        return this.estado;
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
    public Enumeration<Rental> getRentals(){
        return java.util.Collections.enumeration(this.rentals);
    }

    protected Rental getLastRental(){
        return this.rentals.get(this.rentals.size()-1);
    }
    
    protected void addRental(Rental rental){
        this.rentals.add(rental);
    }

    protected void rmRental(Rental rental){
        this.rentals.remove(rental);
    }

    public Date getDateBackToService(){
        return this.dateBackToService;
    }

    public void setDateBackToService(Date date){
        this.dateBackToService = date;
    }
    
    public Car getCocheSustituto(){
        return this.cocheSustituto;
    }

    public void setCocheSustituto(Car cocheSustituto){
        this.cocheSustituto = cocheSustituto;
    }

    public void takeOutOfService(Date fecha){
        estado.takeOutOfService(fecha, this);
    }
}