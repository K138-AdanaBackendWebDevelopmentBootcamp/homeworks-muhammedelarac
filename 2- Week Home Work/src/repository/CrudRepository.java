package repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> listall();
     T finfById(Long id);
     void saveToDatabase(T t);
     void updateOnDatabase(T t ,Long id);
     void deletFromDatabase(T t);
     void deletFromDatabase(T t ,Long id);
     
    
    
    
}