Feature: Booking Feature
  Scenario Outline: Positive Booking Appointment
    Given Saat ingin membuat janji temu, pengguna wajib melakukan login.
    When  pengguna mengisi form Facility "<facility>".
    And   pengguna memilih Healthcare Program "<program>".
    And   pengguna mengisi Visit Date "<visit_date>".
    And   pengguna mengisi Comment "<comment>".
    Then  pengguna melakukan Book Appointment.
    Then  pengguna dibawa menuju halaman summary "<url>".

    Examples:
    |           facility              | program   | visit_date |              comment             |                     url                                         |
    | Tokyo CURA Healthcare Center    | Medicare  | 22-09-2024 | kontrol bulanan specialist dalam | https://katalon-demo-cura.herokuapp.com/appointment.php#summary |
    | Seoul CURA Healthcare Center    | None      | 15-08-2025 | Konsultasi Psikiater             | https://katalon-demo-cura.herokuapp.com/appointment.php#summary |
    | Hongkong CURA Healthcare Center | Medicaid  | 25-05-2024 | Konsultasi Penyakit Dalam        | https://katalon-demo-cura.herokuapp.com/appointment.php#summary |
