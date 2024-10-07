package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> f = ex.submit(() -> {
			Thread.sleep(1000);
			return 42;
		});
		
		try {
			System.out.println("waiting for result...");
			Integer result = f.get();
			System.out.println("Result" +result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		finally {
			ex.shutdown();
		}
	}

}
