package pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student implements Person{
    private Integer sid;

    private String sName;

    private Integer age;

    private String gender;

    private Class aClass;

    private Clazz clazz;

    private List<Class> list;

    private Map<String, Clazz> map;

    private String[] array;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", aClass=" + aClass +
                ", clazz=" + clazz +
                ", list=" + list +
                ", map=" + map +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public List<Class> getList() {
        return list;
    }

    public void setList(List<Class> list) {
        this.list = list;
    }

    public Map<String, Clazz> getMap() {
        return map;
    }

    public void setMap(Map<String, Clazz> map) {
        this.map = map;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Student(Integer sid, String sName, Integer age, String gender, Class aClass, Clazz clazz, List<Class> list, Map<String, Clazz> map, String[] array) {
        this.sid = sid;
        this.sName = sName;
        this.age = age;
        this.gender = gender;
        this.aClass = aClass;
        this.clazz = clazz;
        this.list = list;
        this.map = map;
        this.array = array;
    }

    public Student() {
    }
}
