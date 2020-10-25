package jdbc.models;

import jdbc.daos.CourseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private Integer id;
    private String title;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Course() {    }
    public Course(Integer id, String title) {
        this.id = id;
        this.title = title;
    }
    public String toString() {
        return id + ", " + title;
    }


}
