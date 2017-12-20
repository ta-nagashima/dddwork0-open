package example.domain.time

import spock.lang.Specification
import spock.lang.Unroll

class TimeSpec extends Specification {

    @Unroll
    def "#input を時分に変換"() {

        setup:

        when:
        Time time = new Time(input);

        then:
        time.getTime() == result;
        System.out.println(result);

        where:
        input   || result
        "0000"  || 0000
        "0900"  || 900
        "1200"  || 1200
        "1230"  || 1230
        "2300"  || 2300
        "2400"  || 0000
        "10000"  || 0
        "00"  || 0
        "134"  || 0
        "１２３"  || 0
        "文字列"  || 0



    }
}
