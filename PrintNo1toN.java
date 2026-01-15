// Printing numbers from 1 to n using Recursion

void main() {
    numbersAtoB(1, 10);
}

public static void numbersAtoB(int a, int b){
    if(a>=b)
        return;
    IO.println(a);
    numbersAtoB(a+1, b);
}