package example.domain.attendance.input

import spock.lang.Specification
import spock.lang.Unroll

class StartTimeSpec extends Specification {

    @Unroll
    def "IsAfter #inputTime"() {

        when:
        def startTime = new StartTime(inputTime)

        then:
        startTime.isInProvisionTime() == result

        where:
        inputTime | result
        "0859"    | true
        "0900"    | true
        "0901"    | false

    }
}
