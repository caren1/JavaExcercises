import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    private Account account;

    @Before
    public void createBankAccountWithZeroValue() {
        account = new Account();
    }

    public int getBankAccountBalance() {
        int balance = account.getValue();
        return balance;
    }

    @Test
    public void isBankAccountZero() {
        Assert.assertEquals(0, getBankAccountBalance());
    }

    @Test
    public void shouldReturn200If200GivenDuringCreating() {
        Account account = new Account(200);
        int balance = account.getValue();
        Assert.assertEquals(200, balance);
    }

    @Test
    public void isDepositPossible() {
        Account account = new Account(0);
        Assert.assertEquals(35, account.deposit(35));
    }

    @Test
    public void shouldAddMoneyForNonEmptyAccount() {
        int initialAmount = 300;
        int amount = 700;
        int expectedBalance = 1000;
        Account account = new Account(initialAmount);
        int balance = account.deposit(amount);
        Assert.assertEquals(expectedBalance, balance);
    }

    @Test
    public void shouldNotChangeBalanceIfNegativeAmountGiven() {
        int negativeAmount = -100;
        int initialAmount = 400;
        int expectedBalance = initialAmount;
        Account account = new Account(initialAmount);
        int balance = account.deposit(negativeAmount);
        Assert.assertEquals(expectedBalance, balance);
    }

    @Test
    public void shouldWithdrawGivenMoney() {
        int initialAmount = 2000;
        int expectedBalance = 500;
        int amount = 1500;
        Account account = getAccount(initialAmount);
        int balance = account.withdraw(amount);
        Assert.assertEquals(expectedBalance, balance);
    }

    private Account getAccount(int initialAmount) {
        return new Account(initialAmount);
    }
}

