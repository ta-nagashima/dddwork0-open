package example.datasource;

import example.domain.time.Time;
import lombok.Getter;

public class TotalWorkingRepositoryDb {
    @Getter
    private Time time;

    public TotalWorkingRepositoryDb(String time) {
        this.time = new Time(time);
    }
}
