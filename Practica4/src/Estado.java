import java.util.Date;
public abstract class Estado{    
    public void takeOutOfService(Date backToService, Car car){}
    //TIPOS DEL ESTADO DEL COCHE
    //SIN SERVICIO Y COCHE_SUSTITUCION = NULL -> SUSTITUYENDO A OTRO
    //SIN SERVICIO Y COCHE_SUSTITUCION != NULL -> SIN SERVICIO
    //EN SERVICIO -> EN SERVICIO
}