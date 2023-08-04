Feature: US001 Google Sayfasi Testi

  @arac1
  Scenario: Arama kutusunda volvo aratir.
    Given kullanici "googleUrl" sayfasina gitti.
    * kullanici google arama kutusunda "volvo" aratir.
    * google sayfasinda basiligin "ford" icerdigini test eder.
    And sayfayi kapatir

  @arac2
  Scenario: Arama kutusunda ford aratir.
    Given kullanici "googleUrl" sayfasina gitti.
    * kullanici google arama kutusunda "volvo" aratir.
    * google sayfasinda basiligin "ford" icerdigini test eder.
    And sayfayi kapatir

  @arac3
  Scenario: Arama kutusunda audio aratir.
    Given kullanici "googleUrl" sayfasina gitti.
    * kullanici google arama kutusunda "volvo" aratir.
    * google sayfasinda basiligin "ford" icerdigini test eder.
    And sayfayi kapatir