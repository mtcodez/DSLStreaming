package com.metacodez.dslstreaming.node

import akka.actor.FSM
import akka.actor.LoggingFSM

object ContentNode {
  sealed trait State
  case object Uninitialized extends State
  case object Initialization extends State
  case object Working extends State

  sealed trait Data
  case object Nothing extends Data

  sealed trait Message
  case object Start extends Message
  case class Join(name: String) extends Message

  def startup(cNode: ContentNode) = {
    
  }
}

class ContentNode extends FSM[ContentNode.State, ContentNode.Data]
with LoggingFSM[ContentNode.State, ContentNode.Data]{
  import ContentNode._

  startWith(Uninitialized, Nothing)

  when(Uninitialized) {
    case Event(Start, _) =>
      goto(Working)
  }
  when(Working) {
    case Event(Join, _) =>
  }
}
