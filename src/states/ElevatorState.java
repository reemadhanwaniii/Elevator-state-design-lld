package states;

import models.Elevator;

public interface ElevatorState {
    void handleRequest(Elevator elevator);
}
