import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private final int id;
    private String image;
    private static  int counter = 1;
    private double fipeTable;
    private String story;
    private String engine;
    private String fuel;
    private int horsePower;
    private double torque;
    private String topSpeed;
    private String acceleration;
    private String exchange;
    private String traction;
    private String suspension;
    private String brakes;

}
