enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class switch_demo {
    public static void main(String[] args) {
        int x = 0;
        Day day = Day.WEDNESDAY;
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case SUNDAY:
                x = 7;
                break;
            case FRIDAY:
            case SATURDAY:
                x = 8;
                break;
            case WEDNESDAY:
            case THURSDAY:
                x = 9;
                break;
            default:
                System.out.println("Invalid Day");
                x = -1; // Assign a value in case of an invalid day
        }
        System.out.println(x);
    }
}
