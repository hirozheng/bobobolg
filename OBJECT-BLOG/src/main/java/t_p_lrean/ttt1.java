package t_p_lrean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ttt1 {
    public List<student> teee() throws  Exception{

        List<student> list = new ArrayList<student>();
        //先获取contection对象
        Connection connection = null;
        //获取真正操作数据的对象
        PreparedStatement pst = null;
        //执行数据库查询操作
        ResultSet rs = null;
        try {
            //加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            //先获取contection对象
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_test","root", "123456");
            //获取真正操作数据的对象
            pst = connection.prepareCall("select * from student");
            //执行数据库查询操作
            rs = pst.executeQuery();
            //把数据库结果集转成java的List集合

            while (rs.next()){
                student items = new student();
                items.setSno(rs.getString("sno"));
                items.setSname(rs.getString("sname"));
                list.add(items);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
