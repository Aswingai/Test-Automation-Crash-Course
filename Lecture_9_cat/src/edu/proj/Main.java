package edu.proj;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        //Master  human = new Master("Аркадий");
        HomeCat Vasya = new HomeCat("Васька", "сиамский");
        HomeCat Flashing = new HomeCat("Вспышка", "Бенгальская кошка");
        HomeCat Cloud = new HomeCat("Туча", "Мейн-кун");
        WildCat Spot = new WildCat("Пятно", "дикая смесь");
        WildCat Dirty = new WildCat("Грязнуля", "непонятно");
        WildCat Sunshine = new WildCat("Луч", " Что то яркое");
        Vasya.setMaster("Виктор");
        Cloud.setMaster("Александр");
        Flashing.setMaster("Герман");
        System.out.println("\nmaster=" + Vasya.getMasterName());
        Vasya.play();
        Vasya.spoiledShoes();
        Vasya.spoiledShoes();
        Vasya.play();
        Cloud.play();
        Cloud.spoiledShoes();
        Cloud.spoiledShoes();
        Cloud.play();
        Flashing.play();
        Flashing.spoiledShoes();
        Spot.SaveWorld();
        Dirty.play();
        Dirty.SaveWorld();
        Sunshine.play();
        Sunshine.SaveWorld();
    }
}
