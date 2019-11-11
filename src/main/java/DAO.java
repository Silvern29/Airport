import java.sql.Connection;
import java.util.LinkedList;

public interface DAO<E> {
    public LinkedList<E> getAllElements();
    public E getElement(String key);
    public void addElement(E el);
    public void updateElement(E el, String col, String set, String cond);
    public void deleteElement(String key);
}
