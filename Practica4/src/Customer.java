import java.util.Collection;
public class Customer {

    private String name;
    private String dni;
    private ConcreteWebRentalIterator iterador;
    private Collection<Rental> rentals;

    public Customer(String name, String dni){
        this.name = name;
        this.dni = dni;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDni(){
        return this.dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    protected void addRental(Rental rental){
        this.rentals.add(rental);
    }

    protected void rmRental(Rental rental){
        this.rentals.remove(rental);
    }

    public Integer numberOfRentalsWithDifferentOffices() {
        int numRentals = 0;
        iterador = new ConcreteWebRentalIterator(rentals);
        while(iterador.hasNext()){
            Rental rental = iterador.next();
            if(rental.getRentalOffice())
            
            
        }

        return numRentals;
    }
/*
    public int numberOfRentalsWithDifferentOffices() {
        RentalIterator iterator = createRentalIterator();
        int count = 0;

        while (iterator.hasNext()) {
            Rental rental = iterator.next();
            if (!rental.getPickupOffice().equals(rental.getDropoffOffice())) {
                count++;
            }
        }

        return count;
    }*/
}