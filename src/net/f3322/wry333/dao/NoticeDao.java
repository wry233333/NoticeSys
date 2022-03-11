package net.f3322.wry333.dao;

import net.f3322.wry333.bean.Institute;
import net.f3322.wry333.bean.Notice;

import java.util.List;

public interface NoticeDao {
    List<Notice> search(String institute);

    List<Institute> institute();
}
