Feature: US002 BlueRentalCar Login Islemi

  Scenario: TC01 BlueRentalCar Pozitif Test
    Given kullanici "blueRentalUrl" sayfasina gitti.
    Then kullanici login butonuna tiklar
    But kullanici 2 saniye bekler
    And kullaniici verilen kullanici bilgileri ile login olur
      | email                         | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
    And sayfayi kapatir
