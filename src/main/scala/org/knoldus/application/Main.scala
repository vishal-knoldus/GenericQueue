package org.knoldus.application
import org.knoldus.customQueue.Queue
object Main {
  def main(args: Array[String]): Unit = {
    // Queue instance of Int type
    val queueInt = new Queue[Int]
    queueInt.enQueue(10)
    queueInt.enQueue(11)
    queueInt.enQueue(12)
    queueInt.enQueue(13)
    queueInt.enQueue(14)
    queueInt.deQueue()
    queueInt.peek
    queueInt.allQueueElement

    // Queue instance of Double type
    val queueDouble = new Queue[Double]
    queueDouble.enQueue(10.1)
    queueDouble.enQueue(11.2)
    queueDouble.enQueue(12)
    queueDouble.enQueue(13)
    queueDouble.enQueue(14)
    queueDouble.deQueue()
    queueDouble.peek
    queueDouble.allQueueElement
  }

  // Queue instance of String Type
  val queueString = new Queue[String]
  queueString.enQueue("Abhay")
  queueString.enQueue("Vishal")
  queueString.enQueue("Nehal")
  queueString.enQueue("Neha")
  queueString.deQueue()
  queueString.deQueue()
  queueString.peek
  queueString.allQueueElement

}
