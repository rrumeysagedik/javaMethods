package com.example.javamethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
         String username="rub";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");
        testMethod();
        System.out.println(math(3,7));
        System.out.println(newMethod("rümeysa "));
        makeMusicians();
        makeSimpsons();
    }

    public void makeSimpsons(){

        Simpsons homer= new Simpsons("homer" ,25, "nuclear");
        System.out.println(homer.getName());
        homer.setName("homer simpson");
        System.out.println(homer.getName());
    }

    public void makeMusicians(){
        Musicians james= new Musicians("james", "guitar",50);
        System.out.println(james.age);


    }

    //public yani hertarafa açık void yani geriye değer döndürmeyen bir method
    public void testMethod() {
        int x=4+4;
        System.out.println("value of x:" + x);
        username="rubi";
    }

    //public yani hertaraftan görülen int tipinde değer döndüren ve int türünde a ve b adında parametre alan foksiyon
    public int math(int a, int b){

        return a+b;

    }

    public String newMethod(String string){
        username="rubip";
        return string + "new method";

    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("on start called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");

    }
}