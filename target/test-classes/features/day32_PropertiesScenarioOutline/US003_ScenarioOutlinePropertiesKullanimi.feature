Feature: US003 Google Sayfasi Testi

  Scenario Outline: Arama kutusunda ford aratir
    Given kullanici "googleUrl" sayfasina gitti.
    Then kullanici google arama kutusunda properties'den "<aranacakArac>" aratti.
    And google sayfasinda basiligin "<aranacakArac>" icerigini test ett.
    And sayfayi kapatir
    Examples:
      | aranacakArac |
      | arac1        |
      | arac2        |
      | arac3        |

     #Eğer Scenario Outline ile verileri .properties dosyasından almak istersek Examples altındaki verileri
#.properties dosyasinda oluşturduğumuz key'leri yazariz. Step definitionda oluşturduğuz parametreli method
#ile de ConfigReader sayesinde bu keylerin değerini kullanmış oluruz


