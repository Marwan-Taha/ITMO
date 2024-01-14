package MyClasses.Characters;

import MyClasses.ExtraObjects.Curls;
import MyClasses.ExtraObjects.Table;
import MyEnums.CharacterMove;
import MyEnums.TableState;
import MyInterfaces.SetAble;
import javafx.scene.control.Tab;

public class Character3 extends AbstractCharacter implements SetAble{


    private CharacterMove characterMove;
    public Character3(String name){
        super(name);
    }




    @Override
    public void set(Table table) {
        table.setTableState(TableState.SETTED);
        System.out.println(" как Муми-мама накрывает на стол к обеду.");
    }
}
