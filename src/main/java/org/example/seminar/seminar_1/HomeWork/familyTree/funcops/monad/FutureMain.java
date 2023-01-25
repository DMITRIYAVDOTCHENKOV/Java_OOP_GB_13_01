package org.example.seminar.seminar_1.HomeWork.familyTree.funcops.monad;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<String> future = completableFuture
                .thenApply(s -> s + " World")
                .thenApply(s -> s + "\n completed!");

        System.out.println(future.get());
    }
}
