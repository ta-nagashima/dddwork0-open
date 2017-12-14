package example.datasource;

import example.domain.time.Time;
import lombok.Getter;

public class TotalAttendanceRepositoryDb {
    @Getter
    private Time time;

    public TotalAttendanceRepositoryDb(String time) {
        this.time = new Time(time);
    }
}
