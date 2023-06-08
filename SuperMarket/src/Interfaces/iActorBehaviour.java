package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * @param makeOrder - показатель созданного заказа (сделан заказ или нет)
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * @param pickUpOrder - показатель полученного заказа (получен заказ или нет)
     */
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}
