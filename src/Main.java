import controller.ElevatorController;
import enums.Direction;
import enums.RequestSource;
import models.Request;

class Main {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController();
        controller.submitRequest(
                new Request(2,
                        Direction.UP,
                        RequestSource.EXTERNAL));
        controller.submitRequest(
                new Request(8,
                        Direction.DOWN,
                        RequestSource.EXTERNAL));

        controller.submitRequest(
                new Request(3,
                        Direction.UP,
                        RequestSource.INTERNAL));

        for(int i=0;i<10;i++)
            controller.run();

    }
}