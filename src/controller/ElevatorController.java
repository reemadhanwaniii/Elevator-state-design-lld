package controller;

import models.Elevator;
import models.Request;
import services.ElevatorService;
import services.RequestSchedular;

public class ElevatorController {
    private final Elevator elevator = new Elevator();
    private final RequestSchedular schedular = new RequestSchedular();
    private final ElevatorService elevatorService = new ElevatorService();


    public void submitRequest(Request request){
        schedular.schedule(elevator,request);
    }

    public void run() {
        elevatorService.step(elevator);
    }
}
