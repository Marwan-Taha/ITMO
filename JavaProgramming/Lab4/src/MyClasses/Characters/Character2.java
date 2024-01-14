package MyClasses.Characters;

import MyClasses.ExtraObjects.Curls;
import MyEnums.*;
import MyInterfaces.*;

public class Character2 extends AbstractCharacter implements SadAble , SoundAble, RememberAble, SilentAble , WatchAble {

    private CharacterMove characterMove;
    private Sounds characterSound;

    public Character2(String name){
        super(name);
    }


    public void setCharacterMove(CharacterMove move){
        this.characterMove = move;
    }

    public CharacterMove getCharacterMove(){
        return this.characterMove;
    }

    public Sounds getCharacterSound() {
        return characterSound;
    }

    public void setCharacterSound(Sounds characterSound) {
        this.characterSound = characterSound;
    }

    @Override
    public void getSad() {
        this.setCharacterState(CharacterState.SAD);
        this.setCharacterLocation(Location.HALL);
        System.out.println("Перед обедом Миса грустила в углу зала.");
    }


    @Override
    public void makeSound() {
        this.setCharacterSound(Sounds.MEANINGFUL_SOUND);
        System.out.println("Миса издала звук, который мог означать что угодно.");
    }


    @Override
    public void remember(Curls curls) {
        this.setCharacterMove(CharacterMove.REMEMBER);
        curls.setCurlsState(CurlsState.REMEMBERED);
        System.out.println("Миса вспомнила чудесные локоны и вздохнула.");
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
