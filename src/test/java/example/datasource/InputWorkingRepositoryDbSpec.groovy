package example.datasource

import example.domain.attendance.input.DailyWorkingHistory
import example.domain.attendance.input.InputWorkingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Unroll

@ContextConfiguration(locations = ["classpath:context.xml"])
class InputWorkingRepositoryDbSpec extends Specification {

    @Autowired
    private InputWorkingRepository inputAttendanceRepository

    @Unroll
    def "日次勤怠情報を登録する #inputDate"() {
        setup:
        def workingDate = inputDate
        def startTime = inputStart
        def endTime = inputEnd

        def dailyWorkingHistory = new DailyWorkingHistory(workingDate, startTime, endTime);

        expect:
        inputAttendanceRepository.registerDailyWorkingHistory(dailyWorkingHistory)

        where:
        inputDate  | inputStart | inputEnd
        "20171218" | "0900"     | "1800"
        "20171219" | "0700"     | "1800"
        "20171220" | "0900"     | "1900"
        "20171221" | "0900"     | "1800"

    }

}
