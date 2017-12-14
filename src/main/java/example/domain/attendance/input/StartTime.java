package example.domain.attendance.input;

import example.domain.time.Time;
import lombok.Getter;

public class StartTime {
    @Getter
    private Time time;

    public StartTime(String time) {
        this.time = new Time(time);
    }
}

