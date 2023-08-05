Feature: US001 Google Sayfasi Testi

  Background: Google Sayfasina Gidilir
    Given kullanici "googleUrl" sayfasina gitti.

  @arc
  Scenario: Arama kutusunda volvo aratir.
    * kullanici google arama kutusunda "volvo" aratir.
    * google sayfasinda basiligin "volvo" icerdigini test eder.
    And sayfayi kapatir

  @arc
  Scenario: Arama kutusunda ford aratir
    Then kullanici google arama kutusunda "ford" aratir.
    And google sayfasinda basiligin "ford" icerdigini test eder.
    And sayfayi kapatir

  @arc
  Scenario: Arama kutusunda audi aratir
    Then kullanici google arama kutusunda "audi" aratir.
    But kullanici 2 saniye bekler
    And google sayfasinda basiligin "audi" icerdigini test eder.
    And sayfayi kapatir
