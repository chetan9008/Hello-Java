public class finalizeExample {

        // A simple class with a finalize method
        static class MyObject {
            // Some data or resources

            @Override
            protected void finalize() throws Throwable {
                try {
                    // Cleanup or release resources here
                    System.out.println("Finalizing MyObject");
                } finally {
                    // Call the superclass finalize method
                    super.finalize();
                }
            }
        }

        public static void main(String[] args) {
            // Creating an object
            MyObject obj = new MyObject();

            // Making the object eligible for garbage collection
            obj = null;

            // Requesting garbage collection (Note: Explicitly calling System.gc() is just
            // for demonstration)
            System.gc();

            // The finalize method may be called, but it's not guaranteed
            // It depends on when the garbage collector runs
        }
    }

