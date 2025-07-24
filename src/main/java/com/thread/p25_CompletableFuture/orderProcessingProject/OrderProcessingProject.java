package com.thread.p25_CompletableFuture.orderProcessingProject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



/**
 *
 * Real-world scenario: Order management system in an online store
 * Suppose you have a system in an online store that requires multiple external services (such as payment service, warehousing service, and email sending service) to be called in parallel to process an order. Each of these services may be time-consuming (due to network requests or heavy calculations), so using synchronous execution will slow down the system. Here, CompletableFuture helps to execute these operations asynchronously and in parallel.
 *
 *
 *
 *
 * Scenario details:
 * 1. Check inventory: Check if the product is in stock or not.
 * 2. Process payment: Communicate with the payment service to make the payment.
 * 3. Send confirmation email: After the payment and inventory check are successful, an order confirmation email is sent to the customer.
 * 4. Combine results: If all steps were successful, the order information is finalized
 *
 * */




public class OrderProcessingProject {

    private static List<Integer> products = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    private static List<Integer> orders = List.of(100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112);
    private static final List<Double> amounts = List.of(1000.5, 1001.5, 1002.5, 1003.5, 1004.4, 1005.4, 1006.4, 1007.4, 1008.3);


    /**
     * checked inventory
     */
    public static CompletableFuture<Boolean> checkInventory(Integer productId) {


        return CompletableFuture.supplyAsync(() -> {

            if (products.contains(productId)) {

                System.out.println("Checking inventory for product : " + " " + productId);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            } else {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.out.println("dont found product");
                    e.printStackTrace();
                }
                System.out.println("the product id dont found.");
                return false;
            }


        });
    }


    /**
     * process Payment
     */
    public static CompletableFuture<String> processPayment(Integer orderId, Double amount) {
        return CompletableFuture.supplyAsync(() -> {
                    if (orderId == null && amount == null) {
                        try {
                            throw new Exception("empty ...!!!");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } else {

                        if (orders.contains(orderId) && amounts.contains(amount)) {
                            System.out.println("Processing payment for order: " + " " + "with order id :" + " " + orderId + " " + "and amount of :" + " " + amount);
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                System.out.println("processPayment have a problem");
                                e.printStackTrace();
                            }
                        }
                    }
                    return "PAYMENT_SUCCESS_" + orderId;
                }

        );
    }


    /**
     * send Confirmation Email
     */

    public static CompletableFuture<String> sendConfirmationEmail(Integer orderId) {

        return CompletableFuture.supplyAsync(() -> {
                    if (orderId == null) {
                        try {
                            throw new Exception("empty order id...!!!");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } else {

                        if (orders.contains(orderId)) {
                            System.out.println("Processing payment for order: " + " " + "with order id :" + " " + orderId);
                            try {
                                Thread.sleep(10000);
                            } catch (InterruptedException e) {
                                System.out.println("sendConfirmationEmail have a problem");
                                e.printStackTrace();
                            }
                        }
                    }
                    return "EMAIL_SENT" + " "+ " with order id :" + " " + orderId;

                }

        );

    }


    public static void main(String[] args) {

        Integer productId = 1;
        Integer orderId = 100;
        Double amount = 1000.5;


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CompletableFuture<Void> orderProcessing = CompletableFuture.allOf(
                        checkInventory(productId),
                        processPayment(orderId, amount)
                )
                .thenCompose((unused) -> {
                    return sendConfirmationEmail(orderId);
                })
                .thenAccept((result) -> {
                    System.out.println("Order processing completed  with order id : " + " " + orderId + " " + " have result :" + " " + result);
                })
                .exceptionally(throwable -> {
                    System.out.println("Error occurred:" + throwable.getMessage());
                    return null;
                });


        orderProcessing.join();
        executorService.shutdown();

    }


}
