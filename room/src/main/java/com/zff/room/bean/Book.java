package com.zff.room.bean;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.room.bean
 * @ClassName: Book
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2019/6/5 16:31
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/5 16:31
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Entity(foreignKeys = @ForeignKey(entity = User.class,parentColumns = "uid",childColumns = "user_id"))
public class Book {
    @PrimaryKey
    private int bookId;
    private String title;
    @ColumnInfo(name = "user_id")
    private int userId;

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
