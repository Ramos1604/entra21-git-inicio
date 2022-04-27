public class Treinamento {



       public static void main(String[] args) {
              treinamento01();
       }

       public static void treinamento01() {
              int varA = 10;
              int varB = 20;
              int varC = varA;
              varA = varB;
              varB = varC;
              System.out.println(varA);
              System.out.println(varB);
       }

}


