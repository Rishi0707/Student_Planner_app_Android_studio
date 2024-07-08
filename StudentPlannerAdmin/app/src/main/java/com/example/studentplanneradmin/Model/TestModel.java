package com.example.studentplanneradmin.Model;

public class TestModel {
    private String testname,key;
    int setNum;

    public TestModel(String testname, String key, int setNum) {
        this.testname = testname;
        this.key = key;
        this.setNum = setNum;
    }

    public TestModel() {
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getSetNum() {
        return setNum;
    }

    public void setSetNum(int setNum) {
        this.setNum = setNum;
    }
}
