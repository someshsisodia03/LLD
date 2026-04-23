package LLD.RouteHandler_COR.Factory;
import LLD.RouteHandler_COR.Handlers.*;
public class HandlerFactory {
    public static Handler createToDoHandler() {
        return new BodyValidatorHandler(
                new ParamsValidatorHandler(
                        new AuthenticationHandler(
                            new AuthorisationHandler(
                                new FinishingHandler() 
                        )
                )
        ));
    }
    public static Handler updateToDoHandler() {
        return new BodyValidatorHandler(
                new ParamsValidatorHandler(
                        new AuthenticationHandler(
                            new AuthorisationHandler(
                                new FinishingHandler() 
                        )
                )
        ));
    }
}