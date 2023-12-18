package MyEnums;

public enum MaterialType {

    HEAVY("heavy "),
    LIGHT("Light "),
    PRINTED("printed ");

    private final String materialType;

    private MaterialType (String type){
        this.materialType = type;
    }

    public String getMType(){
        return materialType;
    }

}
