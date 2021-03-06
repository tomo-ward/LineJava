/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ChannelSyncType implements org.apache.thrift.TEnum {
  SYNC(0),
  REMOVE(1),
  REMOVE_ALL(2);

  private final int value;

  private ChannelSyncType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ChannelSyncType findByValue(int value) { 
    switch (value) {
      case 0:
        return SYNC;
      case 1:
        return REMOVE;
      case 2:
        return REMOVE_ALL;
      default:
        return null;
    }
  }
}
