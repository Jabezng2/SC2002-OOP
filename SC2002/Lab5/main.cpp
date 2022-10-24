//
//  main.cpp
//  Lab5
//
//  Created by Jabez Ng on 22/10/22.
//

#include <iostream>
#include "animal.hpp"
#include "childAnimal.hpp"

using namespace std;

int main() {
    int sel = 1;
    int i = 0;
    Mammal *mammals[3];

    while (sel != 5) {
        cout << "Select the animal to send to Zoo :\n"
                "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;

        cin >> sel;

        switch (sel) {
            case 1:
                mammals[i] = new Dog("Doggy", Green, "Andy");
                break;
            case 2:
                mammals[i] = new Cat("Cat", White, "Andy");
                break;
            case 3:
                mammals[i] = new Lion("Lion", Blue, "Andy");
                break;
            case 4:
                for (Mammal* & mammal : mammals) {
                    mammal->move();
                    mammal->speak();
                    mammal->eat();
                }
                i = 0;
                break;
            default:
                break;
        }
        i++;
    }
    return 0;
}
