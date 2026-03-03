package services;

import models.Elevator;

public class ElevatorService {
    public void step(Elevator elevator) {
        elevator.getState().handleRequest(elevator);
    }
}
