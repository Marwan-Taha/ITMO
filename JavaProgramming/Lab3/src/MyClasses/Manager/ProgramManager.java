package MyClasses.Manager;

import MyClasses.Characters.Character;
import MyClasses.Dresses.MyDress;
import MyEnums.CharacterMove;
import MyEnums.CharacterState;
import MyEnums.DressState;
import MyInterfaces.*;

import java.util.ArrayList;

public class ProgramManager implements InteractAble {
    Character character;
    MyDress dress;


    private static ArrayList<MyDress> Dresses = new ArrayList<>();


    Decorations decoration;
    public ProgramManager(Character character, MyDress dress, Material material, Decorations decoration){
        this.character = character;
        this.dress = dress;
        this.decoration = decoration;
        this.dress.setCharactertoDress(character);
        this.dress.setDressState(DressState.HANGED);
        Dresses.add(dress);
    }




    @Override
    public void interact(){

        Decorations myCurrentDecor = this.decoration;

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



        this.character.getClose();


        if (this.character.getCharacterState() == CharacterState.IS_CLOSE){
            this.character.caresse();
        }

        if (this.character.getCharacterMove() == CharacterMove.CARESSE){
            this.character.embrace();
        }
        if (this.character.getCharacterMove() == CharacterMove.EMBRACE){
            this.character.bury();
        }
        if (this.character.getCharacterMove() == CharacterMove.BURY){
            this.character.press();
        }

        if (this.dress.getDressState() == DressState.PRESSED){
            this.dress.Rustle();
        }

        if (this.character.getCharacterState() == CharacterState.RUSTLED){
            this.dress.gettingDusty();
        }

        if (this.dress.getDressState() == DressState.DUSTY){
            this.dress.Envelope();
        }

        if (this.character.getCharacterState() == CharacterState.ENVELOPED){
            this.character.release();
        }

        if (this.dress.getDressState() == DressState.RELEASED){
            this.character.standOnHead();
        }



        

    }




}
