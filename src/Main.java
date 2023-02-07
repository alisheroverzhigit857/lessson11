import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Кош келиниз!!!");
        String a = scanner.nextLine();
        System.out.println("1: Кыргызча:\n 2: Русский: \n 3: English:  ");
        int b = scanner.nextInt();
//        while (true) {

        switch (b) {
            //  Account account = new Account();
            case 1:
                System.out.println("Кыргызча: ");
                System.out.println("1:  Накталай акча алуу\n2:   Жe кредитке аласызбы");
                break;
            case 2:
                System.out.println("Русский: ");
                System.out.println("N: Выдача наличных\n K: или кредит ");
                break;
            case 3:
                System.out.println("English: ");
                System.out.println("A: cash advance \nC:  Credit ");
        }
        Account account = new Account();
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.nextLine();

        switch ( s ) {
            case "1":
                System.out.println("Сизде 1000 сом бар! ");
                System.out.println("Сиз канча акча аласыз? ");
                int aluu = scanner1.nextInt();
                account.withdrawal(aluu);
                System.out.println("Сиздин балансыныз: "+account.balance);
                break;
            case "2":
                System.out.println("Kредит бере албайбыз!! ");
                break;
            case "N":
                System.out.println("У вас есть 1000 сом! ");
                System.out.println("Сколько денег хотите взять?");
                int vzyat = scanner1.nextInt();
                account.withdrawal(vzyat);
                System.out.println("У вас остолось: "+account.balance);
                break;
            case "K":
                System.out.println("Извините у меня нет денег!!");
                break;
            case "A":
                System.out.println("Do you have 1000 som!! ");
                System.out.println("Siz kancha akcha alasyz: ");
                int take = scanner1.nextInt();
                account.withdrawal(take);
                System.out.println("You'r Balance: "+account.balance);
                break;
            case "C":
                System.out.println("Sorry, I don't have money !!");
                break;
        }

    }
}