package MyClasses.Characters;

import MyClasses.ExtraObjects.Curls;
import MyClasses.ExtraObjects.Doorknob;
import MyEnums.*;
import MyInterfaces.*;
import sun.dc.pr.PRError;

import java.nio.file.Watchable;

public class Character1 extends AbstractCharacter implements ApproachAble, CaresseAble, BuryAble, EmbraceAble, PressAble, ReleaseAble, StandAble, SlipAble, RealizeAble, LeaveAble, OpinionAble ,ChangeAble, SmellAble , EnterAble, SilentAble, WatchAble {



    private CharacterMove characterMove;
    private Sounds characterSound;

    public Character1(String name){
        super(name);
    }
    public Character1(String name, Dress dress){
        super(name, dress);
    }


    public static class Actions{

    }

    private CharacterOpinion characterOpinion = CharacterOpinion.UNCHANGED;

    public CharacterOpinion getCharacterOpinion() {
        return characterOpinion;
    }

    public void setCharacterOpinion(CharacterOpinion characterOpinion) {
        this.characterOpinion = characterOpinion;
    }


    public Sounds getCharacterSound() {
        return characterSound;
    }

    public void setCharacterSound(Sounds characterSound) {
        this.characterSound = characterSound;
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


    @Override
    public void slip(Location location){
        this.setCharacterLocation(location);
        System.out.println("Фрекен Снорк бесшумно выскользнула назад " + location);
    }

    @Override
    public void realize(Character2 character2) {
        leave(character2);
        System.out.println("Она поняла, что Мисе лучше побыть одной.");
    }

    @Override
    public void leave(Character2 character) {
        character.setCharacterState(CharacterState.ALONE);
    }

    @Override
    public void changeOpinion(){
        this.setCharacterOpinion(CharacterOpinion.CHANGED);
        System.out.println("Но обратно в зал фрекен Снорк не пошла.");
    }

    @Override
    public void changeDirection(Location location) {
        this.setCharacterMove(CharacterMove.CHANGE_DIRECTION);
        this.setCharacterLocation(location);
        System.out.println("Она пошла дальше по," + location);
    }

    @Override
    public void feelSmell(Smells ...smell) {
        this.setCharacterMove(CharacterMove.SMELL);
        this.changeOpinion();
        this.changeDirection(Location.CORRIDOR);
        System.out.println("потому что почувствовала" + smell[0] + " и " + smell[1] +" запах");
    }




    @Override
    public void press(Doorknob doorknob){
        this.setCharacterMove(CharacterMove.PRESS);
        doorknob.setDoorknobState(DoorknobState.PRESSED);
        System.out.print("Она нажала ручку двери");
    }


    @Override
    public void enter(Location location) {
        this.setCharacterMove(CharacterMove.ENTER);
        this.setCharacterLocation(Location.WARDROBE);
        System.out.println(" и вошла.");
    }

    @Override
    public void silent() {
        this.setCharacterSound(Sounds.SILENT);
        System.out.print(this.getName() + " помолчала");
    }

    @Override
    public void watch() {
        this.setCharacterMove(CharacterMove.WATCH);
        System.out.print(this.getName() + " watching ");
    }
}
