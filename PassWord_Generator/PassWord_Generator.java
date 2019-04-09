import java.util.*;


class Number{
  String Numbers = "1234567890";
}

class Lower{
  String Lower_case = "qwertyuiopasdfghjklzxcvbnm";
}

class Upper{
  String Upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
}

class Special{
  String Special_char = "!@#$%^&*()_-+='/";
}

class PassWord_Generator{

  Number number1 = new Number();
  Lower lower1 = new Lower();
  Upper upper1 = new Upper();
  Special special1 = new Special();

   private int length = 0;  // password length
   private int choice = 0;  // whi type  of password you want

   PassWord_Generator(int length,int choice){
     this.length = length;
     this.choice = choice;
   }

   PassWord_Generator(){
     this.length = 8;
     this.choice = 4;
   }

  String getpassword(){   //main PassWord_Generator method
    Random rand = new Random();
    int random = 0;
    //String string1 = number1.Numbers.concat(lower1.Lower_case).concat(upper1.Upper_case).concat(special1.Special_char);
    String string1 = number1.Numbers;
    String string2 = lower1.Lower_case;
    String string3 = upper1.Upper_case;
    String string4 = special1.Special_char;
    String pass = "";
    switch(choice){   // each case sor different type of password
      case 1 :
          while(true){
              random = rand.nextInt(10);
              pass = pass.concat(string1.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }
          }
        break;
      case 2 :
          while(true){
              random = rand.nextInt(100000)/10000;
              pass = pass.concat(string1.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }
              random = rand.nextInt(260000)/10000;
              pass = pass.concat(string2.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }
          }
        break;
      case 3 :
          while(true){
              random = rand.nextInt(100000)/10000;
              pass = pass.concat(string1.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }
              random = rand.nextInt(260000)/10000;
              pass = pass.concat(string2.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }
              random = rand.nextInt(260000)/10000;
              pass = pass.concat(string3.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }
          }
        break;
      case 4 :
          HashSet<String> h = new HashSet<String>();
          while(true){
              random = rand.nextInt(100000)/10000;
              while(h.contains(string1.substring(random, random+1))){
                  random = rand.nextInt(100000)/10000;
              }
              h.add(string1.substring(random, random+1));
              pass = pass.concat(string1.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }

              random = rand.nextInt(260000)/10000;
              while(h.contains(string2.substring(random, random+1))){
                  random = rand.nextInt(260000)/10000;
              }
              h.add(string2.substring(random, random+1));
              pass = pass.concat(string2.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }

              random = rand.nextInt(260000)/10000;
              while(h.contains(string3.substring(random, random+1))){
                  random = rand.nextInt(260000)/10000;
              }
              h.add(string3.substring(random, random+1));
              pass = pass.concat(string3.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }

              random = rand.nextInt(160000)/10000;
              while(h.contains(string4.substring(random, random+1))){
                  random = rand.nextInt(160000)/10000;
              }
              h.add(string4.substring(random, random+1));
              pass = pass.concat(string4.substring(random,random+1));
              if(pass.length() >= length){
                break;
              }
          }
        break;
      default :
        System.out.print("Sorry Somethig went wrong ");
        System.exit(0);
    }
      // String mainpassword = "";
      // int[] index = new int[length];
      // for(int i = 0 ; i < length ; i++ ){
      //    index[i] = i;
      // }
      //
      // for(int j = 0 ; j < length ; j++){
      //
      //     mainpassword = mainpassword.concat(pass.substring(index[j],index[j+1]));
      // }
      // return mainpassword;
      String temppassword[] = new String[pass.length()];   //after generate password we are suffle password
      for(int p = 0 ; p < pass.length() ; p++ ){
        temppassword[p] = pass.substring(p,p+1);
      }
      String mainpassword = new String();

      ArrayList<Integer> arrayList = new ArrayList<Integer>();      // most intresting

      while (arrayList.size() < pass.length()) { // how many numbers u need - it will 6
        int a = rand.nextInt(pass.length()); // this will give numbers between 1 and 50.

        if (!arrayList.contains(a)) {
            arrayList.add(a);
            mainpassword = mainpassword.concat(temppassword[a]);
        }
    }


      //
      // for(int f = 0 ; f < pass.length() ; f++){
      //   random = rand.nextInt(pass.length()*100000)/100000;
      //   mainpassword = mainpassword.concat(temppassword[random]);
      // }
      return mainpassword;
  }

  public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter length of your pasword :");
      int length = sc.nextInt();
      System.out.println("Which type of password you want : ");
      System.out.println("1) Eassy-[Numbers] ");
      System.out.println("2) Simple-[Numbers,Lower_case]");
      System.out.println("3) Moderate-[Numbers,Lower_case,Upper_case]");
      System.out.println("4) Advance-[Numbers,Lower_case,Upper_case,Special_char]");
      int choice = sc.nextInt();

      PassWord_Generator p1 = new PassWord_Generator(length,choice);
      String Password1 = p1.getpassword();
      System.out.print("your password is :"+ Password1 );   // you got your password
      }
  }
