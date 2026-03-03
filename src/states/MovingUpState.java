package states;

import models.Elevator;

public class MovingUpState implements ElevatorState{

    @Override
    public void handleRequest(Elevator elevator) {
        if(elevator.getUpRequests().isEmpty()) {
            elevator.setState(new MovingDownState());
            return;
        }

        int nextFloor = elevator.getUpRequests().pollFirst();
        elevator.setCurrentFloor(nextFloor);
        System.out.println("Moving UP  Floor :-> "+nextFloor);
    }
}
