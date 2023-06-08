package Interfaces;

public interface iQueueBehaviour {
    /**
     * @param actor - покупатель (объект)
     */
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
