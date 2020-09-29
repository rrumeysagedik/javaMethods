package com.example.javamethods;

import android.renderscript.ScriptIntrinsicYuvToRGB;

public class Simpsons {

   private String name;
   private int age;                 //bunların hepsi public esasında anck private olsaydı private access hatası verecekti.
   private String job;              //protected olsaydı aşağı yukarı private ile aynı ama extend edince yani kalıtım verince kullanılabilir oluyor.
                            //bu private ve protected olaylarına  çok class ve bir proje içerisinde birden fazla yazılımcı olunca dikkat edilir.
                            //bi başka yazılımcının yazdığı metohdu bozmamak için.
    public Simpsons(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
