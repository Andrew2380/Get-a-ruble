public class Main {

    public static void main(String[] args) {
        boolean user = true;
        int persent =100;
        long wasamount = 100;
        long replenishedamount = 1101;
        long bonus = (replenishedamount / persent);
        long totalamount = (replenishedamount + wasamount);
        long limit = 0;
        if (replenishedamount <= 1000){
            bonus = limit;
    }
        System.out.println(totalamount + bonus );
        System.out.println(bonus);
    }
}