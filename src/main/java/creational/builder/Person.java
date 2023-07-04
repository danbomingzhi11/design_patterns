package creational.builder;

public class Person {
    // 姓名(必填)
    private String name;
    // 性别(必填)
    private int sex;
    // 年龄(必填)
    private Integer age;
    // 兴趣(非必填)
    private String interest;
    // 头像(非必填)
    private String face;
    // 地址(非必填)
    private String address;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.sex = personBuilder.sex;
        this.age = personBuilder.age;
        this.interest = personBuilder.interest;
        this.face = personBuilder.face;
        this.address = personBuilder.address;
    }

    public static class PersonBuilder {
        // 姓名(必填)
        private String name;
        // 性别(必填)
        private int sex;
        // 年龄(必填)
        private Integer age;
        // 兴趣(非必填)
        private String interest;
        // 头像(非必填)
        private String face;
        // 地址(非必填)
        private String address;

        public PersonBuilder() {
        }
        public PersonBuilder setInterest(String interest) {
            this.interest = interest;
            return this;
        }

        public PersonBuilder setFace(String face) {
            this.face = face;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSex(int sex) {
            this.sex = sex;
            return this;
        }

        public PersonBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }


    public String getInterest() {
        return interest;
    }

    public String getFace() {
        return face;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }
}
