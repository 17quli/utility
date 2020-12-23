// ORM class for table 'tblbcmfund'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:27:41 NZDT 2020
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

public class tblbcmfund extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngFundKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.flngFundKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrCreditType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fstrCreditType = (String)value;
      }
    });
    setters.put("fdtmRequestFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fdtmRequestFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmRequestTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fdtmRequestTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmClaimFrom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fdtmClaimFrom = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmClaimTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fdtmClaimTo = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurMaxClaim", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fcurMaxClaim = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fcurApproved = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fcurClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRemainingApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fcurRemainingApproved = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRemainingClaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fcurRemainingClaimed = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnMultipleClaimants", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fblnMultipleClaimants = (Integer)value;
      }
    });
    setters.put("fblnTransferable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fblnTransferable = (Integer)value;
      }
    });
    setters.put("fblnSplittable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fblnSplittable = (Integer)value;
      }
    });
    setters.put("fblnRefundable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fblnRefundable = (Integer)value;
      }
    });
    setters.put("fblnCapOnApprove", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fblnCapOnApprove = (Integer)value;
      }
    });
    setters.put("fblnCapOnClaim", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fblnCapOnClaim = (Integer)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblbcmfund.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblbcmfund() {
    init0();
  }
  private Integer flngFundKey;
  public Integer get_flngFundKey() {
    return flngFundKey;
  }
  public void set_flngFundKey(Integer flngFundKey) {
    this.flngFundKey = flngFundKey;
  }
  public tblbcmfund with_flngFundKey(Integer flngFundKey) {
    this.flngFundKey = flngFundKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblbcmfund with_flngVer(Integer flngVer) {
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
  public tblbcmfund with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrCreditType;
  public String get_fstrCreditType() {
    return fstrCreditType;
  }
  public void set_fstrCreditType(String fstrCreditType) {
    this.fstrCreditType = fstrCreditType;
  }
  public tblbcmfund with_fstrCreditType(String fstrCreditType) {
    this.fstrCreditType = fstrCreditType;
    return this;
  }
  private java.sql.Timestamp fdtmRequestFrom;
  public java.sql.Timestamp get_fdtmRequestFrom() {
    return fdtmRequestFrom;
  }
  public void set_fdtmRequestFrom(java.sql.Timestamp fdtmRequestFrom) {
    this.fdtmRequestFrom = fdtmRequestFrom;
  }
  public tblbcmfund with_fdtmRequestFrom(java.sql.Timestamp fdtmRequestFrom) {
    this.fdtmRequestFrom = fdtmRequestFrom;
    return this;
  }
  private java.sql.Timestamp fdtmRequestTo;
  public java.sql.Timestamp get_fdtmRequestTo() {
    return fdtmRequestTo;
  }
  public void set_fdtmRequestTo(java.sql.Timestamp fdtmRequestTo) {
    this.fdtmRequestTo = fdtmRequestTo;
  }
  public tblbcmfund with_fdtmRequestTo(java.sql.Timestamp fdtmRequestTo) {
    this.fdtmRequestTo = fdtmRequestTo;
    return this;
  }
  private java.sql.Timestamp fdtmClaimFrom;
  public java.sql.Timestamp get_fdtmClaimFrom() {
    return fdtmClaimFrom;
  }
  public void set_fdtmClaimFrom(java.sql.Timestamp fdtmClaimFrom) {
    this.fdtmClaimFrom = fdtmClaimFrom;
  }
  public tblbcmfund with_fdtmClaimFrom(java.sql.Timestamp fdtmClaimFrom) {
    this.fdtmClaimFrom = fdtmClaimFrom;
    return this;
  }
  private java.sql.Timestamp fdtmClaimTo;
  public java.sql.Timestamp get_fdtmClaimTo() {
    return fdtmClaimTo;
  }
  public void set_fdtmClaimTo(java.sql.Timestamp fdtmClaimTo) {
    this.fdtmClaimTo = fdtmClaimTo;
  }
  public tblbcmfund with_fdtmClaimTo(java.sql.Timestamp fdtmClaimTo) {
    this.fdtmClaimTo = fdtmClaimTo;
    return this;
  }
  private java.math.BigDecimal fcurMaxClaim;
  public java.math.BigDecimal get_fcurMaxClaim() {
    return fcurMaxClaim;
  }
  public void set_fcurMaxClaim(java.math.BigDecimal fcurMaxClaim) {
    this.fcurMaxClaim = fcurMaxClaim;
  }
  public tblbcmfund with_fcurMaxClaim(java.math.BigDecimal fcurMaxClaim) {
    this.fcurMaxClaim = fcurMaxClaim;
    return this;
  }
  private java.math.BigDecimal fcurApproved;
  public java.math.BigDecimal get_fcurApproved() {
    return fcurApproved;
  }
  public void set_fcurApproved(java.math.BigDecimal fcurApproved) {
    this.fcurApproved = fcurApproved;
  }
  public tblbcmfund with_fcurApproved(java.math.BigDecimal fcurApproved) {
    this.fcurApproved = fcurApproved;
    return this;
  }
  private java.math.BigDecimal fcurClaimed;
  public java.math.BigDecimal get_fcurClaimed() {
    return fcurClaimed;
  }
  public void set_fcurClaimed(java.math.BigDecimal fcurClaimed) {
    this.fcurClaimed = fcurClaimed;
  }
  public tblbcmfund with_fcurClaimed(java.math.BigDecimal fcurClaimed) {
    this.fcurClaimed = fcurClaimed;
    return this;
  }
  private java.math.BigDecimal fcurRemainingApproved;
  public java.math.BigDecimal get_fcurRemainingApproved() {
    return fcurRemainingApproved;
  }
  public void set_fcurRemainingApproved(java.math.BigDecimal fcurRemainingApproved) {
    this.fcurRemainingApproved = fcurRemainingApproved;
  }
  public tblbcmfund with_fcurRemainingApproved(java.math.BigDecimal fcurRemainingApproved) {
    this.fcurRemainingApproved = fcurRemainingApproved;
    return this;
  }
  private java.math.BigDecimal fcurRemainingClaimed;
  public java.math.BigDecimal get_fcurRemainingClaimed() {
    return fcurRemainingClaimed;
  }
  public void set_fcurRemainingClaimed(java.math.BigDecimal fcurRemainingClaimed) {
    this.fcurRemainingClaimed = fcurRemainingClaimed;
  }
  public tblbcmfund with_fcurRemainingClaimed(java.math.BigDecimal fcurRemainingClaimed) {
    this.fcurRemainingClaimed = fcurRemainingClaimed;
    return this;
  }
  private Integer fblnMultipleClaimants;
  public Integer get_fblnMultipleClaimants() {
    return fblnMultipleClaimants;
  }
  public void set_fblnMultipleClaimants(Integer fblnMultipleClaimants) {
    this.fblnMultipleClaimants = fblnMultipleClaimants;
  }
  public tblbcmfund with_fblnMultipleClaimants(Integer fblnMultipleClaimants) {
    this.fblnMultipleClaimants = fblnMultipleClaimants;
    return this;
  }
  private Integer fblnTransferable;
  public Integer get_fblnTransferable() {
    return fblnTransferable;
  }
  public void set_fblnTransferable(Integer fblnTransferable) {
    this.fblnTransferable = fblnTransferable;
  }
  public tblbcmfund with_fblnTransferable(Integer fblnTransferable) {
    this.fblnTransferable = fblnTransferable;
    return this;
  }
  private Integer fblnSplittable;
  public Integer get_fblnSplittable() {
    return fblnSplittable;
  }
  public void set_fblnSplittable(Integer fblnSplittable) {
    this.fblnSplittable = fblnSplittable;
  }
  public tblbcmfund with_fblnSplittable(Integer fblnSplittable) {
    this.fblnSplittable = fblnSplittable;
    return this;
  }
  private Integer fblnRefundable;
  public Integer get_fblnRefundable() {
    return fblnRefundable;
  }
  public void set_fblnRefundable(Integer fblnRefundable) {
    this.fblnRefundable = fblnRefundable;
  }
  public tblbcmfund with_fblnRefundable(Integer fblnRefundable) {
    this.fblnRefundable = fblnRefundable;
    return this;
  }
  private Integer fblnCapOnApprove;
  public Integer get_fblnCapOnApprove() {
    return fblnCapOnApprove;
  }
  public void set_fblnCapOnApprove(Integer fblnCapOnApprove) {
    this.fblnCapOnApprove = fblnCapOnApprove;
  }
  public tblbcmfund with_fblnCapOnApprove(Integer fblnCapOnApprove) {
    this.fblnCapOnApprove = fblnCapOnApprove;
    return this;
  }
  private Integer fblnCapOnClaim;
  public Integer get_fblnCapOnClaim() {
    return fblnCapOnClaim;
  }
  public void set_fblnCapOnClaim(Integer fblnCapOnClaim) {
    this.fblnCapOnClaim = fblnCapOnClaim;
  }
  public tblbcmfund with_fblnCapOnClaim(Integer fblnCapOnClaim) {
    this.fblnCapOnClaim = fblnCapOnClaim;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblbcmfund with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblbcmfund with_fstrWho(String fstrWho) {
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
  public tblbcmfund with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblbcmfund)) {
      return false;
    }
    tblbcmfund that = (tblbcmfund) o;
    boolean equal = true;
    equal = equal && (this.flngFundKey == null ? that.flngFundKey == null : this.flngFundKey.equals(that.flngFundKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrCreditType == null ? that.fstrCreditType == null : this.fstrCreditType.equals(that.fstrCreditType));
    equal = equal && (this.fdtmRequestFrom == null ? that.fdtmRequestFrom == null : this.fdtmRequestFrom.equals(that.fdtmRequestFrom));
    equal = equal && (this.fdtmRequestTo == null ? that.fdtmRequestTo == null : this.fdtmRequestTo.equals(that.fdtmRequestTo));
    equal = equal && (this.fdtmClaimFrom == null ? that.fdtmClaimFrom == null : this.fdtmClaimFrom.equals(that.fdtmClaimFrom));
    equal = equal && (this.fdtmClaimTo == null ? that.fdtmClaimTo == null : this.fdtmClaimTo.equals(that.fdtmClaimTo));
    equal = equal && (this.fcurMaxClaim == null ? that.fcurMaxClaim == null : this.fcurMaxClaim.equals(that.fcurMaxClaim));
    equal = equal && (this.fcurApproved == null ? that.fcurApproved == null : this.fcurApproved.equals(that.fcurApproved));
    equal = equal && (this.fcurClaimed == null ? that.fcurClaimed == null : this.fcurClaimed.equals(that.fcurClaimed));
    equal = equal && (this.fcurRemainingApproved == null ? that.fcurRemainingApproved == null : this.fcurRemainingApproved.equals(that.fcurRemainingApproved));
    equal = equal && (this.fcurRemainingClaimed == null ? that.fcurRemainingClaimed == null : this.fcurRemainingClaimed.equals(that.fcurRemainingClaimed));
    equal = equal && (this.fblnMultipleClaimants == null ? that.fblnMultipleClaimants == null : this.fblnMultipleClaimants.equals(that.fblnMultipleClaimants));
    equal = equal && (this.fblnTransferable == null ? that.fblnTransferable == null : this.fblnTransferable.equals(that.fblnTransferable));
    equal = equal && (this.fblnSplittable == null ? that.fblnSplittable == null : this.fblnSplittable.equals(that.fblnSplittable));
    equal = equal && (this.fblnRefundable == null ? that.fblnRefundable == null : this.fblnRefundable.equals(that.fblnRefundable));
    equal = equal && (this.fblnCapOnApprove == null ? that.fblnCapOnApprove == null : this.fblnCapOnApprove.equals(that.fblnCapOnApprove));
    equal = equal && (this.fblnCapOnClaim == null ? that.fblnCapOnClaim == null : this.fblnCapOnClaim.equals(that.fblnCapOnClaim));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblbcmfund)) {
      return false;
    }
    tblbcmfund that = (tblbcmfund) o;
    boolean equal = true;
    equal = equal && (this.flngFundKey == null ? that.flngFundKey == null : this.flngFundKey.equals(that.flngFundKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrCreditType == null ? that.fstrCreditType == null : this.fstrCreditType.equals(that.fstrCreditType));
    equal = equal && (this.fdtmRequestFrom == null ? that.fdtmRequestFrom == null : this.fdtmRequestFrom.equals(that.fdtmRequestFrom));
    equal = equal && (this.fdtmRequestTo == null ? that.fdtmRequestTo == null : this.fdtmRequestTo.equals(that.fdtmRequestTo));
    equal = equal && (this.fdtmClaimFrom == null ? that.fdtmClaimFrom == null : this.fdtmClaimFrom.equals(that.fdtmClaimFrom));
    equal = equal && (this.fdtmClaimTo == null ? that.fdtmClaimTo == null : this.fdtmClaimTo.equals(that.fdtmClaimTo));
    equal = equal && (this.fcurMaxClaim == null ? that.fcurMaxClaim == null : this.fcurMaxClaim.equals(that.fcurMaxClaim));
    equal = equal && (this.fcurApproved == null ? that.fcurApproved == null : this.fcurApproved.equals(that.fcurApproved));
    equal = equal && (this.fcurClaimed == null ? that.fcurClaimed == null : this.fcurClaimed.equals(that.fcurClaimed));
    equal = equal && (this.fcurRemainingApproved == null ? that.fcurRemainingApproved == null : this.fcurRemainingApproved.equals(that.fcurRemainingApproved));
    equal = equal && (this.fcurRemainingClaimed == null ? that.fcurRemainingClaimed == null : this.fcurRemainingClaimed.equals(that.fcurRemainingClaimed));
    equal = equal && (this.fblnMultipleClaimants == null ? that.fblnMultipleClaimants == null : this.fblnMultipleClaimants.equals(that.fblnMultipleClaimants));
    equal = equal && (this.fblnTransferable == null ? that.fblnTransferable == null : this.fblnTransferable.equals(that.fblnTransferable));
    equal = equal && (this.fblnSplittable == null ? that.fblnSplittable == null : this.fblnSplittable.equals(that.fblnSplittable));
    equal = equal && (this.fblnRefundable == null ? that.fblnRefundable == null : this.fblnRefundable.equals(that.fblnRefundable));
    equal = equal && (this.fblnCapOnApprove == null ? that.fblnCapOnApprove == null : this.fblnCapOnApprove.equals(that.fblnCapOnApprove));
    equal = equal && (this.fblnCapOnClaim == null ? that.fblnCapOnClaim == null : this.fblnCapOnClaim.equals(that.fblnCapOnClaim));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngFundKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCreditType = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmRequestFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmRequestTo = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmClaimFrom = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmClaimTo = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurMaxClaim = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurApproved = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurClaimed = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurRemainingApproved = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurRemainingClaimed = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnMultipleClaimants = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnTransferable = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnSplittable = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnRefundable = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnCapOnApprove = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnCapOnClaim = JdbcWritableBridge.readInteger(19, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngFundKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrCreditType = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmRequestFrom = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmRequestTo = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmClaimFrom = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fdtmClaimTo = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurMaxClaim = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurApproved = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurClaimed = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurRemainingApproved = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurRemainingClaimed = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnMultipleClaimants = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnTransferable = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnSplittable = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnRefundable = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnCapOnApprove = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnCapOnClaim = JdbcWritableBridge.readInteger(19, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(20, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFundKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequestFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequestTo, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClaimFrom, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClaimTo, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaxClaim, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurApproved, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurClaimed, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemainingApproved, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemainingClaimed, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultipleClaimants, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransferable, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSplittable, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRefundable, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCapOnApprove, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCapOnClaim, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngFundKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreditType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequestFrom, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRequestTo, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClaimFrom, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmClaimTo, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaxClaim, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurApproved, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurClaimed, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemainingApproved, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRemainingClaimed, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMultipleClaimants, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTransferable, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSplittable, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRefundable, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCapOnApprove, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCapOnClaim, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 22 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngFundKey = null;
    } else {
    this.flngFundKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrCreditType = null;
    } else {
    this.fstrCreditType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRequestFrom = null;
    } else {
    this.fdtmRequestFrom = new Timestamp(__dataIn.readLong());
    this.fdtmRequestFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRequestTo = null;
    } else {
    this.fdtmRequestTo = new Timestamp(__dataIn.readLong());
    this.fdtmRequestTo.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClaimFrom = null;
    } else {
    this.fdtmClaimFrom = new Timestamp(__dataIn.readLong());
    this.fdtmClaimFrom.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmClaimTo = null;
    } else {
    this.fdtmClaimTo = new Timestamp(__dataIn.readLong());
    this.fdtmClaimTo.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMaxClaim = null;
    } else {
    this.fcurMaxClaim = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurApproved = null;
    } else {
    this.fcurApproved = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurClaimed = null;
    } else {
    this.fcurClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRemainingApproved = null;
    } else {
    this.fcurRemainingApproved = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRemainingClaimed = null;
    } else {
    this.fcurRemainingClaimed = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMultipleClaimants = null;
    } else {
    this.fblnMultipleClaimants = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTransferable = null;
    } else {
    this.fblnTransferable = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSplittable = null;
    } else {
    this.fblnSplittable = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRefundable = null;
    } else {
    this.fblnRefundable = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCapOnApprove = null;
    } else {
    this.fblnCapOnApprove = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCapOnClaim = null;
    } else {
    this.fblnCapOnClaim = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngFundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFundKey);
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
    if (null == this.fstrCreditType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditType);
    }
    if (null == this.fdtmRequestFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequestFrom.getTime());
    __dataOut.writeInt(this.fdtmRequestFrom.getNanos());
    }
    if (null == this.fdtmRequestTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequestTo.getTime());
    __dataOut.writeInt(this.fdtmRequestTo.getNanos());
    }
    if (null == this.fdtmClaimFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClaimFrom.getTime());
    __dataOut.writeInt(this.fdtmClaimFrom.getNanos());
    }
    if (null == this.fdtmClaimTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClaimTo.getTime());
    __dataOut.writeInt(this.fdtmClaimTo.getNanos());
    }
    if (null == this.fcurMaxClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaxClaim, __dataOut);
    }
    if (null == this.fcurApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurApproved, __dataOut);
    }
    if (null == this.fcurClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurClaimed, __dataOut);
    }
    if (null == this.fcurRemainingApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemainingApproved, __dataOut);
    }
    if (null == this.fcurRemainingClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemainingClaimed, __dataOut);
    }
    if (null == this.fblnMultipleClaimants) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultipleClaimants);
    }
    if (null == this.fblnTransferable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransferable);
    }
    if (null == this.fblnSplittable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSplittable);
    }
    if (null == this.fblnRefundable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRefundable);
    }
    if (null == this.fblnCapOnApprove) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCapOnApprove);
    }
    if (null == this.fblnCapOnClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCapOnClaim);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngFundKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFundKey);
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
    if (null == this.fstrCreditType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreditType);
    }
    if (null == this.fdtmRequestFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequestFrom.getTime());
    __dataOut.writeInt(this.fdtmRequestFrom.getNanos());
    }
    if (null == this.fdtmRequestTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRequestTo.getTime());
    __dataOut.writeInt(this.fdtmRequestTo.getNanos());
    }
    if (null == this.fdtmClaimFrom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClaimFrom.getTime());
    __dataOut.writeInt(this.fdtmClaimFrom.getNanos());
    }
    if (null == this.fdtmClaimTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmClaimTo.getTime());
    __dataOut.writeInt(this.fdtmClaimTo.getNanos());
    }
    if (null == this.fcurMaxClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaxClaim, __dataOut);
    }
    if (null == this.fcurApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurApproved, __dataOut);
    }
    if (null == this.fcurClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurClaimed, __dataOut);
    }
    if (null == this.fcurRemainingApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemainingApproved, __dataOut);
    }
    if (null == this.fcurRemainingClaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRemainingClaimed, __dataOut);
    }
    if (null == this.fblnMultipleClaimants) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMultipleClaimants);
    }
    if (null == this.fblnTransferable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTransferable);
    }
    if (null == this.fblnSplittable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSplittable);
    }
    if (null == this.fblnRefundable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRefundable);
    }
    if (null == this.fblnCapOnApprove) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCapOnApprove);
    }
    if (null == this.fblnCapOnClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCapOnClaim);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFundKey==null?"\\N":"" + flngFundKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditType==null?"\\N":fstrCreditType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequestFrom==null?"\\N":"" + fdtmRequestFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequestTo==null?"\\N":"" + fdtmRequestTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClaimFrom==null?"\\N":"" + fdtmClaimFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClaimTo==null?"\\N":"" + fdtmClaimTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaxClaim==null?"\\N":fcurMaxClaim.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurApproved==null?"\\N":fcurApproved.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurClaimed==null?"\\N":fcurClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemainingApproved==null?"\\N":fcurRemainingApproved.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemainingClaimed==null?"\\N":fcurRemainingClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultipleClaimants==null?"\\N":"" + fblnMultipleClaimants, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransferable==null?"\\N":"" + fblnTransferable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSplittable==null?"\\N":"" + fblnSplittable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRefundable==null?"\\N":"" + fblnRefundable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCapOnApprove==null?"\\N":"" + fblnCapOnApprove, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCapOnClaim==null?"\\N":"" + fblnCapOnClaim, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFundKey==null?"\\N":"" + flngFundKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreditType==null?"\\N":fstrCreditType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequestFrom==null?"\\N":"" + fdtmRequestFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRequestTo==null?"\\N":"" + fdtmRequestTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClaimFrom==null?"\\N":"" + fdtmClaimFrom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmClaimTo==null?"\\N":"" + fdtmClaimTo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaxClaim==null?"\\N":fcurMaxClaim.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurApproved==null?"\\N":fcurApproved.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurClaimed==null?"\\N":fcurClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemainingApproved==null?"\\N":fcurRemainingApproved.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRemainingClaimed==null?"\\N":fcurRemainingClaimed.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMultipleClaimants==null?"\\N":"" + fblnMultipleClaimants, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTransferable==null?"\\N":"" + fblnTransferable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSplittable==null?"\\N":"" + fblnSplittable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRefundable==null?"\\N":"" + fblnRefundable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCapOnApprove==null?"\\N":"" + fblnCapOnApprove, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCapOnClaim==null?"\\N":"" + fblnCapOnClaim, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFundKey = null; } else {
      this.flngFundKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCreditType = null; } else {
      this.fstrCreditType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRequestFrom = null; } else {
      this.fdtmRequestFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRequestTo = null; } else {
      this.fdtmRequestTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClaimFrom = null; } else {
      this.fdtmClaimFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClaimTo = null; } else {
      this.fdtmClaimTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaxClaim = null; } else {
      this.fcurMaxClaim = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurApproved = null; } else {
      this.fcurApproved = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurClaimed = null; } else {
      this.fcurClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemainingApproved = null; } else {
      this.fcurRemainingApproved = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemainingClaimed = null; } else {
      this.fcurRemainingClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultipleClaimants = null; } else {
      this.fblnMultipleClaimants = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransferable = null; } else {
      this.fblnTransferable = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSplittable = null; } else {
      this.fblnSplittable = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRefundable = null; } else {
      this.fblnRefundable = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCapOnApprove = null; } else {
      this.fblnCapOnApprove = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCapOnClaim = null; } else {
      this.fblnCapOnClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFundKey = null; } else {
      this.flngFundKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrCreditType = null; } else {
      this.fstrCreditType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRequestFrom = null; } else {
      this.fdtmRequestFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRequestTo = null; } else {
      this.fdtmRequestTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClaimFrom = null; } else {
      this.fdtmClaimFrom = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmClaimTo = null; } else {
      this.fdtmClaimTo = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaxClaim = null; } else {
      this.fcurMaxClaim = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurApproved = null; } else {
      this.fcurApproved = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurClaimed = null; } else {
      this.fcurClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemainingApproved = null; } else {
      this.fcurRemainingApproved = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRemainingClaimed = null; } else {
      this.fcurRemainingClaimed = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMultipleClaimants = null; } else {
      this.fblnMultipleClaimants = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTransferable = null; } else {
      this.fblnTransferable = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSplittable = null; } else {
      this.fblnSplittable = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRefundable = null; } else {
      this.fblnRefundable = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCapOnApprove = null; } else {
      this.fblnCapOnApprove = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCapOnClaim = null; } else {
      this.fblnCapOnClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    tblbcmfund o = (tblbcmfund) super.clone();
    o.fdtmRequestFrom = (o.fdtmRequestFrom != null) ? (java.sql.Timestamp) o.fdtmRequestFrom.clone() : null;
    o.fdtmRequestTo = (o.fdtmRequestTo != null) ? (java.sql.Timestamp) o.fdtmRequestTo.clone() : null;
    o.fdtmClaimFrom = (o.fdtmClaimFrom != null) ? (java.sql.Timestamp) o.fdtmClaimFrom.clone() : null;
    o.fdtmClaimTo = (o.fdtmClaimTo != null) ? (java.sql.Timestamp) o.fdtmClaimTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblbcmfund o) throws CloneNotSupportedException {
    o.fdtmRequestFrom = (o.fdtmRequestFrom != null) ? (java.sql.Timestamp) o.fdtmRequestFrom.clone() : null;
    o.fdtmRequestTo = (o.fdtmRequestTo != null) ? (java.sql.Timestamp) o.fdtmRequestTo.clone() : null;
    o.fdtmClaimFrom = (o.fdtmClaimFrom != null) ? (java.sql.Timestamp) o.fdtmClaimFrom.clone() : null;
    o.fdtmClaimTo = (o.fdtmClaimTo != null) ? (java.sql.Timestamp) o.fdtmClaimTo.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngFundKey", this.flngFundKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrCreditType", this.fstrCreditType);
    __sqoop$field_map.put("fdtmRequestFrom", this.fdtmRequestFrom);
    __sqoop$field_map.put("fdtmRequestTo", this.fdtmRequestTo);
    __sqoop$field_map.put("fdtmClaimFrom", this.fdtmClaimFrom);
    __sqoop$field_map.put("fdtmClaimTo", this.fdtmClaimTo);
    __sqoop$field_map.put("fcurMaxClaim", this.fcurMaxClaim);
    __sqoop$field_map.put("fcurApproved", this.fcurApproved);
    __sqoop$field_map.put("fcurClaimed", this.fcurClaimed);
    __sqoop$field_map.put("fcurRemainingApproved", this.fcurRemainingApproved);
    __sqoop$field_map.put("fcurRemainingClaimed", this.fcurRemainingClaimed);
    __sqoop$field_map.put("fblnMultipleClaimants", this.fblnMultipleClaimants);
    __sqoop$field_map.put("fblnTransferable", this.fblnTransferable);
    __sqoop$field_map.put("fblnSplittable", this.fblnSplittable);
    __sqoop$field_map.put("fblnRefundable", this.fblnRefundable);
    __sqoop$field_map.put("fblnCapOnApprove", this.fblnCapOnApprove);
    __sqoop$field_map.put("fblnCapOnClaim", this.fblnCapOnClaim);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngFundKey", this.flngFundKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrCreditType", this.fstrCreditType);
    __sqoop$field_map.put("fdtmRequestFrom", this.fdtmRequestFrom);
    __sqoop$field_map.put("fdtmRequestTo", this.fdtmRequestTo);
    __sqoop$field_map.put("fdtmClaimFrom", this.fdtmClaimFrom);
    __sqoop$field_map.put("fdtmClaimTo", this.fdtmClaimTo);
    __sqoop$field_map.put("fcurMaxClaim", this.fcurMaxClaim);
    __sqoop$field_map.put("fcurApproved", this.fcurApproved);
    __sqoop$field_map.put("fcurClaimed", this.fcurClaimed);
    __sqoop$field_map.put("fcurRemainingApproved", this.fcurRemainingApproved);
    __sqoop$field_map.put("fcurRemainingClaimed", this.fcurRemainingClaimed);
    __sqoop$field_map.put("fblnMultipleClaimants", this.fblnMultipleClaimants);
    __sqoop$field_map.put("fblnTransferable", this.fblnTransferable);
    __sqoop$field_map.put("fblnSplittable", this.fblnSplittable);
    __sqoop$field_map.put("fblnRefundable", this.fblnRefundable);
    __sqoop$field_map.put("fblnCapOnApprove", this.fblnCapOnApprove);
    __sqoop$field_map.put("fblnCapOnClaim", this.fblnCapOnClaim);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
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
