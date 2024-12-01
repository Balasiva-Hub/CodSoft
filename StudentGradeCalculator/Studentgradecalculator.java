import java.util.Scanner;
class Studentgradecalculator
{
    public static void main(String args[])
    {
        Scanner sgc = new Scanner(System.in);
        System.out.println("\n*****Student Grade Calculator*****");
        System.out.println("Enter No. of Subjects :");
        int nos = sgc.nextInt();
        int total = 0;
        for(int i=0;i<nos;i++)
        {
            System.out.println("Enter marks obtained in Subject "+(i+1)+": ");
            int marks = sgc.nextInt();
            total+=marks;
        }
        float avg = (float)total/nos;
        String Grade;
        if(avg>=90f){
            Grade ="A+";
        }
        else if(avg>=85f)
        {
            Grade="A";
        }
        else if(avg>=80f)
        {
            Grade="B+";
        }
        else if(avg>=75f)
        {
            Grade="B";
        }
        else if(avg>=70f)
        {
            Grade="C+";
        }
        else if(avg>=65f)
        {
            Grade="C";
        }
        else if(avg>=60f)
        {
            Grade="D+";
        }
        else if(avg>=50f)
        {
            Grade="D";
        }
        else if(avg>=40f)
        {
            Grade="E";
        }
        else{
            Grade="Fail";
        }
        System.out.println("\nTotal Marks Scored :"+total);
        System.out.println("\nAverage Percentage :"+avg+"%");
        System.out.println("Grade :"+Grade);
    }
}
        