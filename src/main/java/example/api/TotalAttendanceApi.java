package example.api;

import example.domain.time.Time;
import lombok.Getter;

public class TotalAttendanceApi {
    @Getter
    private Time time;

    public TotalAttendanceApi(String time) {
        this.time = new Time(time);
    }
}
