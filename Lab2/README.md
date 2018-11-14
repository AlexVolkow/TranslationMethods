# Лабораторная работа №2. Вариант 7.
Описание заголовка функции в Паскале

# Построим грамматику

* `S -> FUN NAME (ARGS) RETTYPE`
* `S -> FUN NAME RETTYPE`
* `S -> PROC NAME (ARGS)`
* `S -> PROC NAME`
* `FUN -> function`
* `PROC -> procedure`
* `RETTYPE -> : NAME`
* `ARGS -> ARGLIST : NAME ARGSPLIT | eps`
* `ARGLIST -> ARGLIST, NAME`
* `ARGLIST -> NAME`
* `ARGSPLIT -> ; ARGS | eps`
* `NAME -> [a-zA-Z]{1}[a-zA-Z0-9]*`

## Описание 

Нетерминал    | Значение
------------- | -------------
S  | Описание заголовка функции в Паскале
FUN | Ключевое слово function
PROC | Ключевое слово procedure
RETTYPE | Тип возвращаемого значения
ARGS | Описание аргументов функции
ARGSPLIT | Разделитель между группами аргументов
ARGLIST | Список аргументов, разделенных запятыми
NAME | Имя переменной или типа


## Устранение левой рекурсии

* `S -> FUN NAME (ARGS) RETTYPE`
* `S -> FUN NAME RETTYPE`
* `S -> PROC NAME (ARGS)`
* `S -> PROC NAME`
* `FUN -> function`
* `PROC -> procedure`
* `RETTYPE -> : NAME | eps`
* `ARGS -> ARGLIST : NAME ARGSPLIT | eps`
* `ARGLIST -> NAME ARGLIST' | NAME`
* `ARGLIST' -> , NAME ARGLIST' | , NAME`
* `ARGSPLIT -> ; ARGS | eps`
* `NAME -> [a-zA-Z]{1}[a-zA-Z0-9]*`

Нетерминал    | Значение
------------- | -------------
S  | Описание заголовка функции в Паскале
FUN | Ключевое слово function
PROC | Ключевое слово procedure
RETTYPE | Тип возвращаемого значения
ARGS | Описание аргументов функции
ARGSPLIT | Разделитель между группами аргументов
ARGLIST | Список аргументов, разделенных запятыми
ARGLIST' | Продолжение списка аргументов
NAME | Имя переменной или типа


## Множества FIRST и FOLLOW для нетерминалов

`ch` - символ из [a-zA-Z]. 

Нетерминал | FIRST    | FOLLOW
-----------|----------|-------
S          | `function`, `procedure` |`$`
FUN          | `function` |` `
PROC | `procedure` | ` `
RETTYPE | `:` | `$`
ARGS  | `eps`,`ch`  |`)`
ARGLIST    | `ch` |`:`
ARGLIST'   | `,` |`:`
ARGSPLIT | `;` , `eps` | `)`
NAME       | `ch`      |`;`,`,`, `(`, `)`, `$`
