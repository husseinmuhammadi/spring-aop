# Spring AOP

## 1. What is Spring AOP?
Spring AOP enables Aspect-Oriented Programming in spring applications. In AOP, aspects enable the modularization of concerns such as transaction management, logging or security that cut across multiple types and objects (often termed **crosscutting concerns**).

AOP provides the way to dynamically add the cross-cutting concern before, after or around the actual logic using simple pluggable configurations. It makes easy to maintain code in the present and future as well. You can add/remove concerns without recompiling complete sourcecode simply by changing configuration files (if you are applying aspects suing XML configuration).

## 2. What is advice, joinpoint or pointcut?
1. An important term in AOP is advice. It is the action taken by an aspect at a particular join-point.
2. Joinpoint is a point of execution of the program, such as the execution of a method or the handling of an exception. In Spring AOP, a joinpoint always represents a method execution.
3. Pointcut is a predicate or expression that matches join points.
4. Advice is associated with a pointcut expression and runs at any join point matched by the pointcut.
5. Spring uses the AspectJ pointcut expression language by default.