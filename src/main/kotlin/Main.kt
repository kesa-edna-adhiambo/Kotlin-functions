fun main() {

    first()

    second()

    third()

    fourth()

    fifth()

    sixth()


}
fun first() {
//CREATING ARRAYS
    //array of integers
    var numArray = arrayOf(10,11,12,13,14,15,16,17,18,19)

//ACCESSING ELEMENTS IN ARRAY BY INDEXING
    println(numArray[0])
    println(numArray[1])
    println(numArray[2])

}

fun second(){
//ARRAYS HOLDING ELEMENTS OF A SINGLE TYPE
    //array of string
    var namesArray = arrayOf("Edna","Adhiambo","Kesa","Levin","Brenda")
    //accessing element on different indices
    println(namesArray[0])
    println(namesArray[4])

//ARRAYS HOLDING ELEMENTS OF DIFFERENT TYPE
    //array of any
    var country = arrayOf("kenya",true,5.0F,39.99)
    println(country[0])
    println(country[1])
    println(country[2])
    println(country[3])

}

fun third(){
 //BASIC ARRAY OPERATION
    //array of strings
    var namesArray = arrayOf("Mayabi","Kelvin","Fred")
    //get an element at a certain index
    var name = namesArray.get(2)
    println(name)

    //set a value at a certain index(the element in that index will be removed completely)
    namesArray.set(1, "Faith")
    println(namesArray.get(1))

    //adding an element to an array.
    namesArray = namesArray.plus("Jane")
    println(namesArray[3])

    //getting an index of an element(shows -1 because it does not exist, we replaced it earlier with Faith)
    var index = namesArray.indexOf("Kelvin")
    println(index)
    //shows zero since that is its index
    index = namesArray.indexOf("Mayabi")
    println(index)

}

fun fourth(){
    //array of Integers
    val numArray = arrayOf(1,2,3,4,5,6,7,8,9,10)

    //count the number of elements in the array(they are 10 in number)
    var numElements = numArray.count()
    println(numElements)

    //sum the elements in the array
    var sumElements = numArray.sum()
    println(sumElements)

    //max number in the array
    var maxValue = numArray.maxOrNull()
    println(maxValue)

    //min number in the array
    var minValue = numArray.minOrNull()
    println(minValue)

    //average of the elements(gives a whole number answer)
    println(numArray.sum()/numArray.size)

    //Or
    //gives an answer with decimal(more accurate)
    println(numArray.sum().toDouble()/numArray.size)

}

fun fifth(){
    //LOOPING THROUGH ARRAYS(accessing elements in sequence)
    var namesArray = arrayOf("Sheila","Mary","Laureen","Yasinta","Mayabi")
    namesArray.forEach { names ->

        println(names)

    }

    //OR
    for (x in namesArray)
        println(x)

}


fun sixth(){
    //SORTING(arranging in alphabet order or if it is for integers it is arranged in ascending oder)
    val namesArray = arrayOf("Edna","Ashley","Ken")
    val sortedNames = (namesArray.sortedArray())


println("hello")


}



