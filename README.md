
# Java & Spring Boot Mülakat Soruları Rehberi

Bu doküman, Java ve Spring Boot teknolojileriyle ilgili teknik mülakatlarda sıkça sorulan soruların derlenmiş halidir. Her madde bir soru ve yanıt içermektedir. Java temelinden Spring Boot’a, koleksiyonlardan tasarım desenlerine kadar geniş bir konuyu kapsar.

---

## 1. Java programlama dilinin özellikleri nelerdir?
- Nesne yönelimli
- Platformdan bağımsız
- Otomatik bellek yönetimi
- Güvenli
- Açık kaynak
- Multithreading desteği
- Dinamik bağlantı yeteneği
- Geniş kullanım alanı ve topluluk desteği

## 2. Java Sanal Makinesi (JVM) nedir?
JVM, Java bytecode’unu çalıştıran sanal makinedir. Platform bağımsızlığı sağlar, bellek yönetimi ve hata ayıklama işlemlerini yürütür.

## 3. JVM, JRE ve JDK arasındaki farklar nelerdir?
- **JVM**: Bytecode çalıştırır.
- **JRE**: JVM + runtime kütüphaneleri.
- **JDK**: JRE + geliştirme araçları (javac, debugger vs.)

## 4. Typecasting nedir? Kod örneği verin.
Typecasting, veri tiplerinin birbirine dönüştürülmesidir. Örnek:
```java
int i = 10;
double d = i;        // Implicit
int j = (int) d;     // Explicit
```

## 5. Nesne (Object) nedir?
Sınıfın bir örneğidir. Durum (state) ve davranış (behavior) içerir.

## 6. Static metod, değişken ve blok nedir?
- Static metot/alan sınıfa aittir, nesneye değil.
- Static blok, sınıf yüklendiğinde ilk çalışan bloktur.

## 7. Constructor (Yapıcı metod) nedir?
Sınıf adıyla aynı isimde, geri dönüş tipi olmayan metotlardır. Nesne oluşturulurken çalışırlar.

## 8. equals() ve == farkı nedir?
- `equals()`: İçerik karşılaştırması yapar.
- `==`: Referans karşılaştırması yapar.

## 9. super anahtar kelimesi nedir?
Üst sınıfın constructor'ına veya metodlarına erişmek için kullanılır.

## 10. HashSet, TreeSet, LinkedHashSet nedir?
- **HashSet**: Sırasız ve benzersiz.
- **LinkedHashSet**: Ekleme sırasını korur.
- **TreeSet**: Sıralı ve benzersiz.

## 11. HashSet ile TreeSet farkı nedir?
| HashSet        | TreeSet         |
|----------------|-----------------|
| Daha hızlı     | Daha yavaş      |
| Sıra yok       | Sıralı          |
| null kabul eder| null kabul etmez|

## 12. Hangi Set ne zaman kullanılmalı?
- HashSet → hız öncelikli.
- LinkedHashSet → sıra önemli.
- TreeSet → sıralama gerekli.

## 13. break nedir?
Döngüyü ya da switch'i sonlandırır.

## 14. continue nedir?
İlgili döngünün mevcut iterasyonunu atlar.

## 15. OOP (Nesne Yönelimli Programlama) nedir?
Kodun nesneler üzerinden organize edildiği yaklaşım.

## 16. OOP’nin prensipleri nelerdir?
- Kalıtım
- Kapsülleme
- Soyutlama
- Polimorfizm

## 17. Java erişim belirleyicileri nelerdir?
- public
- protected
- private
- default (paket içi)

## 18. this() ve super() farkı nedir?
- `this()`: Aynı sınıf içinde constructor çağırır.
- `super()`: Üst sınıf constructor’ını çağırır.

## 19. Overloading ve Overriding farkı?
- Overloading: Aynı metot ismi, farklı parametreler.
- Overriding: Üst sınıftaki metodu ezmek.

## 20. Veri tipleri nelerdir?
- Primitive (int, boolean, char…)
- Reference (class, array, interface…)

## 21. final anahtar kelimesi nedir?
- Değişken → değeri değiştirilemez
- Metot → override edilemez
- Sınıf → extend edilemez

## 22. Collections framework nedir?
List, Set, Map gibi veri yapılarını içeren Java kütüphanesidir.

## 23. Exception Handling nedir?
try-catch-finally yapıları ile hata yönetimi yapılır.

## 24. Interface vs Abstract Class farkı?
- Interface → yalnızca imza
- Abstract → hem imza hem gövde içerebilir

