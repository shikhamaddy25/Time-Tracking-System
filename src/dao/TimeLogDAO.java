package dao;

import model.TimeLog;
import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TimeLogDAO {
    public void addTimeLog(TimeLog log) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps =
                con.prepareStatement("INSERT INTO timelogs VALUES (?,?,?,?,?)");
        ps.setInt(1, log.getUserId());
        ps.setInt(2, log.getUserId());
        ps.setString(3, log.getDate());
        ps.setInt(4, log.getHours());
        ps.setString(5, log.getTask());
        ps.executeUpdate();
    }
}
