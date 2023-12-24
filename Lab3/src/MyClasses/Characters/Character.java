package MyClasses.Characters;

import MyEnums.CharacterMove;
import MyEnums.CharacterState;
import MyEnums.DressState;
import MyInterfaces.*;

public class Character extends AbstractCharacter implements ApproachAble, CaresseAble, BuryAble, EmbraceAble, PressAble, ReleaseAble, StandAble{


    private CharacterState characterState;

    private CharacterMove characterMove;
    public Character(String name){
        super(name);
    }
    public Character(String name, Dress dress){
        super(name, dress);
    }




    public CharacterState getCharacterState(){
        return characterState;
    }
    public void setCharacterState(CharacterState state){
        this.characterState = state;
    }

    public void setCharacterMove(CharacterMove move){
        this.characterMove = move;
    }

    public CharacterMove getCharacterMove(){
        return this.characterMove;
    }


    @Override
    public void getClose() {
        this.setCharacterState(CharacterState.IS_CLOSE);
        System.out.println(this.getName() +" подошла ближе. ");
    }

    @Override
    public void caresse() {
        this.setCharacterMove(CharacterMove.CARESSE);
        this.getDress().setDressState(DressState.CARESSED);
        System.out.println(this.getName() + " ласкала платья, ");
    }


    @Override
    public void embrace() {
        this.setCharacterMove(CharacterMove.EMBRACE);
        this.getDress().setDressState(DressState.EMBRACED);
        System.out.println(this.getName() + " заключала их в объятия, ");
    }

    @Override
    public void bury() {
        this.setCharacterMove(CharacterMove.BURY);
        this.getDress().setDressState(DressState.BURIED);
        System.out.println(this.getName() + "зарывалась в них мордочкой, ");
    }


    @Override
    public void press() {
        this.setCharacterMove(CharacterMove.PRESS);
        this.getDress().setDressState(DressState.PRESSED);
        System.out.println(this.getName() + "прижимала к груди.");
    }

    @Override
    public void release() {
        this.setCharacterMove(CharacterMove.RELEASE);
        this.getDress().setDressState(DressState.RELEASED);
        System.out.println("Внезапно фрекен Снорк выпустила платья из лапок");
    }

    @Override
    public void standOnHead() {
        this.setCharacterMove(CharacterMove.STAND_ON_HEAD);
        System.out.println("и немного постояла на голове.");
    }
}
