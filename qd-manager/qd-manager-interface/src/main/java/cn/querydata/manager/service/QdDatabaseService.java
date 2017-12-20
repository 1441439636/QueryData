package cn.querydata.manager.service;

import cn.querydata.pojo.QdAdmin;
import cn.querydata.pojo.QdDatabase;
import cn.querydata.utils.QueryDataResult;

/**
 * Created by ZLS on 2017/11/24.
 */
public interface QdDatabaseService {

    //    注册时，验证id是否存在
    public QueryDataResult getExistsById(Integer id);
    //    注册时，验证id是否存在
    public QueryDataResult getExistsByAdminId(Integer adminId);
    //    注册，默认设置启动
    public QueryDataResult saveDatabase(QdDatabase qdDatabase);
    //    获取数据库信息
    public  QueryDataResult getDatabase(Integer adminId);
    //   设置数据库信息，
    public QueryDataResult setDatabase(QdDatabase qdDatabase);

}
