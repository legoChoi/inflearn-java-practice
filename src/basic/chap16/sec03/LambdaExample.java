package basic.chap16.sec03;

public class LambdaExample {

    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> System.out.printf("%s이 %s을 합니다.\n", name, job));
        person.action1((name, job) -> System.out.printf("%s이 %s을 하지 않습니다.\n", name, job));

        person.action2(word -> System.out.printf("\"%s\" 라고 말합니다.\n", word));
        person.action2(word -> System.out.printf("\"%s\" 라고 외칩니다.\n", word));
    }
}
