package Classes;

import Interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour {

    /**
     * @param name - имя покупателя
     * @param isTakeOrder - 
     * @param isMakeOrder
     */
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxService() {
        this.name = "Tax audit";
    }

    /**
     * @return - возвращает имя покупателя
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

}