## 25. equals vs hashCode farkı?
- `equals()`: Mantıksal eşitlik
- `hashCode()`: Hash tabanlı yapılarda kullanılır

## 26. Spring Boot’ta REST servis nasıl yapılır?
```java
@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
```

## 27. Streams API nedir?
Verileri filtrelemek, dönüştürmek için Java 8 ile gelen fonksiyonel API.

## 28. Garbage Collection nedir?
JVM’in kullanılmayan nesneleri otomatik olarak temizlemesi.

## 29. Optional nedir?
null kontrolü yapmak için Java 8 ile gelen sınıf.

## 30. @SpringBootApplication nedir?
@Configuration + @EnableAutoConfiguration + @ComponentScan birleşimidir.

## 31. @GetMapping vs @PostMapping farkı?
- GET → veri alır
- POST → veri gönderir

## 38. @PathVariable vs @RequestParam farkı?
- PathVariable → URL’den parametre alır
- RequestParam → query parametre alır

## 39. @Component, @Service, @Repository farkı?
- Component → Genel kullanım
- Service → İş mantığı
- Repository → Veri katmanı

## 40. @Qualifier nedir?
Bean çakışmasında doğru olanı belirtmek için kullanılır.

## 41. @Primary nedir?
Varsayılan bean olarak işaretler.

## 42. @Scheduled nedir?
Zamanlanmış görevleri çalıştırmak için kullanılır.

## 43. Kafka ve RabbitMQ nedir?
- Kafka → yüksek hacimli log/veri akışı
- RabbitMQ → mesaj kuyruğu temelli yapı

## 44. Lombok, DTO, Entity nedir?
- Lombok → boilerplate kodu azaltır
- DTO → veri transfer objesi
- Entity → veri tabanı nesnesi

## 45. NoArgs, AllArgs, RequiredArgs nedir?
Lombok anotasyonları ile constructor üretimi sağlar.

## 46. AOP nedir?
Aspect Oriented Programming. Log, security gibi çapraz kesitli işler için kullanılır.

## 47. Swagger nedir?
REST API’leri belgelemek ve test etmek için araç.

## 48. Logging nedir, neden yapılır?
Uygulama davranışlarını kaydeder. Hataları izlemek için kullanılır.

## 49. Spring Boot Starter nedir?
Belirli bir işlevi gerçekleştirmek için hazır gelen bağımlılık paketleridir.

## 50. SOLID nedir?
- S: Single Responsibility
- O: Open/Closed
- L: Liskov Substitution
- I: Interface Segregation
- D: Dependency Inversion

## 51. Heap vs Stack nedir?
- Stack → metod çağrıları
- Heap → nesneler

## 52. Clean Code nedir?
Okunabilir, sade ve bakımı kolay kod yazımı prensipleri.

## 53. Methodları nasıl gizleriz?
private erişim belirleyicisi ile ya da interface dışına çıkararak.

## 54. Mocklama nedir?
Bir objenin davranışını testte simüle etmek.

## 55. Code coverage nedir?
Testlerin ne kadar kodu kapsadığını gösteren metrik.

## 56. @Query nedir?
Custom SQL sorgularını tanımlamak için kullanılır.

## 57. @JPQL nedir?
JPA üzerinden SQL benzeri sorgu yazmamızı sağlar.

## 58. Design Patterns – Singleton, Factory, Builder
- Singleton → tek örnek
- Factory → nesne üretim sorumluluğu
- Builder → karmaşık nesne üretimi

## 59. DI ve IoC nedir?
- DI → bağımlılıkların enjekte edilmesi
- IoC → kontrolün framework tarafından alınması

## 60. Mikroservis nedir?
Bağımsız geliştirilip dağıtılabilen küçük servisler. Bileşenleri:
- API Gateway
- Config Server
- Service Discovery (Eureka)
- Circuit Breaker
- Message Queue (Kafka, RabbitMQ)

## 61. Temel SQL Sorguları
SELECT, INSERT, UPDATE, DELETE, JOIN, GROUP BY, HAVING vb.

## 62. Veri Tabanı Optimizasyonu
- İndeksleme
- Normalizasyon
- Sorgu iyileştirme
- Cache kullanımı

## 63. GIT
Versiyon kontrol sistemi. `clone`, `commit`, `push`, `merge` gibi komutlarla çalışır.

## 64. Spring vs Spring Boot farkı
- Spring: Konfigürasyon gerektirir.
- Spring Boot: Otomatik konfigürasyon sağlar, hızlı başlatma sunar.
