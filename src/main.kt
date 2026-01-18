fun main() {
    val employee: Employee = Employee("john doe", "developer", 50000, 5)
    employee.salary = -100
    employee.yearsOfExperience = 56

    val task1 = Task("Organize files", "Organize all files into folders", priority = Priority.LOW ,isCompleted = false)
    val task2 = Task("Organize files", "Organize all files into folders", priority = Priority.LOW ,isCompleted = false)
    val task3 = Task("Organize files", "Organize all files into folders", priority = Priority.MEDIUM ,isCompleted = false)
    println(task1.equals(task2))
    println(task1.equals(task3))
    println(task1.hashCode())
    println(task3.copy(priority = Priority.HIGH))
    println(task2.toString())
}