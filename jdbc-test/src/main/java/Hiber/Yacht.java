package hiber;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by java on 07.04.2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Yacht extends Boat {

    @Column
    private double maxSpeed;
    @Column
    private double length;

    public Yacht(String model, int maxPassengers, double maxSpeed, double length) {
        super(model, maxPassengers);
        this.maxSpeed = maxSpeed;
        this.length = length;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Yacht{id: " + getId()
               + ", model: " + " " + getModel()
               + ", maxPassengers: " + " " + getMaxPassengers()
               + ", maxSpeed: " + " " + getMaxSpeed()
               + ", length: " + " " + getLength() + "}";
=======

    @Override
    public String toString() {
        return "Yacht{id: " + getId()
                + ", model: " + " " + getModel()
                + ", maxPassengers: " + " " + getMaxPassengers()
                + ", maxSpeed: " + " " + getMaxSpeed()
                + ", length: " + " " + getLength() + "}";
>>>>>>> 0285f28a35d73acd24aa24432fae652a6fe507bb
    }
}
