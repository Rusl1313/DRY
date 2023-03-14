public class Main {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
        System.out.println(weekendCount(new String[] {"Sunday",  "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"}));
        System.out.println(weekdayCount(new String[]{"Sunday",  "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"}));
    }
    public static boolean isWeekend(String dayName) {
        if (dayName.equals("Sunday") || dayName.equals("Saturday")) {
            return true;
        } else {
            return false;
        }
    }
    public static int weekendCount(String[] days) {
        int weekend = 0;
        String a = "";
        for (int i = 0; i < days.length; i++) {
            if (isWeekend(days[i])) {
                weekend++;
            }
        }
        return weekend;
    }

    public static int weekdayCount(String[] days) {
        int weekend = 0;
        for (int i = 0; i < days.length; i++) {
            if (isWeekend(days[i])) {
                weekend++;
            }
        }
        int weekday = days.length - weekend;
        return weekday;
    }
}