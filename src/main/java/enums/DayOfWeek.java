package enums;

public enum DayOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String fullName;
    private final int nrOfDay;


    DayOfWeek(String fullName, int nrOfDay) {
        System.out.println("In constructor enum: " + fullName);
        this.fullName = fullName;
        this.nrOfDay = nrOfDay;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public static void main(String[] args) {
        System.out.println("Run our enum!");
    }

}

