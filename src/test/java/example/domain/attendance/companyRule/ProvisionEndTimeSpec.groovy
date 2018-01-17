package example.domain.attendance.companyRule

import example.domain.attendance.input.DailyWorkingHistory
import spock.lang.Specification

class ProvisionEndTimeSpec extends Specification {
    def "isBefore"() {
        setup:
        DailyWorkingHistory dailyWorkingHistory = new DailyWorkingHistory("20170114", "0900", endTime)

        when:
        ProvisionEndTime provisionEndTime = new ProvisionEndTime()

        then:
        if (provisionEndTime.isEarlyEnd(dailyWorkingHistory)) System.out.println("早退")
        else System.out.println("OK")

        where:
        endTime || result
        "1800"  || false
        "1759"  || true
        "1900"  || false
    }
}
