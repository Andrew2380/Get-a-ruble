public class Main {

    public static void main(String[] args) {
        boolean user = true;
        int persent =100;
        long WasAmountKopecks = 10000;
        long ReplenishedAmountKopecks = 110000;
        long Bonus = (ReplenishedAmountKopecks / persent) / 100;
        long totalamount = (ReplenishedAmountKopecks + WasAmountKopecks) / 100;
        long limit = 0;
        if (ReplenishedAmountKopecks <= 100000){
            Bonus = limit;
    }
        System.out.println(totalamount + Bonus );
        System.out.println(Bonus);
    }
}