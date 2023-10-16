public class thirdTask {
    public static void main(String[] args) {

        int numberOfdays=365;
        int hoursInDay=24;
        int minutesInDay=60;
        int secondsInMinute=60;
        long result=numberOfdays*hoursInDay*minutesInDay*secondsInMinute;

        System.out.println("There are " + result + " seconds in a year");


    }
}