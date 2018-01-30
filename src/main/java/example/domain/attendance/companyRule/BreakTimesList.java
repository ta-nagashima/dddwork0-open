package example.domain.attendance.companyRule;


import example.domain.attendance.input.DailyWorkingHistory;
import example.domain.minute.Minutes;

import java.util.List;



public class BreakTimesList {
    private List<BreakTimes> breakTimesList;
    private Minutes minutes;

    /**
     * 休憩時間を合算して返す
     * @param dailyWorkingHistory
     * @return minutes
     */
    public Minutes totalBreakTime(DailyWorkingHistory dailyWorkingHistory){
        //各休憩時間を引っ張ってきて合計するロジック
        return this.minutes;
    }
}
