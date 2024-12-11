import java.util.Date;

public class PromocionNula implements Promocion{   

    public int getDescuento(Car car, Date endDate, Date startDate){
        int precio = car.getModel().getPricePerDay() * (int)((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
        return precio;
    }
    
    
    public int getPromocion(){
        return 0;
    }
}