package com.dianping.gladio.dao;

/**
 * Created with IntelliJ IDEA.
 * User: pieux
 * Date: 13-5-30
 * Time: 下午1:16
 * To change this template use File | Settings | File Templates.
 */

public class UserDao {

    private int id;
    private String name;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String toString() {
        return "id: " + id + "name: " + name;
    }
}
