package com.qwerpark.memo.post.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qwerpark.memo.post.domain.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	// WHERE userId = #{userId} ORDER BY id DESC
	public List<Post> findAllByUserIdOrderByIdDesc(int userId);
}