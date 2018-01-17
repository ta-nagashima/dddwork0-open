package example.domain.attendance.companyRule;

import example.domain.attendance.input.DailyWorkingHistory;
import example.domain.attendance.total.OverWorkingTime;
import example.domain.attendance.total.WorkingTime;
import lombok.Getter;

public class WorkingRules {

    @Getter
    private ProvisionStartTime provisionStartTime;
    @Getter
    private ProvisionEndTime provisionEndTime;
    @Getter
    private BreakTimesList breakTimesList;

    public WorkingRules() {
        this.provisionStartTime = new ProvisionStartTime();
        this.provisionEndTime = new ProvisionEndTime();
    }

    /**
     * 勤務時間計算
     *
     * @param dailyWorkingHistory
     * @return WorkingTime
     */
    public WorkingTime WorkingTimeCalc(DailyWorkingHistory dailyWorkingHistory) {
        //勤務時間を算出するロジック

        return new WorkingTime();
    }

    /**
     * 残業時間計算
     *
     * @param dailyWorkingHistory
     * @return OverWorkingTime
     */
    public OverWorkingTime overWorkingTimeCalc(DailyWorkingHistory dailyWorkingHistory) {
        //残業時間を算出するロジック

        return new OverWorkingTime();
    }
}
