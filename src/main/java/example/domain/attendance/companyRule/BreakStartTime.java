package example.domain.attendance.companyRule;

import example.domain.time.Time;
import lombok.Getter;

public class BreakStartTime {
    @Getter
    private Time time;

    public BreakStartTime(String time) {
        this.time = new Time(time);
    }
}

