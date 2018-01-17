package example.service;

import example.domain.attendance.input.DailyWorkingHistory;
import example.domain.attendance.input.InputWorkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InputWorkingService {

    private InputWorkingRepository inputWorkingRepository;

    /**
     * DI
     * @param inputWorkingRepository
     */
    @Autowired
    public void InputWorkingService(InputWorkingRepository inputWorkingRepository) {
        this.inputWorkingRepository = inputWorkingRepository;
    }

    /**
     * 勤怠履歴を登録するサービス
     * @param dailyWorkingHistory
     */
    public void input(DailyWorkingHistory dailyWorkingHistory) {
        inputWorkingRepository.registerDailyWorkingHistory(dailyWorkingHistory);
    }
}
