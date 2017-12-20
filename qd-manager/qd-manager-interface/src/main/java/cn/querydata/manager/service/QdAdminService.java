package cn.querydata.manager.service;

import cn.querydata.pojo.QdAdmin;
import cn.querydata.utils.QueryDataResult;

/**
 * Created by ZLS on 2017/11/24.
 */
public interface QdAdminService {
    //    注册时:验证账号是否存在,返回值为0时，表示帐号没有被注册
    public QueryDataResult getExistsByNum(String adminNum);

    //    注册时:验证手机号是否存在 ,返回值为0时，表示手机号没有被注册
    public QueryDataResult getExistsByPhone(String adminPhone);
    //    注册完成时：手机号为默认账号，昵称为手机号，类型为个人0
    public QueryDataResult saveAdmin(QdAdmin qdAdmin);
    //    登录验证
    public  QueryDataResult login(QdAdmin qdAdmin);

}
