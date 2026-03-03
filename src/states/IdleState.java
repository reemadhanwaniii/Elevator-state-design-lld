package states;

import models.Elevator;

public class IdleState implements ElevatorState {
    @Override
    public void handleRequest(Elevator elevator) {
        if(!elevator.getUpRequests().isEmpty()) {
            elevator.setState(new MovingUpState());
        }else if(!elevator.getDownRequests().isEmpty()) {
            elevator.setState(new MovingDownState());
        }
        //else stay idle
    }
}
