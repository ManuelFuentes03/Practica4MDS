import java.util.Date;

public class RentalOnSite extends Rental{

    private String comments;

    public RentalOnSite(Date startDate, Date endDate, Car car, Customer customer, RentalOffice rentalOffice, String comments){
        super(startDate, endDate, car, customer, rentalOffice);
        this.comments = comments;
    }

    public String getComments(){
        return this.comments;
    }

    public void setComments(String comments){
        this.comments = comments;
    }

}