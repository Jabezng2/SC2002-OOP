//
//  main.cpp
//  Tut9_Polymorphism_C++
//
//  Created by Jabez Ng on 30/10/22.
//

//#include <iostream.h> ERROR
#include <iostream>

//Add this line
using namespace std;

/*=====QUESTION 1=====*/
class A {
protected:
    int a, b;
public:
    //Default arguements to be placed at the rightmost
    A(int y, int x=0){
        a=x;
        b=y;
    }
    virtual void print();
    //Method to allow access to protected variables
    int getProtectedA(){
        return a;
    }
    int getProtectedB(){
        return b;
    }
};

class B: public A {
private:
    float p, q;
public:
    // B has highlight its parent class A "super" in java
    B(int m, float u, float v): A(m){
        p=u;
        q=v;
    }
    B(): A(0) {
        p = q = 0;
    }
    void input(float u, float v);
    virtual void print(float);
};
void A::print(void) {
    cout << "A values: " << a << " " << b << "\n";
}
void B::print(float) {
    // Wrong attribute variable names
    cout << "B values : " << p << " " << q << "\n";
}
void B::input(float x, float y){
    p = x; q = y;
}

int doubleIt(A a){ return a.getProtectedA() * a.getProtectedA(); }

// Operator overloading
A operator +(A a1, A a2){
    int a3 = a1.getProtectedA() + a2.getProtectedA();
    int b3 = a1.getProtectedB() + a2.getProtectedB();
    return A(b3, a3);
}

/*=====QUESTION 2=====*/
class BC {
public :
    void show(void) { cout << " \n I am in base class.."; }
};
class DC :public BC {
public :
    void show(void) { cout << " \n I am in derived class.."; }
};


// int main() and have return 0 inside body
int main() {
    A a1(10, 20), *ptr;
    B b1;
    b1.input(7.5, 3.142);
    
    ptr = &a1;
    ptr->print();
    ptr = &b1;
    ptr->print();
    
    //Test operator overloading
    A a2(20, 10);
    (a1 + a2).print();
    
    //Test QUESTION 2
    BC* ptr1;
    DC dobj;
    ptr1 = &dobj;
    ptr1->show();
    return 0;
}
//OUTPUT
//A values: 20 10
//A values: 0 0
//b1 prints 0 0 because the method called is from A
//OPERATOR OVERLOADING WORKS
//Outputs A values: 30 30
//Question 2 ouputs BASE CLASS!
//What matters is the type of object the pointer is pointing to
//In this case it is Base Class object. 
