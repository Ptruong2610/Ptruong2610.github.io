package vn.techmaster.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.demo.model.Post;
import vn.techmaster.demo.service.PostService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Controller
@RestController
public class WebController {

    @Autowired
    private PostService postService;
    //1. Lấy ds tất cả post
    @RequestMapping(method = RequestMethod.GET, value = "/post")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }

    //2. Lấy post theo id
    @RequestMapping(method = RequestMethod.GET, value = "/post/{id}")
    public Post getById(@PathVariable Integer id){
        return postService.getPostById(id) ;
    }

    //3. Tạo mới
    @RequestMapping(method = RequestMethod.POST, value = "/post")
    public  Post createPost(@RequestBody Post request ){
        System.out.println(request);
        Post post = new Post();
        Random rd = new Random();
        post.setId(rd.nextInt(1000));
        post.setTitle(request.getTitle());
        post.setAuthor(request.getAuthor());
        this.postList.add(post);
        return post;
    }
    //4. Cập Nhật
    @RequestMapping(method = RequestMethod.PUT, value = "/post/{id}")
    public  Post updatePost(@PathVariable Integer id, @RequestBody Post request){
        Post post = this.postList.stream().filter(post1 -> post1.getId().equals(id)).findFirst().orElse(null);
        if (post !=null){
            post.setTitle(request.getTitle());
            post.setAuthor(request.getAuthor());
            return post;
        }
        return null;
    }
    //5. Xóa
    @RequestMapping(method = RequestMethod.DELETE, value = "/post/{id}")
    public  void deleteById(@PathVariable Integer id){
        this.postList.removeIf(post -> post.getId().equals(id));
    }
}
