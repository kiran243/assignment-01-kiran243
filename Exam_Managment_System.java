/**
*     Name: Kiran Ahmad
*     Reg:cs120192103
*     Semester : 2nd 'B'
*     program : BSCS 
*/




public class Exam_Managment_System {

    
    public static void main(String[] args) {
     paper k = new paper("Computer Science",243,"CS103","Sir Ali Zeb",2,"BSCS","Final","Ma'am Kiran","Ground Floor Hall 2",50, false , new date(3,3,2020), new time(2,30,00) );
     paper ki = new paper("Study Skill",243,"CS104","Ma'am Nadia",2,"BSCS","Final","Ma'am palwasha","Ground Floor Hall 3",50, false , new date(3,3,2020), new time(2,30,00) );
     paper kir = new paper("Discret math",243,"CS105","Ma'am sana",2,"BSCS","Final","Ma'am Zeenata","Ground Floor Hall 5",50, false , new date(3,3,2020), new time(2,30,00) );
     paper kira = new paper("Islamyat",243,"CS106","Ma'am amin",2,"BSCS","Final","Ma'am Gulbano","Ground Floor Hall 6",50, false , new date(3,3,2020), new time(2,30,00) );
     paper kiran = new paper("Pakitan Study",243,"CS107","Ma'am shabnam",2,"BSCS","Final","Ma'am  Shabano","Ground Floor Hall 7",50, false , new date(3,3,2020), new time(2,30,00) );
    
     System.out.println(k.toString()+new course("BSCS" , 243 , " Computer Science "));
     System.out.println(ki.toString()+new course("BSCS" , 243 , " Study Skill "));
     System.out.println(kir.toString()+new course("BSCS" , 543 , " Discret math "));
     System.out.println(kira.toString()+new course("BSCS" , 343 , " Islamyat "));
     System.out.println(kiran.toString()+new course("BSCS" , 241 , " Pakitan Study "));
    }
    
}
