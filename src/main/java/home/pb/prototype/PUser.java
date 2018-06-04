package home.pb.prototype;

import java.io.*;

public class PUser implements Cloneable,Serializable {

    private static final long serialVersionUID = 4492745984559050217L;

    private String name;

    private int age;

    private boolean girl;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGirl() {
        return girl;
    }

    public void setGirl(boolean girl) {
        this.girl = girl;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PUser clone(){
        PUser PUser = null;
        try {
            PUser = (PUser) super.clone();
            /**
             * 深浅克隆的区别就在这，浅克隆不需要在这添加引用类型的克隆。
             *
             * 深克隆就需要在这加上他的所有引用类型的克隆类。
             */
            Address address = this.address.clone();
            PUser.setAddress(address);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return PUser;
    }

    @Override
    public String toString() {
        return "PUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", girl=" + girl +
                ", address=" + address +
                '}';
    }

    /**
     * IO克隆属于深度克隆
     * @return
     */

    public PUser IoClone(){
        PUser PUser = null;
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;

        PipedInputStream inputStream = null;
        PipedOutputStream outputStream = null;

        try {
            outputStream = new PipedOutputStream();
            inputStream = new PipedInputStream(outputStream);

            objectOutputStream = new ObjectOutputStream(outputStream);
            objectInputStream = new ObjectInputStream(inputStream);

            objectOutputStream.writeObject(this);
            objectOutputStream.flush();

            PUser = (PUser) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(objectInputStream != null){
                    objectInputStream.close();
                }
                if (objectOutputStream != null){
                    objectOutputStream.close();
                }
                if(inputStream != null){
                    inputStream.close();
                }
                if(outputStream != null){
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return PUser;
    }
}

