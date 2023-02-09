#java -cp antlr-4.4-complete.jar org.antlr.v4.Tool Mu.g4 -visitor
#javac -cp antlr-4.4-complete.jar *.java
#java -cp .;antlr-4.4-complete.jar Main

#program for counting even and odd numbers
n AS 0;
counteven AS 0;
countodd AS 0;

habang n LT 9 {
  kung n MOD 2 EQ 0 {
    counteven AS counteven + 1;
  } pagiba {
    countodd AS countodd + 1;
  }

  n AS n + 1;
}

ilimbag "Even numbers: " + counteven;
ilimbag "Odd numbers: " + countodd;