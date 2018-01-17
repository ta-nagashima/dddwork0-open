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
    private LocalTime time;

    /**
     * @param time
     */
    public Time(String time) {
        try {
            this.time = LocalTime.parse(time, DateTimeFormatter.ofPattern("HHmm"));
        } catch (Exception e) {
            throw new IllegalArgumentException("引数が不正です");
        }
    }

    public Time() {
        this("0000");
    }

    /**
     *
     * @return
     */
    public String getTimeToHHMM() {
        return toString();
    }

    public String toString() {
        return this.time.format(DateTimeFormatter.ofPattern("HHmm"));
    }

    public boolean exists() {
        return true;
    }

    public int getHour() {
        return time.getHour();
    }

    public int getMinute() {
        return time.getMinute();
    }

    public boolean isAfter(Time other) {
        return this.time.isAfter(other.getTime());
    }

    public boolean isBefore(Time other) {
        return this.time.isBefore(other.getTime());
    }

}
