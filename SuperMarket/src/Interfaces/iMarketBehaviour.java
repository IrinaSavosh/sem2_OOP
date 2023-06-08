package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * @param actor покупатель (объект)
     */
    void acceptToMarket(iActorBehaviour actor);
   /**
     * @param actors - список покупателй, как объектов
     */
     void releaseFromMarket(List<Actor> actors);
    void update();    
}
