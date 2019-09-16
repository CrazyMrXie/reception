package cn.bgs.maven.reception.service;

import cn.bgs.maven.reception.pojo.*;

import java.util.List;

public interface IRecUserIService {
    TbUser login(String codename);

    List<TbUser> findUsers();

    List<TbAddress> findAllAddress(Integer id);

    List<TbAddress> findAddressUsers(Integer id);

    int insertUser(TbUser tbUser);

    int updataAddress(String name,Integer id);

    int subAddress(TbAddress tbAddress);

    int deletAddress(Integer id);

    List<TbPlan> findPlans(Integer userlevel);

    List<TbPlan> findData(TableParam tableParam, Integer userlevel);

    int subPlan(TbPlan tbPlan);

    int insertReal(TbPlan tbPlan);

    int uploadFiles(List<TbGallery> list);

    int addGid(String gId, int id);

    int deleUser(Integer id);

    List<TbAddress> readMySQL();
}
