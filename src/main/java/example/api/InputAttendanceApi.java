package example.api;

import example.domain.time.Time;
import lombok.Getter;

public class InputAttendanceApi {
    @Getter
    private Time time;

    public InputAttendanceApi(String time) {
        this.time = new Time(time);
    }
}
