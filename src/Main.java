public class Main {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
        System.out.println(weekendCount(new String[] {"Sunday",  "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"}));
        System.out.println(weekdayCount(new String[]{"Sunday",  "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"}));
    }
    public static boolean isWeekend(String dayName) {
        return dayName.equals("Sunday") || dayName.equals("Saturday");
    }
    public static int weekendCount(String[] days) {
        int weekend = 0;
        String a = "";
        for (String day : days) {
            if (isWeekend(day)) {
                weekend++;
            }
        }
        return weekend;
    }

    public static int weekdayCount(String[] days) {
        int weekend = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                weekend++;
            }
        }
       return days.length - weekend;

    }
}