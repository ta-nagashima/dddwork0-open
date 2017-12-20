package example.domain.attendance.input;

import lombok.Getter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class WorkingDate {

    private LocalDate date;

    public WorkingDate(String date)  {
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public String getWorkingDate(){
        return this.date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public boolean exists(){return true;}

}
