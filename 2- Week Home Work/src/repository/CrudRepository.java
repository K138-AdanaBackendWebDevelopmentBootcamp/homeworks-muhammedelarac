package repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> listall();
     T finfById(int id);
     void saveToDatabase(T t);
     void updateOnDatabase(T t ,int id);
     void deletFromDatabase(T t);
     void deletFromDatabase(T t ,int id);
     
    
    
    
}