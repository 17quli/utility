// ORM class for table 'tblnz_famchildsupportactuals'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 04:31:14 NZDT 2020
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

public class tblnz_famchildsupportactuals extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngFAMChildSupportActualsKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.flngFAMChildSupportActualsKey = (Integer)value;
      }
    });
    setters.put("flngFAMEntitlementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.flngFAMEntitlementKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngPCGCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.flngPCGCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrPCGIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fstrPCGIRD = (String)value;
      }
    });
    setters.put("flngPNRCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.flngPNRCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrPNRIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fstrPNRIRD = (String)value;
      }
    });
    setters.put("fdtmSentToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fdtmSentToFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurAmountReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fcurAmountReceived = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fcurAmountPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrErrorCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fstrErrorCode = (String)value;
      }
    });
    setters.put("fstrErrorMessage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fstrErrorMessage = (String)value;
      }
    });
    setters.put("fdtmReceivedFromFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fdtmReceivedFromFIRST = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmActualsProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fdtmActualsProcessed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famchildsupportactuals.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_famchildsupportactuals() {
    init0();
  }
  private Integer flngFAMChildSupportActualsKey;
  public Integer get_flngFAMChildSupportActualsKey() {
    return flngFAMChildSupportActualsKey;
  }
  public void set_flngFAMChildSupportActualsKey(Integer flngFAMChildSupportActualsKey) {
    this.flngFAMChildSupportActualsKey = flngFAMChildSupportActualsKey;
  }
  public tblnz_famchildsupportactuals with_flngFAMChildSupportActualsKey(Integer flngFAMChildSupportActualsKey) {
    this.flngFAMChildSupportActualsKey = flngFAMChildSupportActualsKey;
    return this;
  }
  private Integer flngFAMEntitlementKey;
  public Integer get_flngFAMEntitlementKey() {
    return flngFAMEntitlementKey;
  }
  public void set_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
  }
  public tblnz_famchildsupportactuals with_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_famchildsupportactuals with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private Integer flngPCGCustomerKey;
  public Integer get_flngPCGCustomerKey() {
    return flngPCGCustomerKey;
  }
  public void set_flngPCGCustomerKey(Integer flngPCGCustomerKey) {
    this.flngPCGCustomerKey = flngPCGCustomerKey;
  }
  public tblnz_famchildsupportactuals with_flngPCGCustomerKey(Integer flngPCGCustomerKey) {
    this.flngPCGCustomerKey = flngPCGCustomerKey;
    return this;
  }
  private String fstrPCGIRD;
  public String get_fstrPCGIRD() {
    return fstrPCGIRD;
  }
  public void set_fstrPCGIRD(String fstrPCGIRD) {
    this.fstrPCGIRD = fstrPCGIRD;
  }
  public tblnz_famchildsupportactuals with_fstrPCGIRD(String fstrPCGIRD) {
    this.fstrPCGIRD = fstrPCGIRD;
    return this;
  }
  private Integer flngPNRCustomerKey;
  public Integer get_flngPNRCustomerKey() {
    return flngPNRCustomerKey;
  }
  public void set_flngPNRCustomerKey(Integer flngPNRCustomerKey) {
    this.flngPNRCustomerKey = flngPNRCustomerKey;
  }
  public tblnz_famchildsupportactuals with_flngPNRCustomerKey(Integer flngPNRCustomerKey) {
    this.flngPNRCustomerKey = flngPNRCustomerKey;
    return this;
  }
  private String fstrPNRIRD;
  public String get_fstrPNRIRD() {
    return fstrPNRIRD;
  }
  public void set_fstrPNRIRD(String fstrPNRIRD) {
    this.fstrPNRIRD = fstrPNRIRD;
  }
  public tblnz_famchildsupportactuals with_fstrPNRIRD(String fstrPNRIRD) {
    this.fstrPNRIRD = fstrPNRIRD;
    return this;
  }
  private java.sql.Timestamp fdtmSentToFIRST;
  public java.sql.Timestamp get_fdtmSentToFIRST() {
    return fdtmSentToFIRST;
  }
  public void set_fdtmSentToFIRST(java.sql.Timestamp fdtmSentToFIRST) {
    this.fdtmSentToFIRST = fdtmSentToFIRST;
  }
  public tblnz_famchildsupportactuals with_fdtmSentToFIRST(java.sql.Timestamp fdtmSentToFIRST) {
    this.fdtmSentToFIRST = fdtmSentToFIRST;
    return this;
  }
  private java.math.BigDecimal fcurAmountReceived;
  public java.math.BigDecimal get_fcurAmountReceived() {
    return fcurAmountReceived;
  }
  public void set_fcurAmountReceived(java.math.BigDecimal fcurAmountReceived) {
    this.fcurAmountReceived = fcurAmountReceived;
  }
  public tblnz_famchildsupportactuals with_fcurAmountReceived(java.math.BigDecimal fcurAmountReceived) {
    this.fcurAmountReceived = fcurAmountReceived;
    return this;
  }
  private java.math.BigDecimal fcurAmountPaid;
  public java.math.BigDecimal get_fcurAmountPaid() {
    return fcurAmountPaid;
  }
  public void set_fcurAmountPaid(java.math.BigDecimal fcurAmountPaid) {
    this.fcurAmountPaid = fcurAmountPaid;
  }
  public tblnz_famchildsupportactuals with_fcurAmountPaid(java.math.BigDecimal fcurAmountPaid) {
    this.fcurAmountPaid = fcurAmountPaid;
    return this;
  }
  private String fstrErrorCode;
  public String get_fstrErrorCode() {
    return fstrErrorCode;
  }
  public void set_fstrErrorCode(String fstrErrorCode) {
    this.fstrErrorCode = fstrErrorCode;
  }
  public tblnz_famchildsupportactuals with_fstrErrorCode(String fstrErrorCode) {
    this.fstrErrorCode = fstrErrorCode;
    return this;
  }
  private String fstrErrorMessage;
  public String get_fstrErrorMessage() {
    return fstrErrorMessage;
  }
  public void set_fstrErrorMessage(String fstrErrorMessage) {
    this.fstrErrorMessage = fstrErrorMessage;
  }
  public tblnz_famchildsupportactuals with_fstrErrorMessage(String fstrErrorMessage) {
    this.fstrErrorMessage = fstrErrorMessage;
    return this;
  }
  private java.sql.Timestamp fdtmReceivedFromFIRST;
  public java.sql.Timestamp get_fdtmReceivedFromFIRST() {
    return fdtmReceivedFromFIRST;
  }
  public void set_fdtmReceivedFromFIRST(java.sql.Timestamp fdtmReceivedFromFIRST) {
    this.fdtmReceivedFromFIRST = fdtmReceivedFromFIRST;
  }
  public tblnz_famchildsupportactuals with_fdtmReceivedFromFIRST(java.sql.Timestamp fdtmReceivedFromFIRST) {
    this.fdtmReceivedFromFIRST = fdtmReceivedFromFIRST;
    return this;
  }
  private java.sql.Timestamp fdtmActualsProcessed;
  public java.sql.Timestamp get_fdtmActualsProcessed() {
    return fdtmActualsProcessed;
  }
  public void set_fdtmActualsProcessed(java.sql.Timestamp fdtmActualsProcessed) {
    this.fdtmActualsProcessed = fdtmActualsProcessed;
  }
  public tblnz_famchildsupportactuals with_fdtmActualsProcessed(java.sql.Timestamp fdtmActualsProcessed) {
    this.fdtmActualsProcessed = fdtmActualsProcessed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_famchildsupportactuals with_fstrWho(String fstrWho) {
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
  public tblnz_famchildsupportactuals with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famchildsupportactuals)) {
      return false;
    }
    tblnz_famchildsupportactuals that = (tblnz_famchildsupportactuals) o;
    boolean equal = true;
    equal = equal && (this.flngFAMChildSupportActualsKey == null ? that.flngFAMChildSupportActualsKey == null : this.flngFAMChildSupportActualsKey.equals(that.flngFAMChildSupportActualsKey));
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngPCGCustomerKey == null ? that.flngPCGCustomerKey == null : this.flngPCGCustomerKey.equals(that.flngPCGCustomerKey));
    equal = equal && (this.fstrPCGIRD == null ? that.fstrPCGIRD == null : this.fstrPCGIRD.equals(that.fstrPCGIRD));
    equal = equal && (this.flngPNRCustomerKey == null ? that.flngPNRCustomerKey == null : this.flngPNRCustomerKey.equals(that.flngPNRCustomerKey));
    equal = equal && (this.fstrPNRIRD == null ? that.fstrPNRIRD == null : this.fstrPNRIRD.equals(that.fstrPNRIRD));
    equal = equal && (this.fdtmSentToFIRST == null ? that.fdtmSentToFIRST == null : this.fdtmSentToFIRST.equals(that.fdtmSentToFIRST));
    equal = equal && (this.fcurAmountReceived == null ? that.fcurAmountReceived == null : this.fcurAmountReceived.equals(that.fcurAmountReceived));
    equal = equal && (this.fcurAmountPaid == null ? that.fcurAmountPaid == null : this.fcurAmountPaid.equals(that.fcurAmountPaid));
    equal = equal && (this.fstrErrorCode == null ? that.fstrErrorCode == null : this.fstrErrorCode.equals(that.fstrErrorCode));
    equal = equal && (this.fstrErrorMessage == null ? that.fstrErrorMessage == null : this.fstrErrorMessage.equals(that.fstrErrorMessage));
    equal = equal && (this.fdtmReceivedFromFIRST == null ? that.fdtmReceivedFromFIRST == null : this.fdtmReceivedFromFIRST.equals(that.fdtmReceivedFromFIRST));
    equal = equal && (this.fdtmActualsProcessed == null ? that.fdtmActualsProcessed == null : this.fdtmActualsProcessed.equals(that.fdtmActualsProcessed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famchildsupportactuals)) {
      return false;
    }
    tblnz_famchildsupportactuals that = (tblnz_famchildsupportactuals) o;
    boolean equal = true;
    equal = equal && (this.flngFAMChildSupportActualsKey == null ? that.flngFAMChildSupportActualsKey == null : this.flngFAMChildSupportActualsKey.equals(that.flngFAMChildSupportActualsKey));
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.flngPCGCustomerKey == null ? that.flngPCGCustomerKey == null : this.flngPCGCustomerKey.equals(that.flngPCGCustomerKey));
    equal = equal && (this.fstrPCGIRD == null ? that.fstrPCGIRD == null : this.fstrPCGIRD.equals(that.fstrPCGIRD));
    equal = equal && (this.flngPNRCustomerKey == null ? that.flngPNRCustomerKey == null : this.flngPNRCustomerKey.equals(that.flngPNRCustomerKey));
    equal = equal && (this.fstrPNRIRD == null ? that.fstrPNRIRD == null : this.fstrPNRIRD.equals(that.fstrPNRIRD));
    equal = equal && (this.fdtmSentToFIRST == null ? that.fdtmSentToFIRST == null : this.fdtmSentToFIRST.equals(that.fdtmSentToFIRST));
    equal = equal && (this.fcurAmountReceived == null ? that.fcurAmountReceived == null : this.fcurAmountReceived.equals(that.fcurAmountReceived));
    equal = equal && (this.fcurAmountPaid == null ? that.fcurAmountPaid == null : this.fcurAmountPaid.equals(that.fcurAmountPaid));
    equal = equal && (this.fstrErrorCode == null ? that.fstrErrorCode == null : this.fstrErrorCode.equals(that.fstrErrorCode));
    equal = equal && (this.fstrErrorMessage == null ? that.fstrErrorMessage == null : this.fstrErrorMessage.equals(that.fstrErrorMessage));
    equal = equal && (this.fdtmReceivedFromFIRST == null ? that.fdtmReceivedFromFIRST == null : this.fdtmReceivedFromFIRST.equals(that.fdtmReceivedFromFIRST));
    equal = equal && (this.fdtmActualsProcessed == null ? that.fdtmActualsProcessed == null : this.fdtmActualsProcessed.equals(that.fdtmActualsProcessed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngFAMChildSupportActualsKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngPCGCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrPCGIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.flngPNRCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrPNRIRD = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmSentToFIRST = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurAmountReceived = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAmountPaid = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fstrErrorCode = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrErrorMessage = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmReceivedFromFIRST = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmActualsProcessed = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngFAMChildSupportActualsKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.flngPCGCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrPCGIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.flngPNRCustomerKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrPNRIRD = JdbcWritableBridge.readString(7, __dbResults);
    this.fdtmSentToFIRST = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.fcurAmountReceived = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurAmountPaid = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fstrErrorCode = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrErrorMessage = JdbcWritableBridge.readString(12, __dbResults);
    this.fdtmReceivedFromFIRST = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmActualsProcessed = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFAMChildSupportActualsKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPCGCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPCGIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPNRCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPNRIRD, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSentToFIRST, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountReceived, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountPaid, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrErrorCode, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrErrorMessage, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceivedFromFIRST, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmActualsProcessed, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngFAMChildSupportActualsKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPCGCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPCGIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPNRCustomerKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPNRIRD, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSentToFIRST, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountReceived, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountPaid, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrErrorCode, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrErrorMessage, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceivedFromFIRST, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmActualsProcessed, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngFAMChildSupportActualsKey = null;
    } else {
    this.flngFAMChildSupportActualsKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFAMEntitlementKey = null;
    } else {
    this.flngFAMEntitlementKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPCGCustomerKey = null;
    } else {
    this.flngPCGCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPCGIRD = null;
    } else {
    this.fstrPCGIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngPNRCustomerKey = null;
    } else {
    this.flngPNRCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPNRIRD = null;
    } else {
    this.fstrPNRIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSentToFIRST = null;
    } else {
    this.fdtmSentToFIRST = new Timestamp(__dataIn.readLong());
    this.fdtmSentToFIRST.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountReceived = null;
    } else {
    this.fcurAmountReceived = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountPaid = null;
    } else {
    this.fcurAmountPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrErrorCode = null;
    } else {
    this.fstrErrorCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrErrorMessage = null;
    } else {
    this.fstrErrorMessage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReceivedFromFIRST = null;
    } else {
    this.fdtmReceivedFromFIRST = new Timestamp(__dataIn.readLong());
    this.fdtmReceivedFromFIRST.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmActualsProcessed = null;
    } else {
    this.fdtmActualsProcessed = new Timestamp(__dataIn.readLong());
    this.fdtmActualsProcessed.setNanos(__dataIn.readInt());
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
    if (null == this.flngFAMChildSupportActualsKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMChildSupportActualsKey);
    }
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngPCGCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPCGCustomerKey);
    }
    if (null == this.fstrPCGIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPCGIRD);
    }
    if (null == this.flngPNRCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPNRCustomerKey);
    }
    if (null == this.fstrPNRIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPNRIRD);
    }
    if (null == this.fdtmSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmSentToFIRST.getNanos());
    }
    if (null == this.fcurAmountReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountReceived, __dataOut);
    }
    if (null == this.fcurAmountPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountPaid, __dataOut);
    }
    if (null == this.fstrErrorCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrErrorCode);
    }
    if (null == this.fstrErrorMessage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrErrorMessage);
    }
    if (null == this.fdtmReceivedFromFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceivedFromFIRST.getTime());
    __dataOut.writeInt(this.fdtmReceivedFromFIRST.getNanos());
    }
    if (null == this.fdtmActualsProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmActualsProcessed.getTime());
    __dataOut.writeInt(this.fdtmActualsProcessed.getNanos());
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
    if (null == this.flngFAMChildSupportActualsKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMChildSupportActualsKey);
    }
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.flngPCGCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPCGCustomerKey);
    }
    if (null == this.fstrPCGIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPCGIRD);
    }
    if (null == this.flngPNRCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPNRCustomerKey);
    }
    if (null == this.fstrPNRIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPNRIRD);
    }
    if (null == this.fdtmSentToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSentToFIRST.getTime());
    __dataOut.writeInt(this.fdtmSentToFIRST.getNanos());
    }
    if (null == this.fcurAmountReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountReceived, __dataOut);
    }
    if (null == this.fcurAmountPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountPaid, __dataOut);
    }
    if (null == this.fstrErrorCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrErrorCode);
    }
    if (null == this.fstrErrorMessage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrErrorMessage);
    }
    if (null == this.fdtmReceivedFromFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceivedFromFIRST.getTime());
    __dataOut.writeInt(this.fdtmReceivedFromFIRST.getNanos());
    }
    if (null == this.fdtmActualsProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmActualsProcessed.getTime());
    __dataOut.writeInt(this.fdtmActualsProcessed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMChildSupportActualsKey==null?"\\N":"" + flngFAMChildSupportActualsKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPCGCustomerKey==null?"\\N":"" + flngPCGCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPCGIRD==null?"\\N":fstrPCGIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPNRCustomerKey==null?"\\N":"" + flngPNRCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPNRIRD==null?"\\N":fstrPNRIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSentToFIRST==null?"\\N":"" + fdtmSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountReceived==null?"\\N":fcurAmountReceived.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountPaid==null?"\\N":fcurAmountPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrErrorCode==null?"\\N":fstrErrorCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrErrorMessage==null?"\\N":fstrErrorMessage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceivedFromFIRST==null?"\\N":"" + fdtmReceivedFromFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmActualsProcessed==null?"\\N":"" + fdtmActualsProcessed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMChildSupportActualsKey==null?"\\N":"" + flngFAMChildSupportActualsKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPCGCustomerKey==null?"\\N":"" + flngPCGCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPCGIRD==null?"\\N":fstrPCGIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPNRCustomerKey==null?"\\N":"" + flngPNRCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPNRIRD==null?"\\N":fstrPNRIRD, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSentToFIRST==null?"\\N":"" + fdtmSentToFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountReceived==null?"\\N":fcurAmountReceived.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountPaid==null?"\\N":fcurAmountPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrErrorCode==null?"\\N":fstrErrorCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrErrorMessage==null?"\\N":fstrErrorMessage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceivedFromFIRST==null?"\\N":"" + fdtmReceivedFromFIRST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmActualsProcessed==null?"\\N":"" + fdtmActualsProcessed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMChildSupportActualsKey = null; } else {
      this.flngFAMChildSupportActualsKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPCGCustomerKey = null; } else {
      this.flngPCGCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPCGIRD = null; } else {
      this.fstrPCGIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPNRCustomerKey = null; } else {
      this.flngPNRCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPNRIRD = null; } else {
      this.fstrPNRIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSentToFIRST = null; } else {
      this.fdtmSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountReceived = null; } else {
      this.fcurAmountReceived = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountPaid = null; } else {
      this.fcurAmountPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrErrorCode = null; } else {
      this.fstrErrorCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrErrorMessage = null; } else {
      this.fstrErrorMessage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceivedFromFIRST = null; } else {
      this.fdtmReceivedFromFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmActualsProcessed = null; } else {
      this.fdtmActualsProcessed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMChildSupportActualsKey = null; } else {
      this.flngFAMChildSupportActualsKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPCGCustomerKey = null; } else {
      this.flngPCGCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPCGIRD = null; } else {
      this.fstrPCGIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPNRCustomerKey = null; } else {
      this.flngPNRCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPNRIRD = null; } else {
      this.fstrPNRIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSentToFIRST = null; } else {
      this.fdtmSentToFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountReceived = null; } else {
      this.fcurAmountReceived = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountPaid = null; } else {
      this.fcurAmountPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrErrorCode = null; } else {
      this.fstrErrorCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrErrorMessage = null; } else {
      this.fstrErrorMessage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceivedFromFIRST = null; } else {
      this.fdtmReceivedFromFIRST = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmActualsProcessed = null; } else {
      this.fdtmActualsProcessed = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_famchildsupportactuals o = (tblnz_famchildsupportactuals) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmSentToFIRST = (o.fdtmSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmSentToFIRST.clone() : null;
    o.fdtmReceivedFromFIRST = (o.fdtmReceivedFromFIRST != null) ? (java.sql.Timestamp) o.fdtmReceivedFromFIRST.clone() : null;
    o.fdtmActualsProcessed = (o.fdtmActualsProcessed != null) ? (java.sql.Timestamp) o.fdtmActualsProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_famchildsupportactuals o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmSentToFIRST = (o.fdtmSentToFIRST != null) ? (java.sql.Timestamp) o.fdtmSentToFIRST.clone() : null;
    o.fdtmReceivedFromFIRST = (o.fdtmReceivedFromFIRST != null) ? (java.sql.Timestamp) o.fdtmReceivedFromFIRST.clone() : null;
    o.fdtmActualsProcessed = (o.fdtmActualsProcessed != null) ? (java.sql.Timestamp) o.fdtmActualsProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngFAMChildSupportActualsKey", this.flngFAMChildSupportActualsKey);
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngPCGCustomerKey", this.flngPCGCustomerKey);
    __sqoop$field_map.put("fstrPCGIRD", this.fstrPCGIRD);
    __sqoop$field_map.put("flngPNRCustomerKey", this.flngPNRCustomerKey);
    __sqoop$field_map.put("fstrPNRIRD", this.fstrPNRIRD);
    __sqoop$field_map.put("fdtmSentToFIRST", this.fdtmSentToFIRST);
    __sqoop$field_map.put("fcurAmountReceived", this.fcurAmountReceived);
    __sqoop$field_map.put("fcurAmountPaid", this.fcurAmountPaid);
    __sqoop$field_map.put("fstrErrorCode", this.fstrErrorCode);
    __sqoop$field_map.put("fstrErrorMessage", this.fstrErrorMessage);
    __sqoop$field_map.put("fdtmReceivedFromFIRST", this.fdtmReceivedFromFIRST);
    __sqoop$field_map.put("fdtmActualsProcessed", this.fdtmActualsProcessed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngFAMChildSupportActualsKey", this.flngFAMChildSupportActualsKey);
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("flngPCGCustomerKey", this.flngPCGCustomerKey);
    __sqoop$field_map.put("fstrPCGIRD", this.fstrPCGIRD);
    __sqoop$field_map.put("flngPNRCustomerKey", this.flngPNRCustomerKey);
    __sqoop$field_map.put("fstrPNRIRD", this.fstrPNRIRD);
    __sqoop$field_map.put("fdtmSentToFIRST", this.fdtmSentToFIRST);
    __sqoop$field_map.put("fcurAmountReceived", this.fcurAmountReceived);
    __sqoop$field_map.put("fcurAmountPaid", this.fcurAmountPaid);
    __sqoop$field_map.put("fstrErrorCode", this.fstrErrorCode);
    __sqoop$field_map.put("fstrErrorMessage", this.fstrErrorMessage);
    __sqoop$field_map.put("fdtmReceivedFromFIRST", this.fdtmReceivedFromFIRST);
    __sqoop$field_map.put("fdtmActualsProcessed", this.fdtmActualsProcessed);
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
