package example.service;

import example.domain.time.Time;
import lombok.Getter;

public class InputAttendanceService {
    @Getter
    private Time time;

    public InputAttendanceService(String time) {
        this.time = new Time(time);
    }
}
