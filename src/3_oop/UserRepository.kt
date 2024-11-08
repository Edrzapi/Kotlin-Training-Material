package `3_oop`

class UserRepository(private val database: UserDatabase) {

    fun addUser(user: User): Boolean = database.addUser(user)

    fun getUser(id: Int): User? = database.getUser(id)

    fun updateUser(user: User): Boolean = database.updateUser(user)

    fun deleteUser(id: Int): Boolean = database.deleteUser(id)

    fun getAllUsers(): List<User> = database.getAllUsers()
}

class User(var firstName: String, var lastName: String, var age: Int, var email: String)

interface UserDatabase {
    fun addUser(user: User): Boolean
    fun getUser(id: Int): User?
    fun updateUser(user: User): Boolean
    fun deleteUser(id: Int): Boolean
    fun getAllUsers(): List<User>
}