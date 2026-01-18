class Employee(
    private var _fullName: String,
    private var _position: String,
    private var _salary: Int,
    private var _yearsOfExperience: Int,
    private var currentTask: Task? = null
) : ReportGenerator {
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

    override fun generateReport(): String {
        return "ФИО: $fullName\nДолжность: $position\nЗарплата: $salary\nОпыт работы: $yearsOfExperience"
    }

    fun assignTask(newTask: Task) {
        if (currentTask != null && !currentTask!!.isCompleted) {
            println("Сотрудник уже занят задачей ${currentTask?.title}")
        }
        currentTask = newTask
        println("Сотруднику назначена новая задача: '${newTask.title}'")
    }
}