package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int r;
        if (year % 400 == 0){
            r = 1;
        }else if (year % 4 != 0 || year % 100 == 0) {
            r = 0;
        } else {
            r = 1;
        }

        switch (r) {
            case (1):
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}
