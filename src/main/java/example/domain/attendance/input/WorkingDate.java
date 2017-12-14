package example.domain.attendance.input;

import lombok.Getter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class WorkingDate {
    @Getter
    private LocalDate date;

    public WorkingDate(String date) throws ParseException {
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public boolean exists(){return true;}

    public int getYear(){return this.date.getYear();}

    public int getMonth(){return this.date.getMonthValue();}

    public int getDay(){return this.date.getDayOfMonth();}

}
