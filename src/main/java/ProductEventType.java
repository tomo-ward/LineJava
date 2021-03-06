/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ProductEventType implements org.apache.thrift.TEnum {
  NO_EVENT(0),
  CARRIER_ANY(65537),
  BUDDY_ANY(131073),
  INSTALL_IOS(196609),
  INSTALL_ANDROID(196610),
  MISSION_ANY(262145),
  MUSTBUY_ANY(327681);

  private final int value;

  private ProductEventType(int value) {
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
  public static ProductEventType findByValue(int value) { 
    switch (value) {
      case 0:
        return NO_EVENT;
      case 65537:
        return CARRIER_ANY;
      case 131073:
        return BUDDY_ANY;
      case 196609:
        return INSTALL_IOS;
      case 196610:
        return INSTALL_ANDROID;
      case 262145:
        return MISSION_ANY;
      case 327681:
        return MUSTBUY_ANY;
      default:
        return null;
    }
  }
}
