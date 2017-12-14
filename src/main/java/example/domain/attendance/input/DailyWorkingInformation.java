package example.domain.attendance.input;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DailyWorkingInformation {
    @Getter
    private WorkingDate workingDate;
    @Getter
    private StartTime startTime;
    @Getter
    private EndTime endTime;

    public boolean exists(){return true;}
}
