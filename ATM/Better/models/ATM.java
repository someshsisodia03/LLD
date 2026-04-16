package LLD.ATM.Better.models;
import LLD.ATM.Better.DTO.*;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.states.*;
public class ATM {
    private final String atmId;
    private State state;
    private final backendApi backendApi;
    public ATM(String atmId) {
        this.atmId = atmId;
        this.backendApi = new NodeBackend();
        state = new ReadyForTransactionState(this, backendApi);
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