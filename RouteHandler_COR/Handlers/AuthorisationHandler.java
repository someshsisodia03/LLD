package LLD.RouteHandler_COR.Handlers;

import LLD.RouteHandler_COR.DTOs.Request;

public class AuthorisationHandler implements Handler {
    private final Handler nextHandler;
    public AuthorisationHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handle(Request request) {
        // Authorisation logic here
        nextHandler.handle(request);
    }
}