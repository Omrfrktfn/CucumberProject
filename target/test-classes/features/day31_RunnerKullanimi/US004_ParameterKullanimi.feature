#Scenariolar'da birden fazla url'e gitmek istedigimizde yada birden fazla urun
  #aratmak istedigimizde her step icin yeniden method olusturmak yerine gitmek
  #istedgimiz url yada aratmak istedigimiz urunu " " stepleri yazarken tirnak icine
  #alirsak stepdfinition class'inda parametreli bir method olusturur. Ve bu methodu
  #diger url ve aratmak istedigimiz urunler icin direk feature file uzerinden degistirip
  #kullanabiliriz. Boylece tekrar tekrar her step icin method olusturmamis oluruz.

Feature: US004 TechproEducation Arama Testi

  Scenario: TC01 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "mobil" aratir
    And sayfayi kapatir

  Scenario: TC02 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "qa" aratir
    And sayfayi kapatir

  Scenario: TC03 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "java" aratir
    And sayfayi kapatir

  Scenario: TC04 Sayfada Arama Yapar
    Given kullanici "https://google.com" sayfasina gider

  Scenario: TC05 Sayfada Arama Yapar
    Given kullanici "https://youtube.com" sayfasina gider

  Scenario: TC06 Sayfada Arama Yapar
    Given kullanici "https://yahoo.com" sayfasina gider