package MyClasses.Dresses;

import MyEnums.Colors;
import MyEnums.CharacterState;
import MyEnums.DressState;
import MyInterfaces.*;

public class MyDress extends AbstractDress implements RustleAble, DustAble, EnvelopAble {




    public MyDress(Colors color, Material material, Decorations decorations){
        super(color,material,decorations);

    }

    @Override
    public void Rustle(){
        this.getCharactertoDress().setCharacterState(CharacterState.RUSTLED);
    }

    @Override
    public void gettingDusty(){
        this.setDressState(DressState.DUSTY);
        System.out.println("они пахли пылью и духами");
    }

    @Override
    public void Envelope(){
        this.getCharactertoDress().setCharacterState(CharacterState.ENVELOPED);
        System.out.println("окутывали ее мягкими");
    }









}
