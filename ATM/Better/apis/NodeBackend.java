package LLD.ATM.Better.apis;


public class NodeBackend implements backendApi {
    @Override
    public int getTransactionId(String atmId) {
        return (int) (Math.random() * 100000);
    }
}