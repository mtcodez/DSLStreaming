package com.metacodez.dslstreaming.node

sealed trait ChopstickState
case object Taken extends ChopstickState
case object Available extends ChopstickState


