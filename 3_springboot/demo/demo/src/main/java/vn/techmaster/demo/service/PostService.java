package vn.techmaster.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.techmaster.demo.model.Post;

import java.util.List;
import java.util.Random;

@Service
public class PostService {
    @Autowired
    private postDAO postDAO;
    public List<Post> getAllPost(){
        return postDAO.postList;
    }

    public Post getPostById(Integer id){
        List<Post> postList =  postDAO.findAll();
        return postList.stream().filter(post -> post.getId().equals(id)).findFirst().orElseThrow(());
    }

    public Post createPost(Post request) {
        System.out.println(request);
        Post post = new Post();
        Random rd = new Random();
        post.setId(rd.nextInt(1000));
        post.setTitle(request.getTitle());
        post.setAuthor(request.getAuthor());

        postDAO.save(post);
        return post;
    }

    public Post updatePost(Integer id, Post request){

    }
}

