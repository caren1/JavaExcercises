public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException (final Account2 account, final int amount){
        super(account + "cannot withdraw" + amount);
    }
}
