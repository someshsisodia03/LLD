package LLD.ATM.Better.models;
import LLD.ATM.Better.DTO.*;
import LLD.ATM.Better.Services.CardManagerService;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.states.*;
public class ATM {
    private final String atmId;
    private State state;
    private final backendApi backendApi;
    private final CardManagerService cardManagerService;
    public ATM(String atmId,CardManagerService cardManagerService) {
        this.atmId = atmId;
        this.backendApi = new NodeBackend();
        this.cardManagerService = cardManagerService;
        state = new ReadyForTransactionState(this, backendApi, cardManagerService);
    }
    public String getAtmId() {
        return atmId;
    }
    public State getState() {
        return state;
    }
    public void updateState(State state) {
        this.state = state;
        backendApi.updateState(new updateTransactionDTO(atmId, state.getStatus()));
    }
}