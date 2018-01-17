package example.domain.time

import spock.lang.Specification
import spock.lang.Unroll

class TimeSpec extends Specification {

    @Unroll
    def "1.#input をtimeに変換"() {
        given:

        when:
        Time time = new Time(input);

        then:
        time.exists() == result


        where:
        input   || result
        "0000"  || true
        "0900"  || true
        "1230"  || true
        "2300"  || true
        "2400"  || true
        "2500"  || false
        "10000" || false
        "00"    || false
        "134"   || false
        "１２３"   || false
        "文字列"   || false
    }

    def "2.時分抽出"() {
        setup:
        Time time = new Time("0915");

        expect:
        time.getHour().equals(9)
        time.getMinute().equals(15)
    }

    def "3.toString機能確認"() {
        setup:
        Time time = new Time("0915");

        expect:
        time.getTimeToHHMM().equals("0915")
    }
}
