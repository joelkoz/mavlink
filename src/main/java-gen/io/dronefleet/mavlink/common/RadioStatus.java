package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Override;
import java.lang.String;

/**
 * Status generated by radio and injected into MAVLink stream. 
 */
@MavlinkMessageInfo(
    id = 109,
    crc = 185
)
public final class RadioStatus {
  /**
   * Receive errors 
   */
  private final int rxerrors;

  /**
   * Count of error corrected packets 
   */
  private final int fixed;

  /**
   * Local signal strength 
   */
  private final int rssi;

  /**
   * Remote signal strength 
   */
  private final int remrssi;

  /**
   * Remaining free buffer space in percent. 
   */
  private final int txbuf;

  /**
   * Background noise level 
   */
  private final int noise;

  /**
   * Remote background noise level 
   */
  private final int remnoise;

  private RadioStatus(int rxerrors, int fixed, int rssi, int remrssi, int txbuf, int noise,
      int remnoise) {
    this.rxerrors = rxerrors;
    this.fixed = fixed;
    this.rssi = rssi;
    this.remrssi = remrssi;
    this.txbuf = txbuf;
    this.noise = noise;
    this.remnoise = remnoise;
  }

  @MavlinkMessageBuilder
  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "RadioStatus{rssi=" + rssi
         + ", remrssi=" + remrssi
         + ", txbuf=" + txbuf
         + ", noise=" + noise
         + ", remnoise=" + remnoise
         + ", rxerrors=" + rxerrors
         + ", fixed=" + fixed + "}";
  }

  /**
   * Receive errors 
   */
  @MavlinkFieldInfo(
      position = 6,
      unitSize = 2
  )
  public final int rxerrors() {
    return rxerrors;
  }

  /**
   * Count of error corrected packets 
   */
  @MavlinkFieldInfo(
      position = 7,
      unitSize = 2
  )
  public final int fixed() {
    return fixed;
  }

  /**
   * Local signal strength 
   */
  @MavlinkFieldInfo(
      position = 1,
      unitSize = 1
  )
  public final int rssi() {
    return rssi;
  }

  /**
   * Remote signal strength 
   */
  @MavlinkFieldInfo(
      position = 2,
      unitSize = 1
  )
  public final int remrssi() {
    return remrssi;
  }

  /**
   * Remaining free buffer space in percent. 
   */
  @MavlinkFieldInfo(
      position = 3,
      unitSize = 1
  )
  public final int txbuf() {
    return txbuf;
  }

  /**
   * Background noise level 
   */
  @MavlinkFieldInfo(
      position = 4,
      unitSize = 1
  )
  public final int noise() {
    return noise;
  }

  /**
   * Remote background noise level 
   */
  @MavlinkFieldInfo(
      position = 5,
      unitSize = 1
  )
  public final int remnoise() {
    return remnoise;
  }

  public static class Builder {
    private int rxerrors;

    private int fixed;

    private int rssi;

    private int remrssi;

    private int txbuf;

    private int noise;

    private int remnoise;

    private Builder() {
    }

    /**
     * Receive errors 
     */
    @MavlinkFieldInfo(
        position = 6,
        unitSize = 2
    )
    public final Builder rxerrors(int rxerrors) {
      this.rxerrors = rxerrors;
      return this;
    }

    /**
     * Count of error corrected packets 
     */
    @MavlinkFieldInfo(
        position = 7,
        unitSize = 2
    )
    public final Builder fixed(int fixed) {
      this.fixed = fixed;
      return this;
    }

    /**
     * Local signal strength 
     */
    @MavlinkFieldInfo(
        position = 1,
        unitSize = 1
    )
    public final Builder rssi(int rssi) {
      this.rssi = rssi;
      return this;
    }

    /**
     * Remote signal strength 
     */
    @MavlinkFieldInfo(
        position = 2,
        unitSize = 1
    )
    public final Builder remrssi(int remrssi) {
      this.remrssi = remrssi;
      return this;
    }

    /**
     * Remaining free buffer space in percent. 
     */
    @MavlinkFieldInfo(
        position = 3,
        unitSize = 1
    )
    public final Builder txbuf(int txbuf) {
      this.txbuf = txbuf;
      return this;
    }

    /**
     * Background noise level 
     */
    @MavlinkFieldInfo(
        position = 4,
        unitSize = 1
    )
    public final Builder noise(int noise) {
      this.noise = noise;
      return this;
    }

    /**
     * Remote background noise level 
     */
    @MavlinkFieldInfo(
        position = 5,
        unitSize = 1
    )
    public final Builder remnoise(int remnoise) {
      this.remnoise = remnoise;
      return this;
    }

    public final RadioStatus build() {
      return new RadioStatus(rxerrors, fixed, rssi, remrssi, txbuf, noise, remnoise);
    }
  }
}
