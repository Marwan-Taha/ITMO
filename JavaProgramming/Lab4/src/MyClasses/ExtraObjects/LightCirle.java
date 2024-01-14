package MyClasses.ExtraObjects;

import MyEnums.Location;
import MyEnums.RandomMove;
import MyInterfaces.RunAble;
import MyInterfaces.StopAble;

public class LightCirle implements RunAble, StopAble
{
    private Location location;
    private RandomMove randomMove;



    public RandomMove getRandomMove() {
        return randomMove;
    }

    public void setRandomMove(RandomMove randomMove) {
        this.randomMove = randomMove;
    }

    public Location getCircleLocation(){
        return this.location;
    }

    public void setCircleLocation(Location location){
        this.location = location;
    }

    @Override
    public void run_up() {
        this.setRandomMove(RandomMove.UP);
        this.setCircleLocation(Location.UP);
        System.out.print("Кружок света от карманного фонарика, бегал вверх-");
    }

    @Override
    public void run_down() {
        this.setRandomMove(RandomMove.DOWN);
        this.setCircleLocation(Location.DOWN);
        System.out.println("вниз по стенам");
    }


    @Override
    public void stop(Location location) {
        this.setCircleLocation(Location.WARDROBE);
        this.setRandomMove(RandomMove.STOP);
        System.out.println("и остановился наконец на магическом слове \"Гардеробная\"");
    }
}
