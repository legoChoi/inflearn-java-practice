package basic.chap16.sec04;

public class LambdaExample {

    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> {
            double result = x + y;
            return result;
        });
    }

    public static double sum(double x, double y) {
        return x + y;
    }
}
