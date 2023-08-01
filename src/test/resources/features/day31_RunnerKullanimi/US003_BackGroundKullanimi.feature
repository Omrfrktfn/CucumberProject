@techall

Feature: US003 TechproEducation Sayfasi Testi

  Background: Kullanici TechproEducation Sayfasina Gider
    Given kullanici techpro sayfasina gider
    #her seneryo icin backGroun'a ugrayip devam eder.

  Scenario: TC01 Sayfada Arama Yapar
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder



  Scenario: TC02 Sayfada Arama Yapar
    Then arama kutusunda java aratir
    And sayfa basliginin java icerdigini test eder



  Scenario: TC03 Sayfada Arama Yapar
    Then arama kutusunda mobil aratir
    When cikan dropdown da mobil developer linkine tiklar
    And sayfa basliginin Mobile icerdigini test eder
    And sayfayi kapatir
