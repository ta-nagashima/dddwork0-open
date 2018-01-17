package example.domain.attendance.total;

import example.domain.hours.Minutes;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class TotalWorkingTime {
    @Getter
    private static Minutes WorkingTime;
    @Getter
    private static Minutes OverWorkingTime;

}