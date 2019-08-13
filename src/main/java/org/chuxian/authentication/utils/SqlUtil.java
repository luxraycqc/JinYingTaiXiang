package org.chuxian.authentication.utils;

import cn.hutool.db.Entity;
import cn.hutool.db.handler.EntityHandler;
import cn.hutool.db.handler.EntityListHandler;
import cn.hutool.db.sql.SqlExecutor;

import java.sql.Connection;
import java.util.List;

public class SqlUtil {
    public static int execute(Connection connection, String sql, Object... params) throws Exception {
        return SqlExecutor.execute(connection, sql, params);
    }

    public static Entity queryOne(Connection connection, String sql, Object... params) throws Exception {
        return SqlExecutor.query(connection, sql, EntityHandler.create(), params);
    }

    public static List<Entity> query(Connection connection, String sql, Object... params) throws Exception {
        return SqlExecutor.query(connection, sql, EntityListHandler.create(), params);
    }
}
