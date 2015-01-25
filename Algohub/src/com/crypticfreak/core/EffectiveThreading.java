package javacodes.core;

/**
 * Created by Ankur K on 5/9/14.
 */
public class EffectiveThreading {
  /**
   * Why do we need synchronization ?
   * If you say that to make the operations atomic and thread safe so that we do not reach states that are un warranted
   * because some of the operations were concurrent. Java Memory model guarntees that the read and write operations are
   * Atomic, but when we are assigning a variable, for example, then the two different operations, read and write are taking place.
   *
   * Take the following example :
   *
   * variable = variable + 1;
   *
   * Now the above statement consists of the following part
   *
   * 1. Load variable into cpu register from memory.
   * 2. Increment the variable.
   * 3. Now write the variable back into it's memory place.
   *
   * If any two threads attempt  to the above one concurrently, you assume following will happen :
   *
   * Thread 1 will increment the value of variable. The steps it follow will be P1 -> P2 -> P3.
   * Thread 2 will increment the value of variable. The steps it follow will be Q1 -> Q2 -> Q3.
   *
   * Now, what happens if the above interleaves ? the value is only incremented by 1 rather than 2.
   *
   * So, we need to synchronize the code path where it will happen.
   *
   * Now, Is it the only use ?
   *
   * Well, no. Synchronize is also used for information sharing. For example :
   *
   *
   *
   */
}
