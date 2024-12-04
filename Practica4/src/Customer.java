import java.util.Collection;
public class Customer {

    private String name;
    private String dni;
    private ConcreteWebRentalIterator iterador;
    private Collection<Rental> rentals;

    public Customer(String name, String dni){
        this.name = name;
        this.dni = dni;
        rentals = new Collection();
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

    public Collection<Rental>  getRentals(){
        return rentals;
    }

    protected void addRental(Rental rental){
        this.rentals.add(rental);

    }

    protected void rmRental(Rental rental){
        this.rentals.remove(rental);

    }

    public Integer numberOfRentalsWithDifferentOffices() {
        int numRentals = 0;                                     // Numero de rentas (variable a devolver)
        iterador = new ConcreteWebRentalIterator(rentals);   // Creamos un iterador de webRentals

        while(iterador.hasNext()){// Mientras el iterador tenga siguiente (la lista contega items)
            Rental renta = iterator.next();
            if(renta instanceof WebRental){
                WebRental webRental = (WebRental)renta;               // Seleccionamos el item
                RentalOffice deliveryOffice = webRental.getDeliveryOffice();    // Obtenemos la oficina de entregaficina de entrega
                RentalOffice pickUpOffice = webRental.getRentalOffice();        // Obtenemos la oficina de recogida        

                if(!deliveryOffice.equals(pickUpOffice)){           // Si las oficinas son distintas
                    numRentals++;                                   // Aumentamos el contador
                }
            }
        }

        return numRentals;
    }
}