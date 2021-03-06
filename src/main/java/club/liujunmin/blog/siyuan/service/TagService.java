package club.liujunmin.blog.siyuan.service;

import club.liujunmin.blog.siyuan.entity.Tag;
import club.liujunmin.blog.siyuan.entity.Type;
import javassist.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {
    Tag saveTag(Tag tag);
    Tag getTag(Long id);
    Page<Tag> listTag(Pageable pageable);
    List<Tag> listTag();
    List<Tag> listTag(String ids);
    List<Tag> listTagTop(Integer size);
    Tag updateTag(Long id, Tag tag) throws NotFoundException;
    void deleteTag(Long id);
}
