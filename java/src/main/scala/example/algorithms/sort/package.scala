package example.algorithms

/**
  * Created by Ma Dong on 2018/11/30.
  */
package object sort {

  def swap(x:Int,y:Int,array: Array[Int]): Unit ={
    array(x) = array(x) ^ array(y)
    array(y) = array(x) ^ array(y)
    array(x) = array(x) ^ array(y)
  }
}
