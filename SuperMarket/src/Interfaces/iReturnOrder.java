package Interfaces;

public interface iReturnOrder {
   /**
    * @param actor - объект
    * @param checkNumber - номер чека
    * @param product - возвращаемый товар
    * @param priceProduct - общая стоимость чека
    */
   void bringTheProduct (iActorBehaviour actor, Integer checkNumber, String product, double priceProduct);
   /**
    * @param name - имя объекта
    * @param checkAmount - цена возвращаемого товара
    */
   void cashRefund(String name, Double checkAmount);
}
