package example.domain.attendance.input

import spock.lang.Specification
import spock.lang.Unroll

class WorkingDateSpec extends Specification {
    @Unroll
    def "inputCase: #input"() {

        setup:

        when:
        WorkingDate workingDate = new WorkingDate(input);

        then:
        workingDate.getWorkingDate().equals(result);
        System.out.println(workingDate.getWorkingDate());

        where:
        input       ||  result
        "20171210"  ||  "20171210"
        "20171233"  ||  "20171233"
        "201712330" ||  "201712330"
        "2017330"   ||  "2017330"

    }
}
