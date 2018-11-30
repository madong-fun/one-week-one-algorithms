package example.algorithms.sort

/**
  * Created by Ma Dong on 2018/11/30.
  */
object Sorter {

  def selectSort(array: Array[Int]): Unit ={

    for (i <- 0 until  array.length){
      var k = i
      for (j <- i+1 until array.length){
        if (array(k) > array(j)) k = j
      }
      if (k!=i) swap(k,i,array)
    }
  }

  def bubleSort(array: Array[Int]): Unit ={

    array.foreach{x =>
      for (i <- 0 until array.length-1){
        if (array(i) > array(i+1)) swap(i,i+1,array)
      }
    }

  }

  /**
    *
    * @param array
    */
  def bubleSortPro(array: Array[Int]): Unit ={
    var flag = false
    array.foreach{x =>
      for (i <- 0 until array.length-1){
        if (array(i) > array(i+1)) {
          swap(i,i+1,array)
          flag = true
        }
      }
      if (flag) flag = true else return
    }
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1,5,3,6,8,7,9)
    selectSort(array)
    array.foreach(println)
  }

}
