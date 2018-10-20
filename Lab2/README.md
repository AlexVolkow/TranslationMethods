# Лабораторная работа №2. Вариант 7.
Описание заголовка функции в Паскале

# Построим грамматику

* `S -> FUN NAME (ARGS): NAME`
* `FUN -> function | procedure`
* `ARGS -> ARGLIST : NAME ARGSPLIT | eps`
* `ARGLIST -> NAME, ARGLIST`
* `ARGLIST -> NAME`
* `ARGSPLIT -> ; ARGS | eps`
* `NAME -> [a-zA-Z]NAME`

## Описание 

Нетерминал    | Значение
------------- | -------------
S  | Описание заголовка функции в Паскале
FUN | Ключевое слово function или procedure
ARGS | Описание аргументов функции
ARGSPLIT | Разделитель между группами аргументов
ARGLIST | Список аргументов, разделенных запятыми
NAME | Имя переменной или типа


## Устранение правового ветвления

* `S -> FUN NAME (ARGS): NAME`
* `FUN -> function | procedure`
* `ARGS -> ARGLIST : NAME ARGSPLIT | eps`
* `ARGLIST -> NAME ARGLIST'`
* `ARGLIST' -> , ARGLIST | eps`
* `ARGSPLIT -> ; ARGS | eps`
* `NAME -> [a-zA-Z]NAME`

Нетерминал    | Значение
------------- | -------------
S  | Описание заголовка функции в Паскале
FUN | Ключевое слово function или procedure
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
FUN          | `function`, `procedure` |` `
ARGS  | `eps`,`ch`  |`)`
ARGLIST    | `eps`, `ch` |`:`
ARGLIST'   | `,`, `eps` |`:`
ARGSPLIT | `;` , `eps` | `)`
NAME       | `ch`      |`;`,`,`, `(`, `)`, `$`
