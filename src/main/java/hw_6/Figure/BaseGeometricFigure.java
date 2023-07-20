package hw_6;

public interface BaseGeometricFigure {
    double areaFigureInt();

    default  double areaOllInt(double summ){
        summ +=  areaFigureInt();
        return summ;
    }
}
/*0. Створити базовий інтерфейс для геометричної фігури, в якому є метод, який повертає площу фігури.
Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат.
Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві*/