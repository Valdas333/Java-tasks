package lt.techin.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamPraktiniai {

    public static List<Integer> returnSquareRoot(List<Integer> numbers){
       return numbers.stream().map(value -> (int) Math.sqrt(value)).collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> users){
        return users.stream().mapToInt(User::getAge).boxed().collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users){
        return users.stream().map(User::getAge).distinct().collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
        return users.stream().limit(limit).collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users){
        return (int) users.stream().map(User::getAge).filter(age -> age > 25).count();
    }

    public static List<String> mapToUpperCase(List<String> strings){
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers){
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
        return integers.stream().skip(toSkip).collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names){
        return names.stream().map(name -> name.split(" ")[0]).collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names){
        return names.stream()
                .flatMap(s -> s.chars().mapToObj(c -> String.valueOf((char) c)))
                .distinct()
                .collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users){
        return users.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).average().getAsDouble();
    }


    public static Integer getMaxAge(List<User> users){
       return users.stream().mapToInt(User::getAge).max().getAsInt();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).min().getAsInt();
    }

    public static boolean anyMatch(List<User> users, int age){
        return users.stream().anyMatch((user -> user.getAge() == age));
    }

    public static boolean noneMatch(List<User> users, int age){
        return users.stream().noneMatch((user -> user.getAge() == age));
    }

    public static Optional<User> findAny(List<User> users, String name){
        return users.stream().filter(user -> user.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users){
        return users.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){
       return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers(){
        return IntStream.iterate(2, i -> i + 1)
                .filter(num -> IntStream.range(2, (int) Math.sqrt(num) + 1).noneMatch(divisor -> num % divisor == 0))
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }

    public static List<Integer> generate10RandomNumbers(){
        Random random = new Random();
        return random.ints(10).boxed().collect(Collectors.toList());
    }

    public static User findOldest(List<User> users){
        return users.stream().max(Comparator.comparingInt(User::getAge)).orElse(null);
    }

    public static int sumAge(List<User> users){
        return users.stream().mapToInt(User::getAge).sum();
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
        return users.stream().collect(groupingBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
        return users.stream().collect(groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        return users.stream().collect(groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        return users.stream().collect(groupingBy(User::isMale,counting()));
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        return users.stream()
                .collect(Collectors.summarizingInt(User::getAge));
    }

}
