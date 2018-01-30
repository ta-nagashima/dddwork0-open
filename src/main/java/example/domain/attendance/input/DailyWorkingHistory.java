package example.domain.attendance.input;

import example.domain.time.Time;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Entity 勤怠履歴
 */


@EqualsAndHashCode
public class DailyWorkingHistory {

    private WorkingDate workingDate;
    private StartTime startTime;
    private EndTime endTime;

    /**
     * コンストラクタ
     * @param date
     * @param startTime
     * @param endTime
     */
    public DailyWorkingHistory(String date, String startTime, String endTime){
        this.workingDate = new WorkingDate(date);
        this.startTime = new StartTime(startTime);
        this.endTime = new EndTime(endTime);
    }

    public String getWorkingDate(){
        return this.workingDate.getWorkingDate();
    }

    public Time getStartTime(){
        return this.startTime.getTime();
    }

    public Time getEndTime(){
        return this.endTime.getTime();
    }

    public boolean exists(){return true;}
}
