package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    print (countChange(4,List(1,2)))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def matches(n: Int, chars: List[Char]): Boolean = {
        if(chars.isEmpty)
          n == 0
        else if(chars.head == '(')
          matches(n + 1, chars.tail)
        else if(chars.head == ')')
          if(n > 0)
            matches(n - 1, chars.tail)
          else
            false
        else
          matches(n, chars.tail)
      }

      matches(0, chars)

    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(coins.isEmpty || money < 0)
        0
      else if(money == 0)
        1
      else
        countChange(money, coins.tail) +
        countChange(money - coins.head, coins)
    }
  }
