package org.programs.java8.lamda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumerDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 10;
        Consumer<Integer> consumer = i -> System.out.println("Printing Number "+i);
        consumer.accept(supplier.get());

    }
}
