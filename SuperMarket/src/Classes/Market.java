package Classes;

import java.util.List;
import java.util.ArrayList;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

    /**
     * список покупателей
     */
    public List<iActorBehaviour> queue;

    public Market() { 
        this.queue = new ArrayList<iActorBehaviour>();
        System.out.println(queue);
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
        System.out.println();
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

    @Override
    public void bringTheProduct(iActorBehaviour actor, Integer checkNumber, String product, double priceProduct) {
        acceptToMarket(actor);
        System.out.println(actor.getActor().getName() + " клиент принес чек с номером " + checkNumber
                + ", клиенту нужно вернуть товар: " + product);

        cashRefund(actor.getActor().getName(), priceProduct);
        actor.setTakeOrder(true);
        releaseFromQueue();
        this.queue.remove(actor);
    }

    @Override
    public void cashRefund(String name, Double checkAmount) {
        System.out.println(name + " возвращена сумма за товар: " + checkAmount);
    }

    /**
     * @param array - список покупателей, которых нужно добавить в текущий список
     * @param name - имя покупателя, которого нужно удалить из текущего списка покупателей
     */
    public void delete(List<iActorBehaviour> array, String name) {
        for (iActorBehaviour iActorBehaviour2 : this.queue) {
            if (iActorBehaviour2.getActor().getName() == name);
        }
        for (iActorBehaviour iActorBehaviour : array) {
            queue.add(iActorBehaviour);
        }
    }

}
