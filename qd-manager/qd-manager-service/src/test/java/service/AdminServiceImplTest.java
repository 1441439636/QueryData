package service;

import cn.querydata.manager.service.QdAdminService;
import cn.querydata.pojo.QdAdmin;
import cn.querydata.pojo.QdAdminExample;
import cn.querydata.utils.QueryDataResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ZLS on 2017/11/24.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("/spring/applicationContext-*.xml")
public class AdminServiceImplTest {
    //    @Autowired
//    private QdAdminService qdAdminService;
    @Test
//    注册时:验证账号是否存在（手机号）,返回值为0时，表示手机号没有被注册
    public void getExistsOfAccountByNum() {
        QdAdminService qdAdminService = getService();
        QueryDataResult result = qdAdminService.getExistsByNum("123456789");
        System.out.println(result.getData().toString());
        System.out.println(result.getMsg().toString());
        System.out.println(result.getStatus().toString());
    }

    @Test
    //    注册完成时：手机号为默认账号，昵称为手机号，类型为个人0
    public void saveAdmin() {
        QdAdmin qdAdmin = new QdAdmin();
        qdAdmin.setAdminPhone("13144445555");
        qdAdmin.setAdminPasswd(123456 + "");
        qdAdmin.setAdminType(0);
        qdAdmin.setAdminInfo("a 如如你的分宏达股份");
        QueryDataResult result = getService().saveAdmin(qdAdmin);
        System.out.println(result.getData() == null ? null : result.getData().toString());
        System.out.println(result.getMsg().toString());
        System.out.println(result.getStatus().toString());
    }

    @Test
    public void login() {
        QdAdmin qdAdmin = new QdAdmin();
        qdAdmin.setAdminNum("13144445555");
        qdAdmin.setAdminPasswd("123456");
        QueryDataResult result = getService().login(qdAdmin);
        System.out.println("\n\n");
        System.out.println(result.getMsg().toString());
        System.out.println(result.getStatus().toString());
        System.out.println(result.getData().toString());
        System.out.println("\n\n");

    }


    public ApplicationContext getApp() {
        return new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
    }

    public QdAdminService getService() {
        return getApp().getBean(QdAdminService.class);
    }
}
