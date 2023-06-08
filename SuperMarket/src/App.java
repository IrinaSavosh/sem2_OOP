import Classes.Action;
import Classes.Market;
import Classes.PromotionalClient;
import Interfaces.iActorBehaviour;

public class App {
    /**
     * @param args - массив строк
     * @throws Exception - проброс ошибок
     */
    public static void main(String[] args) throws Exception {
        Market market = new Market();

        Action action250523 = new Action("Успей затариться", 1);

        iActorBehaviour client5 = new PromotionalClient("Kira", action250523.getNameAction(), action250523.getCount(),
                PromotionalClient.numberMembers + 1);
        iActorBehaviour client6 = new PromotionalClient("Misha", action250523.getNameAction(), action250523.getCount(),
                PromotionalClient.numberMembers + 1);
        market.acceptToMarket(client6);
        iActorBehaviour client7 = new PromotionalClient("Sania", action250523.getNameAction(), action250523.getCount(),
                PromotionalClient.numberMembers + 1);
        market.acceptToMarket(client7);

       
        market.bringTheProduct(client5, 12569, "Утюг", 154.00);

        System.out.println();

        market.update();
    }
}

// 1) Добавить класс, описывающий акционного клиента. Включить поле название
// акции, id клиента и количество участников в акции(поле статическое) - готово
// 2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы
// могут понадобиться и подключить интерфейс к классам клиентов. - готово
// 3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.

// (задача со *)
// 1) Реализовать отказ в обслуживании для акционного клиента при превышении
// участников акции - готово
// 2) Сохранить в файл лог работы магазина, включая возвраты товара(реализовать
// возврат нескольких товаров)
