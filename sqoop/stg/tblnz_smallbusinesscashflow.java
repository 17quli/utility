// ORM class for table 'tblnz_smallbusinesscashflow'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:31:35 NZDT 2020
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

public class tblnz_smallbusinesscashflow extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngFullTimeEmployees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.flngFullTimeEmployees = (Integer)value;
      }
    });
    setters.put("flngPartTimeEmployees", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.flngPartTimeEmployees = (Integer)value;
      }
    });
    setters.put("fblnReceivedMSDSubsidy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fblnReceivedMSDSubsidy = (Integer)value;
      }
    });
    setters.put("fcurWageSubsidyReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fcurWageSubsidyReceived = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurWageSubsidyCalc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fcurWageSubsidyCalc = (java.math.BigDecimal)value;
      }
    });
    setters.put("flngFullTimeEquivalent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.flngFullTimeEquivalent = (Integer)value;
      }
    });
    setters.put("fcurTotalGrantedForFTE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fcurTotalGrantedForFTE = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnOverrideLoanAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fblnOverrideLoanAmount = (Integer)value;
      }
    });
    setters.put("fcurMaximumAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fcurMaximumAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_smallbusinesscashflow.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_smallbusinesscashflow() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_smallbusinesscashflow with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_smallbusinesscashflow with_flngVer(Integer flngVer) {
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
  public tblnz_smallbusinesscashflow with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngFullTimeEmployees;
  public Integer get_flngFullTimeEmployees() {
    return flngFullTimeEmployees;
  }
  public void set_flngFullTimeEmployees(Integer flngFullTimeEmployees) {
    this.flngFullTimeEmployees = flngFullTimeEmployees;
  }
  public tblnz_smallbusinesscashflow with_flngFullTimeEmployees(Integer flngFullTimeEmployees) {
    this.flngFullTimeEmployees = flngFullTimeEmployees;
    return this;
  }
  private Integer flngPartTimeEmployees;
  public Integer get_flngPartTimeEmployees() {
    return flngPartTimeEmployees;
  }
  public void set_flngPartTimeEmployees(Integer flngPartTimeEmployees) {
    this.flngPartTimeEmployees = flngPartTimeEmployees;
  }
  public tblnz_smallbusinesscashflow with_flngPartTimeEmployees(Integer flngPartTimeEmployees) {
    this.flngPartTimeEmployees = flngPartTimeEmployees;
    return this;
  }
  private Integer fblnReceivedMSDSubsidy;
  public Integer get_fblnReceivedMSDSubsidy() {
    return fblnReceivedMSDSubsidy;
  }
  public void set_fblnReceivedMSDSubsidy(Integer fblnReceivedMSDSubsidy) {
    this.fblnReceivedMSDSubsidy = fblnReceivedMSDSubsidy;
  }
  public tblnz_smallbusinesscashflow with_fblnReceivedMSDSubsidy(Integer fblnReceivedMSDSubsidy) {
    this.fblnReceivedMSDSubsidy = fblnReceivedMSDSubsidy;
    return this;
  }
  private java.math.BigDecimal fcurWageSubsidyReceived;
  public java.math.BigDecimal get_fcurWageSubsidyReceived() {
    return fcurWageSubsidyReceived;
  }
  public void set_fcurWageSubsidyReceived(java.math.BigDecimal fcurWageSubsidyReceived) {
    this.fcurWageSubsidyReceived = fcurWageSubsidyReceived;
  }
  public tblnz_smallbusinesscashflow with_fcurWageSubsidyReceived(java.math.BigDecimal fcurWageSubsidyReceived) {
    this.fcurWageSubsidyReceived = fcurWageSubsidyReceived;
    return this;
  }
  private java.math.BigDecimal fcurWageSubsidyCalc;
  public java.math.BigDecimal get_fcurWageSubsidyCalc() {
    return fcurWageSubsidyCalc;
  }
  public void set_fcurWageSubsidyCalc(java.math.BigDecimal fcurWageSubsidyCalc) {
    this.fcurWageSubsidyCalc = fcurWageSubsidyCalc;
  }
  public tblnz_smallbusinesscashflow with_fcurWageSubsidyCalc(java.math.BigDecimal fcurWageSubsidyCalc) {
    this.fcurWageSubsidyCalc = fcurWageSubsidyCalc;
    return this;
  }
  private Integer flngFullTimeEquivalent;
  public Integer get_flngFullTimeEquivalent() {
    return flngFullTimeEquivalent;
  }
  public void set_flngFullTimeEquivalent(Integer flngFullTimeEquivalent) {
    this.flngFullTimeEquivalent = flngFullTimeEquivalent;
  }
  public tblnz_smallbusinesscashflow with_flngFullTimeEquivalent(Integer flngFullTimeEquivalent) {
    this.flngFullTimeEquivalent = flngFullTimeEquivalent;
    return this;
  }
  private java.math.BigDecimal fcurTotalGrantedForFTE;
  public java.math.BigDecimal get_fcurTotalGrantedForFTE() {
    return fcurTotalGrantedForFTE;
  }
  public void set_fcurTotalGrantedForFTE(java.math.BigDecimal fcurTotalGrantedForFTE) {
    this.fcurTotalGrantedForFTE = fcurTotalGrantedForFTE;
  }
  public tblnz_smallbusinesscashflow with_fcurTotalGrantedForFTE(java.math.BigDecimal fcurTotalGrantedForFTE) {
    this.fcurTotalGrantedForFTE = fcurTotalGrantedForFTE;
    return this;
  }
  private Integer fblnOverrideLoanAmount;
  public Integer get_fblnOverrideLoanAmount() {
    return fblnOverrideLoanAmount;
  }
  public void set_fblnOverrideLoanAmount(Integer fblnOverrideLoanAmount) {
    this.fblnOverrideLoanAmount = fblnOverrideLoanAmount;
  }
  public tblnz_smallbusinesscashflow with_fblnOverrideLoanAmount(Integer fblnOverrideLoanAmount) {
    this.fblnOverrideLoanAmount = fblnOverrideLoanAmount;
    return this;
  }
  private java.math.BigDecimal fcurMaximumAmount;
  public java.math.BigDecimal get_fcurMaximumAmount() {
    return fcurMaximumAmount;
  }
  public void set_fcurMaximumAmount(java.math.BigDecimal fcurMaximumAmount) {
    this.fcurMaximumAmount = fcurMaximumAmount;
  }
  public tblnz_smallbusinesscashflow with_fcurMaximumAmount(java.math.BigDecimal fcurMaximumAmount) {
    this.fcurMaximumAmount = fcurMaximumAmount;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_smallbusinesscashflow with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_smallbusinesscashflow with_fstrWho(String fstrWho) {
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
  public tblnz_smallbusinesscashflow with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_smallbusinesscashflow)) {
      return false;
    }
    tblnz_smallbusinesscashflow that = (tblnz_smallbusinesscashflow) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFullTimeEmployees == null ? that.flngFullTimeEmployees == null : this.flngFullTimeEmployees.equals(that.flngFullTimeEmployees));
    equal = equal && (this.flngPartTimeEmployees == null ? that.flngPartTimeEmployees == null : this.flngPartTimeEmployees.equals(that.flngPartTimeEmployees));
    equal = equal && (this.fblnReceivedMSDSubsidy == null ? that.fblnReceivedMSDSubsidy == null : this.fblnReceivedMSDSubsidy.equals(that.fblnReceivedMSDSubsidy));
    equal = equal && (this.fcurWageSubsidyReceived == null ? that.fcurWageSubsidyReceived == null : this.fcurWageSubsidyReceived.equals(that.fcurWageSubsidyReceived));
    equal = equal && (this.fcurWageSubsidyCalc == null ? that.fcurWageSubsidyCalc == null : this.fcurWageSubsidyCalc.equals(that.fcurWageSubsidyCalc));
    equal = equal && (this.flngFullTimeEquivalent == null ? that.flngFullTimeEquivalent == null : this.flngFullTimeEquivalent.equals(that.flngFullTimeEquivalent));
    equal = equal && (this.fcurTotalGrantedForFTE == null ? that.fcurTotalGrantedForFTE == null : this.fcurTotalGrantedForFTE.equals(that.fcurTotalGrantedForFTE));
    equal = equal && (this.fblnOverrideLoanAmount == null ? that.fblnOverrideLoanAmount == null : this.fblnOverrideLoanAmount.equals(that.fblnOverrideLoanAmount));
    equal = equal && (this.fcurMaximumAmount == null ? that.fcurMaximumAmount == null : this.fcurMaximumAmount.equals(that.fcurMaximumAmount));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_smallbusinesscashflow)) {
      return false;
    }
    tblnz_smallbusinesscashflow that = (tblnz_smallbusinesscashflow) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngFullTimeEmployees == null ? that.flngFullTimeEmployees == null : this.flngFullTimeEmployees.equals(that.flngFullTimeEmployees));
    equal = equal && (this.flngPartTimeEmployees == null ? that.flngPartTimeEmployees == null : this.flngPartTimeEmployees.equals(that.flngPartTimeEmployees));
    equal = equal && (this.fblnReceivedMSDSubsidy == null ? that.fblnReceivedMSDSubsidy == null : this.fblnReceivedMSDSubsidy.equals(that.fblnReceivedMSDSubsidy));
    equal = equal && (this.fcurWageSubsidyReceived == null ? that.fcurWageSubsidyReceived == null : this.fcurWageSubsidyReceived.equals(that.fcurWageSubsidyReceived));
    equal = equal && (this.fcurWageSubsidyCalc == null ? that.fcurWageSubsidyCalc == null : this.fcurWageSubsidyCalc.equals(that.fcurWageSubsidyCalc));
    equal = equal && (this.flngFullTimeEquivalent == null ? that.flngFullTimeEquivalent == null : this.flngFullTimeEquivalent.equals(that.flngFullTimeEquivalent));
    equal = equal && (this.fcurTotalGrantedForFTE == null ? that.fcurTotalGrantedForFTE == null : this.fcurTotalGrantedForFTE.equals(that.fcurTotalGrantedForFTE));
    equal = equal && (this.fblnOverrideLoanAmount == null ? that.fblnOverrideLoanAmount == null : this.fblnOverrideLoanAmount.equals(that.fblnOverrideLoanAmount));
    equal = equal && (this.fcurMaximumAmount == null ? that.fcurMaximumAmount == null : this.fcurMaximumAmount.equals(that.fcurMaximumAmount));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngFullTimeEmployees = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngPartTimeEmployees = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnReceivedMSDSubsidy = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fcurWageSubsidyReceived = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurWageSubsidyCalc = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.flngFullTimeEquivalent = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fcurTotalGrantedForFTE = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fblnOverrideLoanAmount = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fcurMaximumAmount = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngFullTimeEmployees = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngPartTimeEmployees = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnReceivedMSDSubsidy = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fcurWageSubsidyReceived = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurWageSubsidyCalc = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.flngFullTimeEquivalent = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fcurTotalGrantedForFTE = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fblnOverrideLoanAmount = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fcurMaximumAmount = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(14, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(15, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFullTimeEmployees, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPartTimeEmployees, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReceivedMSDSubsidy, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWageSubsidyReceived, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWageSubsidyCalc, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFullTimeEquivalent, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrantedForFTE, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverrideLoanAmount, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaximumAmount, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFullTimeEmployees, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPartTimeEmployees, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReceivedMSDSubsidy, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWageSubsidyReceived, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurWageSubsidyCalc, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFullTimeEquivalent, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalGrantedForFTE, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOverrideLoanAmount, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMaximumAmount, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 15 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngFullTimeEmployees = null;
    } else {
    this.flngFullTimeEmployees = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPartTimeEmployees = null;
    } else {
    this.flngPartTimeEmployees = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReceivedMSDSubsidy = null;
    } else {
    this.fblnReceivedMSDSubsidy = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurWageSubsidyReceived = null;
    } else {
    this.fcurWageSubsidyReceived = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurWageSubsidyCalc = null;
    } else {
    this.fcurWageSubsidyCalc = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngFullTimeEquivalent = null;
    } else {
    this.flngFullTimeEquivalent = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalGrantedForFTE = null;
    } else {
    this.fcurTotalGrantedForFTE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOverrideLoanAmount = null;
    } else {
    this.fblnOverrideLoanAmount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMaximumAmount = null;
    } else {
    this.fcurMaximumAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngFullTimeEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFullTimeEmployees);
    }
    if (null == this.flngPartTimeEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPartTimeEmployees);
    }
    if (null == this.fblnReceivedMSDSubsidy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReceivedMSDSubsidy);
    }
    if (null == this.fcurWageSubsidyReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWageSubsidyReceived, __dataOut);
    }
    if (null == this.fcurWageSubsidyCalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWageSubsidyCalc, __dataOut);
    }
    if (null == this.flngFullTimeEquivalent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFullTimeEquivalent);
    }
    if (null == this.fcurTotalGrantedForFTE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrantedForFTE, __dataOut);
    }
    if (null == this.fblnOverrideLoanAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverrideLoanAmount);
    }
    if (null == this.fcurMaximumAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaximumAmount, __dataOut);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
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
    if (null == this.flngFullTimeEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFullTimeEmployees);
    }
    if (null == this.flngPartTimeEmployees) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPartTimeEmployees);
    }
    if (null == this.fblnReceivedMSDSubsidy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReceivedMSDSubsidy);
    }
    if (null == this.fcurWageSubsidyReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWageSubsidyReceived, __dataOut);
    }
    if (null == this.fcurWageSubsidyCalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurWageSubsidyCalc, __dataOut);
    }
    if (null == this.flngFullTimeEquivalent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFullTimeEquivalent);
    }
    if (null == this.fcurTotalGrantedForFTE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalGrantedForFTE, __dataOut);
    }
    if (null == this.fblnOverrideLoanAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOverrideLoanAmount);
    }
    if (null == this.fcurMaximumAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMaximumAmount, __dataOut);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFullTimeEmployees==null?"\\N":"" + flngFullTimeEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPartTimeEmployees==null?"\\N":"" + flngPartTimeEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReceivedMSDSubsidy==null?"\\N":"" + fblnReceivedMSDSubsidy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWageSubsidyReceived==null?"\\N":fcurWageSubsidyReceived.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWageSubsidyCalc==null?"\\N":fcurWageSubsidyCalc.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFullTimeEquivalent==null?"\\N":"" + flngFullTimeEquivalent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrantedForFTE==null?"\\N":fcurTotalGrantedForFTE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverrideLoanAmount==null?"\\N":"" + fblnOverrideLoanAmount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaximumAmount==null?"\\N":fcurMaximumAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFullTimeEmployees==null?"\\N":"" + flngFullTimeEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPartTimeEmployees==null?"\\N":"" + flngPartTimeEmployees, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReceivedMSDSubsidy==null?"\\N":"" + fblnReceivedMSDSubsidy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWageSubsidyReceived==null?"\\N":fcurWageSubsidyReceived.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurWageSubsidyCalc==null?"\\N":fcurWageSubsidyCalc.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFullTimeEquivalent==null?"\\N":"" + flngFullTimeEquivalent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalGrantedForFTE==null?"\\N":fcurTotalGrantedForFTE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOverrideLoanAmount==null?"\\N":"" + fblnOverrideLoanAmount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMaximumAmount==null?"\\N":fcurMaximumAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFullTimeEmployees = null; } else {
      this.flngFullTimeEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPartTimeEmployees = null; } else {
      this.flngPartTimeEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReceivedMSDSubsidy = null; } else {
      this.fblnReceivedMSDSubsidy = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWageSubsidyReceived = null; } else {
      this.fcurWageSubsidyReceived = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWageSubsidyCalc = null; } else {
      this.fcurWageSubsidyCalc = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFullTimeEquivalent = null; } else {
      this.flngFullTimeEquivalent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrantedForFTE = null; } else {
      this.fcurTotalGrantedForFTE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverrideLoanAmount = null; } else {
      this.fblnOverrideLoanAmount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaximumAmount = null; } else {
      this.fcurMaximumAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFullTimeEmployees = null; } else {
      this.flngFullTimeEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPartTimeEmployees = null; } else {
      this.flngPartTimeEmployees = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReceivedMSDSubsidy = null; } else {
      this.fblnReceivedMSDSubsidy = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWageSubsidyReceived = null; } else {
      this.fcurWageSubsidyReceived = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurWageSubsidyCalc = null; } else {
      this.fcurWageSubsidyCalc = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFullTimeEquivalent = null; } else {
      this.flngFullTimeEquivalent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalGrantedForFTE = null; } else {
      this.fcurTotalGrantedForFTE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOverrideLoanAmount = null; } else {
      this.fblnOverrideLoanAmount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMaximumAmount = null; } else {
      this.fcurMaximumAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
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
    tblnz_smallbusinesscashflow o = (tblnz_smallbusinesscashflow) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_smallbusinesscashflow o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFullTimeEmployees", this.flngFullTimeEmployees);
    __sqoop$field_map.put("flngPartTimeEmployees", this.flngPartTimeEmployees);
    __sqoop$field_map.put("fblnReceivedMSDSubsidy", this.fblnReceivedMSDSubsidy);
    __sqoop$field_map.put("fcurWageSubsidyReceived", this.fcurWageSubsidyReceived);
    __sqoop$field_map.put("fcurWageSubsidyCalc", this.fcurWageSubsidyCalc);
    __sqoop$field_map.put("flngFullTimeEquivalent", this.flngFullTimeEquivalent);
    __sqoop$field_map.put("fcurTotalGrantedForFTE", this.fcurTotalGrantedForFTE);
    __sqoop$field_map.put("fblnOverrideLoanAmount", this.fblnOverrideLoanAmount);
    __sqoop$field_map.put("fcurMaximumAmount", this.fcurMaximumAmount);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngFullTimeEmployees", this.flngFullTimeEmployees);
    __sqoop$field_map.put("flngPartTimeEmployees", this.flngPartTimeEmployees);
    __sqoop$field_map.put("fblnReceivedMSDSubsidy", this.fblnReceivedMSDSubsidy);
    __sqoop$field_map.put("fcurWageSubsidyReceived", this.fcurWageSubsidyReceived);
    __sqoop$field_map.put("fcurWageSubsidyCalc", this.fcurWageSubsidyCalc);
    __sqoop$field_map.put("flngFullTimeEquivalent", this.flngFullTimeEquivalent);
    __sqoop$field_map.put("fcurTotalGrantedForFTE", this.fcurTotalGrantedForFTE);
    __sqoop$field_map.put("fblnOverrideLoanAmount", this.fblnOverrideLoanAmount);
    __sqoop$field_map.put("fcurMaximumAmount", this.fcurMaximumAmount);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
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
