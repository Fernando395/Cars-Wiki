import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final int id;
    private String name;
    private String image;
    private static int counter = 1;
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

    public Car(String name, String image, double fipeTable, String story, String engine, String fuel, int horsePower, double torque, String topSpeed, String acceleration, String exchange, String traction, String suspension, String brakes) {
        this.name = name;
        this.image = image;
        this.fipeTable = fipeTable;
        this.story = story;
        this.engine = engine;
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.torque = torque;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.exchange = exchange;
        this.traction = traction;
        this.suspension = suspension;
        this.brakes = brakes;
        this.id = counter;
        counter++;
    }


    public Car(CreateCarDto dto) {
        this(dto.getImage(), dto.getName(), dto.getFipeTable(), dto.getStory(), dto.getEngine(), dto.getFuel(), dto.getHorsePower(), dto.getTorque(), dto.getTopSpeed(), dto.getAcceleration(), dto.getTraction(), dto.getSuspension(), dto.getBrakes(), dto.getStory);
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public double getFipeTable() {
        return fipeTable;
    }

    public String getStory() {
        return story;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getTorque() {
        return torque;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public String getExchange() {
        return exchange;
    }

    public String getTraction() {
        return traction;
    }

    public String getSuspension() {
        return suspension;
    }

    public String getBrakes() {
        return brakes;
    }

    public Car updateFromDto(CreateCarDto dto) {
        this.image = dto.getImage();
        this.name = dto.getName();
        this.acceleration = dto.getAcceleration();
        this.brakes = dto.getBrakes();
        this.exchange = dto.getExchange();
        this.engine = dto.getEngine();
        this.fipeTable = dto.getFipeTable();
        this.fuel = dto.getFuel();
        this.horsePower = dto.getHorsePower();
        this.story = dto.getStory();
        this.suspension = dto.getSuspension();
        this.topSpeed = dto.getTopSpeed();
        this.torque = dto.getTorque();
        this.traction = dto.getTraction();
        return this;
    }

    public Car partialUpdateFromDto(PartialUpdateCarDto dto) {
        if (dto.getImage().isPresent()) {
            this.image = dto.getImage().get();
        }
        if (dto.getName().isPresent()) {
            this.name = dto.getName().get();
        }
        if (dto.getFipeTable().isPresent()) {
            this.fipeTable = dto.getFipeTable().get();
        }
        if (dto.getTraction().isPresent()) {
            this.traction = dto.getTraction().get();
        }
        if (dto.getTorque().isPresent()) {
            this.torque = dto.getTorque().get();
        }
        if (dto.getEngine().isPresent()) {
            this.engine = dto.getEngine().get();
        }
        if (dto.getTopSpeed().isPresent()) {
            this.topSpeed = dto.getTopSpeed().get();
        }
        if (dto.getSuspension().isPresent()) {
            this.suspension = dto.getSuspension().get();
        }
        if (dto.getStory().isPresent()) {
            this.story = dto.getStory().get();
        }
        if (dto.getHorsePower().isPresent()) {
            this.horsePower = dto.getHorsePower().get();
        }
        if (dto.getFuel().isPresent()) {
            this.fuel = dto.getFuel().get();
        }
        if (dto.getExchange().isPresent()) {
            this.exchange = dto.getExchange().get();
        }
        if (dto.getBrakes().isPresent()) {
            this.brakes = dto.getBrakes().get();
        }
        if (dto.getAcceleration().isPresent()) {
            this.acceleration = dto.getAcceleration().get();
        }
        return this;
    }
}
