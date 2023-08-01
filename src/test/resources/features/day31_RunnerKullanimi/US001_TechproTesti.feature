@all

Feature: US001 TechproEducation Sayfasi Testi
  Scenario: TC01 Sayfada Arama Yapar
    Given kullanici techpro sayfasina gider
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder
    And sayfayi kapatir

     #Feature fille da daha once olusturdugumuz bir method'u baska bir scenario larda tekrar olusturmadan kullanabiliriz
  #Yukaridaki ornekte sayfayi kapatir step'i ocon daha once amazonStepDefinition class'inda olusturdugumuz methodu kullanabiliriz

  Scenario: TC02 Sayfada Arama Yapar
    Given kullanici techpro sayfasina gider
    Then arama kutusunda java aratir
    And sayfa basliginin java icerdigini test eder
    And sayfayi kapatir


    @techpro
    Scenario: TC03 Sayfada Arama Yapar
      Given kullanici techpro sayfasina gider
      Then arama kutusunda mobil aratir
      When cikan dropdown da mobil developer linkine tiklar
      And sayfa basliginin Mobile icerdigini test eder
      And sayfayi kapatir