abstract class Department(
    val departmentName: String,
) {
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment : Department("Development Department"), ReportGenerator {
    val departmentGoal: String = "Писать чистый код"
    override fun printDepartmentGoal() {
        println("Цель отдела: $departmentGoal")
    }

    override fun generateReport(): String {
        return "Название отдела: $departmentName\nЦель отдела: $departmentGoal"
    }
}

class TestingDepartment : Department("Testing Department") {
    override fun printDepartmentGoal() {
        println("Цель отдела: Находить все баги")
    }
}