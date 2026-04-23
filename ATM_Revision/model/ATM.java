package LLD.ATM_Revision.model;
import LLD.ATM_Revision.DTO.*;
import LLD.ATM_Revision.States.*;
import LLD.ATM_Revision.apis.*;
public class ATM{
    private final int ATMId;
    private final int amount;
    private final Backend backend;
    State state;
    public ATM(int ATMId, int amount, Backend backend) {
        this.ATMId = ATMId;
        this.amount = amount;
        this.backend = backend;
    }
    public int getATMId() {
        return ATMId;
    }
    public int getAmount() {
        return amount;
    }
    public State getState() {
        return state;
    }
    public void updateState(State state) {
        this.state = state;
        backend.updateATMState(new UpdateATMStateDTO(ATMId, state.getStatus()));
    }   
}