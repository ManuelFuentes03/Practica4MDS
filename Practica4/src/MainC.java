import java.util.Date;

public class MainC {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Customer customer = new Customer("David", "123456789A");
        Model model = new Model("Corsa", 50);
        RentalOffice rentalOffice = new RentalOffice("Boulevar Louis Pasteur, 13", 220);
        RentalOffice deliveryOffice = new RentalOffice("Gran Via, 20", 120);
        Car car = new Car("0000ABC", model, rentalOffice);
        Date startDate = new Date(2024, 12, 1);
        Date endDate = new Date(2024, 12, 10);
        Promocion promocionNula = new PromocionNula();
        Promocion promocionCantidad = new PromocionCantidad(100);
        Promocion promocionPorcentaje = new PromocionPorcentaje(20);


        System.out.println("-----------------------RENTA NULA-----------------------");
        WebRental webRentalNula = new WebRental(startDate, endDate, car, customer, rentalOffice, deliveryOffice, promocionNula);
        customer.addRental(webRentalNula);
        car.addRental(webRentalNula);

        rentalOffice.addCar(car);
        System.out.println("El precio por dia es de: " + car.getModel().getPricePerDay());
        System.out.println("El descuento es de: " + promocionNula.getPromocion());
        System.out.println("El numero de dias alquilado es de: " + (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
        System.out.println("El precio de alquiler es de: " + webRentalNula.getPrice());

        
        System.out.println("\n\n-----------------------RENTA CANTIDAD-----------------------");
        Customer customerCantidad = new Customer("Marcos", "5123423E");
        Car carCantidad = new Car("12345JQK", model, rentalOffice);
        WebRental webRentalCantidad = new WebRental(startDate, endDate, carCantidad, customerCantidad, rentalOffice, deliveryOffice, promocionCantidad);
        customerCantidad.addRental(webRentalCantidad);
        carCantidad.addRental(webRentalCantidad);

        rentalOffice.addCar(carCantidad);
        System.out.println("El precio por dia es de: " + carCantidad.getModel().getPricePerDay());
        System.out.println("El descuento es de: " + promocionCantidad.getPromocion());
        System.out.println("El numero de dias alquilado es de: " + (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
        System.out.println("El precio de alquiler es de: " + webRentalCantidad.getPrice());
        
        
        System.out.println("\n\n-----------------------RENTA PORCENTAJE-----------------------");
        Customer customerPorcentaje = new Customer("Pepe", "1111111D");
        Car carPorcentaje = new Car("6969XDD", model, rentalOffice);
        WebRental webRentalPorcentaje = new WebRental(startDate, endDate, carPorcentaje, customerPorcentaje, rentalOffice, deliveryOffice, promocionPorcentaje);
        customerPorcentaje.addRental(webRentalPorcentaje);
        carPorcentaje.addRental(webRentalPorcentaje);

        rentalOffice.addCar(carPorcentaje);

        System.out.println("El precio por dia es de: " + carPorcentaje.getModel().getPricePerDay());
        System.out.println("El descuento es de: " + promocionPorcentaje.getPromocion() + "%");
        System.out.println("El numero de dias alquilado es de: " + (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
        System.out.println("El precio de alquiler es de: " + webRentalPorcentaje.getPrice());
    }

    
}
