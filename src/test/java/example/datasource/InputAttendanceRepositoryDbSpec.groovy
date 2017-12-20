package example.datasource

import example.domain.attendance.input.DailyWorkingInformation
import example.domain.attendance.input.InputAttendanceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Unroll

@ContextConfiguration(locations = ["classpath:context.xml"])
@Unroll
class InputAttendanceRepositoryDbSpec extends Specification {

        @Autowired
        private InputAttendanceRepository inputAttendanceRepository

        def "日次勤怠情報を登録する"() {
            setup:
            def workingDate = inputDate
            def startTime = inputStart
            def endTime = inputEnd

            def dailyWorkingInformation = new DailyWorkingInformation(workingDate,startTime,endTime);

            expect:
            inputAttendanceRepository.registerDailyWorkingInformation(dailyWorkingInformation)

            where:
            inputDate   |   inputStart  |   inputEnd
            "20171218"  |   "0900"      |   "1800"

        }

}
