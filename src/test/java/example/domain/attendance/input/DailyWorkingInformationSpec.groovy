package example.domain.attendance.input

import spock.lang.Specification
import spock.lang.Unroll

class DailyWorkingInformationSpec extends Specification {

    @Unroll
    def "日次勤怠情報を生成"() {

        setup:

        when:
        DailyWorkingInformation dailyWorkingInformation = new DailyWorkingInformation(inputDate, inputStartTime, inputEndTime);

        then:
        System.out.println(dailyWorkingInformation.getWorkingDate());
        System.out.println(dailyWorkingInformation.getStartTime());
        System.out.println(dailyWorkingInformation.getEndTime());

        where:
        inputDate  | inputStartTime | inputEndTime
        "20171210" | "0900"         | "1800"
        "20170101" | "0900"         | "1800"
        "20180308" | "0800"         | "1900"


    }
}
