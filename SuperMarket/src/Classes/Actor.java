package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * @param name - имя покупателя
     */
    public Actor(String name) {
        this.name = name;
    }
   /**
     * @return - возвращает имя покупателя
     */
     abstract public String getName();

}
