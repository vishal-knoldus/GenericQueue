package org.knoldus.customQueue

class Queue[T]{
  var elementQueue : List[T] = List()
  def enQueue(element:T):List[T]={
    elementQueue=elementQueue :+ element
    elementQueue
  }
  def deQueue():List[T]={
      if(elementQueue.nonEmpty) {
        elementQueue = elementQueue.tail
        elementQueue
      }
      else
        elementQueue
  }
  def peek:Unit={
    if(elementQueue.isEmpty)
      println("Queue is Empty")
    else
      println("Peek value is : "+elementQueue.last)
  }
  def allQueueElement:Unit={
    if(elementQueue.isEmpty)
      println("Queue is Empty")
    else {
      println("Elements in the Queue are : ")
     for(element <- elementQueue)
       println(element+" ")
    }
  }
}
