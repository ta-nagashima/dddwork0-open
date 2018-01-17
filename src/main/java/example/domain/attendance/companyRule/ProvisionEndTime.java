package example.domain.attendance.companyRule;


import example.domain.attendance.input.DailyWorkingHistory;
import example.domain.time.Time;
import lombok.AllArgsConstructor;

public class ProvisionEndTime {

    private static final Time PROVISION_TIME = new Time("1800");

    /**
     * 早退かどうか判定する
     *
     * @param dailyWorkingHistory
     * @return boolean
     */
    public boolean isEarlyEnd(DailyWorkingHistory dailyWorkingHistory) {
        //PROVISION_TIMEと比較判定するロジック
        if (dailyWorkingHistory.getEndTime().isBefore(PROVISION_TIME)) return true;
        return false;
    }
}
