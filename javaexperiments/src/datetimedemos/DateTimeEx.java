package datetimedemos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTimeEx {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("day of month=" + today.getDayOfMonth() + " day of week=" + today.getDayOfWeek() + " year=" + today.getYear());
        LocalDate date1 = LocalDate.of(2024, 2, 10);
        System.out.println("day of month=" + date1.getDayOfMonth() + " day of week=" + date1.getDayOfWeek() + " year=" + date1.getYear());
        if (today.isAfter(date1)) {
            System.out.println("yes today is after date1");
            date1 = date1.minusDays(1);
        }

        System.out.println("all zones");
        Set<String> zoneIDs=ZoneId.getAvailableZoneIds();
       for (String zone:zoneIDs){
           System.out.println("zone="+zone);
       }
        System.out.println("current date time");
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println("day of month=" + currentDateTime.getDayOfMonth() + " day of week=" + currentDateTime.getDayOfWeek() + " year=" + currentDateTime.getYear());
        System.out.println("hour="+currentDateTime.getHour()+" minute="+currentDateTime.getMinute()+" "+currentDateTime.getSecond());


       ZoneId americaRecifeZone=ZoneId.of("America/Recife");
        ZoneId indianZone=ZoneId.of("Asia/Kolkata");
        System.out.println("indian date time");
        ZonedDateTime indianDateTime=ZonedDateTime.now(indianZone);
        System.out.println("day of month=" + indianDateTime.getDayOfMonth() + " day of week=" + indianDateTime.getDayOfWeek() + " year=" + indianDateTime.getYear());
        System.out.println("hour="+indianDateTime.getHour()+" minute="+indianDateTime.getMinute()+" "+indianDateTime.getSecond());
        ZonedDateTime americaReciffDateTime=indianDateTime.withZoneSameInstant(americaRecifeZone);
        System.out.println("amerca reciffe date time");
        System.out.println("day of month=" + americaReciffDateTime.getDayOfMonth() + " day of week=" + americaReciffDateTime.getDayOfWeek() + " year=" + americaReciffDateTime.getYear());
        System.out.println("hour="+americaReciffDateTime.getHour()+" minute="+americaReciffDateTime.getMinute()+" "+americaReciffDateTime.getSecond());

        ZonedDateTime tokyoDateTime=indianDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyo ="+tokyoDateTime.getHour()+":"+tokyoDateTime.getMinute()+":"+tokyoDateTime.getSecond());

    }
}
