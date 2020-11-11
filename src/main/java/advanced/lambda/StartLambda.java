package advanced.lambda;

import java.lang.reflect.Parameter;
import java.util.function.Function;
import java.util.function.Predicate;

public class StartLambda {

    public static void main(String[] args) {

        Person person3 = new Person(26, "Ion", "Popescu");


        Predicate<Person> adultTest = new AdultPersonTest();

        System.out.println(adultTest.test(person3));

        Person person2 = new Person(12, "Maria", "Popescu");

        Predicate<Person> lambdaAdultTest = (person) -> person.getAge() >= 18;

        System.out.println(lambdaAdultTest.test(person2));

        Runnable runnableExample = () -> System.out.println("This is now running.");
        runnableExample.run();

        Predicate<String> endsWithTest = (string)-> string.endsWith("ant");
        System.out.println(endsWithTest.test("Zebra"));

        Function<String, Integer > stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("Mere"));

        Function<Person, Integer> getAgeFunction = person -> person.getAge();
        System.out.println(getAgeFunction.apply(person2));
        System.out.println(getAgeFunction.apply(person3));

    }

}
