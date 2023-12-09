#define _CRT_SECURE_NO_WARNINGS 1
//#include <stdio.h>
//struct Student {
//    char arr[5];
//    char name[10];
//    int score;
//};
//int main() {
//    int n = 0;
//    scanf("%d", &n);
//    struct Student s[10];
//    for (int i = 0; i < n; i++) {
//        scanf("%s", s[i].arr);
//        scanf("%s", s[i].name);
//        scanf("%d", &s[i].score);
//    }
//    double ave = 0.0;
//    for (int i = 0; i < n; i++) {
//        ave += s[i].score;
//    }
//    ave /= n;
//    printf("%.2f\n", ave);
//    for (int i = 0; i < n; i++) {
//        if (s[i].score < ave) {
//            printf("%s", s[i].name);
//            for (int j = 0; j < 5; j++) {
//                printf(" %d", s[i].arr[j]);
//            }
//            printf("\n");
//        }
//    }
//    return 0;
//}
//#include <stdio.h>
//struct Student {
//    int sex;
//    char name[9];
//};
//void sort(struct Student* s, int n) {
//    int left = 0;
//    int right = n - 1;
//    while (left < right) {
//        while (s[left].sex + s[right].sex != 1&&left<right) {
//            right--;
//        }
//        if (left >=right) {
//            break;
//        }
//        printf("%s %s\n", s[left].name, s[right].name);
//        s[right].sex = -1;
//        right = n - 1;
//        left++;
//    }
//}
//int main() {
//    int n = 0;
//    scanf("%d", &n);
//    struct Student s[50];
//    for (int i = 0; i < n; i++) {
//        scanf("%d %s", &s[i].sex, s[i].name);
//    }
//    sort(s, n);
//    return 0;
//}
#include<stdio.h>
#include<stdlib.h>
struct Friend {
    char name[11];
    int birth;
    char tele[18];
};
int cmp_stu_by_birth(const void* e1, const void* e2)
{
    return ((struct Friend*)e1)->birth - ((struct Friend*)e2)->birth;
}
int main() {
    int n = 0;
    scanf("%d", &n);
    struct Friend s[10];
    for (int i = 0; i < n; i++) {
        scanf("%s %d %s", s[i].name, &s[i].birth, s[i].tele);
    }
    qsort(s, n, sizeof(struct Friend), cmp_stu_by_birth);
    for (int i = 0; i < n; i++) {
        printf("%s %d %s\n", s[i].name, s[i].birth, s[i].tele);
    }
    return 0;
}