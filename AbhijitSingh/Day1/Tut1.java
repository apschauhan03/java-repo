
public class Tut1{
    public static void main(String[] args){
        //Variable Declaration
        int age = 23;
        float weight = 60.5f;
        boolean isJavaFun = true;
        char oneChar = 'A';
        String name = "Abhijit Singh";
        String[] hobbies = {"swimming","badminton","cricket"};

        //Condition Cheaking
        if(age>=18&&isJavaFun&&weight>50)
        {
           System.out.println(name+' '+oneChar);
           for(int i = 0;i<hobbies.length;i++)
           {
                System.out.println(hobbies[i]);
           }

        }

    }
}