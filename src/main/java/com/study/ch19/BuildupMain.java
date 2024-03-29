package com.study.ch19;

public class BuildupMain {
    public static void main(String[] args) {
        Car.CarBuilder cb = new Car.CarBuilder(); //CarBuilder(): 생성자
        Car c2 = cb.build();

        Car c = Car.builder().model("폭스바겐").color("차콜").build(); // builder(): static 메소드

        System.out.println(c);

        Member m = new Member("김종현", "01034216786");
        Member m1 = Member.builder()
                .phone("01034216786")
                .name("")
                .build();

    }

}