package com.example.serializationdemo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class User2 implements Parcelable {



    private String id;
    private String name;

    User2(){}


    /**
     * 从序列化结构中新建对象
     */
    protected User2(Parcel in) {
        id = in.readString();
        name = in.readString();
    }

    /**
     * 负责将序列化后的数据再反序列化，得到原先的数据
     */
    public static final Creator<User2> CREATOR = new Creator<User2>() {
        @Override
        public User2 createFromParcel(Parcel in) {
            return new User2(in);
        }

        @Override
        public User2[] newArray(int size) {
            return new User2[size];
        }
    };

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * 当前对象的描述，一般都是return 0，有特殊需要的时候才返回别的值
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * 将当前对象写入序列化结构
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
    }
}
