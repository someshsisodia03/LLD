package LLD.ATM.Better.DTO;

import LLD.ATM.Better.Enums.ATMState;

public class updateTransactionDTO {
    private final String atm;
    private final ATMState status;

    public updateTransactionDTO(String atm, ATMState status) {
        this.atm = atm;
        this.status = status;
    }

    
}