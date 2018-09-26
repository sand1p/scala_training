//single line expression and multiline expression

val a =10
val b =12
val expr = if ( a > b) a else b


val mulExpr = if ( a > b)
                 a else
                  b


val mulExprReturnsTypes = if ( a > b)
  a
else
  "b"


/**   - Any
          - Int
          -  String


  **/



val multilineExprReturnsTypes = if ( a > b) {
  val c = a
  a+c
}else{
 val d = b
  b + d
}


/** pure method /functions
output will be computed based on provided inputes

//Method returning Unit data type then it has side effect


**/

/**
  *
  * impure methods
  */
//using var
var c =0
def add (a: Int, b: Int ) = {
  c += 1
  c+ a+ b
}

add(4,5)
add(4,5)
add(4,5)
add(4,5)
add(4,5)
add(4,5)


//using val
val c =0
def add (a: Int, b: Int ) = {
  c += 1
   a+ b
}

add(4,5)
add(4,5)
add(4,5)
add(4,5)
add(4,5)
add(4,5)




