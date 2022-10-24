//
//  childAnimal.hpp
//  Lab5
//
//  Created by Jabez Ng on 22/10/22.
//

#ifndef childAnimal_hpp
#define childAnimal_hpp

#include <stdio.h>

#include "animal.hpp"

class Dog : public Mammal {
public:
    Dog(string n, COLOR c, string owner);
    ~Dog();
    void speak() const;
    void move();
};

class Cat : public Mammal {
public:
    Cat(string n, COLOR c, string owner);
    ~Cat();
    void speak() const;
    void move();
};

class Lion : public Mammal {
public:
    Lion(string n, COLOR c, string owner);
    ~Lion();
    void speak() const;
    void move();
};
#endif
