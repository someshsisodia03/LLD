package LLD.RouteHandler_COR.Controllers;
import LLD.RouteHandler_COR.DTOs.Request;
import LLD.RouteHandler_COR.Factory.*;
import LLD.RouteHandler_COR.Handlers.*;
import LLD.RouteHandler_COR.Schema.ToDo;
public class ToDoControllers {
    private Handler handlerChain;
    private ToDo createToDoController(Request request) {
        handlerChain = HandlerFactory.createToDoHandler();
        handlerChain.handle(request);

        return new ToDo();
    }
}