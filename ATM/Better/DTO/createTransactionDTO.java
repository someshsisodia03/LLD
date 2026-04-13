package LLD.ATM.Better.DTO;
//what this class will do?
//This class will be used to create a transaction in the backend when a new transaction is initiated at the ATM. It will contain the necessary information required to create a transaction, such as the ATM ID. This DTO will be sent to the backend API when the initTransaction method is called in the ReadyForTransactionState.

// WHat that DTO will do?
//This DTO will be used to transfer the necessary information from the ATM to the backend API when a new transaction is initiated. It will contain the ATM ID, which will be used by the backend to create a new transaction record in the database and associate it with the correct ATM. This will allow the backend to track the transaction and its status as it progresses through the various states of the ATM transaction process.

// So dto will be used to transfer data from one layer to another layer. In this case, it will transfer data from the ATM layer to the backend API layer when a new transaction is initiated. The backend API will then use this data to create a new transaction record in the database and manage the transaction as it progresses through the various states of the ATM transaction process.

// who will return the transaction id create coneection dto or backend api?
//The backend API will return the transaction ID when a new transaction is initiated. The createTransactionDTO will be used to transfer the necessary information (such as the ATM ID) from the ATM layer to the backend API layer, and the backend API will use this information to create a new transaction record in the database and generate a unique transaction ID. This transaction ID will then be returned to the ATM layer, where it can be used to track the transaction as it progresses through the various states of the ATM transaction process.

// while returnign the transaction id is there no role of dto?
// The DTO (Data Transfer Object) plays a crucial role in the process of returning the transaction ID. When the initTransaction method is called in the ReadyForTransactionState, it creates an instance of the createTransactionDTO and populates it with the necessary information (such as the ATM ID). This DTO is then sent to the backend API when the getTransactionId method is called. The backend API uses the information in the DTO to create a new transaction record in the database and generate a unique transaction ID. Finally, this transaction ID is returned to the ReadyForTransactionState, which can then use it to manage the transaction as it progresses through the various states of the ATM transaction process. So, while the DTO itself does not directly return the transaction ID, it is an essential part of the process that allows the backend API to generate and return the transaction ID based on the information provided by the ATM layer.

public class createTransactionDTO {
    private final String atmId;

    public createTransactionDTO(String atmId) {
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }



}