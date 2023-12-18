

/* Dresses, dresses, everywhere you look, dresses everywhere. They hung in endless rows, hundreds, one after another: heavy sparkling brocade, light clouds of tulle and swan's down, printed  silk of different colors and velvet black as night. Multi-colored sparkles flickered everywhere, winking in short flashes, like the lights of a lighthouse. The stunned Miss Snork came  closer. She caressed the dresses, embraced them, buried her face in them, and pressed them to her chest. The dresses rustled, they smelled of dust and perfume, enveloping her in soft folds. Suddenly Miss Snork released the dresses from her paws and stood on her head for a while.
*/

/*

Платья, платья, куда ни кинешь взгляд, всюду платья. Они висели бесконечными рядами, сотнями, одно за другим: тяжелая сверкающая парча, легкие облачка тюля и лебяжьего пуха, набивной шелк разных цветов и черный, как ночь, бархат. Повсюду мерцали разноцветные блестки, перемигиваясь короткими вспышками, словно огни маяка. Ошеломленная фрекен Снорк подошла ближе. Она ласкала платья, заключала их в объятия, зарывалась в них мордочкой, прижимала к груди. Платья шуршали, они пахли пылью и духами, окутывали ее мягкими складками. Внезапно фрекен Снорк выпустила платья из лапок и немного постояла на голове.

*/

import MyClasses.Characters.Character;
import MyClasses.Dresses.MyDress;
import MyClasses.decorations.ColoredSparkles;
import MyClasses.materials.Brocade;
import MyClasses.materials.MyMaterial;
import MyClasses.materials.Silk;
import MyClasses.materials.Tulle;
import MyEnums.Colors;
import MyEnums.MaterialType;
import MyInterfaces.Dress;
import MyInterfaces.Material;

public class Main {
    public static void main(String[] args) {

        Brocade brocade = new Brocade(MaterialType.HEAVY);
        Tulle tulle = new Tulle(MaterialType.LIGHT);
        Silk silk  = new Silk(MaterialType.PRINTED);
        ColoredSparkles coloredSparkles = new ColoredSparkles();

        MyDress dress1 = new MyDress(Colors.RED, brocade, coloredSparkles);
        MyDress dress2 = new MyDress(Colors.RED, brocade, coloredSparkles);
        MyDress dress3 = new MyDress(Colors.BLACK, silk);

        Character character = new Character("фрекен Снорк", (Dress) dress1);

        dress1.interact();
        character.interact();


        System.out.println(" ");
        System.out.println(" ");


        System.out.println(dress1.toString());
        System.out.println(dress1.equals(dress2));
        System.out.println(dress1.hashCode());

        System.out.println(" ");
        System.out.println(" ");

        System.out.println(brocade.toString());
        System.out.println(brocade.hashCode());
        System.out.println(brocade.equals(tulle));

        }
    }
