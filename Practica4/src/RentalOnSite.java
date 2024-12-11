import java.util.Date;

public class RentalOnSite extends Rental{

    private String comments;

    public RentalOnSite(Date startDate, Date endDate, Car car, Customer customer, RentalOffice pickUpOffice, String comments){
        super(startDate, endDate, car, customer, pickUpOffice);
        this.comments = comments;
    }

    public RentalOnSite(Date startDate, Date endDate, Car car, Customer customer, RentalOffice pickUpOffice, String comments, Promocion promocion){
        super(startDate, endDate, car, customer, pickUpOffice, promocion);
        this.comments = comments;
    }

    public String getComments(){
        return this.comments;
    }

    public void setComments(String comments){
        this.comments = comments;
    }

}