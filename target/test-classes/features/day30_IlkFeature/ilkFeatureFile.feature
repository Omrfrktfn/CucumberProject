Feature: US001_Amazon_Urun_Arama_Testi
  Scenario: TC01_Amazonda_Iphone_aramasi
    Given kullanici amazon sayfasina gider
    Then kullanici aramaKutusunda iphone aratir
    And sayfayi kapatir