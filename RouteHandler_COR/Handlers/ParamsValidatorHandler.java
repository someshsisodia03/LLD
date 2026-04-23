package LLD.RouteHandler_COR.Handlers;
import LLD.RouteHandler_COR.DTOs.Request;
public class ParamsValidatorHandler implements Handler {
    private final Handler nextHandler;
    public ParamsValidatorHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        // Parameter validation logic here
        nextHandler.handle(request);
    }
}