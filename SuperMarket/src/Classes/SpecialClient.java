package Classes;

public class SpecialClient extends Actor{
    private int idVIP;
    /**
     * @param name - имя покупателя
     * @param idVIP - идентификационный номер покупателя
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    /**
     * @return - возвращает идентификационный номер покупателя
     */
    public int getId() {
        return idVIP;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }
}
