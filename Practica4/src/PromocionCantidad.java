import java.util.Date;
public class PromocionCantidad implements Promocion{

    private Integer cantidad;

    public PromocionCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }

    public int getPromocion(){
        return cantidad;
    }

    public int getDescuento(Car car, Date endDate, Date startDate){
        int precio = car.getModel().getPricePerDay() * (int)((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24)) - cantidad;
        return precio;
    }
}
