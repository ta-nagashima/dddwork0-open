package example.domain.attendance.companyRule;

import example.domain.attendance.input.DailyWorkingHistory;
import example.domain.time.Time;
import lombok.Getter;

/**
 * 休憩開始時刻
 */
public class BreakStartTime {

    @Getter
    private Time time;

    public BreakStartTime(String time) {
        this.time = new Time(time);
    }

    public boolean isAfter(DailyWorkingHistory dailyWorkingHistory) {
//        if (dailyWorkingHistory.getEndTime().isBefore()) return true;
        return true;
    }
}

