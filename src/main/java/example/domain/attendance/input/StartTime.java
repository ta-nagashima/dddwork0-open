package example.domain.attendance.input;

import example.domain.time.Time;
import lombok.Getter;

import java.time.LocalTime;

public class StartTime {
    private final static Time PROVISIONTIME;

    static {
        PROVISIONTIME = new Time("0900");
    }

    @Getter
    private Time time;

    public StartTime(String time) {
        this.time = new Time(time);
    }

    public boolean isInProvisionTime() {
        LocalTime temp = PROVISIONTIME.getTimeValue();
        return this.time.getTimeValue().compareTo(temp) <= 0;
    }
}

