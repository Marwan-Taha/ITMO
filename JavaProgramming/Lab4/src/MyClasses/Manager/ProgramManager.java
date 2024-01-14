package MyClasses.Manager;

import MyClasses.Characters.Character1;
import MyClasses.Characters.Character2;
import MyClasses.Characters.Character3;
import MyClasses.Dresses.MyDress;
import MyClasses.ExtraObjects.*;
import MyClasses.Time.Time;
import MyEnums.*;
import MyInterfaces.*;

import java.util.ArrayList;

public class ProgramManager implements InteractAble {
    Character1 character1;
    Character2 character2;

    Character3 character3;

    LightCirle lightCirle = new LightCirle();

    Wardrobe wardrobe = new Wardrobe();
    Doorknob doorknob = new Doorknob();

    Powder powder = new Powder();

    Table table = new Table();

    Curls curls = new Curls();

    Time time = new Time();
    MyDress dress;



    private static ArrayList<MyDress> Dresses = new ArrayList<>();


    Decorations decoration;
    public ProgramManager(Character1 character1, Character2 character2, Character3 character3, MyDress dress, Decorations decoration){
        this.character1 = character1;
        this.character2 = character2;
        this.character3 = character3;
        this.dress = dress;
        this.decoration = decoration;
        this.dress.setCharactertoDress(character1);
        this.dress.setDressState(DressState.HANGED);
        Dresses.add(dress);
    }




    @Override
    public void interact(){

        Decorations myCurrentDecor = this.decoration;

        character1.slip(Location.CORRIDOR);
        if (character1.getCharacterLocation() == Location.CORRIDOR){
            character1.realize(character2);
        }
        if (character1.getCharacterOpinion() == CharacterOpinion.UNCHANGED){
            character1.feelSmell(Smells.ALLURING, Smells.SWEETISH);
        }


        if (character1.getCharacterLocation() == Location.CORRIDOR){
            lightCirle.run_up();
            lightCirle.run_down();
            lightCirle.stop(Location.WARDROBE);
            character1.press(doorknob);
            character1.enter(Location.WARDROBE);
        }





        if(this.dress != null) {
            System.out.println("Платья, платья, куда ни кинешь взгляд, всюду платья. ");
        }
        if (this.dress.getDressState() == DressState.HANGED){
            System.out.println("Они висели бесконечными рядами, сотнями, одно за другим: ");
        }
        if (Dresses != null){
            for (MyDress dress : Dresses) {
                Material myCurrentMaterial = dress.getDressMaterial();
                System.out.println(myCurrentMaterial.getMaterialType().getMType() + myCurrentMaterial.getMaterialDescription()+ " ");
            }
        }
        if (myCurrentDecor.getDecorationInfo() == "ColoredSparkles") {
            myCurrentDecor.flicker();
            myCurrentDecor.wink();
        }



        this.character1.getClose();


        if (this.character1.getCharacterState() == CharacterState.IS_CLOSE){
            this.character1.caresse();
        }

        if (this.character1.getCharacterMove() == CharacterMove.CARESSE){
            this.character1.embrace();
        }
        if (this.character1.getCharacterMove() == CharacterMove.EMBRACE){
            this.character1.bury();
        }
        if (this.character1.getCharacterMove() == CharacterMove.BURY){
            this.character1.press();
        }

        if (this.dress.getDressState() == DressState.PRESSED){
            this.dress.Rustle();
        }

        if (this.character1.getCharacterState() == CharacterState.RUSTLED){
            this.dress.gettingDusty();
        }

        if (this.dress.getDressState() == DressState.DUSTY){
            this.dress.Envelope();
        }

        if (this.character1.getCharacterState() == CharacterState.ENVELOPED){
            this.character1.release();
        }

        if (this.dress.getDressState() == DressState.RELEASED){
            this.character1.standOnHead();
        }


        time.setTime(Times.BEFORE_LUNCH);
        character2.getSad();
        character2.makeSound();

        character1.silent();
        character2.silent();
        character1.watch();
        character2.watch();
        character3.set(table);

        character2.remember(curls);



        

    }




}
