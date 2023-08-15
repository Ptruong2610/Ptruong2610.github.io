package vn.techmaster.demo.dao;

import org.springframework.stereotype.Repository;
import vn.techmaster.demo.database.PostDB;

@Repository
public class PostDAO {
    public List<Post> findAll(){
        return PostDB.postList;
    }

    public void save

}
