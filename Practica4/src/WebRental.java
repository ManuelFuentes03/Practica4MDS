import java.util.Date;

public class WebRental extends Rental{
    private int deliveryTime; //No hay que tenerlo en cuenta para nada
    private RentalOffice deliveryOffice;

    public WebRental(Date startDate, Date endDate, int deliveryTime, Car car, Customer customer, RentalOffice pickUpOffice, RentalOffice deliveryOffice){//Caso en el que nos pasan un deliveryTime no nulo
        super(startDate, endDate, car, customer, pickUpOffice);
        this.deliveryTime = deliveryTime;
        this.deliveryOffice = deliveryOffice;
    }

    public WebRental(Date startDate, Date endDate, Car car, Customer customer, RentalOffice rentalOffice){//Caso de que el deliveryTime sea nulo
        super(startDate, endDate, car, customer, rentalOffice);
    }

    public int getDeliveryTime(){
        return this.deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime){
        this.deliveryTime = deliveryTime;
    }

    public RentalOffice getDeliveryOffice(){
        return deliveryOffice;
    }

    public RentalOffice setDeliveyOffice(){
        return this.deliveryOffice
    }
}