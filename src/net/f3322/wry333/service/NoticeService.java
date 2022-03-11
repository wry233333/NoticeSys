package net.f3322.wry333.service;

import net.f3322.wry333.bean.Institute;
import net.f3322.wry333.bean.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> search(String institute);

    List<Institute> institute();

    Notice find(String name);
}
