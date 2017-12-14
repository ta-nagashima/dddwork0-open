package example.domain.attendance.companyRule;

import example.domain.time.Time;
import lombok.Getter;

public class BreakEndTime {
    @Getter
    private Time time;

    public BreakEndTime(String time) {
        this.time = new Time(time);
    }
}
