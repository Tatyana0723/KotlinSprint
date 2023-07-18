fun main() {
    val workers = 50 //количество сотрудников до приема стажеров
    val salary = 30000 //зарплата сотрудника
    val staffSalary = workers * salary //зарплата штата до приема стажеров
    val trainees = 30 //количество стажеров
    val salaryNew = 20000 //зарплата стажера
    val traineesSalary = trainees * salaryNew //зарплата стажеров
    val totalSalary = staffSalary + traineesSalary //общая зарплата
    val averageSalary = totalSalary / (workers + trainees)// средняя зарплата

    println(staffSalary)
    println(totalSalary)
    println(averageSalary)




}