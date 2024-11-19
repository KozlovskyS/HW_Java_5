public class BonusService {

    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;  //вычисляем размер бонуса
        long limit = 500;  //установление лимита
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
