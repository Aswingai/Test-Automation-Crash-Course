package edu.proj;

public class WildCat extends Cat implements Playable{

    public WildCat(String name, String breed) {
        this.name = name;
        this.breed = breed;
        System.out.println("MEow! Wild cat " + (this.name) + ". Breed is " + this.breed);
    }
    public void HateHuman(){
        System.out.println("Hating human so much");
    }

    public void play() {
        System.out.println("I'm playing with human... i should hate them");

    }
    public void SaveWorld(){
        System.out.println("I'm The " + (this.name) + "! Only true saviour of this world");

    }
}
