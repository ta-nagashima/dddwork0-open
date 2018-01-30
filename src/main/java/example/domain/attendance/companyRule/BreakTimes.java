package example.domain.attendance.companyRule;

import example.domain.attendance.input.DailyWorkingHistory;
import lombok.Getter;

/**
 * 休憩時間
 */
public class BreakTimes {

    private enum BreakTimeZone {
        daybreak("1200", "1300"),
        evening("1500", "1600"),
        night("2100", "2200");

        @Getter
        private BreakStartTime breakStartTime;
        @Getter
        private BreakEndTime breakEndTime;

        private BreakTimeZone(String startTime, String endTime) {
            this.breakStartTime = new BreakStartTime(startTime);
            this.breakEndTime = new BreakEndTime(endTime);
        }

        public int getValue() {
            return ordinal() + 1;
        }

    }


    public BreakTimes() {

    }

    /**
     * 勤怠履歴と比較して実休憩時間を返す
     *
     * @param dailyWorkingHistory
     * @return 休憩時間
     */
    public void breakTimeCalc(DailyWorkingHistory dailyWorkingHistory) {

        //休憩時間を算出して返すロジック
    }

    /**
     * enumテスト確認
     */
    public void testEnum(DailyWorkingHistory dailyWorkingHistory) {
        for (BreakTimeZone breakTimeZone : BreakTimeZone.values()) {
            System.out.println(breakTimeZone.getBreakStartTime());
            System.out.println(breakTimeZone.getBreakEndTime());
        }
    }

}

