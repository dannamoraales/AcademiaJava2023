package com.curso.v0;

import java.util.ArrayList;
import java.util.List;

public class User {
	private List<Post> post;

    public User(String nombre) {
        this.post = new ArrayList<>();
    }

    public void agregarPost(Post post) {
    	this.post.add(post);
    }

    public List<Post> getPost() {
        return post;
    }
}