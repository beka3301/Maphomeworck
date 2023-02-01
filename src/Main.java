import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,Series> data=new HashMap<>();
        data.put(new Car(99,999),new Series("toyota",2009,300000));
        data.put(new Car(929,123),new Series("porshe",2019,9000000));
        data.put(new Car(1,926),new Series("nissan",2010,800000));
        data.put(new Car(5,9457),new Series("mclaren",2020,10000000));
        data.put(new Car(11,715),new Series("hundai",2015,900000));
        data.forEach((car, series) -> System.out.println(car+" "+series));
    }
}