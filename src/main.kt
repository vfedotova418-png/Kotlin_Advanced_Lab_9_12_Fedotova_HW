fun main() {
    val employee: Employee = Employee("john doe", "developer", 50000, 5)
    employee.salary = -100
    employee.yearsOfExperience = 56

    println("==================")

    val task1 = Task("Organize files", "Organize all files into folders", priority = Priority.LOW ,isCompleted = false)
    val task2 = Task("Organize files", "Organize all files into folders", priority = Priority.LOW ,isCompleted = false)
    val task3 = Task("Organize files", "Organize all files into folders", priority = Priority.MEDIUM ,isCompleted = false)
    println(task1.equals(task2))
    println(task1.equals(task3))
    println(task1.hashCode())
    println(task3.copy(priority = Priority.HIGH))
    println(task2.toString())

    println("==================")

    val dep1: DevelopmentDepartment = DevelopmentDepartment()
    val dep2: TestingDepartment = TestingDepartment()
    dep1.printDepartmentGoal()
    dep2.printDepartmentGoal()

    println("==================")

    val reports: List<ReportGenerator> = listOf(
        employee,
        dep1
    )

    reports.forEach { generator ->
        println(generator.generateReport())
    }

    println("==================")

    println("Назначаем задачу сотруднику:")
    employee.assignTask(task1)
    println(employee.generateReport())
}