public class Main {
    public static void main(String[] args) {




        int deposit = 400; // было на счету
        int pay = 2000; // внесли


        int percent;

        if (pay > 1000) {
            percent = pay / 100 * 1;
        } else {
            percent = 0;
        }

        deposit = deposit + pay + percent;

        System.out.println("Сумма баланса " + deposit);
    }

}






