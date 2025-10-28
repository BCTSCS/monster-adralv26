public class MarshmallowMonster{
    private int arms;
    private int eyes;
    private int legs;
    private int buttons;
    private String name;
    public static void main(String[] args){
        MarshmallowMonster monster1 = new MarshmallowMonster();
        MarshmallowMonster monster2 = new MarshmallowMonster(3,2,1,2,"Johnson");
        System.out.println(monster1.toString());
        System.out.println(monster2.toString());
    }
    public MarshmallowMonster(){
        this.name = "Mallow";
        this.arms = 3;
        this.buttons = 2;
        this.eyes = 1;
        this.legs = 2;
    }
    public MarshmallowMonster(int arms, int eyes, int buttons, int legs, String name){
        this.arms = arms;
        this.eyes = eyes;
        this.buttons = buttons;
        this.name = name;
        this.legs = legs;

    }
    public int getArms(){
        return this.arms;
    }
    public int getLegs(){
        return this.legs;
    }
    public int getEyes(){
        return this.eyes;
    }
    public int getButtons(){
        return this.buttons;
    }
    public String getName(){
        return this.name;
    }
    public void setArms(int newArms){
        this.arms = newArms;
    }
    public void setLegs(int newLegs){
        this.legs = newLegs;
    }
    public void setEyes(int newEyes){
        this.eyes = newEyes;   
    }
    public void setButtons(int newButtons){
        this.buttons = newButtons;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String toString(){
        return "The monster is called "+this.name+". They have "+this.eyes+" eye(s), "+this.arms+" arm(s), "+this.legs+" legs, and "+this.buttons+" button(s).";
    }
}