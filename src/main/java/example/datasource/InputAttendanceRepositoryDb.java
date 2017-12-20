package example.datasource;

import example.domain.attendance.input.DailyWorkingInformation;
import example.domain.attendance.input.InputAttendanceRepository;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;

import static java.lang.System.out;

@Component
public class InputAttendanceRepositoryDb implements InputAttendanceRepository {

    @Override
    public void registerDailyWorkingInformation(DailyWorkingInformation dailyWorkingInformation) {
        File attendance_ManagementCSV = new File("/Users/taku.nagashima/Development/dddwork0-open/etc/document/attendance_ManagementCSV.csv");

        try (FileWriter fileWriter = new FileWriter(attendance_ManagementCSV,true)) {
            fileWriter.write(String.format("%s,%s,%s\n",
                    dailyWorkingInformation.getWorkingDate(),
                    dailyWorkingInformation.getStartTime(),
                    dailyWorkingInformation.getEndTime()
            ));
        } catch (Exception e) {
            out.println(e);
        }
    }
}

/**
 * ローカルDB用
 *
 * @Override
 * public void registerDailyWorkingInformation(DailyWorkingInformation dailyWorkingInformation) {
 *      InputAttendanceMapper.insert(dailyWorkingInformation);
 * }
 *
 *
 */
