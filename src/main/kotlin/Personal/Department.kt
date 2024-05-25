package Personal

class Department(private var _name: String, private var _employees: List<String>) {

    var name: String
        get() = _name
        set(value) {
            _name = value
        }

    var employees: List<String>
        get() = _employees
        set(value) {
            if (value.isNotEmpty()) {
                _employees = value
            } else {
                println("Список сотрудников не может быть пустым.")
            }
        }
}

fun main() {
    val department = Department("IT", listOf("Алиса", "Дима"))

    println(department.name) // Output: IT
    println(department.employees) // Output: [Alice, Bob]

    // Попытка установить пустой список сотрудников
    department.employees = listOf()
    // Output: Список сотрудников не может быть пустым.

    // Список сотрудников остается прежним
    println(department.employees) // Output: [Alice, Bob]

    // Устанавливаем новый непустой список сотрудников
    department.employees = listOf("Андрей", "Мишка")
    println(department.employees) // Output: [Charlie, Dave]
}