package example.domain.attendance.input;


public interface InputWorkingRepository {
    /**
     * 勤怠履歴を登録する
     * @param dailyWorkingHistory
     */
    void registerDailyWorkingHistory(DailyWorkingHistory dailyWorkingHistory);
}
