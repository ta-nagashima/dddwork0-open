package example.api;

import example.domain.time.Time;
import lombok.Getter;

public class TotalWorkingApi {
    @Getter
    private Time time;

    public TotalWorkingApi(String time) {
        this.time = new Time(time);
    }
}
