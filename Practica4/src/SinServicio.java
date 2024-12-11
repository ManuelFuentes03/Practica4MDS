import java.util.Date;

public class SinServicio extends Estado{
    public void takeOutOfService(Date fecha, Car car){
        System.out.println("El coche ya esta fuera de servicio");
    }
}