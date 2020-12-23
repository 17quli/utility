// ORM class for table 'tbltransadjust'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:24:33 NZDT 2020
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class tbltransadjust extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngAdjustKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.flngAdjustKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrAdjustType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fstrAdjustType = (String)value;
      }
    });
    setters.put("fintSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fintSequence = (Integer)value;
      }
    });
    setters.put("flngRequestKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.flngRequestKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngBillItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.flngBillItemKey = (Integer)value;
      }
    });
    setters.put("flngSourceTransKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.flngSourceTransKey = (Integer)value;
      }
    });
    setters.put("fstrSourceTransType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fstrSourceTransType = (String)value;
      }
    });
    setters.put("fdtmSourceEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fdtmSourceEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrTransAdjust", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fstrTransAdjust = (String)value;
      }
    });
    setters.put("fdtmAdjustEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fdtmAdjustEffect = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrAdjustSelectType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fstrAdjustSelectType = (String)value;
      }
    });
    setters.put("fcurMaxAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fcurMaxAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnDefaultTransEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fblnDefaultTransEffect = (Integer)value;
      }
    });
    setters.put("fblnCanChangeEffect", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fblnCanChangeEffect = (Integer)value;
      }
    });
    setters.put("fblnSpecificToTrans", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fblnSpecificToTrans = (Integer)value;
      }
    });
    setters.put("fblnForced", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fblnForced = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbltransadjust.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tbltransadjust() {
    init0();
  }
  private Integer flngAdjustKey;
  public Integer get_flngAdjustKey() {
    return flngAdjustKey;
  }
  public void set_flngAdjustKey(Integer flngAdjustKey) {
    this.flngAdjustKey = flngAdjustKey;
  }
  public tbltransadjust with_flngAdjustKey(Integer flngAdjustKey) {
    this.flngAdjustKey = flngAdjustKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tbltransadjust with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tbltransadjust with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrAdjustType;
  public String get_fstrAdjustType() {
    return fstrAdjustType;
  }
  public void set_fstrAdjustType(String fstrAdjustType) {
    this.fstrAdjustType = fstrAdjustType;
  }
  public tbltransadjust with_fstrAdjustType(String fstrAdjustType) {
    this.fstrAdjustType = fstrAdjustType;
    return this;
  }
  private Integer fintSequence;
  public Integer get_fintSequence() {
    return fintSequence;
  }
  public void set_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
  }
  public tbltransadjust with_fintSequence(Integer fintSequence) {
    this.fintSequence = fintSequence;
    return this;
  }
  private Integer flngRequestKey;
  public Integer get_flngRequestKey() {
    return flngRequestKey;
  }
  public void set_flngRequestKey(Integer flngRequestKey) {
    this.flngRequestKey = flngRequestKey;
  }
  public tbltransadjust with_flngRequestKey(Integer flngRequestKey) {
    this.flngRequestKey = flngRequestKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tbltransadjust with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tbltransadjust with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngBillItemKey;
  public Integer get_flngBillItemKey() {
    return flngBillItemKey;
  }
  public void set_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
  }
  public tbltransadjust with_flngBillItemKey(Integer flngBillItemKey) {
    this.flngBillItemKey = flngBillItemKey;
    return this;
  }
  private Integer flngSourceTransKey;
  public Integer get_flngSourceTransKey() {
    return flngSourceTransKey;
  }
  public void set_flngSourceTransKey(Integer flngSourceTransKey) {
    this.flngSourceTransKey = flngSourceTransKey;
  }
  public tbltransadjust with_flngSourceTransKey(Integer flngSourceTransKey) {
    this.flngSourceTransKey = flngSourceTransKey;
    return this;
  }
  private String fstrSourceTransType;
  public String get_fstrSourceTransType() {
    return fstrSourceTransType;
  }
  public void set_fstrSourceTransType(String fstrSourceTransType) {
    this.fstrSourceTransType = fstrSourceTransType;
  }
  public tbltransadjust with_fstrSourceTransType(String fstrSourceTransType) {
    this.fstrSourceTransType = fstrSourceTransType;
    return this;
  }
  private java.sql.Timestamp fdtmSourceEffect;
  public java.sql.Timestamp get_fdtmSourceEffect() {
    return fdtmSourceEffect;
  }
  public void set_fdtmSourceEffect(java.sql.Timestamp fdtmSourceEffect) {
    this.fdtmSourceEffect = fdtmSourceEffect;
  }
  public tbltransadjust with_fdtmSourceEffect(java.sql.Timestamp fdtmSourceEffect) {
    this.fdtmSourceEffect = fdtmSourceEffect;
    return this;
  }
  private String fstrTransAdjust;
  public String get_fstrTransAdjust() {
    return fstrTransAdjust;
  }
  public void set_fstrTransAdjust(String fstrTransAdjust) {
    this.fstrTransAdjust = fstrTransAdjust;
  }
  public tbltransadjust with_fstrTransAdjust(String fstrTransAdjust) {
    this.fstrTransAdjust = fstrTransAdjust;
    return this;
  }
  private java.sql.Timestamp fdtmAdjustEffect;
  public java.sql.Timestamp get_fdtmAdjustEffect() {
    return fdtmAdjustEffect;
  }
  public void set_fdtmAdjustEffect(java.sql.Timestamp fdtmAdjustEffect) {
    this.fdtmAdjustEffect = fdtmAdjustEffect;
  }
  public tbltransadjust with_fdtmAdjustEffect(java.sql.Timestamp fdtmAdjustEffect) {
    this.fdtmAdjustEffect = fdtmAdjustEffect;
    return this;
  }
  private String fstrAdjustSelectType;
  public String get_fstrAdjustSelectType() {
    return fstrAdjustSelectType;
  }
  public void set_fstrAdjustSelectType(String fstrAdjustSelectType) {
    this.fstrAdjustSelectType = fstrAdjustSelectType;
  }
  public tbltransadjust with_fstrAdjustSelectType(String fstrAdjustSelectType) {
    this.fstrAdjustSelectType = fstrAdjustSelectType;
    return this;
  }
  private java.math.BigDecimal fcurMaxAmount;
  public java.math.BigDecimal get_fcurMaxAmount() {
    return fcurMaxAmount;
  }
  public void set_fcurMaxAmount(java.math.BigDecimal fcurMaxAmount) {
    this.fcurMaxAmount = fcurMaxAmount;
  }
  public tbltransadjust with_fcurMaxAmount(java.math.BigDecimal fcurMaxAmount) {
    this.fcurMaxAmount = fcurMaxAmount;
    return this;
  }
  private Integer fblnDefaultTransEffect;
  public Integer get_fblnDefaultTransEffect() {
    return fblnDefaultTransEffect;
  }
  public void set_fblnDefaultTransEffect(Integer fblnDefaultTransEffect) {
    this.fblnDefaultTransEffect = fblnDefaultTransEffect;
  }
  public tbltransadjust with_fblnDefaultTransEffect(Integer fblnDefaultTransEffect) {
    this.fblnDefaultTransEffect = fblnDefaultTransEffect;
    return this;
  }
  private Integer fblnCanChangeEffect;
  public Integer get_fblnCanChangeEffect() {
    return fblnCanChangeEffect;
  }
  public void set_fblnCanChangeEffect(Integer fblnCanChangeEffect) {
    this.fblnCanChangeEffect = fblnCanChangeEffect;
  }
  public tbltransadjust with_fblnCanChangeEffect(Integer fblnCanChangeEffect) {
    this.fblnCanChangeEffect = fblnCanChangeEffect;
    return this;
  }
  private Integer fblnSpecificToTrans;
  public Integer get_fblnSpecificToTrans() {
    return fblnSpecificToTrans;
  }
  public void set_fblnSpecificToTrans(Integer fblnSpecificToTrans) {
    this.fblnSpecificToTrans = fblnSpecificToTrans;
  }
  public tbltransadjust with_fblnSpecificToTrans(Integer fblnSpecificToTrans) {
    this.fblnSpecificToTrans = fblnSpecificToTrans;
    return this;
  }
  private Integer fblnForced;
  public Integer get_fblnForced() {
    return fblnForced;
  }
  public void set_fblnForced(Integer fblnForced) {
    this.fblnForced = fblnForced;
  }
  public tbltransadjust with_fblnForced(Integer fblnForced) {
    this.fblnForced = fblnForced;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tbltransadjust with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tbltransadjust with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltransadjust)) {
      return false;
    }
    tbltransadjust that = (tbltransadjust) o;
    boolean equal = true;
    equal = equal && (this.flngAdjustKey == null ? that.flngAdjustKey == null : this.flngAdjustKey.equals(that.flngAdjustKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrAdjustType == null ? that.fstrAdjustType == null : this.fstrAdjustType.equals(that.fstrAdjustType));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.flngRequestKey == null ? that.flngRequestKey == null : this.flngRequestKey.equals(that.flngRequestKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.flngSourceTransKey == null ? that.flngSourceTransKey == null : this.flngSourceTransKey.equals(that.flngSourceTransKey));
    equal = equal && (this.fstrSourceTransType == null ? that.fstrSourceTransType == null : this.fstrSourceTransType.equals(that.fstrSourceTransType));
    equal = equal && (this.fdtmSourceEffect == null ? that.fdtmSourceEffect == null : this.fdtmSourceEffect.equals(that.fdtmSourceEffect));
    equal = equal && (this.fstrTransAdjust == null ? that.fstrTransAdjust == null : this.fstrTransAdjust.equals(that.fstrTransAdjust));
    equal = equal && (this.fdtmAdjustEffect == null ? that.fdtmAdjustEffect == null : this.fdtmAdjustEffect.equals(that.fdtmAdjustEffect));
    equal = equal && (this.fstrAdjustSelectType == null ? that.fstrAdjustSelectType == null : this.fstrAdjustSelectType.equals(that.fstrAdjustSelectType));
    equal = equal && (this.fcurMaxAmount == null ? that.fcurMaxAmount == null : this.fcurMaxAmount.equals(that.fcurMaxAmount));
    equal = equal && (this.fblnDefaultTransEffect == null ? that.fblnDefaultTransEffect == null : this.fblnDefaultTransEffect.equals(that.fblnDefaultTransEffect));
    equal = equal && (this.fblnCanChangeEffect == null ? that.fblnCanChangeEffect == null : this.fblnCanChangeEffect.equals(that.fblnCanChangeEffect));
    equal = equal && (this.fblnSpecificToTrans == null ? that.fblnSpecificToTrans == null : this.fblnSpecificToTrans.equals(that.fblnSpecificToTrans));
    equal = equal && (this.fblnForced == null ? that.fblnForced == null : this.fblnForced.equals(that.fblnForced));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbltransadjust)) {
      return false;
    }
    tbltransadjust that = (tbltransadjust) o;
    boolean equal = true;
    equal = equal && (this.flngAdjustKey == null ? that.flngAdjustKey == null : this.flngAdjustKey.equals(that.flngAdjustKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrAdjustType == null ? that.fstrAdjustType == null : this.fstrAdjustType.equals(that.fstrAdjustType));
    equal = equal && (this.fintSequence == null ? that.fintSequence == null : this.fintSequence.equals(that.fintSequence));
    equal = equal && (this.flngRequestKey == null ? that.flngRequestKey == null : this.flngRequestKey.equals(that.flngRequestKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngBillItemKey == null ? that.flngBillItemKey == null : this.flngBillItemKey.equals(that.flngBillItemKey));
    equal = equal && (this.flngSourceTransKey == null ? that.flngSourceTransKey == null : this.flngSourceTransKey.equals(that.flngSourceTransKey));
    equal = equal && (this.fstrSourceTransType == null ? that.fstrSourceTransType == null : this.fstrSourceTransType.equals(that.fstrSourceTransType));
    equal = equal && (this.fdtmSourceEffect == null ? that.fdtmSourceEffect == null : this.fdtmSourceEffect.equals(that.fdtmSourceEffect));
    equal = equal && (this.fstrTransAdjust == null ? that.fstrTransAdjust == null : this.fstrTransAdjust.equals(that.fstrTransAdjust));
    equal = equal && (this.fdtmAdjustEffect == null ? that.fdtmAdjustEffect == null : this.fdtmAdjustEffect.equals(that.fdtmAdjustEffect));
    equal = equal && (this.fstrAdjustSelectType == null ? that.fstrAdjustSelectType == null : this.fstrAdjustSelectType.equals(that.fstrAdjustSelectType));
    equal = equal && (this.fcurMaxAmount == null ? that.fcurMaxAmount == null : this.fcurMaxAmount.equals(that.fcurMaxAmount));
    equal = equal && (this.fblnDefaultTransEffect == null ? that.fblnDefaultTransEffect == null : this.fblnDefaultTransEffect.equals(that.fblnDefaultTransEffect));
    equal = equal && (this.fblnCanChangeEffect == null ? that.fblnCanChangeEffect == null : this.fblnCanChangeEffect.equals(that.fblnCanChangeEffect));
    equal = equal && (this.fblnSpecificToTrans == null ? that.fblnSpecificToTrans == null : this.fblnSpecificToTrans.equals(that.fblnSpecificToTrans));
    equal = equal && (this.fblnForced == null ? that.fblnForced == null : this.fblnForced.equals(that.fblnForced));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngAdjustKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAdjustType = JdbcWritableBridge.readString(4, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngRequestKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngSourceTransKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrSourceTransType = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmSourceEffect = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrTransAdjust = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmAdjustEffect = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrAdjustSelectType = JdbcWritableBridge.readString(15, __dbResults);
    this.fcurMaxAmount = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fblnDefaultTransEffect = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnCanChangeEffect = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnSpecificToTrans = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnForced = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngAdjustKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAdjustType = JdbcWritableBridge.readString(4, __dbResults);
    this.fintSequence = JdbcWritableBridge.readInteger(5, __dbResults);
    this.flngRequestKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.flngBillItemKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngSourceTransKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrSourceTransType = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmSourceEffect = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrTransAdjust = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmAdjustEffect = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrAdjustSelectType = JdbcWritableBridge.readString(15, __dbResults);
    this.fcurMaxAmount = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fblnDefaultTransEffect = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnCanChangeEffect = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnSpecificToTrans = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnForced = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAdjustKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRequestKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceTransKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceTransType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSourceEffect, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransAdjust, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAdjustEffect, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustSelectType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaxAmount, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefaultTransEffect, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanChangeEffect, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecificToTrans, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnForced, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngAdjustKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSequence, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngRequestKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngBillItemKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceTransKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceTransType, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSourceEffect, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransAdjust, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmAdjustEffect, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrAdjustSelectType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaxAmount, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDefaultTransEffect, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanChangeEffect, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecificToTrans, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnForced, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngAdjustKey = null;
    } else {
    this.flngAdjustKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAdjustType = null;
    } else {
    this.fstrAdjustType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintSequence = null;
    } else {
    this.fintSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngRequestKey = null;
    } else {
    this.flngRequestKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngBillItemKey = null;
    } else {
    this.flngBillItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSourceTransKey = null;
    } else {
    this.flngSourceTransKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceTransType = null;
    } else {
    this.fstrSourceTransType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSourceEffect = null;
    } else {
    this.fdtmSourceEffect = new Timestamp(__dataIn.readLong());
    this.fdtmSourceEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransAdjust = null;
    } else {
    this.fstrTransAdjust = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmAdjustEffect = null;
    } else {
    this.fdtmAdjustEffect = new Timestamp(__dataIn.readLong());
    this.fdtmAdjustEffect.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAdjustSelectType = null;
    } else {
    this.fstrAdjustSelectType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMaxAmount = null;
    } else {
    this.fcurMaxAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDefaultTransEffect = null;
    } else {
    this.fblnDefaultTransEffect = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanChangeEffect = null;
    } else {
    this.fblnCanChangeEffect = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSpecificToTrans = null;
    } else {
    this.fblnSpecificToTrans = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnForced = null;
    } else {
    this.fblnForced = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngAdjustKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAdjustKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fstrAdjustType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustType);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
    }
    if (null == this.flngRequestKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRequestKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.flngSourceTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceTransKey);
    }
    if (null == this.fstrSourceTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceTransType);
    }
    if (null == this.fdtmSourceEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSourceEffect.getTime());
    __dataOut.writeInt(this.fdtmSourceEffect.getNanos());
    }
    if (null == this.fstrTransAdjust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransAdjust);
    }
    if (null == this.fdtmAdjustEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAdjustEffect.getTime());
    __dataOut.writeInt(this.fdtmAdjustEffect.getNanos());
    }
    if (null == this.fstrAdjustSelectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustSelectType);
    }
    if (null == this.fcurMaxAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaxAmount, __dataOut);
    }
    if (null == this.fblnDefaultTransEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefaultTransEffect);
    }
    if (null == this.fblnCanChangeEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanChangeEffect);
    }
    if (null == this.fblnSpecificToTrans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecificToTrans);
    }
    if (null == this.fblnForced) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnForced);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngAdjustKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAdjustKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.fstrAdjustType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustType);
    }
    if (null == this.fintSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSequence);
    }
    if (null == this.flngRequestKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngRequestKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngBillItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngBillItemKey);
    }
    if (null == this.flngSourceTransKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceTransKey);
    }
    if (null == this.fstrSourceTransType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceTransType);
    }
    if (null == this.fdtmSourceEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSourceEffect.getTime());
    __dataOut.writeInt(this.fdtmSourceEffect.getNanos());
    }
    if (null == this.fstrTransAdjust) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransAdjust);
    }
    if (null == this.fdtmAdjustEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmAdjustEffect.getTime());
    __dataOut.writeInt(this.fdtmAdjustEffect.getNanos());
    }
    if (null == this.fstrAdjustSelectType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAdjustSelectType);
    }
    if (null == this.fcurMaxAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaxAmount, __dataOut);
    }
    if (null == this.fblnDefaultTransEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDefaultTransEffect);
    }
    if (null == this.fblnCanChangeEffect) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanChangeEffect);
    }
    if (null == this.fblnSpecificToTrans) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecificToTrans);
    }
    if (null == this.fblnForced) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnForced);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(flngAdjustKey==null?"\\N":"" + flngAdjustKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustType==null?"\\N":fstrAdjustType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRequestKey==null?"\\N":"" + flngRequestKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceTransKey==null?"\\N":"" + flngSourceTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceTransType==null?"\\N":fstrSourceTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSourceEffect==null?"\\N":"" + fdtmSourceEffect, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransAdjust==null?"\\N":fstrTransAdjust, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAdjustEffect==null?"\\N":"" + fdtmAdjustEffect, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustSelectType==null?"\\N":fstrAdjustSelectType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaxAmount==null?"\\N":fcurMaxAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefaultTransEffect==null?"\\N":"" + fblnDefaultTransEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanChangeEffect==null?"\\N":"" + fblnCanChangeEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecificToTrans==null?"\\N":"" + fblnSpecificToTrans, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnForced==null?"\\N":"" + fblnForced, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngAdjustKey==null?"\\N":"" + flngAdjustKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustType==null?"\\N":fstrAdjustType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSequence==null?"\\N":"" + fintSequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngRequestKey==null?"\\N":"" + flngRequestKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngBillItemKey==null?"\\N":"" + flngBillItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceTransKey==null?"\\N":"" + flngSourceTransKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceTransType==null?"\\N":fstrSourceTransType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSourceEffect==null?"\\N":"" + fdtmSourceEffect, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransAdjust==null?"\\N":fstrTransAdjust, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmAdjustEffect==null?"\\N":"" + fdtmAdjustEffect, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAdjustSelectType==null?"\\N":fstrAdjustSelectType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaxAmount==null?"\\N":fcurMaxAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDefaultTransEffect==null?"\\N":"" + fblnDefaultTransEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanChangeEffect==null?"\\N":"" + fblnCanChangeEffect, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecificToTrans==null?"\\N":"" + fblnSpecificToTrans, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnForced==null?"\\N":"" + fblnForced, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAdjustKey = null; } else {
      this.flngAdjustKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdjustType = null; } else {
      this.fstrAdjustType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRequestKey = null; } else {
      this.flngRequestKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceTransKey = null; } else {
      this.flngSourceTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceTransType = null; } else {
      this.fstrSourceTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSourceEffect = null; } else {
      this.fdtmSourceEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransAdjust = null; } else {
      this.fstrTransAdjust = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAdjustEffect = null; } else {
      this.fdtmAdjustEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdjustSelectType = null; } else {
      this.fstrAdjustSelectType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaxAmount = null; } else {
      this.fcurMaxAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefaultTransEffect = null; } else {
      this.fblnDefaultTransEffect = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanChangeEffect = null; } else {
      this.fblnCanChangeEffect = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecificToTrans = null; } else {
      this.fblnSpecificToTrans = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnForced = null; } else {
      this.fblnForced = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAdjustKey = null; } else {
      this.flngAdjustKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdjustType = null; } else {
      this.fstrAdjustType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSequence = null; } else {
      this.fintSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngRequestKey = null; } else {
      this.flngRequestKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngBillItemKey = null; } else {
      this.flngBillItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceTransKey = null; } else {
      this.flngSourceTransKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceTransType = null; } else {
      this.fstrSourceTransType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSourceEffect = null; } else {
      this.fdtmSourceEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransAdjust = null; } else {
      this.fstrTransAdjust = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmAdjustEffect = null; } else {
      this.fdtmAdjustEffect = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAdjustSelectType = null; } else {
      this.fstrAdjustSelectType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaxAmount = null; } else {
      this.fcurMaxAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDefaultTransEffect = null; } else {
      this.fblnDefaultTransEffect = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanChangeEffect = null; } else {
      this.fblnCanChangeEffect = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecificToTrans = null; } else {
      this.fblnSpecificToTrans = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnForced = null; } else {
      this.fblnForced = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tbltransadjust o = (tbltransadjust) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmSourceEffect = (o.fdtmSourceEffect != null) ? (java.sql.Timestamp) o.fdtmSourceEffect.clone() : null;
    o.fdtmAdjustEffect = (o.fdtmAdjustEffect != null) ? (java.sql.Timestamp) o.fdtmAdjustEffect.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbltransadjust o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmSourceEffect = (o.fdtmSourceEffect != null) ? (java.sql.Timestamp) o.fdtmSourceEffect.clone() : null;
    o.fdtmAdjustEffect = (o.fdtmAdjustEffect != null) ? (java.sql.Timestamp) o.fdtmAdjustEffect.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngAdjustKey", this.flngAdjustKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrAdjustType", this.fstrAdjustType);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("flngRequestKey", this.flngRequestKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("flngSourceTransKey", this.flngSourceTransKey);
    __sqoop$field_map.put("fstrSourceTransType", this.fstrSourceTransType);
    __sqoop$field_map.put("fdtmSourceEffect", this.fdtmSourceEffect);
    __sqoop$field_map.put("fstrTransAdjust", this.fstrTransAdjust);
    __sqoop$field_map.put("fdtmAdjustEffect", this.fdtmAdjustEffect);
    __sqoop$field_map.put("fstrAdjustSelectType", this.fstrAdjustSelectType);
    __sqoop$field_map.put("fcurMaxAmount", this.fcurMaxAmount);
    __sqoop$field_map.put("fblnDefaultTransEffect", this.fblnDefaultTransEffect);
    __sqoop$field_map.put("fblnCanChangeEffect", this.fblnCanChangeEffect);
    __sqoop$field_map.put("fblnSpecificToTrans", this.fblnSpecificToTrans);
    __sqoop$field_map.put("fblnForced", this.fblnForced);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngAdjustKey", this.flngAdjustKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrAdjustType", this.fstrAdjustType);
    __sqoop$field_map.put("fintSequence", this.fintSequence);
    __sqoop$field_map.put("flngRequestKey", this.flngRequestKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngBillItemKey", this.flngBillItemKey);
    __sqoop$field_map.put("flngSourceTransKey", this.flngSourceTransKey);
    __sqoop$field_map.put("fstrSourceTransType", this.fstrSourceTransType);
    __sqoop$field_map.put("fdtmSourceEffect", this.fdtmSourceEffect);
    __sqoop$field_map.put("fstrTransAdjust", this.fstrTransAdjust);
    __sqoop$field_map.put("fdtmAdjustEffect", this.fdtmAdjustEffect);
    __sqoop$field_map.put("fstrAdjustSelectType", this.fstrAdjustSelectType);
    __sqoop$field_map.put("fcurMaxAmount", this.fcurMaxAmount);
    __sqoop$field_map.put("fblnDefaultTransEffect", this.fblnDefaultTransEffect);
    __sqoop$field_map.put("fblnCanChangeEffect", this.fblnCanChangeEffect);
    __sqoop$field_map.put("fblnSpecificToTrans", this.fblnSpecificToTrans);
    __sqoop$field_map.put("fblnForced", this.fblnForced);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
