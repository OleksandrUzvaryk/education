package lesson06.hometask.task1;

public class Purchase {

    public boolean canBuy(boolean isEdecaOpen, boolean isReweOpen){
        boolean result = (isEdecaOpen||isReweOpen);
        return result;
    }
}
