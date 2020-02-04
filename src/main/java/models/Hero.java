package models;
import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String superPower;
    private String weakness;
    private int id;
    private static  ArrayList<Hero> listOfHeroes = new ArrayList<>();

    public Hero(String name, int age, String superPower, String weakness){
        this.name = name;
        this.age = age;
        this.superPower = superPower;
        this.weakness = weakness;
        listOfHeroes.add(this);
        this.id = listOfHeroes.size();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    public String getSuperPower(){
        return superPower;
    }

    public String getWeakness(){
        return weakness;
    }

    public static ArrayList<Hero> getAll(){
        return listOfHeroes;
    }

    public static void clearAll(){
        listOfHeroes.clear();
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }

    public void setWeakness(String weakness){
        this.weakness = weakness;
    }
}

