package example.domain.attendance.companyRule;


import example.domain.attendance.input.DailyWorkingHistory;
import example.domain.attendance.input.StartTime;
import example.domain.time.Time;
import lombok.AllArgsConstructor;
import lombok.ToString;

public class ProvisionStartTime {

    private final static Time PROVISION_TIME = new Time("0900");;

    /**
     * 遅刻かどうか判定する
     *
     * @param dailyWorkingHistory
     * @return boolean
     */
    public boolean isTardy(DailyWorkingHistory dailyWorkingHistory) {
        //PROVISION_TIMEと比較判定するロジック
        if (dailyWorkingHistory.getStartTime().isAfter(PROVISION_TIME)) return true;
        return false;
    }
}


