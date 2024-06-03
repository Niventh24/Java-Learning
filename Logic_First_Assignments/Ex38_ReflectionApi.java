import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class Ex38_ReflectionApi {
    public static void main(String[] args) {
        try{//to print all public methods-no private methods are printed
            Example eg=new Example();
            Class<?> cls=eg.getClass();
            Method[] meth=cls.getMethods();//get public methods
            for(Method m:meth){
                System.out.println(m.getName());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{//to print declared methods-even private methods are displayed
            Example eg=new Example("Niventh",24);
            Class<?> cls=eg.getClass();
            Method[] meth=cls.getDeclaredMethods();//get all methods including private methods
            for(Method m:meth){
                System.out.println(m.getName());
            }
            Method meth1=cls.getDeclaredMethod("tes2", String.class);//give null if meth has no arhs or give datatypes with.class suffic(eg:int.class)
            //meth1.invoke(meth1, null);//cannot invoke private method(access flag is false)-will get error
            meth1.setAccessible(true);//changing access type
            meth1.invoke(eg, "hello ");//can invoke private method now-give the value of data type or leave as empty(give instance of class to invoke)
            System.out.println(eg.getName());//-can even change the values of private var with private methods
            Method[] meths=cls.getDeclaredMethods();
            meths[0].setAccessible(true);//can access via array
        }
        catch(Exception e){
            System.out.println(e);
        }
    try{//to print all public and private constructors
            Example eg=new Example("Aksh",24);
            Class<?> cls=eg.getClass();
            Constructor<?>[] constructor=cls.getConstructors();//get public constructors
            for(Constructor<?> c:constructor){
                System.out.println(c.getName());
            }
            Constructor<?>[] privateConstructor=cls.getDeclaredConstructors(); 
            for(Constructor<?> c1:privateConstructor){
                System.out.println(c1.getName());
            }
            privateConstructor[0].setAccessible(true);//now even private constructors are accessible
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    try{//to print all public methods-no private methods are printed
            Example eg=new Example("Akash",24);
            Class<?> cls=eg.getClass();
            Field[] field=cls.getFields();//get public methods
            for(Field f:field){
                System.out.println(f.getName());//print all public fields 
            }
            Field[] field2=cls.getDeclaredFields();//get all fields
            for(Field f:field2){
                System.out.println(f.getName());//print all  fields 
            }
            Field field3=cls.getDeclaredField("name");
            field3.setAccessible(true);
            System.out.println((String)field3.get(eg));//value before changing
            field3.set(eg, "old name is modified");//setting new value
            System.out.println((String)field3.get(eg));//printing new value
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
@SuppressWarnings("unused")
class Example{
    private int number;
    private String name;
    public int input;

    public Example(String name,int number){
        this.name=name;
        this.number=number;
        System.out.println("Default constructor with paramaters");
    }

    public Example(){
        System.out.println("Default constructor public");
    }

    private Example(String name){
        System.out.println("Default constructor private");
    }

    private Example(int number){
        System.out.println("Default constructor private with paramaters");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private void tes1(){
        System.out.println("test1 is being displayed");
    }
    
    private String tes2(String name){
        this.name=name;
        System.out.println("test2 is being displayed "+name);
        return name;
    }
   
    private void tes3(){
        System.out.println("test3 is being displayed");
    }
    
    private void tes4(){
        System.out.println("test4 is being displayed");
    }
}
