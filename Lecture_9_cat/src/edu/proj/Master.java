package edu.proj;


public class Master {
    private String name;
    private Integer mood;
    private Integer money;

    public Master(String name){
        this.name = name;
        this.setMood();
        System.out.println("I'm master " + (this.name)+ ". Mood level=" + this.mood);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setMood(){
        this.mood = 50;
        System.out.println("Master " + this.name + " mood is " + this.mood);
    }

    public void setMoney(){
        this.money =50
        System.out.println("Master " + this.money + " money is " + this.money);
    }

    public void increaseMood(int measure){
        this.mood = this.mood + measure;
        System.out.println("Master " + this.name + " mood became " + this.mood);
    }

    public void decreaseMoney(int measure){
        if(this.money >= measure) {
            this.money = this.money - measure;
            System.out.println("Master " + this.name + " money became " + this.money);
        }else {
            this.money = 0;


        }
        if(this.money == 0)
            System.out.println("Master " + this.name +" is very poor with no money");
    }
}

    public void decreaseMood(int measure){
        if(this.mood >= measure) {
            this.mood = this.mood - measure;
            System.out.println("Master " + this.name + " mood became " + this.mood);
        }else {
            this.mood = 0;


        }
        if(this.mood == 0)
            System.out.println("Master " + this.name +" is very upset with mood=" + this.mood);
    }
}
