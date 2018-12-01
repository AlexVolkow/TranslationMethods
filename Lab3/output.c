#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

const int N = 69;
int a, b;

int main() {
    scanf("%d%d", &a, &b);
    a = b + a + 42;
    printf("%s", 'result');
    printf("%d\n", a);
    return 0;
}

