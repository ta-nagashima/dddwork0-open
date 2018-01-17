package example.domain.attendance.companyRule;

import example.domain.attendance.input.DailyWorkingHistory;
import example.domain.time.Time;
import lombok.Getter;

/**
 * 休憩終了時刻
 */
public class BreakEndTime {
    @Getter
    private Time time;

    public BreakEndTime(String time) {
        this.time = new Time(time);
    }
}
