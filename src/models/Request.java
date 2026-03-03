package models;

import enums.Direction;
import enums.RequestSource;

public class Request {
    private final int targetfloor;
    private final Direction direction;
    private final RequestSource requestSource;

    public Request(int targetfloor,Direction direction,RequestSource requestSource) {
        this.targetfloor = targetfloor;
        this.direction = direction;
        this.requestSource = requestSource;
    }

    public int getTargetfloor() {
        return targetfloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public RequestSource getRequestSource() {
        return requestSource;
    }
}
