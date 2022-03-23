package net.f3322.wry333.service;
import net.f3322.wry333.bean.Book;
import net.f3322.wry333.dao.DeleteDao;
import net.f3322.wry333.dao.DeleteDaoImpl;


public class DeleteServiceImpl implements DeleteService{
    private DeleteDao dd = new DeleteDaoImpl();
    @Override
    public void delete(String[] ids){
        for (String b_id : ids) {
            dd.delete(Integer.parseInt(b_id));
        }
    }
}
