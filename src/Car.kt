import java.awt.Color
import java.awt.Color.red

// Создать Машина, у него будет 3 функции, цвет машины, цена, марка.
// Конструктора - пустой
// Конструктора - цвет машины
// Конструктора - цвет машины, цена машины,
// Конструктора - цвет машины, цена машины, марка

// зальешь на github и создашь репозиторий

class Car() {
    private val color = red
    private val price = 45000
    private val brand = "Lada"
    constructor(
    color: Color,
    price: Int,
    brand: String
    ) : this() {
        this.color
        this.price
        this.brand
    }

}
