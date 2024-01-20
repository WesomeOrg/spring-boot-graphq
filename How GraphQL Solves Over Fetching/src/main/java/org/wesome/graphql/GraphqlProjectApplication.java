package org.wesome.graphql;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wesome.graphql.data.AppleType;
import org.wesome.graphql.entity.Apple;
import org.wesome.graphql.entity.Store;
import org.wesome.graphql.entity.Vendor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {
    public static Apple apple;
    public static List<Vendor> vendors;
    public static List<Store> stores;

    public static void main(String[] args) {
        SpringApplication.run(GraphqlProjectApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Faker faker = new Faker();
        vendors = IntStream.rangeClosed(1, AppleType.values().length - 1).mapToObj(value -> new Vendor(value, value, faker.name().fullName(), faker.random().nextBoolean())).collect(Collectors.toList());
        stores = IntStream.rangeClosed(1, AppleType.values().length - 1).mapToObj(value -> new Store(value, value, faker.company().name(), faker.address().fullAddress())).collect(Collectors.toList());
        apple = new Apple(1, AppleType.MACINTOSH.name(), faker.random().nextBoolean(), Float.valueOf(1), vendors, stores);
    }
}