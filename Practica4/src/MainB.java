import java.util.Date;

public class MainB {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Customer customer = new Customer("David", "123456789A");
        Model model = new Model("Corsa", 50);
        RentalOffice rentalOffice = new RentalOffice("Boulevar Louis Pasteur, 13", 220);
        RentalOffice deliveryOffice = new RentalOffice("Gran Via, 20", 120);
        Car car = new Car("0000ABC", model, rentalOffice);
        Car car2 = new Car("1111ABC", model, rentalOffice);
        Date startDate = new Date(2024, 12, 1);
        Date endDate = new Date(2024, 12, 10);
        Date backToService = new Date(2024, 12, 5);
        
        WebRental webRental = new WebRental(startDate, endDate, car, customer, rentalOffice, deliveryOffice);
        
        customer.addRental(webRental);
        car.addRental(webRental);
        car2.addRental(webRental);
        rentalOffice.addCar(car);   
        rentalOffice.addCar(car2);
        
        //Como el coche esta en servicio, no se hay coche de sustitucion
        System.out.println("El coche esta en servicio");
        if(car.getCocheSustituto() == null){
            System.out.println("No hay coche sustituto");
        }else{
            System.out.println("El coche sustituto es: " + car.getCocheSustituto().getLicensePlate());
        }

        //Cambiamos el estado del coche a SinServicio
        System.out.println("Cambiamos el estado del coche a SinServicio");
        car.takeOutOfService(backToService);

        if(car.getCocheSustituto() == null){
            System.out.println("No hay coche sustituto");
        }else{
            System.out.println("El coche sustituto es: " + car.getCocheSustituto().getLicensePlate());
        }
    } 
}
