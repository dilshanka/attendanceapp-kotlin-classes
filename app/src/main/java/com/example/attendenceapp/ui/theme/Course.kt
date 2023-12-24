package com.example.attendenceapp.ui.theme

class Course(val id: String, var name: String, var teacher: String) {
    val enrolledStudents: MutableList<String> = mutableListOf()

    fun getEnrolledStudents(): List<String> {
        return enrolledStudents
    }
}