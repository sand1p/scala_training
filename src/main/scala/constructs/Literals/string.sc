val str = "some_string"

//escape sequence

val muliline =
  """ this
  line
  spans
  multiple
  muliline"""

println(muliline)


// with stripe margin

val mulilineStripeMargin =
  """ this
    |line
    |spans
    |multiple
    |muliline"""

println(mulilineStripeMargin)


//without stripe margin




//concatenation



//string interpolation
val sting1 = "asdsad"
val strinInterpolation =  s" $sting1"

def square (x: Int) = x * x


println(s"${square(5)}")
println(s"${Int.MaxValue}")


//Predef class present which allows to call method
