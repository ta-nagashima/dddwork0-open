package example.api;

import example.domain.time.Time;
import lombok.Getter;

public class InputWorkingApi {
    @Getter
    private Time time;

    public InputWorkingApi(String time) {
        this.time = new Time(time);
    }
}
