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
    @Getter
    private int year;
    @Getter
    private int Month;
    @Getter
    private int day;

    /**
     * コンストラクタでdate型と各要素に変換
     * @param date
     * @throws ParseException
     */
    public WorkingDate(String date) throws ParseException {
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd"));
        this.Month = this.date.getMonthValue();
        this.year = this.date.getYear();
        this.day = this.date.getDayOfMonth();
    }


}
