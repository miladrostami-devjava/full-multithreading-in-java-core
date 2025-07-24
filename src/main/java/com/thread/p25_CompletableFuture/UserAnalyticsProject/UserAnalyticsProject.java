package com.thread.p25_CompletableFuture.UserAnalyticsProject;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User data analysis system in a social networking platform
 *
 *
 *
 * Real-world scenario: User data analysis system in a social networking platform
 * Suppose that in a social networking platform, information related to user behavior (such as the number of likes, the number of visits, and recent activities) needs to be collected and analyzed from several different sources (such as a database, a behavior analysis service, and an external API). This information is used to generate personalized reports for the user or display statistical dashboards.
 * Each of these sources may be time-consuming (due to database access or network requests), so using a CompletableFuture to execute these operations in parallel and combine their results can improve system performance.
 * #Scenario details:
 * 1. Get the number of likes: The number of likes the user has received in a given time period is retrieved from the database.
 * 2. Get the number of views: The number of views the user has had on the user’s profile is extracted from a behavior analysis service.
 * 3. Get recent activities: The list of recent user activities (such as posts or comments) is retrieved from an external API.
 * 4 .Data synthesis and analysis: After collecting data, a comprehensive report is generated that includes the user's total score (e.g., likes and views) and details of recent activities. Based on a specific formula
 * 5. Save or display report: The final report is saved in the database or displayed to the user.
 *
 *
 *
 */
public class UserAnalyticsProject {


    /**
     * Simulate fetching likes from database
     */
    private static CompletableFuture<Integer> fetchLikes(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching likes for user: " + userId);
            try {
                //  Simulate database latency
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Likes
            return 150;
        });
    }


    /**
     * Simulate getting the number of views from the behavior analysis service
     */
    private static CompletableFuture<Integer> fetchViews(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching views for user: " + userId);
            try {
                //      Simulate the service delay
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //      Number of views
            return 300;

        });
    }


    /**
     * External API emulation fetching recent activities from
     */
    private static CompletableFuture<List<String>> fetchRecentActivities(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching recent activities for user: " + userId);
            try {


                // API emulation delay
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return Arrays.asList("Posted a photo", "Commented on a post", "Liked a video", "Like Accounts");
        });
    }


    /**
     * Calculating user scores based on likes and views
     */

    public static CompletableFuture<String> generateReport(Integer likes, Integer views, List<String> activities) {

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Generating report...");
            int score = likes * 2 + views;
            String report = String.format("User Report of : Score=%d,Like=%d,View=%d,Recent Activities=%s ", score, likes, views, activities);
            return report;
        });


    }


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        String userId = "9000";


        CompletableFuture<Void> analyticsProcessing = CompletableFuture.allOf(
                fetchLikes(userId),
                fetchViews(userId),
                fetchRecentActivities(userId)
        ).thenCompose(unused -> {
            CompletableFuture<Integer> likesFutures = fetchLikes(userId);
            CompletableFuture<Integer> viewsFutures = fetchViews(userId);
            CompletableFuture<List<String>> activitiesFutures = fetchRecentActivities(userId);


            return likesFutures
                    .thenCombine(viewsFutures,(likes, views) ->
                            generateReport(likes, views, activitiesFutures.join())
                    );
                })
                    .thenCompose(reportFuture -> reportFuture)
                    .thenAccept(report ->
                            System.out.println("The Report :" + " " + report)
                    )
                    .exceptionally(throwable -> {

                        System.out.println("The exception is :" + " " + throwable.getMessage());
                        return null;
                    });


        //region for use Executor the run code is :

//        CompletableFuture<Void> analyticsProcessing1 = analyticsProcessing;
//        analyticsProcessing1.join();
//
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                CompletableFuture<Void> analyticsProcessing11 = analyticsProcessing1;
//            }
//        };

       // executor.execute(task);


        //endregion

        analyticsProcessing.join();
        executor.shutdown();




        }
    }
