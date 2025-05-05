public class BankApp {
    static BankProcess bc = new BankProcess();


    public static void main(String[] args) {

        System.out.println("Добро пожаловать в Банк!");
//        bc.balanceInput();
//        bc.monthInput();
        bc.bankCalculation("cycleFor");
    }

}
