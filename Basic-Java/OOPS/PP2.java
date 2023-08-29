import java.util.Scanner;

class ComplexNumbers {

    int real;
    int imag;

    public ComplexNumbers(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public void plus(ComplexNumbers c) {
        this.real += c.real;
        this.imag += c.imag;
    }

    public void multiply(ComplexNumbers c) {
        int updatedReal = this.real * c.real - (this.imag * c.imag);
        int updatedImag = this.real * c.imag + this.imag * c.real;
        this.real = updatedReal;
        this.imag = updatedImag;
    }

    public void print() {
        System.out.println(this.real + " + " + "i" + this.imag);
    }
}

public class Solution {

    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);

        ComplexNumbers c1 = new ComplexNumbers(ob.nextInt(), ob.nextInt());
        ComplexNumbers c2 = new ComplexNumbers(ob.nextInt(), ob.nextInt());

        int operation = ob.nextInt();
        switch (operation) {
            case 1:
                c1.plus(c2);
        		c1.print();
                break;

            case 2:
                c1.multiply(c2);
        		c1.print();
                break;
        }

    }
}
