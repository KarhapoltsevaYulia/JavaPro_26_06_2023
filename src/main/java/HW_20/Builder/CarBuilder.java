package HW_20.Builder;

public class CarBuilder {

    private  Engine engine;
    private  Wheels wheels ;
    private  ElectricIgnitionSystem electricIgnitionSystem ;

    public CarBuilder(Builder builder) {
        this.engine = engine;
        this.wheels = wheels;
        this.electricIgnitionSystem = electricIgnitionSystem;
    }

    public Engine getBun() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public ElectricIgnitionSystem getElectricIgnitionSystem() {
        return electricIgnitionSystem;
    }
    public static Builder newBuilder() {
        return new Builder();
    }
    public enum Engine {
       GASOLINE,
        DIESEL;
    }
    public enum Wheels{
        TUBELESS,
        RADIAL;
    }
    public enum ElectricIgnitionSystem{
        CONTACT_SYSTEM,
        CONTACTLESS_IGNITION_SYSTEM,
        ELECTRIC_IGNITION_SYSTEM;
    }
    static final class Builder {
        private  Engine engine;
        private  Wheels wheels ;
        private  ElectricIgnitionSystem electricIgnitionSystem ;

        private Builder() {
        }

        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }
        public Builder wheels(Wheels wheels) {
            this.wheels = wheels;
            return this;
        }
        public Builder electricIgnitionSystem(ElectricIgnitionSystem electricIgnitionSystem) {
            this.electricIgnitionSystem = electricIgnitionSystem;
            return this;
        }
        public CarBuilder build() {
            return new CarBuilder(this);
        }
    }
}
/*Реалізувати шаблон проектування "Фабрика" для створення різних типів меблів
Реалізувати шаблон проектування "Будівельник" для створення автомобіля з багатьох частин
Реалізувати шаблон проектування "Стратегія" для обчислення площі фігур: Прямокутник, Трикутник*/