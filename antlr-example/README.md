
## antlr4安装

#### UNIX环境

* Install Java (version 1.6 or higher)
* Download
```
$ cd /usr/local/lib
$ curl -O https://www.antlr.org/download/antlr-4.7.1-complete.jar
```
* Add antlr-4.7.1-complete.jar to your CLASSPATH:
```$xslt
$ export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
```
* Create aliases for the ANTLR Tool, and TestRig.
```$xslt
$ alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
$ alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
```

### A First Example

* In a temporary directory, put the following grammar inside file Hello.g4: Hello.g4
```$xslt
// Define a grammar called Hello
grammar Hello;
r  : 'hello' ID ;         // match keyword hello followed by an identifier
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
```

* Then run ANTLR the tool on it:
```$xslt
$ cd /tmp
$ antlr4 Hello.g4
$ javac Hello*.java
```

* Now test it:
```$xslt
$ grun Hello r -tree
(Now enter something like the string below)
hello parrt
(now,do:)
^D
(The output:)
(r hello parrt)
(That ^D means EOF on unix; it's ^Z in Windows.) The -tree option prints the parse tree in LISP notation.
It's nicer to look at parse trees visually.
$ grun Hello r -gui
hello parrt
^D
```