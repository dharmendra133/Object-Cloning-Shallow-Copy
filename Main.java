package ObjectCloning_ShallowCopy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student(1,"Dharmendra","Mirchaiya");

        Student s3=(Student) s1.clone();
        System.out.println(Arrays.toString(s3.arr));
        s3.arr[0]=12;
        System.out.println(Arrays.toString(s1.arr));


    }
}
