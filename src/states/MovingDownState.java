package states;

import models.Elevator;

public class MovingDownState implements ElevatorState{

    @Override
    public void handleRequest(Elevator elevator) {
        if(elevator.getDownRequests().isEmpty()) {
            elevator.setState(new MovingUpState());
            return;
        }

        int nextFloor = elevator.getDownRequests().pollFirst();
        elevator.setCurrentFloor(nextFloor);
        System.out.println("Moving Down : Floor :->"+nextFloor);
    }
}
