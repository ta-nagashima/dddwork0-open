package example.datasource

class inputAttendanceFixture {

    public final static String TABLE_NAME = "attendance_management"

    static class One {

        private final static Map VALUE = [
                (TABLE_NAME): [
                        1: ["working_date": "20171219", "start_time": "0900", "end_time": "1800"]
                ]
        ]
        static Map getDefaultData() {
            return VALUE
        }
    }

}
