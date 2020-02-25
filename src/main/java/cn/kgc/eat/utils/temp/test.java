package cn.kgc.eat.utils.temp;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/22 13:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class test {
    @Resource
    private DataSource dataSource;
    String tableName="eat_user";//这里是举例生成数据库存在的表t_address。如果需要生成其它表，改表名就可以。
    String[] tableNames=tableName.split("_");
    public String getClassName(String[] tableNames){
        String className="";
        for (String tableName:tableNames){
            String firstChar="";
            firstChar=tableName.substring(0,1);
            className+=firstChar.toUpperCase()+tableName.substring(1);
        }
        return className;
    }
    String className=getClassName(tableNames);//这里是生成的domain类名。生成其它表的时候就可以，改成表名对应的类名。

    @Test
    public void testCreate() throws Exception {
//拿到数据库的链接对象
        Connection connection = dataSource.getConnection();
//准备需要执行行sql语句
        String sql="select * from "+tableName;
//执行准备好的sql语句
        PreparedStatement ps = connection.prepareStatement(sql);
//拿到结果集
        ResultSet rs = ps.executeQuery();
//拿到参数的原数据
        ResultSetMetaData metaData = rs.getMetaData();
//拿到当前表有多少个字段
        int count = metaData.getColumnCount();
//在遍历集合相应的字段，并却准备一个list装我们拿到的字段
        List<Map> list = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
//getColumnClassName拿到我们表中的字段类型，replaceFirst并把类型的前缀去掉
            String type = metaData.getColumnClassName(i).replaceFirst("java.lang.", "");
//拿到表中的字段名称 java.lang.字段类型
            String name = metaData.getColumnName(i);
//把name的第一个首字母变成大写的字母 Name
//substring这个方法是截取字段，从那个下标开始到那个下标结束，toUpperCase把首字母变大写
            String upperName = name.substring(0, 1).toUpperCase()+name.substring(1);
            HashMap<String,Object> map = new HashMap<>();
            map.put("type", type);
            map.put("name", name);
            map.put("upperName", upperName);
            list.add(map);
        }

//准备好一个配置对象
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
//在设置模板的加载path，
// Directory:目录 Template：模板 Loading:加载
        String path = "src/main/java/cn/kgc/eat/utils/temp/";//这地址是放domain.java的模板文件路径
        cfg.setDirectoryForTemplateLoading(new File(path));
//设置模板字符集
        cfg.setDefaultEncoding("UTF-8");
//获取一个模板对象
        Template template = cfg.getTemplate("fmGeneControllerTemp.ftl");
//准备相应的数据（Map,对象）
        Map dataMap = new HashMap<>();
        dataMap.put("className", className);
        dataMap.put("filedList", list);
        String filePath="src/main/java/cn/kgc/eat/controller/";
//生成文件
//数据(dataMap)+模板(template) = 输出文件(out)
        File newFile = new File(filePath,className+"Controller.java");
        FileWriter out = new FileWriter(newFile);
        template.process(dataMap, out);
        out.flush();
    }
}

