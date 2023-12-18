// final class First {
//     int value;

//     First(int x) {
//         value = x;
//     }

//     void display() {
//         System.out.println("Value is " + value);
//     }

//     protected void finalize() throws Throwable
//     {
//         try{
//                     System.out.println("Called Finalizer");

//         }
//         catch(Throwable t)
//         {
//             System.out.println(t);
//         }
//     }
// }

// class Base {
//     int first;
//     final int value = 2;

//     Base(int x) {
//         first = x;
//         // value = 5; constant variable can't change
//     }

//     final void display() {
//         System.out.println("Value of base member variable is " + first);
//     }
// }

// class SubClass extends Base {
//     int second;

//     SubClass(int x, int y) {
//         super(x);
//         second = y;
//     }

//     // @Override
//     void displaySub() {
//         super.display();
//         System.out.println("Value of Sub Class member variable is " + second);

//     }
// }

// class callOverriddenFunction {
//     public static void main(String arg[]) {
//         SubClass example = new SubClass(10, 20);
//         example.display();

//         First ex = new First(2);
//         ex.display();
//         ex = null;
//         System.gc();
//     }
// }