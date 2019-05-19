package com.booking.sereal;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class ByteArray {
  public byte[] array;
  public int start;
  public int length;

  public ByteArray(byte[] array) {
    this(array, 0, array.length);
  }

  public ByteArray(byte[] array, int length) {
    this(array, 0, length);
  }

  public ByteArray(byte[] array, int start, int length) {
    this.array = array;
    this.start = start;
    this.length = length;
  }

  public ByteArray(ByteBuffer buffer) {
    this(buffer.array(), buffer.limit());
  }

  public void ensure(int size) {
    if (size > array.length) array = Arrays.copyOf(array, size * 3 / 2);
  }
}
