package javaToKotlin.chapter01.section01;

import javaToKotlin.chapter01.Person;

public class Lec01Main {
    long number1 = 10L; // 1
    final long number2 = 10L; // 2
    // 1과 2의 차이는 final의 차이다. 불변의 차이인것이다.

    Long number3 = 1_000L; // 3
    Person person = new Person("최태현"); // 4
//
//    public long calculate(Long number) {
//        if(number == null)
//            return 0;
//        // 다음 로직
//    }
}
