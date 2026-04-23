package LLD.RouteHandler_COR.Handlers;
import LLD.RouteHandler_COR.DTOs.Request;
public class BodyValidatorHandler implements Handler {
    private final Handler nextHandler;
    public BodyValidatorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        // Body validation logic here
        nextHandler.handle(request);
    }
}