import java.util.Date;

public class WebRental extends Rental{
    private int deliveryTime; //No hay que tenerlo en cuenta para nada
    private RentalOffice deliveryOffice;

    public WebRental(Date startDate, Date endDate, int deliveryTime, Car car, Customer customer, RentalOffice pickUpOffice, RentalOffice deliveryOffice){//Caso en el que nos pasan un deliveryTime no nulo
        super(startDate, endDate, car, customer, pickUpOffice);
        this.deliveryTime = deliveryTime;
        this.deliveryOffice = deliveryOffice;
    }

    public WebRental(Date startDate, Date endDate, Car car, Customer customer, RentalOffice pickUpOffice, RentalOffice deliveryOffice){//Caso de que el deliveryTime sea nulo
        super(startDate, endDate, car, customer, pickUpOffice);
        this.deliveryTime = 0;
        this.deliveryOffice = deliveryOffice;
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

    public void setDeliveryOffice(RentalOffice rental){
        this.deliveryOffice = rental;
    }

    protected boolean customerWithoutOverlap(){
        return true;
    }

    public boolean horaEntrega(){
        if(!(deliveryOffice.equals(super.getRentalOffice()))){
            return deliveryTime <= 13; 
        }
        return true;
    }
}