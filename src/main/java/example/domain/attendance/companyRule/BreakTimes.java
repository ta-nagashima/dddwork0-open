package example.domain.attendance.companyRule;

import example.domain.hours.Hours;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.Duration;
import java.time.LocalTime;

@AllArgsConstructor
@EqualsAndHashCode
public class BreakTimes {

    private BreakStartTime breakStartTime;
    private BreakEndTime breakEndTime;

}

