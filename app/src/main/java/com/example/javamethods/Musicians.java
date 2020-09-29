package com.example.javamethods;

public class Musicians {

    //ilk olarak sınıfta oluşturalacak objelerin isimleri oluşturulur.
    //attribute=özellik
    String name;
    String instrument;
    int age;
                    //sınıf oluşturulurken görülen input
                    //kullanıcı bize hangi name,insturement ve age verirse al onu o classın name instrument ve age'ine eşitle.
    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor OK.");
    }
}
