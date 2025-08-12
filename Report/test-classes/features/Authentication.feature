Feature: Authentication Feature

  Scenario Outline: Negative Sign In
    Given pengguna masuk ke halaman login.
    When pengguna memasukkan username "<username>".
    And pengguna memasukkan password "<password>".
    And pengguna menekan tombol login.
    Then pengguna akan melihat pesan kesalahan "<message>".

    Examples:
      | username | password | message |
      | John Doe  | secret_sauce         | Login failed! Please ensure the username and password are valid. |
      | John Doel | ThisIsNotAPassword   | Login failed! Please ensure the username and password are valid. |

  Scenario Outline: Positive Sign In
    Given Saat ingin membuat janji temu, pengguna masuk ke halaman login.
    When  pengguna memasukkan username "<username>" dan password "<password>" yang valid.
    Then pengguna akan dibawa ke halaman booking janji temu "<url>".

    Examples:
      | username |       password     |                      url                             |
      |John Doe  | ThisIsNotAPassword | https://katalon-demo-cura.herokuapp.com/#appointment |
