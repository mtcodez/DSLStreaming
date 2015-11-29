/**
 * Copyright (C) 2015 Typesafe Inc. <http://www.typesafe.com>
 */
package akka.japi.function

/**
 * A Function interface. Used to create 3-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function3[-T1, -T2, -T3, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3): R
}

/**
 * A Function interface. Used to create 4-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function4[-T1, -T2, -T3, -T4, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4): R
}

/**
 * A Function interface. Used to create 5-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function5[-T1, -T2, -T3, -T4, -T5, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): R
}

/**
 * A Function interface. Used to create 6-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function6[-T1, -T2, -T3, -T4, -T5, -T6, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): R
}

/**
 * A Function interface. Used to create 7-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function7[-T1, -T2, -T3, -T4, -T5, -T6, -T7, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7): R
}

/**
 * A Function interface. Used to create 8-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function8[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8): R
}

/**
 * A Function interface. Used to create 9-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function9[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9): R
}

/**
 * A Function interface. Used to create 10-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function10[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10): R
}

/**
 * A Function interface. Used to create 11-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function11[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11): R
}

/**
 * A Function interface. Used to create 12-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function12[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12): R
}

/**
 * A Function interface. Used to create 13-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function13[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13): R
}

/**
 * A Function interface. Used to create 14-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function14[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14): R
}

/**
 * A Function interface. Used to create 15-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function15[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15): R
}

/**
 * A Function interface. Used to create 16-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function16[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16): R
}

/**
 * A Function interface. Used to create 17-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function17[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17): R
}

/**
 * A Function interface. Used to create 18-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function18[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18): R
}

/**
 * A Function interface. Used to create 19-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function19[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, -T19, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19): R
}

/**
 * A Function interface. Used to create 20-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function20[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, -T19, -T20, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20): R
}

/**
 * A Function interface. Used to create 21-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function21[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, -T19, -T20, -T21, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20, arg21: T21): R
}

/**
 * A Function interface. Used to create 22-arg first-class-functions is Java.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Function22[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, -T19, -T20, -T21, -T22, +R] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20, arg21: T21, arg22: T22): R
}

/**
 * A Consumer interface. Used to create 2-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure2[-T1, -T2] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2): Unit
}

/**
 * A Consumer interface. Used to create 3-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure3[-T1, -T2, -T3] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3): Unit
}

/**
 * A Consumer interface. Used to create 4-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure4[-T1, -T2, -T3, -T4] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4): Unit
}

/**
 * A Consumer interface. Used to create 5-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure5[-T1, -T2, -T3, -T4, -T5] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): Unit
}

/**
 * A Consumer interface. Used to create 6-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure6[-T1, -T2, -T3, -T4, -T5, -T6] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): Unit
}

/**
 * A Consumer interface. Used to create 7-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure7[-T1, -T2, -T3, -T4, -T5, -T6, -T7] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7): Unit
}

/**
 * A Consumer interface. Used to create 8-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure8[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8): Unit
}

/**
 * A Consumer interface. Used to create 9-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure9[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9): Unit
}

/**
 * A Consumer interface. Used to create 10-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure10[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10): Unit
}

/**
 * A Consumer interface. Used to create 11-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure11[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11): Unit
}

/**
 * A Consumer interface. Used to create 12-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure12[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12): Unit
}

/**
 * A Consumer interface. Used to create 13-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure13[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13): Unit
}

/**
 * A Consumer interface. Used to create 14-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure14[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14): Unit
}

/**
 * A Consumer interface. Used to create 15-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure15[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15): Unit
}

/**
 * A Consumer interface. Used to create 16-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure16[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16): Unit
}

/**
 * A Consumer interface. Used to create 17-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure17[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17): Unit
}

/**
 * A Consumer interface. Used to create 18-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure18[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18): Unit
}

/**
 * A Consumer interface. Used to create 19-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure19[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, -T19] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19): Unit
}

/**
 * A Consumer interface. Used to create 20-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure20[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, -T19, -T20] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20): Unit
}

/**
 * A Consumer interface. Used to create 21-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure21[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, -T19, -T20, -T21] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20, arg21: T21): Unit
}

/**
 * A Consumer interface. Used to create 22-arg consumers in Java.
 * A Procedure is like a Function, but it doesn't produce a return value.
 * `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 */
@SerialVersionUID(1L)
trait Procedure22[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, -T9, -T10, -T11, -T12, -T13, -T14, -T15, -T16, -T17, -T18, -T19, -T20, -T21, -T22] extends java.io.Serializable {
  @throws(classOf[Exception])
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13, arg14: T14, arg15: T15, arg16: T16, arg17: T17, arg18: T18, arg19: T19, arg20: T20, arg21: T21, arg22: T22): Unit
}
