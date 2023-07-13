grammar c;

program: (preprocessorDirective | declaration)* ;

preprocessorDirective: '#' Identifier ;

declaration: variableDeclaration
           | functionDeclaration
           ;

variableDeclaration: typeSpecifier ID ';' ;

typeSpecifier: 'int'
             | 'float'
             | 'char'
             | 'double'
             | 'long'
             | Identifier
             ;

functionDeclaration: typeSpecifier ID '(' parameterList? ')' compoundStatement ;

parameterList: parameter (',' parameter)* ;

parameter: typeSpecifier ID ;

compoundStatement: '{' statement* '}' ;

statement: compoundStatement
         | expressionStatement
         | selectionStatement
         | iterationStatement
         | jumpStatement
         ;

expressionStatement: expression? ';' ;

selectionStatement: 'if' '(' expression ')' statement ('else' statement)? ;

iterationStatement: 'while' '(' expression ')' statement ;

jumpStatement: 'return' expression? ';' ;

expression: assignmentExpression ;

assignmentExpression: logicalOrExpression (assignmentOperator assignmentExpression)? ;

logicalOrExpression: logicalAndExpression ('||' logicalAndExpression)* ;

logicalAndExpression: equalityExpression ('&&' equalityExpression)* ;

equalityExpression: relationalExpression (('==' | '!=') relationalExpression)* ;

relationalExpression: additiveExpression (('<' | '>' | '<=' | '>=') additiveExpression)* ;

additiveExpression: multiplicativeExpression (('+' | '-') multiplicativeExpression)* ;

multiplicativeExpression: unaryExpression (('*' | '/' | '%') unaryExpression)* ;

unaryExpression: ('+' | '-' | '!') unaryExpression
               | primaryExpression
               ;

primaryExpression: ID
                 | NUMBER
                 | '(' expression ')'
                 | functionCall
                 ;

functionCall: ID '(' argumentList? ')' ;

argumentList: expression (',' expression)* ;

assignmentOperator: '=' ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;

NUMBER: [0-9]+ ('.' [0-9]+)?;

Identifier: '#'? [a-zA-Z_][a-zA-Z0-9_]* ;

WS: [ \t\r\n]+ -> skip ;
