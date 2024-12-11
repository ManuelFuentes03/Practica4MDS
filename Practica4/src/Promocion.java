import java.util.Date;

public interface Promocion {
    
    public int getDescuento(Car car, Date endDate, Date startDate);

    public int getPromocion();
    
}