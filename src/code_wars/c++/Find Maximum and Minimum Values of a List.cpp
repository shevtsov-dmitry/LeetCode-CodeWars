//
// Created by shado on 23.08.2023.
//
#include <iostream>
#include <vector>

int min(std::vector<int> list){
    int min = list[0];
    for (int i : list) {
        if(min > i) min = i;

    }
    return min;
}

int max(std::vector<int> list){
    int max = list[0];
    for (int i : list) {
        if(max < i) max = i;
    }
    return max;
}

int main(){
    std::vector<int> vec = {-52, 56, 30, 29, -54, 0, -110};
    std::cout << "min: " << min(vec) << " \t max: " << max(vec);
    return 0;
}