package example.domain.attendance.companyRule

import spock.lang.Specification

class BreakTimesSpec extends Specification {

    def "休憩時間確定"() {
        setup:
        BreakStartTime breakStartTime = new BreakStartTime("1200")
        BreakEndTime breakEndTime = new BreakEndTime("1300")

    }
}
