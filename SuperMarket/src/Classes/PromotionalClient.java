package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
// import Classes.Market;

public class PromotionalClient extends Actor {

   Integer actionCount;
   String nameAction;
   Integer clientID;
   public static int numberMembers;

   /**
    * @param name - имя пкоупателя
    * @param actionCount   - количество покупателей в акции
    * @param clientID      - идентификатор клиента
    * @param numberMembers - количество участников акции
    */
   public PromotionalClient (String name, String nameAction, int actionCount, Integer clientID) {
      super(name);
      this.nameAction = nameAction;
      this.actionCount = actionCount;
      this.clientID = clientID;
      numberMembers++;
      if (numberMembers > actionCount) {
         // List<iActorBehaviour> array = new ArrayList<>();

         Market market = new Market();
         market.delete (promotionIsOver(), name);
     
      }
      else
      System.out.println(name + " - акционный клиент");
   }

 

   /**
    * @return - возвращает список покупателей, которые не попали в акцию
    */
   public List<iActorBehaviour> promotionIsOver () {
      List<iActorBehaviour> array = new ArrayList<iActorBehaviour>();
      iActorBehaviour client = new OrdinaryClient(name);
      System.out.println("К сожалению, акция \"" + nameAction + "\" завершилась. Теперь мы продаем товары по обычным ценам");

      array.add(client);
      return array;
   }

   @Override
   public String getName() {
      return super.name;
   }

   @Override
   public Actor getActor() {
      return this;
   }

   @Override
   public boolean isMakeOrder() {
      return super.isMakeOrder;
   }

   @Override
   public boolean isTakeOrder() {

      return super.isTakeOrder;
   }

   @Override
   public void setMakeOrder(boolean makeOrder) {
      super.isMakeOrder = makeOrder;

   }

   @Override
   public void setTakeOrder(boolean pickUpOrder) {
      super.isTakeOrder = pickUpOrder;
   }

}
