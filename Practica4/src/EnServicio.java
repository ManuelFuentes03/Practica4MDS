import java.util.Date;
import java.util.List;

public class EnServicio extends Estado{

    public void takeOutOfService(Date backtoService, Car car){
        //Comprobar estado
            //Si estado == SinServicio, no hacemos nada
            //Si estado == EnServicio, cambiamos a SinServicio y sustituimos por otro coche del mismo modelo, 
            //misma oficina y que este en servicio
        car.estado = new SinServicio(); //Cambiamos el estado del coche
        car.setDateBackToService(backtoService);
        List<Car> cochesParaUsar = car.getRentaloffice().listaCochesDisponibles(car.getModel());
        if(cochesParaUsar != null){
            Car coche_sus = cochesParaUsar.get(0);
            car.setCocheSustituto(coche_sus); //Inicializamos el coche sustituto
            coche_sus.estado = new SinServicio();            
        }else{
            System.out.println("No hay coches disponibles para la sustitucion");
        }
    }

    
}
