package com.company.lesson58;

import com.company.lesson58.animals.*;
import com.company.lesson58.diff_tasks.Aspirant;
import com.company.lesson58.diff_tasks.Student;

public class Main {

        public static void main(String[] args) {

                /*Animal[] animals = {
                                        new Dog("Meet", "New York", "BigBoy", "Hasky", true),
                                        new Dog("Bones", "Moscow", "LittleBoy", "Mops", false),
                                        new Dog("Tomato's", "Praga", "Woman", "Nope", true),

                                        new Cat("Cat food", "Old York", 15,  "Siam"),
                                        new Cat("Cucumber", "Warsaw", 20,  "Scotland"),
                                        new Cat("fish", "Berlin", 10,  "Nope")
                };

                for(Animal member : animals) {
                        member.makeNoise();
                        member.eat();
                        member.sleep();
                }

                Veterinarian[] vet_patients = animals;

                for(Veterinarian patient : vet_patients) {
                        patient.treatAnimal();
                }*/

                Student[] students = { new Aspirant(), new Student(), new Aspirant(), new Student() };

                for(Student member : students) {
                        System.out.println(member.getScholarship());
                }

        }
}
