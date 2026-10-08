import java.time.temporal.IsoFields;
import java.util.Scanner;
import java.util.Arrays;
import javax.lang.model.util.ElementScanner14;

public class Ahmed_117 {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);


//                    THE PROJECT IS FINISHED BY ENG, AHMED HASHEM

// ===============================================================================================

System.out.println("                   بسم الله الرحمن الرحيم                    ");

System.out.println("===============================================================");
System.out.println("===============================================================");
System.out.println("                       WELCOME HR SYSTEM                       ");
System.out.println("===============================================================");
System.out.println("===============================================================");
// 
String   UserName="ahmed";
        String PassWord = "12345";
        int us = 3;                          // عدد المرات الدخول
        int pa = 3;                            // عدد المرات الدخول
        boolean lo = false;

 while (us > 0 && !lo) {
    System.out.print("Enter username : ");
      String q = input.nextLine();

 if (q.equals(UserName)) {
        while (pa > 0) {
             System.out.print("Enter password : ");
              String w = input.nextLine();
               input.nextLine(); 
        
  if (w.equals(PassWord)) {
        System.out.println(" Login successful! Welcome, " + q + "!");
        lo = true;
        break;
               }
       else {
           pa--;
        System.out.println(" password is wrong! Attempts left: " + pa);
      }
   }
   break;
} 
   else {
      us--;
      System.out.println(" username is wrong! Attempts left: " + us);
   }
}

        if (!lo) {
        System.out.println(" Too many failed attempts.");
        System.out.println("==========================================================");
        System.out.println("                      Exiting program                     ");
        System.out.println("==========================================================");
      
        input.close();
        return;
        }



String str[]=new String[]{"ID","Name","Depertment","Salary","position","Hire Date","Status"};

int id[]=new int[100];
   id[1]=1001;
   id[2]=1002;
   id[3]=1003;
   id[4]=1004;
   id[5]=1005;
   id[6]=1006;
 
String name[]=new String[100];
   name[1]="Ahmed hashem";
   name[2]="Mostafa Amr";
   name[3]="Ahmed Abodef";
   name[4]="Rasad Ahmed";
   name[5]="zaker mohamad";
   name[6]="Adam hashem";
String department[]=new String[100];
   department[1]="IT";
   department[2]="HR";
   department[3]="Markting";
   department[4]="IT ";
   department[5]="HR";
   department[6]="IT";

String salary[]=new String[100];
   salary[1]= "7000.00";
   salary[2]= "8000.00";
   salary[3]= "10000.00";
   salary[4]= "35000.00";
   salary[5]= "40000.00";
   salary[6]= "45000.00"   ;

 String position[]=new String[100];
   position[1]="IT Manager";
   position[2]="HR Manager";
   position[3]="Marting   ";
   position[4]="    VH    ";
   position[5]="    IT    ";
   position[6]="depolep   ";

String hireDate[]=new String[100];
   hireDate[1]="2022-2-13";
   hireDate[2]="2024-8-23";
   hireDate[3]="2023-1-17";
   hireDate[4]="2021-1-9";
   hireDate[5]="2025-9-12";
   hireDate[6]="2021-2-25";
String status[]=new String[100] ;
   status[1]="Active";
   status[2]="Active";
   status[3]="Retired";
   status[4]="Active";                               
   status[5]="Active";
   status[6]="Active";

int xxx=6;          //total Employee now
int hj=1007;         //new ID

