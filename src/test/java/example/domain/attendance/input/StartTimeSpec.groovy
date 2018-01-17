package example.domain.attendance.input

import spock.lang.Specification
import spock.lang.Unroll

class StartTimeSpec extends Specification {

    @Unroll
    def "これは大丈夫 #inputTime"() {

        when:
        def startTime = new StartTime(inputTime)
        then:
        System.out.println(startTime.getTime())

        where:
        inputTime || result
        "0859"    || true
        "0900"    || true
        "0901"    || true

    }
}
