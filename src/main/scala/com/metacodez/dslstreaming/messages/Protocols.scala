package com.metacodez.dslstreaming.messages

import akka.actor.ActorRef

import scala.collection.mutable.ListBuffer


// sealed class ProtocolMessages(from: akka.actor.ActorRef, generation: Int) extends java.io.Serializable

sealed trait Messages
case class AddMedia(name: String, size: Int) extends Messages
case class JoinRequest(act: ActorRef, time: Int) extends Messages
case class RequestMediaList(ref: ActorRef) extends Messages
case class RequestMediaListReply(list: ListBuffer[String]) extends Messages