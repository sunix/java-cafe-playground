import java.time.DayOfWeek;

public class Main {

    public static boolean isWeekDay(DayOfWeek day){
        boolean isWeekDay = switch(day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> true;
            case SATURDAY, SUNDAY -> false;
        };
        return isWeekDay;
    }
    public static void main(String [] args){
        if(isWeekDay(DayOfWeek.valueOf("MONDAY"))){
            System.out.println("weekday!!!");
        }
        else {
            System.out.println("Weekend!!!");
        }
    }
    
}