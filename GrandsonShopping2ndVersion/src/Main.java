import Money.ComplexSourceOfMoney;
import Money.FormOfMoney;
import Money.Grandma;
import Money.ISimpleSourceOfMoney;
import SimpleMoneySources.CreditCard;
import SimpleMoneySources.Socket;
import SimpleMoneySources.Wallet;

public class Main {
    public static void main(String[] args) {
//        Wallet wallet = new Wallet();
//        ShoppingNarrator shoppingNarrator = new ShoppingNarrator();
//        wallet.setAmount(1200);
//        wallet.addAmount(100);
//        wallet.getAmount();
//        wallet.substractMoney(200);
//
//        wallet.statusOfAvailableFunds();
//        shoppingNarrator.printFunds(wallet.statusOfAvailableFunds());
//
////        wallet.takeAvailableFunds();
////        shoppingNarrator.printFunds(wallet.statusOfAvailableFunds());
//
//        ComplexSourceOfMoney complexSourceOfMoney = new ComplexSourceOfMoney();
//        complexSourceOfMoney.addSourceOfMoney(wallet);
//
//        shoppingNarrator.printFunds(complexSourceOfMoney.statusOfAvailableFunds());
//
//        Socket socket = new Socket();
//        socket.setAmount(600);
//        socket.addAmount(359);
//        socket.getAmount();
//        socket.substractMoney(100);
//
//        complexSourceOfMoney.addSourceOfMoney(socket);


//        socket.statusOfAvailableFunds();
//        shoppingNarrator.printFunds(socket.statusOfAvailableFunds());
//        System.out.println("-----------");
//        shoppingNarrator.printFunds(complexSourceOfMoney.statusOfAvailableFunds());
//        System.out.println("-----------");
//        complexSourceOfMoney.takeAvailableFunds();

        ShoppingNarrator shoppingNarrator = new ShoppingNarrator();


        Grandma grandma = new Grandma("Halyna", 102);
        ISimpleSourceOfMoney wallet = new Wallet(500);
        ISimpleSourceOfMoney socket = new Socket(959);
        ISimpleSourceOfMoney creditcard = new CreditCard(1000);
        grandma.addSourceOfMoney(wallet, socket, creditcard);

        System.out.println("srodki baabci - stan aktualny");
        shoppingNarrator.printFunds(grandma.statusOfAvailableFunds());
        System.out.println();

        System.out.println("zabieramy babci srodki");
        shoppingNarrator.printFunds(grandma.takeAvailableFunds());
        System.out.println();

        System.out.println("srodki baabci - stan aktualny po zabraniu");
        shoppingNarrator.printFunds(grandma.statusOfAvailableFunds());
        System.out.println();

        System.out.println("do skiety 500 stów");
        socket.addAmount(500);

        System.out.println("stan srodkow babci -  aktualny po włozeniu ");
        shoppingNarrator.printFunds(grandma.statusOfAvailableFunds());


    }
}
