package com.metacodez.dslstreaming.node
import akka.actor.{ ActorRef, FSM }
import scala.concurrent.duration._
import scala.collection.immutable

case class Player(name: String, score: Int)

// Events
final case class SetTarget(ref: ActorRef)
final case class Queue(obj: Any)
case object Init
case object Second
case object End
case object Flush

// States
sealed trait State
case object Idle extends State
case object Active extends State

// Data
sealed trait Data
case object Uninitialized extends Data
final case class Info(data: String) extends Data
final case class ToDo(target: ActorRef, queue: Seq[Any]) extends Data

class SimpleFSM extends FSM[State,Data] {
  startWith(Idle, Uninitialized)

  // when(Idle) {
  //   case Event(SetTarget(ref), Uninitialized) =>
  //     stay using ToDo(ref, Vector.empty)
  // }

  // when(Active, stateTimeout = 1 second) {
  //   case Event(Flush | StateTimeout, t: ToDo) =>
  //     goto(Idle) using t.copy(queue = Vector.empty)
  // }
  when(Idle) {
    case Event(Init, Uninitialized) =>
      goto(Active) using Info("Hello")
  }
  // when(Active) {

  // }

  initialize()
}

