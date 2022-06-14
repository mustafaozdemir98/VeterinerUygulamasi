# Vetapp2 - Veteriner Uygulamasına Hoşgeldiniz


## Bu yazımızda uygulamada hangi teknolojiler kullanıldığı , uygulamanın nasıl çalıştırılacağı vb. anlatılacaktır. 
### Kullanılan Teknolojiler
+ Spring Web 
+ Thymeleaf
+ JPA
+ Maven
+ Hibernate
+ Spring Data JPA
+ Spring Boot Dev Tools 
+ Mysql
+ Spring Security
+ JUnit Test
+ ve daha fazlası
---

### Uygulama özellikleri
Uygulamamız hoşgeldin sayfasıyla sizi karşılamaktadır.

Uygulamamızda Pets Menu ve Pet Owners Menu bulunmaktadır .

Pets Menu Sayfamızda : Yeni Hayvan ekleme, güncelleme ve silme yapılabilmektedir . Ve listelenmektedir.

Pet Owners Menu Sayfamızda : Yine aynı şekilde hayvan sahibi ekleme , güncelleme ve silme yapılabilmektedir . Ve listelenmektedir.

Listede arama yapılabilmektedir ve Clear ile aramadan çıkılabiliyor.

Login(kullanıcı adı ve şifreyle giriş) ve Authorization(yetkilendirme) özellikleri mevcuttur.

Birim test vardır.


### Uygulamanın çalıştırılması
Uygulamamız herhangi bir ide kullanılmadan çalışabilir.Eclipse IDE ile de çalıştırabilirsiniz.
#### (ÖNEMLİ) Öncelikle Login ve Authorization işlemlerinin çalışması için mevcut veritabanını bilgisayarınıza eklemelisiniz.

Uygulamanın çalışması için Mysql kurulu olmalıdır . Default Port localhost:3306 . Fakat application.properties dosyasından server portu kendi default portunuz olarak değiştirebilirsiniz.

İndirilen vetapp2.sql dosyası not defteri ile açılır . İçindeki metnin hepsi seçilir , kopyalanır , workbench'de new query seçilip yapıştırılır ve çalıştırılır. Ve veritabanımız artık bilgisayarınızda var.
##### 1.Yol Ide kullanılmadan çalıştırma
##### (ÖNEMLİ) uygulamanın yüklü olduğu klasörü Sabit disk(C:) içine atıp çalıştırırsanız daha iyi bir yöntemdir . (Çalışması için)
Veritabanı bilgisayara eklendikten sonra .

Bilgisayarınızda Java 17 kurulu olmalıdır. Ve Sistem ortam değişkenlerinde JAVA_HOME ayarları yapılmalıdır.[Buradan Bakabilirsiniz](https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html)

Ardından cmd açılır. 
ve bu adımlar yapılır.
`cd (uygulamanın bulunduğu klasör)`
ardından
`mvnw spring-boot:run`
komutu çalıştırılır .

Son olarak uygulama başlayınca(konsolda Started denecektir) . localhost:8080 adresinden uygulamaya ulaşılır .
##### 2.Yol Ide kullanılarak çalıştırma
Veritabanı bilgisayara eklendikten sonra .

Eclipse Ide programında import yapılır . Run as java application denilerek çalıştırılır. localhost:8080 adresinden uygulamaya ulaşılır .

### Kullanıcı adı ve şifreler
kullanıcı adı : admin // Şifresi : admin1 // Rolü : Yönetici // Ekleme Güncelleme Silme yapabilir

kullanıcı adı : mustafa // Şifresi mustafa1 // Rolü : Kullanıcı // Sadece Ekleme yapabilir

kullanıcı adı : murat // Şifresi murat1 // Rolü : Editor // Ekleme Güncelleme Yapabilir
