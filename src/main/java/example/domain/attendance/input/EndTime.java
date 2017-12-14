package example.domain.attendance.input;

import example.domain.time.Time;
import lombok.Getter;

public class EndTime {
    @Getter
    private Time time;

    public EndTime(String time) {
        this.time = new Time(time);
    }

}
