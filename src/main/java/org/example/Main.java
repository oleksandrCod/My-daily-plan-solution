package org.example;

public class Main {
        public static String createDailyPlan(String[] plans) {
            String start = "\"My plans:";
            StringBuilder result = new StringBuilder();
            StringBuilder resultAll = new StringBuilder();
            for (int i = 0; i < plans.length; i++) {
                resultAll = result.append("\n").append(i+1).append(".) ").append(plans[i]).append(";");
            }
            StringBuilder resultAllPlus = new StringBuilder();
            resultAllPlus.append(start).append(resultAll).append("\"");
            return resultAllPlus.toString();
        }

    public static void main(String[] args) {
        String[] plans = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars", "drink coffe", "watch anime"};
      Main obj = new Main();
      String result = obj.createDailyPlan(plans);
        System.out.println(result);
    }
}
