package MyInterfaces;

import MyEnums.Colors;
import MyEnums.DressState;

public interface Dress {

    Colors getDressColor();

    Material getDressMaterial();

    Decorations getDressDecorations();


    boolean isWorn();
    
    DressState getDressState();


    void setDressState(DressState dressState);
}
