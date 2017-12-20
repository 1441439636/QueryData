package service;

import cn.querydata.manager.service.QdDatabaseService;
import cn.querydata.pojo.QdDatabase;
import cn.querydata.pojo.QdDatabaseExample;
import cn.querydata.utils.QueryDataResult;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ZLS on 2017/11/24.
 */
public class DatabaseServiceImplTest {
    @Test
    //    注册时，验证id是否存在
    public void getExistsById() {
        QueryDataResult idExistsById = getService().getExistsById(1);
        System.out.println("\n\n\n");
        System.out.println(idExistsById.getMsg());
        QdDatabase database = (QdDatabase) idExistsById.getData();
        if (database != null)
            System.out.println(database.toString());
        System.out.println("\n\n\n");
    }

    @Test
    public void getExistsByAdminId() {
        QueryDataResult idExistsById = getService().getExistsByAdminId(1);
        System.out.println("\n\n\n");
        System.out.println(idExistsById.getMsg());
        Integer count = (int) idExistsById.getData();
        if (count > 0)
            System.out.println(count.toString());
        System.out.println("\n\n\n");
    }

    @Test
    //    注册，默认设置启动
    public void saveDatabase() {
        QdDatabase database = new QdDatabase();
        database.setDbType("MySql");
        database.setDbAddress("127.0.0.1");
        database.setDbPort("3306");
        database.setDbUser("root");
        database.setDbPasswd("root");
        database.setDbName("misaki");
        database.setDbStatus(1);
        database.setAdminId(10001);

        int num = (int) getService().saveDatabase(database).getData();
        System.out.println("\n\n\n");
        System.out.println("num=" + num);
        System.out.println("\n\n\n");
    }

    @Test
    //    获取数据库信息
    public void getDatabase() {
        QueryDataResult database = getService().getDatabase(10001);
        System.out.println("\n\n\n");
        if (database.getData().getClass().toString() == Integer.class.toString()) {
            if ((int) database.getData() == -1) {
                System.out.println(-1);
            } else if ((int) database.getData() == -2) {
                System.out.println(-2);
            }
        } else {
            QdDatabase database1 = (QdDatabase) database.getData();
            System.out.println(database1.toString());
        }
        System.out.println("\n\n\n");
    }

    @Test
    //   设置数据库信息状态，id,admin_id同时验证
    public void setDatabase() {
        QdDatabase database = new QdDatabase();
        database.setId(1);
        database.setDbType("MySql");
        database.setDbAddress("127.0.0.1");
        database.setDbPort("3306");
        database.setDbUser("root");
        database.setDbPasswd("root");
//        database.setDbPasswd("");
        database.setDbName("misaki");
        database.setDbStatus(1);
        database.setAdminId(10001);

        QueryDataResult result = getService().setDatabase(database);
        System.out.println("\n\n\n");
        System.out.println("result.getData().getClass().toString()=" + result.getData().getClass().toString());
        System.out.println("int.class.toString()=" + Integer.class.toString());

        if (result.getData().getClass().toString().equalsIgnoreCase(Integer.class.toString())) {
            if ((int) result.getData() == -1) {
                //除id、adminId外，数据有为空
                System.out.println(-1);
            } else if ((int) result.getData() == -2) {
                //adminId为空，帐号数据出错
                System.out.println(-2);
            } else if ((int) result.getData() == -3) {
                //Id为空，数据库信息数据出错
                System.out.println(-3);
            }
        } else {
            QdDatabase database1 = (QdDatabase) result.getData();
            System.out.println(database1.toString());
        }
        System.out.println("\n\n\n");
    }


    public ApplicationContext getApp() {
        return new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
    }

    public QdDatabaseService getService() {
        return getApp().getBean(QdDatabaseService.class);
    }
}
