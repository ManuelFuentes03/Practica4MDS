import java.util.Date;

public class PromocionPorcentaje implements Promocion{

    private Integer porcentaje;

    public PromocionPorcentaje(Integer porcentaje){
        this.porcentaje = porcentaje;
    }
    
    public int getDescuento(Car car, Date endDate, Date startDate){
        int precio = car.getModel().getPricePerDay() * (int)((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24)) * (100 - porcentaje) / 100;
        return precio;
    }

    public int getPromocion(){
        return porcentaje;
    }
}
