package selenium;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormat {

    @Test
    public void dateFormat()
    {
        Date currentDate=new Date();
        SimpleDateFormat date= new SimpleDateFormat("dd-MM-YY");
        System.out.println( date.format(currentDate));

        Date d=new Date();
        SimpleDateFormat sfd=new SimpleDateFormat("dd-MMM-yyyy");
        System.out.println( sfd.format(d));

//        LocalDate ld=LocalDate.now();
//        System.out.println(ld.format(ld));
    }
}
