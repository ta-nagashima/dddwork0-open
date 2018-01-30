package example.domain.minute;

import example.domain.time.Time;
import lombok.Getter;

import java.time.Duration;
import java.time.Instant;

public class Minutes {

    private final static int MIN_DURATION = 0;

    @Getter
    private Duration duration;
    private Time start;
    private Time end;

    public Minutes(Duration other) {
        this.duration = other;
    }

    public Minutes(Time startTime, Time endTime) {
        if (!canCalculable(startTime, endTime)) throw new IllegalArgumentException("計算不可");
    }

    public long toDuration(Instant start, Instant end) {
        return Duration.between(start, end).toHours();
    }
//    public Minutes plus(Minutes otherDuration) {
//        return new Minutes(this.duration + otherDuration.getDuration());
//    }
//
//    public Minutes minus(Minutes otherDuration) {
//        if (!canMinus(otherDuration)) throw new IllegalArgumentException("不正");
//        return new Minutes(minusValue(otherDuration));
//
//    }

//    public Minutes toMinute() {
//        int otherHours = this.to.getTime().getHour() * 60;
//        int otherMinute = this.to.getTime().getMinute();
//        return new Minutes(otherHours + otherMinute);
//    }

    public boolean canCalculable(Time start, Time end) {
        return start.getTime().isBefore(end.getTime());
    }

//    public boolean canMinus(Minutes otherDuration) {
//        if (minusValue(otherDuration) < MIN_DURATION) return false;
//        return true;
//    }

//    public int minusValue(Minutes otherDuration) {
//        return this.duration - otherDuration.getDuration();
//    }

}
