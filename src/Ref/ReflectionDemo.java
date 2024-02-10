package Ref;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IOException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class empClass = Class.forName("Ref.Reflection");
        Constructor constructor = empClass.getConstructor(String.class,String.class,int.class);
        Object object = constructor.newInstance("Ramiz","IT",4);
        System.out.println(object);
        Method method = empClass.getMethod("setSalary", double.class);
        method.invoke(object,808.88);
        System.out.println(object);
//








//        Class empClass = Class.forName("Ref.Reflection");
//
//        Field f = empInfo.getField("salary");
//        System.out.println(f.getType());

//        Field[] fields = empInfo.getFields();
//        for (Field f : fields){
//            System.out.println(f.getType() + " " +  f.getName());
//        Field f = empInfo.getDeclaredField("salary");
//        System.out.println(f);
//        Field[] fields = empInfo.getDeclaredFields();
//        for (Field f : fields){
//            System.out.println(f.getType() + " - " + f.getName() );
//        }
//        Method method = empInfo.getMethod("chanceId",int.class);
//        System.out.println(method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));
//        Method method = empInfo.getMethod("salaryMultiplyTwo",double.class);
//        System.out.println(method.getReturnType() +" " + Arrays.toString(method.getParameterTypes()));
//        Method[] methods = empInfo.getDeclaredMethods();
//        for (Method m : methods){
//            System.out.println(m.getReturnType() + " " + Arrays.toString(m.getParameterTypes()));
//        }
//        Method [] methods = empInfo.getDeclaredMethods();
//        for (Method m : methods){
//            if(Modifier.isPublic(m.getModifiers())){
//                System.out.println(m.getName() + " " + m.getReturnType() + " " + Arrays.toString(m.getParameterTypes()));
//            }
//        }
//        Constructor[] constructors = empInfo.getConstructors();
//        for (Constructor c : constructors) {
//            System.out.println(c);
//        }
//        String s = "privet kak dela normalno poka";
//        Writer writer = null;
//        try {
//            writer = new FileWriter("test.txt");
//            for (int i = 0; i < s.length(); i++) {
//                writer.write(s.charAt(i));
//            }
//            System.out.println("done");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            writer.close();
//        }




    }



}

