import java.util.ArrayList;

public class Attractions {

    private String name;
    private Double heightRestriction;


    public Attractions(String name, Double heightRestriction) {
        this.name = name;
        this.heightRestriction = heightRestriction;
    }

    public String getName() {
        return name;
    }

    public Double getHeightRestriciton() {
        return heightRestriction;
    }
}

