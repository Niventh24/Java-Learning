public class Ex39_Enum {
    enum Level{
        
        BEGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");//contructors with or without paramaters

        private String abb;

        private Level(String abb){
            this.abb=abb;
        }

        public void getAbbrevation(){
            System.out.println(abb);
        }
    }
    public static void main(String[] args) {
        Level l1=Level.BEGINNER;
        Level l2=Level.INTERMEDIATE;
        Level l3=Level.ADVANCED;
        Level l4=Level.valueOf("ADVANCED");
        System.out.println(l4);
        System.out.println(l1);
        l1.getAbbrevation();
        System.out.println(l1.ordinal());//returns index
        //System.out.println(l1.valueOf("B"));
        int result=l2.compareTo(l3);//compares based on rodinal value
        System.out.println(l1.name());//returns name of const in string format
        System.out.println(result);
    }
}
