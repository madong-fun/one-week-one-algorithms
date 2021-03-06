package example.algorithms.search

/**
  * Created by Ma Dong on 2018/11/20.
  */
object Searcher {

  /**
    * 二分查找法
    * @param array
    * @param item
    * @return
    */
  def binarySearch(array:Array[Int],item:Int): Int ={
    var low = 0
    var high = array.length - 1

    while (low <= high){
      val mid = (low+high) / 2
      if (array(mid) == item){
        return mid
      }
      if (array(mid) > item){
        high = mid -1
      }else{
        low = mid + 1
      }
    }
    -1
  }

  def main(args: Array[String]): Unit = {
    val array = for (i <- 0 to 6) yield i

    println(array)
    println(binarySearch(array.toArray, 5))
  }
}
