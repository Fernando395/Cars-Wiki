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
    private double FipeTable;
    private DataSheet dataSheet;
    private String story;
}
