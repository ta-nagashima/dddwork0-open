package example.domain.attendance.input;

import example.domain.time.Time;
import lombok.Getter;

public class EndTime {

    /**
     * @param time 退社時刻
     */

    @Getter
    private Time time;

    public EndTime(String time) {
        this.time = new Time(time);
    }

    public boolean exists() {
        return true;
    }

}
