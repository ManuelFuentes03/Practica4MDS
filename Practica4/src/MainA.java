import java.util.Date;

public class MainA {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Customer customer = new Customer("David", "123456789A");
        Model model = new Model("Corsa", 50);
        RentalOffice rentalOffice = new RentalOffice("Boulevar Louis Pasteur, 13", 220);
        RentalOffice deliveryOffice = new RentalOffice("Gran Via, 20", 120);
        Car car = new Car("0000ABC", model, rentalOffice);
        Date startDate = new Date(2024, 12, 1);
        Date endDate = new Date(2024, 12, 10);
        Date startDate2 = new Date(2024, 12, 15);
        Date endDate2 = new Date(2024, 12, 20);
        Date startDate3 = new Date(2024, 12, 25);
        Date endDate3 = new Date(2024, 12, 30);


        //El cliente customer alquila un coche car en la oficina de rentalOffice el día 1 y lo devuelve en la oficina deliveryOffice el día 10
        //Creamos 3 webRentals, con 3 fechas diferentes, con la diferncia de que la 1 y la 3 tiene la misma oficiona de recogida.
        //Así, el método numberOfRentalsWithDifferentOffices debería devolver 2
        WebRental webRental = new WebRental(startDate, endDate, car, customer, rentalOffice, deliveryOffice);
        WebRental webRental2 = new WebRental(startDate2, endDate2, car, customer, deliveryOffice, rentalOffice);
        WebRental webRental3 = new WebRental(startDate3, endDate3, car, customer, rentalOffice, rentalOffice);
        customer.addRental(webRental);
        customer.addRental(webRental2);
        customer.addRental(webRental3);
        car.addRental(webRental);
        car.addRental(webRental2);
        car.addRental(webRental3);

        rentalOffice.addCar(car);
                
        
        System.out.println("Numero de rentals con oficinas diferentes: " + customer.numberOfRentalsWithDifferentOffices());


    }
    
}
