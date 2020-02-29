package com.test.kotlinactivity1

import java.lang.Math.sqrt

// Remove an element, problem 20

/*
* removeElement(array: String, index: int)
*   from i to array length
*       if i equals to index
*       remove array in the ith position
*   return array
* finish removeElement
*
* It can also be done with the kotlin drop method
* */

fun removeElement (array: String, index: Int): String
{
    var newArray = array.drop(index)
    return newArray
}

var removeProblem = readLine()!!.toString()
var removeIndex = readLine()!!.toInt()
print("(" + removeElement(removeProblem, removeIndex) + " , " + removeIndex + ")")


// Prime factors of a given integer, problem 36

/*
* primeFactors(number: Int)
*   while number % 2 different from 0 (it means that it is a pair)
*       print 2
*       number = number / 2
*   nextPrime -> 3
*   while nextPrime <= root(number)
*       while number % nextPrime equals 0 (it means that you found another factor)
*           print nextFactor
*           number -> number / nextPrime
*       nextPrime -> nextPrime + 2
*   if number greater than 2
*       print number (cus' it is a prime)
* finish primeFactors
*
* */

fun primeFactors(n: Int) {
    var n = n
    while (n % 2 == 0) {
        print("2 ")
        n /= 2
    }
    var i = 3
    while (i <= sqrt(n.toDouble())) {
        while (n % i == 0) {
            print("$i ")
            n /= i
        }
        i += 2
    }
    if (n > 2) print("$n ")
}

var primeProblem = readLine()!!.toInt()
primeFactors(primeProblem)