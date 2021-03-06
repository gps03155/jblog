package com.douzone.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douzone.jblog.repository.PostDao;
import com.douzone.jblog.vo.PostVo;

@Service
public class PostService {
	@Autowired
	private PostDao postDao;
	
	public void insertPost(PostVo postVo) {
		postDao.insertPost(postVo);
	}
	
	public List<PostVo> selectPost(String id){
		return postDao.selectPost(id);
	}
	
	public List<PostVo> categoryPost(long categoryNo){
		return postDao.categoryPost(categoryNo);
	}
	
	public PostVo getNoPost(long postNo, String id){
		return postDao.getNoPost(postNo, id);
	}
	
	public long lastSelect(String id) {
		return postDao.lastSelect(id);
		
	}
}
