package example.domain.minute

import example.domain.attendance.input.DailyWorkingHistory
import spock.lang.Specification

class MinutesSpec extends Specification {

    def "MinuteTest"() {
        setup:
        DailyWorkingHistory dailyWorkingHistory = new DailyWorkingHistory("20181201", "0900", "1800")
        when:
        Minutes minutes = new Minutes(
                dailyWorkingHistory.getStartTime(), dailyWorkingHistory.getEndTime())

        then:
        System.out.println(minutes.getDuration())


    }
}
