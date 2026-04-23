package LLD.RouteHandler_COR.Handlers;

import LLD.RouteHandler_COR.DTOs.Request;

public class AuthenticationHandler implements Handler {
    private final Handler nextHandler;
    public AuthenticationHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        // Authentication logic here
        nextHandler.handle(request);
    }
}