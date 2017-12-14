package example.domain.attendance.input

import spock.lang.Specification
import spock.lang.Unroll

class DailyWorkingInformationSpec extends Specification {

    @Unroll
    def "#input オブジェクト表示判定"() {
        when:
        WorkingDate workingDate = new WorkingDate(input)

        then:
        System.out.println(workingDate.getDate());
        workingDate.exists() == result

        where:
        input       || result
        "20171210"  || true
        "20001001"  || true
    }
}
