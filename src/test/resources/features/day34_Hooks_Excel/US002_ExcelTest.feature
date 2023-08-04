Feature: US002 BlueRentalCar Excel Login

  Scenario: TC01 Pozitif Login Testi
    Given kullanici "blueRentalUrl" sayfasina gitti.
    And kullanici login butonuna tiklar
    But kullanici 2 saniye bekler
    And kullanici exceldeki "customer_info" sayfasindaki bilgiler ile giris yapildigini test eder
    And sayfayi kapatir