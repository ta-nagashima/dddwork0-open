package example.domain.attendance.companyRule;

import example.domain.attendance.input.DailyWorkingHistory;
import lombok.Getter;

/**
 * 休憩時間
 */
public class BreakTimes {
    @Getter
    private BreakStartTime breakStartTime;
    @Getter
    private BreakEndTime breakEndTime;

    public BreakTimes(String breakStartTime, String breakEndTime) {
        this.breakStartTime = new BreakStartTime(breakStartTime);
        this.breakEndTime = new BreakEndTime(breakEndTime);
    }

    /**
     * 勤怠履歴と比較して実休憩時間を返す
     * @param dailyWorkingHistory
     * @return 休憩時間
     */
    public void breakTimeCalc(DailyWorkingHistory dailyWorkingHistory){
        //休憩時間を算出して返すロジック(基本:1時間)

    }

}

