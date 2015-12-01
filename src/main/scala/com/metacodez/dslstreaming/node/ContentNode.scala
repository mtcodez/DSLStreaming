package com.metacodez.dslstreaming.node

import akka.actor.FSM
import akka.actor.LoggingFSM
import com.metacodez.dslstreaming.node.PeerNode.JoinOverlayReply

import scala.collection.mutable.ListBuffer

object ContentNode {
  sealed trait State
  case object Uninitialized extends State
  case object Initialization extends State
  case object Working extends State

  sealed trait Data
  case object Nothing extends Data

  sealed trait Message
  case object Start extends Message
  case object End extends Message
  case object Done extends Message
  case class Join(name: String) extends Message

  def startup(cNode: ContentNode) = {
    
  }
}

class ContentNode extends FSM[ContentNode.State, ContentNode.Data]
  with LoggingFSM[ContentNode.State, ContentNode.Data]{
  import ContentNode._
  import com.metacodez.dslstreaming.messages._

  val mediaList = new ListBuffer[String]()

  startWith(Uninitialized, Nothing)

  when(Uninitialized) {
    case Event(Start, _) =>
      goto(Working) // replying Done
  }
  when(Initialization) {
    case Event(_,_) =>
      goto(Working)
  }
  when(Working) {
    case Event(RequestMediaList(ref),_) =>
      stay replying RequestMediaListReply(mediaList)
    case Event(PeerNode.JoinOverlay(playbackTime),_)  =>
      log.info("A peer node connected.")
      stay //replying Done
    case Event(AddMedia(name, size), _) =>
      mediaList += name
      log.info(s"Media: $name with size: $size")
      stay
    case Event(JoinRequest(mediaName, time), _) =>
      log.info(s"Peer requests to join the $mediaName streaming, with the time: $time secs")
      stay
    case Event(ContentNode.End, _) =>
      stop
  }
  initialize()
}
