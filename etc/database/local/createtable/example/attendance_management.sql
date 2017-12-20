CREATE TABLE attendance_management (
  working_date VARCHAR2(1024) NOT NULL,
  start_time VARCHAR2(1024) NOT NULL,
  end_time VARCHAR2(1024) NOT NULL,
  CONSTRAINT primary_key PRIMARY KEY(working_date)
);