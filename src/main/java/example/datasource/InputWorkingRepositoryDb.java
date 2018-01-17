package example.datasource;

import example.domain.attendance.input.DailyWorkingHistory;
import example.domain.attendance.input.InputWorkingRepository;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import static java.lang.System.out;

@Component
public class InputWorkingRepositoryDb implements InputWorkingRepository {

    /**
     * 勤怠履歴をCSVに書き込む
     * @param dailyWorkingHistory
     */
    @Override
    public void registerDailyWorkingHistory(DailyWorkingHistory dailyWorkingHistory) {
        File attendance_ManagementCSV = new File("/Users/taku.nagashima/Development/dddwork0-open/etc/document/attendance_ManagementCSV.csv");
        try {
            FileWriter fileWriter = new FileWriter(attendance_ManagementCSV, true);
            fileWriter.write(String.format(
                    "%s,%s,%s\n",
                    dailyWorkingHistory.getWorkingDate(),
                    dailyWorkingHistory.getStartTime(),
                    dailyWorkingHistory.getEndTime()
                             )
            );
        } catch (Exception e) {
            out.println(e);
        }
    }

    /**
     * 日付が登録済みかどうか
     * @param dailyWorkingHistory
     */
    public boolean isRegistered(DailyWorkingHistory dailyWorkingHistory){
        return true ;
    }

    /**
     * 該当日付消去
     * @param dailyWorkingHistory
     */
    public void overWritingDailyWorkingHistory(DailyWorkingHistory dailyWorkingHistory){

    }
}

