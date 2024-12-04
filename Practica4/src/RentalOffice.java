import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;

public class RentalOffice{

    private String addres;
    private int feeForDelivery;
    private List<WebRental> webRentals;
    private List<Rental> rentals;
    private List<Car> cars;

    public RentalOffice(String address, int feeForDelivery){
        this.addres = address;
        this.feeForDelivery = feeForDelivery;

        this.webRentals = new ArrayList<WebRental>();
        this.rentals = new ArrayList<Rental>();
        this.cars = new ArrayList<Car>();
    }

    public String getAddress(){
        return this.addres;
    }

    public void setAddress(String address){
        this.addres = address;
    }

    public int getfeeForDelivery(){
        return this.feeForDelivery;
    }

    public void setfeeForDelivery(int feeForDelivery){
        this.feeForDelivery = feeForDelivery;
    }

    // WebRental
    public Enumeration<WebRental> getwebRentals(){
        return java.util.Collections.enumeration(this.webRentals);
    }

    protected void addWebRental(WebRental webRental){
        this.webRentals.add(webRental);
    }

    protected void rmWebRental(WebRental webRental){
        this.webRentals.remove(webRental);
    }

    // Rental
    public Enumeration<Rental> getRentals(){
        return java.util.Collections.enumeration(this.rentals);
    }

    protected void addRental(Rental rental){
        this.rentals.add(rental);
    }

    protected void rmRental(Rental rental){
        this.rentals.remove(rental);
    }

    // Cars
    public Enumeration<Car> getCars(){
        return java.util.Collections.enumeration(this.cars);
    }

    protected void addCar(Car car){
        this.cars.add(car);
    }

    protected void rmCar(Car car){
        this.cars.remove(car);
    }
}