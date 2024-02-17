package com.example.navigationwitharguments.data

data class UserData(
    val id: Int,
    val name: String,
    val contactNum: Int,
    val email: String,
    val homeTown: String
)

val listOfUsers: List<UserData> = listOf(
    UserData(
        id = 1,
        name = "Sajudin1",
        contactNum = 1234,
        email= "satu@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 2,
        name = "Sajudin2",
        contactNum = 1235,
        email= "dua@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 3,
        name = "Sajudin3",
        contactNum = 1236,
        email= "tiga@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 4,
        name = "Sajudin4",
        contactNum = 1237,
        email= "empat@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 5,
        name = "Sajudin5",
        contactNum = 1238,
        email= "lima@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 6,
        name = "Sajudin6",
        contactNum = 1239,
        email= "enam@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 7,
        name = "Sajudin7",
        contactNum = 12310,
        email= "tujuh@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 8,
        name = "Sajudin8",
        contactNum = 12311,
        email= "delapan@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 9,
        name = "Sajudin9",
        contactNum = 12312,
        email= "sembilan@gmail.com",
        homeTown = "Earth"
    ),
    UserData(
        id = 10,
        name = "Sajudin10",
        contactNum = 12313,
        email= "sepuluh@gmail.com",
        homeTown = "Earth"
    )
)