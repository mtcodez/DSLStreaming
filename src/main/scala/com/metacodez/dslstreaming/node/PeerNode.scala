package com.metacodez.dslstreaming.node

import akka.actor.ActorRef
import akka.actor.FSM
import akka.actor.LoggingFSM
import com.metacodez.dslstreaming.media.PlaybackTime

object PeerNode {
  sealed trait State
  case object Start extends State
  case object Working extends State

  sealed trait Data
  case object Nothing extends Data

  sealed trait Message
  case class JoinOverlay(mediaName: String, playbackTime: PlaybackTime) extends Message
  case class JoinOverlayReply(neighbor: Option[ActorRef]) extends Message

}

class PeerNode extends FSM[PeerNode.State, PeerNode.Data]
with LoggingFSM[PeerNode.State, PeerNode.Data]{
  import PeerNode._
  import com.metacodez.dslstreaming.messages._
  startWith(Start, Nothing)

  when(Start) {
    case Event(JoinOverlayReply(name: String, length: Int),_) =>
       goto(Working)
  }
  when(Working) {
    case Event(RequestMediaListReply(mediaList),_) =>
      log.info("Media list: "+mediaList.head)
      stay
  }

  initialize()

}
