package club.liujunmin.blog.siyuan.service;

import club.liujunmin.blog.siyuan.entity.Blog;
import club.liujunmin.blog.siyuan.entity.BlogQuery;
import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {
    Blog getBlog(Long id);

    /**
     * 根据ID将博客内容转化为HTML
     * @param id 博客ID
     * @return Blog
     */
    Blog getAndConvert(Long id) throws NotFoundException;

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    Page<Blog> listBlog(Pageable pageable);
    Page<Blog> listBlog(Long tagId, Pageable pageable);
    Page<Blog> listBlog(Pageable pageable, String query);
    List<Blog> listRecommendBlogTop(Integer size);
    Map<String, List<Blog>> archiveBlog();
    Blog saveBlog(Blog blog);
    Blog updateBlog(Long id, Blog blog) throws NotFoundException;
    Long countBlog();
    void deleteBlog(Long id);
}
