    class Student{
        private int age;
        private String name;
        public void setAge(int age){
            this.age=age;
        }
        public int getAge(){
        return age;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }

    }
    public class Encapsulation3 {
        public static void main(String[] args){
            Student obj = new Student();
            Student obj1 = new Student();
            obj.setAge(18);
            obj.setName("Annkit");
            obj1.setAge(21);
            obj1.setName("Aryan");
            int stud1Age=obj1.getAge();
            System.out.println(stud1Age);

            


        }
        
    }
