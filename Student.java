package ObjectCloning_ShallowCopy;

public class Student implements Cloneable {
    int roll;
    String name;
    String address;
    int[] arr;

    public Student(int roll, String name,String address){
        this.roll=roll;
        this.name=name;
        this.address=address;
        this.arr=new int[]{1,2,3,4,5};
    }
//    public Student(Student other){
//        this.roll=other.roll;
//        this.name=other.name;
//        this.address=other.address;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //this is shallow copy
        return super.clone();
    }
}
