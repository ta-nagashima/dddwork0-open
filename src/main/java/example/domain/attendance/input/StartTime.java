package example.domain.attendance.input;

import example.domain.time.Time;
import lombok.Getter;

import java.time.LocalTime;

public class StartTime {
    /**
     * @param time 出社時刻
     */
    @Getter
    private Time time;

    public StartTime(String time) {
        this.time = new Time(time);
    }

    public boolean exists() {
        return true;
    }
}

