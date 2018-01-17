package example.domain.attendance.companyRule

import example.domain.attendance.input.DailyWorkingHistory
import spock.lang.Specification
import spock.lang.Unroll

class ProvisionStartTimeSpec extends Specification {
    @Unroll
    def "#startTime isAfter"() {
        setup:
        DailyWorkingHistory dailyWorkingHistory = new DailyWorkingHistory("20171111", startTime, "1800")

        when:
        ProvisionStartTime provisionStartTime = new ProvisionStartTime()

        then:
        if (provisionStartTime.isTardy(dailyWorkingHistory)) System.out.println("遅刻")
        else System.out.println("OK")


        where:
        startTime || result
        "0900"    || false
        "0800"    || false
        "1000"    || true
        "0901"    || true


    }
}
