import java.util.List;
import java.util.Enumeration;
import java.util.ArrayList;

public class Model {
    private String name;
    private int pricePerDay;
    private List<Car> cars;

    public Model(String name, int pricePerDay){
        this.name = name;
        this.pricePerDay = pricePerDay;

        this.cars = new ArrayList<Car>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPricePerDay(){
        return this.pricePerDay;
    }

    public void setPricePerDay(int pricePerDay){
        this.pricePerDay = pricePerDay;
    }

    // Car
    public Enumeration<Car> getCarsOfModel(){
        return java.util.Collections.enumeration(this.cars);
    }

    protected void addCarOfModel(Car car){
        this.cars.add(car);
    }

    protected void rmCarOfModel(Car car){
        this.cars.remove(car);
    }
}