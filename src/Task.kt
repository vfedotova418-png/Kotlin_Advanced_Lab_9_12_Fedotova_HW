data class Task(
    val title: String,
    val description: String,
    var isCompleted: Boolean = false
) {
    enum class Priority {
        low, medium, high
    }
}
