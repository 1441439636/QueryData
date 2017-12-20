package cn.querydata.manager.service.impl;

import cn.querydata.dao.QdAdminMapper;
import cn.querydata.manager.service.QdAdminService;
import cn.querydata.pojo.QdAdmin;
import cn.querydata.pojo.QdAdminExample;
import cn.querydata.utils.QueryDataResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZLS on 2017/11/24.
 */
@Service
public class QdAdminServiceImpl implements QdAdminService {
    @Autowired
    private QdAdminMapper adminMapper;

    @Override
    public QueryDataResult getExistsByNum(String adminNum) {
        QdAdminExample example = new QdAdminExample();
        QdAdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminNumEqualTo(adminNum.toString());
        List<QdAdmin> qdAdmins = adminMapper.selectByExample(example);
        return QueryDataResult.ok(qdAdmins.size());
    }

    @Override
    public QueryDataResult getExistsByPhone(String adminPhone) {
        QdAdminExample example = new QdAdminExample();
        QdAdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminPhoneEqualTo(adminPhone.toString());
        List<QdAdmin> qdAdmins = adminMapper.selectByExample(example);
        return QueryDataResult.ok(qdAdmins.size());
    }

    @Override
    public QueryDataResult saveAdmin(QdAdmin qdAdmin) {
        if (qdAdmin.getAdminPhone().trim() == "" || qdAdmin.getAdminPhone() == null)
            return QueryDataResult.ok(-1);//手机号不能为空
        if (qdAdmin.getAdminPasswd().trim() == "" || qdAdmin.getAdminPasswd() == null)
            return QueryDataResult.ok(-1);//密码不能为空
        if ((int) getExistsByPhone(qdAdmin.getAdminPhone()).getData() == 1 || (int) getExistsByNum(qdAdmin.getAdminPhone()).getData() == 1)
            return QueryDataResult.ok(-2);//手机号已注册
        qdAdmin.setAdminNum(qdAdmin.getAdminPhone());
        qdAdmin.setAdminName(qdAdmin.getAdminPhone());
        qdAdmin.setAdminPasswd(DigestUtils.md5Hex(qdAdmin.getAdminPasswd()));
        int insert = adminMapper.insertSelective(qdAdmin);
        return QueryDataResult.ok(insert);
    }

    @Override
    public QueryDataResult login(QdAdmin qdAdmin) {
        qdAdmin.setAdminPasswd(DigestUtils.md5Hex(qdAdmin.getAdminPasswd()));
        QdAdminExample example1 = new QdAdminExample();
        QdAdminExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andAdminNumEqualTo(qdAdmin.getAdminNum());
        criteria1.andAdminPasswdEqualTo(qdAdmin.getAdminPasswd());
        List<QdAdmin> qdAdmins1 = adminMapper.selectByExample(example1);


        QdAdminExample example2 = new QdAdminExample();
        QdAdminExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andAdminPhoneEqualTo(qdAdmin.getAdminNum());
        criteria2.andAdminPasswdEqualTo(qdAdmin.getAdminPasswd());
        List<QdAdmin> qdAdmins2 = adminMapper.selectByExample(example2);
        if (qdAdmins1.size() == 1) {
            qdAdmin = qdAdmins1.get(0);
            return QueryDataResult.ok(qdAdmin);
        }
        if (qdAdmins2.size() == 1) {
            qdAdmin = qdAdmins2.get(0);
            return QueryDataResult.ok(qdAdmin);
        }
        return QueryDataResult.ok(-1);
    }
}
