package me.es359.Project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by ES359 on 11/26/14.
 */
public class ThisSQL
{

    public Connection connection;

    public ThisSQL(String ip, String userName, String access, String db) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + db + "?user=" + userName + "&password=" + access);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