while (true){
  
System.out.println("=======================================================");
System.out.println("                       MAIN MENU                       ");
System.out.println("=======================================================");

  System.out.println("1.Add New Employee ");                                        
   System.out.println("2.View All Active Employees");                  
   System.out.println("3.Search Employee by ID");                       
     System.out.println("4.Update Employee Detalis");                      
      System.out.println("5.Change Employee Status (Active/Retired)");      
       System.out.println("6.View Retired Employees");                       
       System.out.println("7.Delete Employee");                              
       System.out.println("8.Exit");                                         
       System.out.print("Choose an option(1-8): ");
   int i=input.nextInt();
   input.nextLine();
   
   
// #######################################################################
// #######################################################################
// #######################################################################

if(i==1){                                //Add New Employee

++xxx;

int g=xxx;

id[g]=hj;
hj++;


    System.out.print("Enter Employee name: ");
       String o=input.nextLine();
         name[g]=o;
   System.out.print("Enter Department: ");
        String p=input.nextLine();
        department[g]=p; 
       System.out.print("Enter Salary: ");
         String a=input.nextLine();
         salary[g]=a;
         System.out.print("Enter Position: ");
         String s=input.nextLine();
       position[g]=s;
       System.out.print("Enter Hire Date (YYYY-MM-DD): ");
      
       String d=input.nextLine();
       hireDate[g]=d;
       
       String f;
       do{
       System.out.print("Enter Employee status (Active/Retired): ");
       f=input.next();
       if(f.equals("Active")&&f.equals("Retired")){
       status[g]=f;
      }
      else {
         System.out.println(" rewrite Status");
      }
      }while(!(f.equals("Active")||f.equals("Retired")));
       System.out.println("Employee added successfully! Emplyee ID:"+id[g]);



       System.out.println("press Enter To  return to the menu... ");
        input.nextLine();
} 

// // ========================================================================================================
// // ========================================================================================================

else if (i==2) {                       //All Active
  
  System.out.println("--- VIEW ALL ACTIVE EMPLOYEES ---");
  System.out.println("============================================================================================================================================");
  System.out.println("============================================================================================================================================");
  System.out.println(str[0]+"\t\t"+str[1]+"\t\t"+str[2]+"\t\t"+str[3]+"\t\t"+str[4]+"\t\t"+str[5]+"\t\t"+str[6]);
  System.out.println("============================================================================================================================================");
  System.out.println("============================================================================================================================================");
  int num=0;
 for (int pp = 1; pp <= xxx ; pp++) {
  if (status[pp] != null && status[pp].equals("Active")) {
  System.out.println(id[pp] + "\t\t" + name[pp] + "\t\t" + department[pp] + "\t\t" +"$"+ salary[pp] + "\t\t" + position[pp] + "\t\t" + hireDate[pp] + "\t\t" + status[pp]);
  num++;
   }
  }
  System.out.println("============================================================================================================================================");
  System.out.println("============================================================================================================================================");
System.out.println("Total Active Employees: "+num);
  System.out.println("============================================================================================================================================");
  System.out.println("============================================================================================================================================");
 

System.out.println("Press Enter to return to the menu...");
input.nextLine();
}
// // ========================================================================================================
// // ========================================================================================================

 else if (i==3) {                       //search Employee

    System.out.println("==============================================");
    System.out.print("Enter the ID of employee:");
         int h=input.nextInt();
         input.nextLine();
         int v=(h-1000);{
    if(v<=xxx){
 System.out.println("==============================================");
       System.out.println("name: "+name[v]);
       System.out.println("department: "+department[v]);
       System.out.println ("salary: $"+salary[v]);
       System.out.println("position: "+position[v]);
       System.out.println("hire date: "+hireDate[v]);
       System.out.println("status: "+status[v]);      
       System.out.println("==============================================");

     System.out.println("press Enter To  return to the menu ");
     input.nextLine();
} 
else{
    System.out.println("the employee not found");
    System.out.println(" ");
    System.out.println("please check the ID,and return");
    System.out.println(" ");
    System.out.println("press Enter To  return to  the menu  ");
      input.nextLine();
  
}}


}
// // ========================================================================================================
// // ========================================================================================================

else if(i==4){                                                     //Update Employee

 System.out.println("==============================================");
        System.out.print("Enter the ID of employee to change:");
        int m=input.nextInt();
        input.nextLine();
        int n=(m-1000);
  if(n<=100){   
        
      System.out.println("("+name[n]+")"+" :Enter new name:");
         String ii=input.nextLine();
         name[n]=ii;     
      System.out.print("("+department[n]+")"+" :Enter new department:");
         String ee=input.nextLine();
         department[n]=ee;      
         System.out.print("("+salary[n]+")"+" :Enter new salary:");
         String rr=input.nextLine();
         salary[n]=rr;
         System.out.print("("+position[n]+")"+" :Enter new position:");
         String tt=input.nextLine();
         position[n]=tt;
      System.out.print("("+hireDate[n]+")"+" :Enter new hire date:");
         String yy=input.nextLine();
         hireDate[n]=yy;
       System.out.print("("+status[n]+")"+" :Enter new status:");
          String uu=input.nextLine();
          status[n]=uu;             
      System.out.println("  ");
       
      System.out.println("The change is succesful !");

      
      System.out.println(" ");
      System.out.println("press Enter To  return to the menu  ");
      input.nextLine();
    }
else{
      System.out.println("the ID not found");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("press Enter To  return to the menu  ");
       input.nextLine();
}
}
// // ========================================================================================================
// // ========================================================================================================

 else if(i==5){                                    //change(Active / Retired) 

     System.out.print("Enter the ID of employee to change:");
       int ss=input.nextInt();
       input.nextLine();
       int mm=(ss-1000);
    
   if(mm<=xxx){  
     System.out.println("Active :Enter 1\nRetired :Enter 2 ");
       int nn=input.nextInt();
       input.nextLine();

   if(nn==1){
        status[mm]="Active";
     System.out.println(name[mm]+"is Active now");
            }
   if(nn==2){
        status[mm]="Retired";
        System.out.println(name[mm]+"is Retired now");
            }
      
    System.out.println("press Enter To return to the menu ");
       input.nextLine();

 }

else{
    System.out.println("the employee not found");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("press Enter To return to the menu ");
      input.nextLine();
 } 
 }
// // ========================================================================================================
// // ========================================================================================================

else if (i==6) {                   //All Retired Employee
    
    System.out.println("--- VIEW ALL RETIRED EMPLOYEES ---");
    System.out.println("============================================================================================================================================");
    System.out.println(str[0]+"\t\t"+str[1]+"\t\t"+str[2]+"\t\t"+str[3]+"\t\t"+str[4]+"\t\t"+str[5]+"\t\t"+str[6]);
    System.out.println("============================================================================================================================================");
      int cc;
      int num2=0;
for( cc=1;cc<=xxx;cc++){
   if(status[cc]!=null&&status[cc].equals("Retired")){
    
    System.out.println(id[cc]+"\t\t"+name[cc]+"\t\t"+department[cc]+"\t\t"+"$"+salary[cc]+"\t\t"+position[cc]+"\t\t"+hireDate[cc]+"\t\t"+status[cc]);
     num2++;
 }
 }

  System.out.println("============================================================================================================================================");
  System.out.println("============================================================================================================================================");
                  System.out.println("Total Retired Employees: "+num2);
  System.out.println("============================================================================================================================================");
  System.out.println("============================================================================================================================================");
 
  System.out.println("press Enter to return to the menu ");
     input.nextLine();
 }

// // ========================================================================================================
// // ========================================================================================================

else if (i==7){                                 //Delete Employee

  System.out.println("Enter the ID of Delete");
     int cv=input.nextInt();
     input.nextLine();
     int bn=(cv-1000);
  System.out.print("Enter ( 1 ) to delete Array: ");
     int mn=input.nextInt();

if(mn==1){
     name[bn]=null;
    department[bn]=null;
    salary[bn]=null;
    position[bn]=null;
    hireDate[bn]=null;
    status[bn]=null;

  System.out.println("     Array is delete ");
  
  
 }
else{
  System.out.println("you not Delete");
  System.out.println("press Enter to  return to the menu ");
     input.nextLine();
 }
 System.out.println("press Enter To  return to the menu ");
input.nextLine();
}
// // ========================================================================================================
// // ========================================================================================================

else if(i==8){
    System.out.println("============================================");
    System.out.println("============================================");
    System.out.println("            we finish to program            ");
    System.out.println("============================================");
    System.out.println("============================================");
      break;
  
  }


// // ========================================================================================================
// // ========================================================================================================

// THE PROJECT IS FINISHED BY ENG, AHMED HASHEM

 }             

 }}