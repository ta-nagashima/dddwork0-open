/**
 * 時刻を表すクラス
 *
 * @param time 時刻
 */
package example.domain.time;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@EqualsAndHashCode
public class Time {

    @Getter
    private LocalTime timeValue;

    public Time(String time) {
        this.timeValue = LocalTime.parse(time, DateTimeFormatter.ofPattern("HHmm"));
    }

    public Time() {
        this("0000");
    }

    public String toString() {
        return this.timeValue.format(DateTimeFormatter.ofPattern("HHmm"));
    }

    public boolean exists() {
        return true;
    }

}
