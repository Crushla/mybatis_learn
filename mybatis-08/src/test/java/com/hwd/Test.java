package com.hwd;

import com.hwd.dao.BlogMapper;
import com.hwd.pojo.Blog;
import com.hwd.utils.IDUtils;
import com.hwd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Test {
    @org.junit.Test
    public void Test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("1241515");
        blog.setAuthor("hwd");
        blog.setCreateTime(new Date());
        blog.setViews(123);
        blogMapper.addBlog(blog);


        blog.setId(IDUtils.getId());
        blog.setTitle("1231231");
        blogMapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();
    }

    @org.junit.Test
    public void queryBlogIF() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();

        map.put("title", 124);
        map.put("author", "hwd1");
        map.put("id", "da54bc3ac69a4af1b9a72d6c9011b2f4");
        int blogs = blogMapper.updateBlog(map);
        /*for (Blog blog:blogs){
            System.out.println(blog);
        }*/
        sqlSession.commit();
        sqlSession.close();
    }

    @org.junit.Test
    public void foreach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        ArrayList<String> ids = new ArrayList<String>();
        ids.add("da54bc3ac69a4af1b9a72d6c9011b2f4");
        map.put("ids",ids);

        List<Blog> blogs = blogMapper.queryBlogForeach(map);
        for (Blog blog:blogs){
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
