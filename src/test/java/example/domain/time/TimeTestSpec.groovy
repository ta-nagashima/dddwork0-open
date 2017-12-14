package example.domain.time

import spock.lang.Specification
import spock.lang.Unroll

class TimeTestSpec extends Specification {

    @Unroll
    def "#input を時分に変換"() {

        setup:

        when:
        Time time = new Time(input);


        then:
        time.getHour() == result;

        where:
        input   || result
        "0000"  || 0
        "1200"  || 12
        "2300"  || 23
        "2400"  || 0
        "10000"  || 0
        "00"  || 0
        "134"  || 0
        "１２３"  || 0
        "ごいすー"  || 0



    }
}
