package dispatcher;

import models.Elevator;
import models.Request;

import java.util.List;

public class ElevatorDispatcher {
    private final List<Elevator> elevators;

    public ElevatorDispatcher(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public Elevator selectElevator(Request request) {
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for(Elevator e : elevators) {
            int distance = Math.abs(e.getCurrentFloor() - request.getTargetfloor());
            if(distance < minDistance) {
                minDistance = distance;
                bestElevator = e;
            }
        }
        return bestElevator;
    }
}


