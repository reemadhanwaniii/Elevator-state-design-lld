package models;

import enums.ElevatorStateType;
import states.ElevatorState;
import states.IdleState;

import java.util.TreeSet;

public class Elevator {
    private int currentFloor;
    private ElevatorState state;
    private final TreeSet<Integer> upRequests = new TreeSet<>();
    private final TreeSet<Integer> downRequests = new TreeSet<>((a,b) -> b-a);

    public Elevator() {
        this.currentFloor = 0;
        this.state = new IdleState();
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public ElevatorState getState() {
        return state;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public TreeSet<Integer> getUpRequests() {
        return upRequests;
    }

    public TreeSet<Integer> getDownRequests() {
        return downRequests;
    }
}
