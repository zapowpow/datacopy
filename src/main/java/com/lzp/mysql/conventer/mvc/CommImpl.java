package com.lzp.mysql.conventer.mvc;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/21 14:58
 * @Description:
 */
@Service
public class CommImpl implements CommService {

    @Autowired
    @Qualifier("pbsEntity")
    private EntityManager pbsEntityManager;

    @Autowired
    @Qualifier("tmrEntity")
    private EntityManager tmrEntityManager;


    @Override
    public List<?> query(String sql) {
        try{
            return pbsQuery(sql);
        }catch (Exception e){
            return tmrQuery(sql);
        }
    }

    @Override
    public Object findById(Class t, Object id) {
        try{
            return pbsFindById(t,id);
        }catch (Exception e){
            return tmrFindById(t,id);
        }
    }

//    @Override
//    public Object save(Object t) {
//        try{
//            return pbsSave(t);
//        }catch (Exception e){
//            return tmrSave(t);
//        }
//    }
//
//    @Override
//    public List<?> save(List<?> ts) {
//        transactionalBegin();
//        for(Object object : ts){
//            try {
//                tmrEntityManager.persist(object);
//            }catch (Exception r){
//                pbsEntityManager.persist(object);
//            }
//        }
//        try {
//            tmrEntityManager.getTransaction().commit();
//            pbsEntityManager.getTransaction().commit();
//            return ts;
//        }catch (Exception e){
//            tmrEntityManager.getTransaction().rollback();
//            pbsEntityManager.getTransaction().rollback();
//            throw e;
//        }
//    }

    @Override
    public List<?> findAll(Class t) {
        try{
            return pbsFindAll(t);
        }catch (Exception e){
            return tmrFindAll(t);
        }
    }

    @Override
    public List<?> findBy(Class t, String column, Object value) {
        try{
            return pbsFindBy(t,column,value);
        }catch (Exception e){
            return tmrFindBy(t,column,value);
        }
    }

    @Override
    public List<?> pbsQuery(String sql) {
        Query query= (Query) pbsEntityManager.createQuery(sql);
        return query.getResultList();
    }

    @Override
    public Object pbsFindById(Class t, Object id) {
        transactionalBegin();
        Object m =pbsEntityManager.find(t,id);
        pbsEntityManager.getTransaction().commit();
        return m;
    }

//    @Override
//    public List<?> pbsSave(List<?> ts) {
//        transactionalBegin();
//        for(Object obj :ts){
//            pbsEntityManager.persist(obj);
//        }
//        pbsEntityManager.getTransaction().commit();
//        return ts;
//    }
//
//    @Override
//    public Object pbsSave(Object t) {
//        transactionalBegin();
//        pbsEntityManager.persist(t);
//        pbsEntityManager.getTransaction().commit();
//        return t;
//    }

    @Override
    public List<?> pbsFindAll(Class t) {
        String sql = "select m from "+t.getSimpleName()+" m ";
        Query query= (Query) pbsEntityManager.createQuery(sql);
        return query.getResultList();
    }

    @Override
    public List<?> pbsFindBy(Class t, String column, Object value) {
        String sql = "select m from "+t.getSimpleName()+ " m where m."+column+"="+value;
        Query query= (Query) pbsEntityManager.createQuery(sql);
        return query.getResultList();
    }

    @Override
    public List<?> tmrQuery(String sql) {
        Query query= (Query) tmrEntityManager.createQuery(sql);
        return query.getResultList();
    }

    @Override
    public Object tmrFindById(Class t, Object id) {
        transactionalBegin();
        Object m =pbsEntityManager.find(t,id);
        pbsEntityManager.getTransaction().commit();
        return m;
    }

    @Override
    public List<?> tmrSave(List<?> ts) {
        transactionalBegin();
        for(Object obj :ts){
            tmrEntityManager.persist(obj);
        }
        tmrEntityManager.getTransaction().commit();
        return ts;
    }

    @Override
    public Object tmrSave(Object t) {
        transactionalBegin();
        tmrEntityManager.persist(t);
        tmrEntityManager.getTransaction().commit();
        return t;
    }

    @Override
    public List<?> tmrFindAll(Class t) {
        String sql = "select m from "+t.getSimpleName()+" m ";
        Query query= (Query) tmrEntityManager.createQuery(sql);
        return query.getResultList();
    }

    @Override
    public List<?> tmrFindBy(Class t, String column, Object value) {
        String sql = "select m from "+t.getSimpleName()+ " m where m."+column+"="+value;
        Query query= (Query) tmrEntityManager.createQuery(sql);
        return query.getResultList();
    }

    private void transactionalBegin(){
        if(!tmrEntityManager.getTransaction().isActive()){
            tmrEntityManager.getTransaction().begin();
        }
        if(!pbsEntityManager.getTransaction().isActive()){
            pbsEntityManager.getTransaction().begin();
        }
    }

}