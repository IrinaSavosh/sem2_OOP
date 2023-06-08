package Classes;

public class Action {

private String nameAction;
private int count;


/**
 * @author Ira Savosh
 * @param nameAction - название акции
 * @param count - максимальное количество человек в акции
 */
public Action (String nameAction, int count){
   this.nameAction = nameAction;
   this.count = count;
  
}

/**
 * @return возвращает название акции
 */
public String getNameAction() {
   return nameAction;
}
/**
 * @param nameAction - название акции
 */
public void setNameAction(String nameAction) {
   this.nameAction = nameAction;
}

/**
 * @return - возвращает количество акционных покупателей
 */
public int getCount() {
   return count;
}
/**
 * @param count - количество акционных покупателей
 */
public void setCount(int count) {
   this.count = count;
}
}
