package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbNotices;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangGejin on 2016/7/6.
 */
public class EbNoticesDao extends BaseDao{
    public List<EbNotices> getNotices(){
        List<EbNotices> noticesList = new ArrayList<EbNotices>();
        String sql = "select * from easybuy_notices order by en_create_time desc limit 0,7";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EbNotices notices = new EbNotices();
                notices.setEnId(rs.getInt("en_id"));
                notices.setEnTitle(rs.getString("en_title"));
                //添加到集合中
                noticesList.add(notices);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return noticesList;
    }
}
