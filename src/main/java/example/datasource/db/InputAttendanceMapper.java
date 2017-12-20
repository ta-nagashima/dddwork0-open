package example.datasource.db;

import example.domain.attendance.input.DailyWorkingInformation;
import org.apache.ibatis.annotations.Param;

public interface InputAttendanceMapper {
    void insert(@Param("attendance_management")DailyWorkingInformation dailyWorkingInformation);
}
