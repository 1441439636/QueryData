package cn.querydata.manager.service.impl;

import cn.querydata.dao.QdDatabaseMapper;
import cn.querydata.manager.service.QdDatabaseService;
import cn.querydata.pojo.QdAdmin;
import cn.querydata.pojo.QdDatabase;
import cn.querydata.pojo.QdDatabaseExample;
import cn.querydata.utils.QueryDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZLS on 2017/11/24.
 */
@Service
public class QdDatabaseServiceImpl implements QdDatabaseService {
    @Autowired
    private QdDatabaseMapper databaseMapper;

    @Override
    public QueryDataResult getExistsById(Integer id) {
        QdDatabase qdDatabase = databaseMapper.selectByPrimaryKey(id);
        if (qdDatabase == null)
            return QueryDataResult.ok();
        else
            return QueryDataResult.ok();
    }

    @Override
    public QueryDataResult getExistsByAdminId(Integer id) {
        QdDatabaseExample example = new QdDatabaseExample();
        QdDatabaseExample.Criteria criteria = example.createCriteria();
        criteria.andAdminIdEqualTo(id);
        List<QdDatabase> qdDatabases = databaseMapper.selectByExample(example);
        return QueryDataResult.ok(qdDatabases.size());
    }

    @Override
    public QueryDataResult saveDatabase(QdDatabase database) {
        if(getQdDatabaseIsNull(database))
            return  QueryDataResult.ok(-1);
        if (database.getAdminId() == 0 || database.getDbType() == null)
            return QueryDataResult.ok(-2);
        if ((int) getExistsByAdminId(database.getAdminId()).getData() > 0)
            return QueryDataResult.ok(-3);
        int i = databaseMapper.insertSelective(database);
        return QueryDataResult.ok(i);
    }

    @Override
    public QueryDataResult getDatabase(Integer adminId) {
        QdDatabaseExample example = new QdDatabaseExample();
        QdDatabaseExample.Criteria criteria = example.createCriteria();
        criteria.andAdminIdEqualTo(adminId);
        List<QdDatabase> qdDatabases = databaseMapper.selectByExample(example);
        if (qdDatabases.size() == 1)
            return QueryDataResult.ok(qdDatabases.get(0));
        else
            return
                    QueryDataResult.ok(-1);
    }
    /*
    //处理方法
        QueryDataResult result = getService().getDatabase(adminId);
        if (result.getData().getClass().toString() == Integer.class.toString()) {
            if ((int) result.getData() == -1) {
               //数据库信息不存在，请先设置数据库信息
            }
        } else {
            QdDatabase database = (QdDatabase) result.getData();
        }
     */

    @Override
    public QueryDataResult setDatabase(QdDatabase database) {
        if(getQdDatabaseIsNull(database))
            return  QueryDataResult.ok(-1);
        if (database.getAdminId() == null || database.getAdminId() == 0)
            return QueryDataResult.ok(-2);
        if (database.getId() == null || database.getId() == 0)
            return QueryDataResult.ok(-3);
        databaseMapper.updateByPrimaryKeySelective(database);
        return QueryDataResult.ok(database);
    }

    /**
     * 验证除Id、adminId外的所有数据是否为空
     * @param database
     * @return
     */
    private boolean getQdDatabaseIsNull(QdDatabase database){
        if (database.getDbType().trim() == "" || database.getDbType() == null)
            return true;
        if (database.getDbAddress().trim() == "" || database.getDbType() == null)
            return true;
        if (database.getDbPort().trim() == "" || database.getDbType() == null)
            return true;
        if (database.getDbName().trim() == "" || database.getDbType() == null)
            return true;
        if (database.getDbUser().trim() == "" || database.getDbType() == null)
            return true;
        if (database.getDbPasswd().trim() == "" || database.getDbType() == null)
            return true;
        return false;
    }
}
