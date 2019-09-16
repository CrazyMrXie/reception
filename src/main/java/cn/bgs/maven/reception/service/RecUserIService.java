package cn.bgs.maven.reception.service;

import cn.bgs.maven.reception.dao.IRecUserDao;
import cn.bgs.maven.reception.pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecUserIService implements IRecUserIService{
    @Resource
    private IRecUserDao iRecUserDao;
    @Override
    public TbUser login(String codename) {
        return iRecUserDao.login(codename);
    }

    @Override
    public List<TbUser> findUsers() {
        return iRecUserDao.findUsers();
    }

    @Override
    public List<TbAddress> findAllAddress(Integer id) {
        return iRecUserDao.findAllAddress(id);
    }

    @Override
    public List<TbAddress> findAddressUsers(Integer id) {
        return iRecUserDao.findAddressUsers(id);
    }

    @Override
    public int insertUser(TbUser tbUser) {
        return iRecUserDao.insertUser(tbUser);
    }

    @Override
    public int updataAddress(String name,Integer id) {
        return iRecUserDao.updataAddress(name,id);
    }

    @Override
    public int subAddress(TbAddress tbAddress) {
        return iRecUserDao.subAddress(tbAddress);
    }

    @Override
    public int deletAddress(Integer id) {
        return iRecUserDao.deletAddress(id);
    }

    @Override
    public List<TbPlan> findPlans(Integer userlevel) {
        return iRecUserDao.findPlans(userlevel);
    }
    @Override
    public List<TbPlan> findData(TableParam tableParam, Integer userlevel) {
        return iRecUserDao.findData(tableParam,userlevel);
    }

    @Override
    public int subPlan(TbPlan tbPlan) {
        return iRecUserDao.subPlan(tbPlan);
    }

    @Override
    public int insertReal(TbPlan tbPlan) {
        return iRecUserDao.insertReal(tbPlan);
    }

    @Override
    public int uploadFiles(List<TbGallery> list) {
        return iRecUserDao.uploadFiles(list);
    }

    @Override
    public int addGid(String gId, int id) {
        return iRecUserDao.addGid(gId,id);
    }

    @Override
    public int deleUser(Integer id) {
        return iRecUserDao.deleUser(id);
    }

    @Override
    public List<TbAddress> readMySQL() {
        return iRecUserDao.readMySQL();
    }

}
