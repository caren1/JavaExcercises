import org.junit.Assert;
import org.junit.Test;

public class AccountTest1 {

    @Test(expected = NotEnoughMoneyException.class)
    public void shouldThrowsNotEnoughMoneyException() throws  Exception{
        final Account2 account = new Account2("Wojtek");
        account.deposit(1000);
        account.withdraw(200);
        Assert.fail("attempt to withdraw too much money should throw an exception");
    }
}
