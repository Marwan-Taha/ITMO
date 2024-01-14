

/*

1. Miss Snork silently slipped back into the corridor. She realized that it was better for Misa to be alone.

  But Miss Snork did not go back to the hall. She walked further down the corridor because she felt an alluring and sweetish smell, the smell of powder. The circle of light from the flashlight ran up and down the walls and finally stopped at the magic word “Wardrobe”.

    She pressed the doorknob and entered.



Dresses, dresses, everywhere you look, dresses everywhere. They hung in endless rows, hundreds, one after another: heavy sparkling brocade, light clouds of tulle and swan's down, printed  silk of different colors and velvet black as night. Multi-colored sparkles flickered everywhere, winking in short flashes, like the lights of a lighthouse. The stunned Miss Snork came closer. She caressed the dresses, embraced them, buried her face in them, and pressed them to her chest. The dresses rustled, they smelled of dust and perfume, enveloping her in soft folds. Suddenly Miss Snork released the dresses from her paws and stood on her head for a while.



Before lunch, Misa was sad in the corner of the hall.
Misa made a sound that could mean anything.
Then they were silent, watching as Moominmama set the table for dinner. // in Program Manager
Misa remembered the wonderful curls and sighed.


*/

/*

// EXTRA
Фрекен Снорк бесшумно выскользнула назад в коридор. Она поняла, что Мисе лучше побыть одной.
Но обратно в зал фрекен Снорк не пошла. Она пошла дальше по коридору, потому что почувствовала манящий и сладковатый запах, запах пудры. Кружок света от карманного фонарика бегал вверх-вниз по стенам и остановился наконец на магическом слове "Гардеробная".
Она нажала ручку двери и вошла.


// ORIGINAL
Платья, платья, куда ни кинешь взгляд, всюду платья. Они висели бесконечными рядами, сотнями, одно за другим: тяжелая сверкающая парча, легкие облачка тюля и лебяжьего пуха, набивной шелк разных цветов и черный, как ночь, бархат. Повсюду мерцали разноцветные блестки, перемигиваясь короткими вспышками, словно огни маяка. Ошеломленная фрекен Снорк подошла ближе. Она ласкала платья, заключала их в объятия, зарывалась в них мордочкой, прижимала к груди. Платья шуршали, они пахли пылью и духами, окутывали ее мягкими складками. Внезапно фрекен Снорк выпустила платья из лапок и немного постояла на голове.


// EXTRA
Перед обедом Миса грустила в углу зала.
Миса издала звук, который мог означать что угодно.
Потом они помолчали, наблюдая, как Муми-мама накрывает на стол к обеду.
Миса вспомнила чудесные локоны и вздохнула.
*/

import MyClasses.Characters.Character2;
import MyClasses.Characters.Character3;
import MyClasses.Manager.ProgramManager;
import MyClasses.Characters.Character1;
import MyClasses.Dresses.MyDress;
import MyClasses.decorations.ColoredSparkles;
import MyClasses.materials.Brocade;
import MyClasses.materials.MyMaterial;
import MyEnums.Colors;
import MyEnums.MaterialType;
import MyInterfaces.Material;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws InvalidMaterialException{
        StoryEnd.EndOfStory ending = new StoryEnd.EndOfStory();



        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)){



            Brocade brocade = new Brocade(MaterialType.HEAVY);

            ColoredSparkles coloredSparkles = new ColoredSparkles();

            ValidateMaterial(brocade);

            MyDress dress1 = new MyDress(Colors.RED, brocade, coloredSparkles);


            Character1 character1 = new Character1("фрекен Снорк", dress1);
            Character2 character2 = new Character2("Misa");
            Character3 character3 = new Character3("MamaMia");


            ProgramManager manager = new ProgramManager(character1, character2, character3, dress1, coloredSparkles);


            manager.interact();


        } catch (InvalidDecorationException ide){
            System.out.println("Decoration Exception Catched" + ide.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            ending.PrintInf();
        }


    }

    private static void ValidateMaterial(MyMaterial material) throws InvalidMaterialException{
        if (material == null){
            throw new InvalidMaterialException("Material is not VALID", new RuntimeException() );
        }
    }
}















