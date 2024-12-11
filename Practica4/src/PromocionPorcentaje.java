
public class PromocionPorcentaje implements Promocion{
    public int getPrice(){
        int precio = car.getModel().getPricePerDay() * (int)((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
        return precio;
    }
}
