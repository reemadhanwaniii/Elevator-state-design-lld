package services;

import enums.Direction;
import enums.RequestSource;
import models.Elevator;
import models.Request;

public class RequestSchedular {
    public void schedule(Elevator elevator, Request request) {
        int nextFloor = request.getTargetfloor();
        int currentFloor = elevator.getCurrentFloor();

        if(request.getRequestSource() == RequestSource.INTERNAL) {
            if(nextFloor > currentFloor) {
                elevator.getUpRequests().add(nextFloor);
            }else{
                elevator.getDownRequests().add(nextFloor);
            }
        }

//        external request logic
        if(request.getDirection() == Direction.UP) {
            if(nextFloor >= currentFloor) {
                elevator.getUpRequests().add(nextFloor);
            }else{
                elevator.getDownRequests().add(nextFloor);
            }
        }else {
            if(nextFloor <= currentFloor) {
                elevator.getDownRequests().add(nextFloor);
            }else {
                elevator.getUpRequests().add(nextFloor);
            }
        }
    }
}
