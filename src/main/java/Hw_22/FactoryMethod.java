package Hw_22;

public class FactoryMethod {
        public FitnessTracker createStorage(TypeSave type) {
            switch (type) {
                case DB -> {
                    return new DataBaseImpl();
                }
                case FILE -> {

                    return new FileImpl();

                }
                case IN_MEMORY -> {
                    return new InMemoryImpl();
                }
            }
            throw new RuntimeException();
        }
    }

