import java.util.Scanner;

class user{
  String Name;
  String Middle;
  String Last;
  String BirthDateMonth;
  String BirthDateYear;
  String BirthDateDay;
  String Charactor;

  user(String NameString,String BirthDate,String Charactor){
      String[] sp = NameString.split(" ");
      this.Name = sp[0];
      this.Middle = sp[1];
      this.Last = sp[2];
      this.BirthDateDay = BirthDate.substring(0,2);
      this.BirthDateYear = BirthDate.substring(6,10);
      this.BirthDateMonth = BirthDate.substring(3,5);
      this.Charactor = Charactor;
  }
}

public class UserNameGenerator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Full Name (FirstName MiddleName LastName {separate by Space}) : ");
    String NameString = sc.nextLine();
    System.out.print("Enter your BirthDate(DD-MM-YYYY) :");
    String BirthDate = sc.nextLine();
    System.out.print("Enter favorite special charactor :");
    String Charactor = sc.nextLine();

    user U1 = new user(NameString,BirthDate,Charactor);
    String[] Uname = new String[16];
    Uname[0] = U1.Name.concat(U1.Middle).concat(U1.Last);
    Uname[1] = U1.Name.concat("_").concat(U1.Middle).concat("_").concat(U1.Last);
    Uname[2] = U1.Name.concat(".").concat(U1.Middle).concat(".").concat(U1.Last);
    Uname[3] = U1.Name.concat(U1.Middle);
    Uname[4] = U1.Name.concat(U1.Middle).concat(U1.BirthDateYear.substring(2,4));
    Uname[5] = U1.Name.concat("_").concat(U1.Middle).concat("_").concat(U1.BirthDateYear.substring(2,4));
    Uname[6] = U1.Name.concat(U1.Charactor).concat(U1.Middle).concat(U1.Charactor).concat(U1.BirthDateYear.substring(2,4));
    Uname[7] = U1.Name.concat(U1.Charactor).concat(U1.BirthDateYear);
    Uname[8] = U1.Name.concat("_").concat(U1.BirthDateYear);
    Uname[9] = U1.Name.substring(0,1).concat(U1.Last.substring(0,1)).concat("_").concat(U1.Last);
    Uname[10] = U1.Name.substring(0,1).concat(U1.Last.substring(0,1)).concat(U1.Charactor).concat(U1.Last);
    Uname[11] = U1.Name.substring(0,1).concat(U1.Last.substring(0,1)).concat("_").concat(U1.BirthDateMonth);
    Uname[12] = U1.Name.concat("_").concat(U1.BirthDateYear);
    Uname[13] = U1.Name.concat("_").concat(U1.BirthDateDay);
    Uname[14] = U1.Name.concat("_").concat(U1.BirthDateMonth);
    Uname[15] = U1.Name.substring(0,1).concat(U1.Last.substring(0,1)).concat("_").concat(U1.BirthDateYear);
     for(int i = 0 ; i < 16 ; i++){
       System.out.println(Uname[i]);
     }
  }
}
