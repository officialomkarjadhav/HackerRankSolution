import java.util.List;
import java.util.stream.Collectors;

class grading{
 
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
    
    List <Integer> round=grades.stream().map(e->((e+4)/5)*5).collect(Collectors.toList());
    
     for(int i=0;i<round.size();i++){
         if(round.get(i)-grades.get(i)==3){
             round.set(i, grades.get(i));
         }
         if(round.get(i)<40){
             round.set(i, grades.get(i));
         }
         
     }
      
    return round;
        }
}