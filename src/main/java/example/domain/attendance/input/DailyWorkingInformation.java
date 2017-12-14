package example.domain.attendance.input;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class DailyWorkingInformation {
    @Getter
    private final WorkingDate workingDate;
    @Getter
    private final StartTime startTime;
    @Getter
    private final EndTime endTime;

    public boolean exists(){return true;}

}
