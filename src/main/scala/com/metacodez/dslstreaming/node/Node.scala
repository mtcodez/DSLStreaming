package com.metacodez.dslstreaming.node
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object Node {
  case object Ping
  case object Pong
  case class Get(data: String)
  def props: Props = Props(new Node)
}
/**
  * Created by Mante Luo on 11/23/15.
  */
class Node extends Actor {
  import Node._
  def receive = {
    case Ping => println("Ping..")
    case Pong => println("Pong..")
    case Get(data) => println(data)
    case _ => println("unsupported!")
  }
}

// object Main extends App {
//   val system = ActorSystem("HelloSystem")
//   val helloActor = system.actorOf(Props[Node], name = "helloactor")
//   helloActor ! "hello"
//   helloActor ! "chedan"
// }

