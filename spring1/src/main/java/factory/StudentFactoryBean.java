package factory;

import org.springframework.beans.factory.FactoryBean;
import pojo.Student;

public class StudentFactoryBean implements FactoryBean<Student> {

    @Override
    public Student getObject() throws Exception {
        return new Student();
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
