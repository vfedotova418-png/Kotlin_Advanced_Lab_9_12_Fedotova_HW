class Employee(
    private var _fullName: String,
    private var _position: String,
    private var _salary: Int,
    private var _yearsOfExperience: Int
) {
    val fullName: String
        get() = _fullName
    val position: String
        get() = _position
    var salary: Int = _salary
        set(value) {
            if (value < 0) {
                println("Некорректное значение")
                return
            }
            field = value
        }
    var yearsOfExperience: Int = _yearsOfExperience
        set(value) {
            if (value > 50) {
                println("Некорректное значение")
                return
            }
            field = value
        }
}