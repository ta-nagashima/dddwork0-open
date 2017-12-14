package example.service;

import example.domain.time.Time;
import lombok.Getter;

public class TotalAttendanceService {
    @Getter
    private Time time;

    public TotalAttendanceService(String time) {
        this.time = new Time(time);
    }
}
