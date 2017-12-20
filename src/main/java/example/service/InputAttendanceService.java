package example.service;

import example.domain.attendance.input.DailyWorkingInformation;
import example.domain.attendance.input.InputAttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InputAttendanceService {

    private InputAttendanceRepository inputAttendanceRepository;

    @Autowired
    public void InputAttendanceService(InputAttendanceRepository inputAttendanceRepository) {
        this.inputAttendanceRepository = inputAttendanceRepository;
    }

    public void input(DailyWorkingInformation dailyWorkingInformation) {
        inputAttendanceRepository.registerDailyWorkingInformation(dailyWorkingInformation);
    }
}
