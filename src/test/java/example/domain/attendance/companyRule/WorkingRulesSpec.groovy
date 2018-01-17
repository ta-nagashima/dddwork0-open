package example.domain.attendance.companyRule

import example.domain.attendance.input.DailyWorkingHistory
import spock.lang.Specification
import spock.lang.Unroll

class WorkingRulesSpec extends Specification {
    @Unroll
    def "provision test"() {
        setup:
        DailyWorkingHistory dailyWorkingHistory = new DailyWorkingHistory("20180101", startTime, endTime)

        when:
        WorkingRules workingRules = new WorkingRules();

        then:
        if (workingRules.getProvisionStartTime().isTardy(dailyWorkingHistory)) System.out.println("遅刻")
        else System.out.println("OK")

        if (workingRules.getProvisionEndTime().isEarlyEnd(dailyWorkingHistory)) System.out.println("早退")
        else System.out.println("OK")

        where:
        startTime | endTime || result
        "0900"    | "1800"  || true
        "0900"    | "1700"  || false
        "1000"    | "1800"  || false
        "1000"    | "1700"  || false

    }

}
