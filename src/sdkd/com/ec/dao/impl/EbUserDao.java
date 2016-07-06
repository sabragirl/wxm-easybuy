package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbUser;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户DAO
 * Created by 王晓敏 on 2016/7/5.
 */
public class EbUserDao extends BaseDao {

/*
    public List<EbUser> getUserPassword(){
        List<EbUser> newsList = new ArrayList<EbUser>();
        String sql = "select easybuy_password from easybuy_user where eb_user_name=(?)";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EbUser user = new EbUser();
                user.setEuUserId(rs.getInt("eu_user_id"));
                user.setEuUserName(rs.getString("eu_user_name"));
                user.setEuPassword(rs.getString("eu_password"));
                user.setEuSex(rs.getString("eu_sex"));
                user.setEuBirthday(rs.getString("eu_birthday"));
                user.setEuIdentityCode(rs.getString("eu_identity_code"));
                user.setEuEmail(rs.getString("eu_email"));
                user.setEuMobile(rs.getInt("eu_mobile"));
                user.setEuAddress(rs.getString("eu_address"));
                user.setEuStatus(rs.getInt("eu_status"));

                //添加到集合中
                newsList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newsList;
    }
    */
    /*
    public static void testAdd(){
        //JDBC的步骤
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.桥梁--Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.210.228:3306/easybuy","root","root");
            //3.CRUD
            String sql = "insert into easybuy_user(eu_user_name) values('陈浩')";
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println(result);
            //sout+Tab
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void testUpdate(){
        //JDBC的步骤
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.桥梁--Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.210.228:3306/easybuy","root","root");
            //3.CRUD
            String sql = "update easybuy_user set eu_user_name = '陈浩南' where eu_user_id = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println(result);
            //sout+Tab
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testDelete(){
        //JDBC的步骤
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.桥梁--Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.210.228:3306/easybuy","root","root");
            //3.CRUD
            String sql = "delete from easybuy_user where eu_user_id = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println(result);
            //sout+Tab
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testQuery(){
        //JDBC的步骤
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.桥梁--Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.210.210:3306/easybuy","root","root");
            //3.CRUD
            String sql = "select * from easybuy_user";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("eu_user_name");
                System.out.println("name："+name);
            }
            //sout+Tab
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
*/
    public static void main(String[] args) {
//        test();
//        testUpdate();
//        testDelete();
        //testQuery();
    }

    public List<EbUser> getUserInfo(){
        List<EbUser> newsList = new ArrayList<EbUser>();
        String sql = "select * from easybuy_user order by eu_user_id";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EbUser user = new EbUser();
                user.setEuUserId(rs.getInt("eu_user_id"));
                user.setEuUserName(rs.getString("eu_user_name"));
                user.setEuPassword(rs.getString("eu_password"));
                user.setEuSex(rs.getString("eu_sex"));
                user.setEuBirthday(rs.getString("eu_birthday"));
                user.setEuIdentityCode(rs.getString("eu_identity_code"));
                user.setEuEmail(rs.getString("eu_email"));
                user.setEuMobile(rs.getInt("eu_mobile"));
                user.setEuAddress(rs.getString("eu_address"));
                user.setEuStatus(rs.getInt("eu_status"));

                //添加到集合中
                newsList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newsList;
    }
}
