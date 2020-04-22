package edu.proj;

public class HomeCat extends Cat implements Playable{
    private static String masterName;
    private Master master;

    public HomeCat(String name, String breed){
        this.name = name;
        this.breed = breed;
        System.out.println("MEow! Home cat " + (this.name)+ ". Breed is " + this.breed);
    }

    public String getMasterName (){
        return this.masterName;
    }

    public void setMasterName(String name){
        this.masterName=name;
    }

    public void setMaster(String name){
        this.master = new Master(name);
        this.masterName=name;
    }

    public void play(){
        System.out.println("Home cat " + (this.name) + " is playing");
        this.master.increaseMood(5);
    }

    public void spoiledShoes(){
        System.out.println("Home cat " + this.name + " spoiled shoes of " + this.master.getName() + "!");
        this.master.decreaseMood(15);
        this.master.decreaseMoney( 15);
    }
}
