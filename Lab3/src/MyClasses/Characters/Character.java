package MyClasses.Characters;

import MyInterfaces.*;

public class Character extends AbstractCharacter implements CaressedAble, InteractAble, EmbraceAble, BuryAble, PressAble, AffectAble {



    public Character(String name){
        super(name);
    }
    public Character(String name, Dress dress){
        super(name, dress);
    }





    @Override
    public void interact(){
        this.caressed();
        this.embrace();
        this.bury();
        this.press();
        this.showEffect();

    }

    @Override
    public void caressed(){
        System.out.print("Ошеломленная фрекен Снорк подошла ближе. Она ласкала платья, ");
    }

    @Override
    public void embrace(){
        System.out.print("заключала их в объятия, ");
    }

    @Override
    public void bury(){
        System.out.print("зарывалась в них мордочкой, ");
    }

    @Override
    public void press(){
        System.out.println("прижимала к груди, ");
    }

    @Override
    public void showEffect(){
        System.out.println("Платья шуршали, они пахли пылью и духами, окутывали ее мягкими складками. Внезапно фрекен Снорк выпустила платья из лапок и немного постояла на голове.");
    }

}
