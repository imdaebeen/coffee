
public class TransactionHandler{

    public <T> T runOnWriteTransaction(Supplier<T> supplier){
        return supplier.get();
    }
}