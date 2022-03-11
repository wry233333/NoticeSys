package net.f3322.wry333.service;

import net.f3322.wry333.bean.Institute;
import net.f3322.wry333.bean.Notice;
import net.f3322.wry333.dao.NoticeDao;
import net.f3322.wry333.dao.NoticeDaoImpl;

import java.util.List;

public class NoticeServiceImpl implements NoticeService{
    private NoticeDao noticeDao = new NoticeDaoImpl();
    @Override
    public List<Notice> search(String institute) {
        return noticeDao.search(institute);
    }

    @Override
    public List<Institute> institute() {
        return noticeDao.institute();
    }

    @Override
    public Notice find(String name) {
        return noticeDao.find(name);
    }
}
