package example.datasource;

import example.domain.time.Time;
import lombok.Getter;

public class InputAttendanceRepositoryDb {
    @Getter
    private Time time;

    public InputAttendanceRepositoryDb(String time) {
        this.time = new Time(time);
    }
}
