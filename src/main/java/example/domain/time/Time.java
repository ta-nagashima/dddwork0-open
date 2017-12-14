/**
 * 時刻を表すクラス
 *
 * @param time 時刻
 */
package example.domain.time;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
public class Time {

    @Getter
    LocalTime time;

    public Time(String time) {
        this.time = LocalTime.parse(time, DateTimeFormatter.ofPattern("HHmm"));
    }

    public Time() {
        this("0000");
    }

    public boolean exists(){ return true; }

}
