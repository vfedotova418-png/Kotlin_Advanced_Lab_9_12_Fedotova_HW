abstract class Department(
    val departmentName: String,
) {
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment : Department("Development Department") {
    override fun printDepartmentGoal() {
        println("Цель отдела: Писать чистый код")
    }
}

class TestingDepartment : Department("Testing Department") {
    override fun printDepartmentGoal() {
        println("Цель отдела: Находить все баги")
    }
}