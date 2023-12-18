package MyClasses.Dresses;

import MyClasses.materials.Brocade;
import MyClasses.materials.Silk;
import MyClasses.materials.Tulle;
import MyEnums.Colors;
import MyEnums.MaterialType;
import MyInterfaces.Decorations;
import MyInterfaces.Material;

import java.util.ArrayList;

public class MyDress extends AbstractDress{

        private static ArrayList<MyDress> Dresses = new ArrayList<>();


    public MyDress(Colors color, Material material){
        super(color,material);
        Dresses.add(this);
    }
        public MyDress(Colors color, Material material, Decorations decorations){
            super(color,material,decorations);
            Dresses.add(this);
        }

        @Override
        public void interact(){

            Decorations myCurrentDecor = this.getDressDecorations();
//            Material myCurrentMaterial = this.getDressMaterial();

            if(this != null) {
                System.out.print("Платья, платья, куда ни кинешь взгляд, всюду платья. ");
            }
            if (this.hanging == true){
                System.out.print("Они висели бесконечными рядами, сотнями, одно за другим: ");
            }
            if (Dresses != null){
                for (MyDress dress : Dresses) {
                    Material myCurrentMaterial = dress.getDressMaterial();
                    System.out.print(myCurrentMaterial.getMaterialType().getMType() + myCurrentMaterial.getMaterialDescription()+ " ");
                }
            }
            if (myCurrentDecor.getDecorationInfo() == "ColoredSparkles"){
                System.out.print("Повсюду мерцали разноцветные блестки, перемигиваясь короткими вспышками, словно огни маяка.");
            }
        }

}
