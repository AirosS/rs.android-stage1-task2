package subtask6

class Fibonacci {
    fun productFibonacciSequenceFor(n: Int): IntArray {
val product = mutableListOf(0,1)
      var buf =0
        while(product[0]*product[1]<n)
        {
            buf = product[1]+product[0]
            product[0]=product[1]
            product[1]=buf
        }
        if(product[0]*product[1]==n)
        product.add(1)
        else
            product.add(0)
        return product.toIntArray()
    }
}
