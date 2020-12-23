// ORM class for table 'tblnz_audprdwpreporting'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:50:41 NZDT 2020
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

public class tblnz_audprdwpreporting extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fintSeq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fintSeq = (Integer)value;
      }
    });
    setters.put("fstrPostingType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fstrPostingType = (String)value;
      }
    });
    setters.put("fdtmPostingDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fdtmPostingDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurTaxOriginal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurTaxOriginal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxAfter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurTaxAfter = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxDelta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurTaxDelta = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLossAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurLossAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRentalAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurRentalAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDTIAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurRDTIAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRDTIRemainingAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurRDTIRemainingAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurICAAdjustment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurICAAdjustment = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCoreTax", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fcurCoreTax = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnCommitted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fblnCommitted = (Integer)value;
      }
    });
    setters.put("fblnGPCommitted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fblnGPCommitted = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_audprdwpreporting.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_audprdwpreporting() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_audprdwpreporting with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fintSeq;
  public Integer get_fintSeq() {
    return fintSeq;
  }
  public void set_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
  }
  public tblnz_audprdwpreporting with_fintSeq(Integer fintSeq) {
    this.fintSeq = fintSeq;
    return this;
  }
  private String fstrPostingType;
  public String get_fstrPostingType() {
    return fstrPostingType;
  }
  public void set_fstrPostingType(String fstrPostingType) {
    this.fstrPostingType = fstrPostingType;
  }
  public tblnz_audprdwpreporting with_fstrPostingType(String fstrPostingType) {
    this.fstrPostingType = fstrPostingType;
    return this;
  }
  private java.sql.Timestamp fdtmPostingDate;
  public java.sql.Timestamp get_fdtmPostingDate() {
    return fdtmPostingDate;
  }
  public void set_fdtmPostingDate(java.sql.Timestamp fdtmPostingDate) {
    this.fdtmPostingDate = fdtmPostingDate;
  }
  public tblnz_audprdwpreporting with_fdtmPostingDate(java.sql.Timestamp fdtmPostingDate) {
    this.fdtmPostingDate = fdtmPostingDate;
    return this;
  }
  private java.math.BigDecimal fcurTaxOriginal;
  public java.math.BigDecimal get_fcurTaxOriginal() {
    return fcurTaxOriginal;
  }
  public void set_fcurTaxOriginal(java.math.BigDecimal fcurTaxOriginal) {
    this.fcurTaxOriginal = fcurTaxOriginal;
  }
  public tblnz_audprdwpreporting with_fcurTaxOriginal(java.math.BigDecimal fcurTaxOriginal) {
    this.fcurTaxOriginal = fcurTaxOriginal;
    return this;
  }
  private java.math.BigDecimal fcurTaxAfter;
  public java.math.BigDecimal get_fcurTaxAfter() {
    return fcurTaxAfter;
  }
  public void set_fcurTaxAfter(java.math.BigDecimal fcurTaxAfter) {
    this.fcurTaxAfter = fcurTaxAfter;
  }
  public tblnz_audprdwpreporting with_fcurTaxAfter(java.math.BigDecimal fcurTaxAfter) {
    this.fcurTaxAfter = fcurTaxAfter;
    return this;
  }
  private java.math.BigDecimal fcurTaxDelta;
  public java.math.BigDecimal get_fcurTaxDelta() {
    return fcurTaxDelta;
  }
  public void set_fcurTaxDelta(java.math.BigDecimal fcurTaxDelta) {
    this.fcurTaxDelta = fcurTaxDelta;
  }
  public tblnz_audprdwpreporting with_fcurTaxDelta(java.math.BigDecimal fcurTaxDelta) {
    this.fcurTaxDelta = fcurTaxDelta;
    return this;
  }
  private java.math.BigDecimal fcurLossAdjustment;
  public java.math.BigDecimal get_fcurLossAdjustment() {
    return fcurLossAdjustment;
  }
  public void set_fcurLossAdjustment(java.math.BigDecimal fcurLossAdjustment) {
    this.fcurLossAdjustment = fcurLossAdjustment;
  }
  public tblnz_audprdwpreporting with_fcurLossAdjustment(java.math.BigDecimal fcurLossAdjustment) {
    this.fcurLossAdjustment = fcurLossAdjustment;
    return this;
  }
  private java.math.BigDecimal fcurRentalAdjustment;
  public java.math.BigDecimal get_fcurRentalAdjustment() {
    return fcurRentalAdjustment;
  }
  public void set_fcurRentalAdjustment(java.math.BigDecimal fcurRentalAdjustment) {
    this.fcurRentalAdjustment = fcurRentalAdjustment;
  }
  public tblnz_audprdwpreporting with_fcurRentalAdjustment(java.math.BigDecimal fcurRentalAdjustment) {
    this.fcurRentalAdjustment = fcurRentalAdjustment;
    return this;
  }
  private java.math.BigDecimal fcurRDTIAdjustment;
  public java.math.BigDecimal get_fcurRDTIAdjustment() {
    return fcurRDTIAdjustment;
  }
  public void set_fcurRDTIAdjustment(java.math.BigDecimal fcurRDTIAdjustment) {
    this.fcurRDTIAdjustment = fcurRDTIAdjustment;
  }
  public tblnz_audprdwpreporting with_fcurRDTIAdjustment(java.math.BigDecimal fcurRDTIAdjustment) {
    this.fcurRDTIAdjustment = fcurRDTIAdjustment;
    return this;
  }
  private java.math.BigDecimal fcurRDTIRemainingAdjustment;
  public java.math.BigDecimal get_fcurRDTIRemainingAdjustment() {
    return fcurRDTIRemainingAdjustment;
  }
  public void set_fcurRDTIRemainingAdjustment(java.math.BigDecimal fcurRDTIRemainingAdjustment) {
    this.fcurRDTIRemainingAdjustment = fcurRDTIRemainingAdjustment;
  }
  public tblnz_audprdwpreporting with_fcurRDTIRemainingAdjustment(java.math.BigDecimal fcurRDTIRemainingAdjustment) {
    this.fcurRDTIRemainingAdjustment = fcurRDTIRemainingAdjustment;
    return this;
  }
  private java.math.BigDecimal fcurICAAdjustment;
  public java.math.BigDecimal get_fcurICAAdjustment() {
    return fcurICAAdjustment;
  }
  public void set_fcurICAAdjustment(java.math.BigDecimal fcurICAAdjustment) {
    this.fcurICAAdjustment = fcurICAAdjustment;
  }
  public tblnz_audprdwpreporting with_fcurICAAdjustment(java.math.BigDecimal fcurICAAdjustment) {
    this.fcurICAAdjustment = fcurICAAdjustment;
    return this;
  }
  private java.math.BigDecimal fcurCoreTax;
  public java.math.BigDecimal get_fcurCoreTax() {
    return fcurCoreTax;
  }
  public void set_fcurCoreTax(java.math.BigDecimal fcurCoreTax) {
    this.fcurCoreTax = fcurCoreTax;
  }
  public tblnz_audprdwpreporting with_fcurCoreTax(java.math.BigDecimal fcurCoreTax) {
    this.fcurCoreTax = fcurCoreTax;
    return this;
  }
  private Integer fblnCommitted;
  public Integer get_fblnCommitted() {
    return fblnCommitted;
  }
  public void set_fblnCommitted(Integer fblnCommitted) {
    this.fblnCommitted = fblnCommitted;
  }
  public tblnz_audprdwpreporting with_fblnCommitted(Integer fblnCommitted) {
    this.fblnCommitted = fblnCommitted;
    return this;
  }
  private Integer fblnGPCommitted;
  public Integer get_fblnGPCommitted() {
    return fblnGPCommitted;
  }
  public void set_fblnGPCommitted(Integer fblnGPCommitted) {
    this.fblnGPCommitted = fblnGPCommitted;
  }
  public tblnz_audprdwpreporting with_fblnGPCommitted(Integer fblnGPCommitted) {
    this.fblnGPCommitted = fblnGPCommitted;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_audprdwpreporting with_fstrWho(String fstrWho) {
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
  public tblnz_audprdwpreporting with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_audprdwpreporting)) {
      return false;
    }
    tblnz_audprdwpreporting that = (tblnz_audprdwpreporting) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrPostingType == null ? that.fstrPostingType == null : this.fstrPostingType.equals(that.fstrPostingType));
    equal = equal && (this.fdtmPostingDate == null ? that.fdtmPostingDate == null : this.fdtmPostingDate.equals(that.fdtmPostingDate));
    equal = equal && (this.fcurTaxOriginal == null ? that.fcurTaxOriginal == null : this.fcurTaxOriginal.equals(that.fcurTaxOriginal));
    equal = equal && (this.fcurTaxAfter == null ? that.fcurTaxAfter == null : this.fcurTaxAfter.equals(that.fcurTaxAfter));
    equal = equal && (this.fcurTaxDelta == null ? that.fcurTaxDelta == null : this.fcurTaxDelta.equals(that.fcurTaxDelta));
    equal = equal && (this.fcurLossAdjustment == null ? that.fcurLossAdjustment == null : this.fcurLossAdjustment.equals(that.fcurLossAdjustment));
    equal = equal && (this.fcurRentalAdjustment == null ? that.fcurRentalAdjustment == null : this.fcurRentalAdjustment.equals(that.fcurRentalAdjustment));
    equal = equal && (this.fcurRDTIAdjustment == null ? that.fcurRDTIAdjustment == null : this.fcurRDTIAdjustment.equals(that.fcurRDTIAdjustment));
    equal = equal && (this.fcurRDTIRemainingAdjustment == null ? that.fcurRDTIRemainingAdjustment == null : this.fcurRDTIRemainingAdjustment.equals(that.fcurRDTIRemainingAdjustment));
    equal = equal && (this.fcurICAAdjustment == null ? that.fcurICAAdjustment == null : this.fcurICAAdjustment.equals(that.fcurICAAdjustment));
    equal = equal && (this.fcurCoreTax == null ? that.fcurCoreTax == null : this.fcurCoreTax.equals(that.fcurCoreTax));
    equal = equal && (this.fblnCommitted == null ? that.fblnCommitted == null : this.fblnCommitted.equals(that.fblnCommitted));
    equal = equal && (this.fblnGPCommitted == null ? that.fblnGPCommitted == null : this.fblnGPCommitted.equals(that.fblnGPCommitted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_audprdwpreporting)) {
      return false;
    }
    tblnz_audprdwpreporting that = (tblnz_audprdwpreporting) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fintSeq == null ? that.fintSeq == null : this.fintSeq.equals(that.fintSeq));
    equal = equal && (this.fstrPostingType == null ? that.fstrPostingType == null : this.fstrPostingType.equals(that.fstrPostingType));
    equal = equal && (this.fdtmPostingDate == null ? that.fdtmPostingDate == null : this.fdtmPostingDate.equals(that.fdtmPostingDate));
    equal = equal && (this.fcurTaxOriginal == null ? that.fcurTaxOriginal == null : this.fcurTaxOriginal.equals(that.fcurTaxOriginal));
    equal = equal && (this.fcurTaxAfter == null ? that.fcurTaxAfter == null : this.fcurTaxAfter.equals(that.fcurTaxAfter));
    equal = equal && (this.fcurTaxDelta == null ? that.fcurTaxDelta == null : this.fcurTaxDelta.equals(that.fcurTaxDelta));
    equal = equal && (this.fcurLossAdjustment == null ? that.fcurLossAdjustment == null : this.fcurLossAdjustment.equals(that.fcurLossAdjustment));
    equal = equal && (this.fcurRentalAdjustment == null ? that.fcurRentalAdjustment == null : this.fcurRentalAdjustment.equals(that.fcurRentalAdjustment));
    equal = equal && (this.fcurRDTIAdjustment == null ? that.fcurRDTIAdjustment == null : this.fcurRDTIAdjustment.equals(that.fcurRDTIAdjustment));
    equal = equal && (this.fcurRDTIRemainingAdjustment == null ? that.fcurRDTIRemainingAdjustment == null : this.fcurRDTIRemainingAdjustment.equals(that.fcurRDTIRemainingAdjustment));
    equal = equal && (this.fcurICAAdjustment == null ? that.fcurICAAdjustment == null : this.fcurICAAdjustment.equals(that.fcurICAAdjustment));
    equal = equal && (this.fcurCoreTax == null ? that.fcurCoreTax == null : this.fcurCoreTax.equals(that.fcurCoreTax));
    equal = equal && (this.fblnCommitted == null ? that.fblnCommitted == null : this.fblnCommitted.equals(that.fblnCommitted));
    equal = equal && (this.fblnGPCommitted == null ? that.fblnGPCommitted == null : this.fblnGPCommitted.equals(that.fblnGPCommitted));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrPostingType = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmPostingDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fcurTaxOriginal = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurTaxAfter = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurTaxDelta = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurLossAdjustment = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurRentalAdjustment = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurRDTIAdjustment = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurRDTIRemainingAdjustment = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurICAAdjustment = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurCoreTax = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnCommitted = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnGPCommitted = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fintSeq = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrPostingType = JdbcWritableBridge.readString(3, __dbResults);
    this.fdtmPostingDate = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fcurTaxOriginal = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurTaxAfter = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurTaxDelta = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurLossAdjustment = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurRentalAdjustment = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurRDTIAdjustment = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurRDTIRemainingAdjustment = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurICAAdjustment = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurCoreTax = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fblnCommitted = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnGPCommitted = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(16, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(17, __dbResults);
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
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostingType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPostingDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxOriginal, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfter, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDelta, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAdjustment, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalAdjustment, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDTIAdjustment, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDTIRemainingAdjustment, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurICAAdjustment, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCoreTax, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommitted, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGPCommitted, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSeq, 2 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostingType, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPostingDate, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxOriginal, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxAfter, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxDelta, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLossAdjustment, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRentalAdjustment, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDTIAdjustment, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRDTIRemainingAdjustment, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurICAAdjustment, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCoreTax, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommitted, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnGPCommitted, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 17 + __off, 93, __dbStmt);
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
        this.fintSeq = null;
    } else {
    this.fintSeq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPostingType = null;
    } else {
    this.fstrPostingType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPostingDate = null;
    } else {
    this.fdtmPostingDate = new Timestamp(__dataIn.readLong());
    this.fdtmPostingDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxOriginal = null;
    } else {
    this.fcurTaxOriginal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxAfter = null;
    } else {
    this.fcurTaxAfter = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxDelta = null;
    } else {
    this.fcurTaxDelta = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLossAdjustment = null;
    } else {
    this.fcurLossAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRentalAdjustment = null;
    } else {
    this.fcurRentalAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRDTIAdjustment = null;
    } else {
    this.fcurRDTIAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRDTIRemainingAdjustment = null;
    } else {
    this.fcurRDTIRemainingAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurICAAdjustment = null;
    } else {
    this.fcurICAAdjustment = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCoreTax = null;
    } else {
    this.fcurCoreTax = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCommitted = null;
    } else {
    this.fblnCommitted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnGPCommitted = null;
    } else {
    this.fblnGPCommitted = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fstrPostingType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostingType);
    }
    if (null == this.fdtmPostingDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPostingDate.getTime());
    __dataOut.writeInt(this.fdtmPostingDate.getNanos());
    }
    if (null == this.fcurTaxOriginal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxOriginal, __dataOut);
    }
    if (null == this.fcurTaxAfter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfter, __dataOut);
    }
    if (null == this.fcurTaxDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDelta, __dataOut);
    }
    if (null == this.fcurLossAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAdjustment, __dataOut);
    }
    if (null == this.fcurRentalAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRentalAdjustment, __dataOut);
    }
    if (null == this.fcurRDTIAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDTIAdjustment, __dataOut);
    }
    if (null == this.fcurRDTIRemainingAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDTIRemainingAdjustment, __dataOut);
    }
    if (null == this.fcurICAAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurICAAdjustment, __dataOut);
    }
    if (null == this.fcurCoreTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCoreTax, __dataOut);
    }
    if (null == this.fblnCommitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommitted);
    }
    if (null == this.fblnGPCommitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGPCommitted);
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
    if (null == this.fintSeq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSeq);
    }
    if (null == this.fstrPostingType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostingType);
    }
    if (null == this.fdtmPostingDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPostingDate.getTime());
    __dataOut.writeInt(this.fdtmPostingDate.getNanos());
    }
    if (null == this.fcurTaxOriginal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxOriginal, __dataOut);
    }
    if (null == this.fcurTaxAfter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxAfter, __dataOut);
    }
    if (null == this.fcurTaxDelta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxDelta, __dataOut);
    }
    if (null == this.fcurLossAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLossAdjustment, __dataOut);
    }
    if (null == this.fcurRentalAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRentalAdjustment, __dataOut);
    }
    if (null == this.fcurRDTIAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDTIAdjustment, __dataOut);
    }
    if (null == this.fcurRDTIRemainingAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRDTIRemainingAdjustment, __dataOut);
    }
    if (null == this.fcurICAAdjustment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurICAAdjustment, __dataOut);
    }
    if (null == this.fcurCoreTax) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCoreTax, __dataOut);
    }
    if (null == this.fblnCommitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommitted);
    }
    if (null == this.fblnGPCommitted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnGPCommitted);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostingType==null?"\\N":fstrPostingType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPostingDate==null?"\\N":"" + fdtmPostingDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxOriginal==null?"\\N":fcurTaxOriginal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfter==null?"\\N":fcurTaxAfter.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDelta==null?"\\N":fcurTaxDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAdjustment==null?"\\N":fcurLossAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRentalAdjustment==null?"\\N":fcurRentalAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDTIAdjustment==null?"\\N":fcurRDTIAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDTIRemainingAdjustment==null?"\\N":fcurRDTIRemainingAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurICAAdjustment==null?"\\N":fcurICAAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCoreTax==null?"\\N":fcurCoreTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommitted==null?"\\N":"" + fblnCommitted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGPCommitted==null?"\\N":"" + fblnGPCommitted, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fintSeq==null?"\\N":"" + fintSeq, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostingType==null?"\\N":fstrPostingType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPostingDate==null?"\\N":"" + fdtmPostingDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxOriginal==null?"\\N":fcurTaxOriginal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxAfter==null?"\\N":fcurTaxAfter.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxDelta==null?"\\N":fcurTaxDelta.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLossAdjustment==null?"\\N":fcurLossAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRentalAdjustment==null?"\\N":fcurRentalAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDTIAdjustment==null?"\\N":fcurRDTIAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRDTIRemainingAdjustment==null?"\\N":fcurRDTIRemainingAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurICAAdjustment==null?"\\N":fcurICAAdjustment.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCoreTax==null?"\\N":fcurCoreTax.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommitted==null?"\\N":"" + fblnCommitted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnGPCommitted==null?"\\N":"" + fblnGPCommitted, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostingType = null; } else {
      this.fstrPostingType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPostingDate = null; } else {
      this.fdtmPostingDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxOriginal = null; } else {
      this.fcurTaxOriginal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfter = null; } else {
      this.fcurTaxAfter = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDelta = null; } else {
      this.fcurTaxDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAdjustment = null; } else {
      this.fcurLossAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRentalAdjustment = null; } else {
      this.fcurRentalAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDTIAdjustment = null; } else {
      this.fcurRDTIAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDTIRemainingAdjustment = null; } else {
      this.fcurRDTIRemainingAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurICAAdjustment = null; } else {
      this.fcurICAAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCoreTax = null; } else {
      this.fcurCoreTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommitted = null; } else {
      this.fblnCommitted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGPCommitted = null; } else {
      this.fblnGPCommitted = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSeq = null; } else {
      this.fintSeq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostingType = null; } else {
      this.fstrPostingType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPostingDate = null; } else {
      this.fdtmPostingDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxOriginal = null; } else {
      this.fcurTaxOriginal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxAfter = null; } else {
      this.fcurTaxAfter = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxDelta = null; } else {
      this.fcurTaxDelta = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLossAdjustment = null; } else {
      this.fcurLossAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRentalAdjustment = null; } else {
      this.fcurRentalAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDTIAdjustment = null; } else {
      this.fcurRDTIAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRDTIRemainingAdjustment = null; } else {
      this.fcurRDTIRemainingAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurICAAdjustment = null; } else {
      this.fcurICAAdjustment = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCoreTax = null; } else {
      this.fcurCoreTax = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommitted = null; } else {
      this.fblnCommitted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnGPCommitted = null; } else {
      this.fblnGPCommitted = Integer.valueOf(__cur_str);
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
    tblnz_audprdwpreporting o = (tblnz_audprdwpreporting) super.clone();
    o.fdtmPostingDate = (o.fdtmPostingDate != null) ? (java.sql.Timestamp) o.fdtmPostingDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_audprdwpreporting o) throws CloneNotSupportedException {
    o.fdtmPostingDate = (o.fdtmPostingDate != null) ? (java.sql.Timestamp) o.fdtmPostingDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrPostingType", this.fstrPostingType);
    __sqoop$field_map.put("fdtmPostingDate", this.fdtmPostingDate);
    __sqoop$field_map.put("fcurTaxOriginal", this.fcurTaxOriginal);
    __sqoop$field_map.put("fcurTaxAfter", this.fcurTaxAfter);
    __sqoop$field_map.put("fcurTaxDelta", this.fcurTaxDelta);
    __sqoop$field_map.put("fcurLossAdjustment", this.fcurLossAdjustment);
    __sqoop$field_map.put("fcurRentalAdjustment", this.fcurRentalAdjustment);
    __sqoop$field_map.put("fcurRDTIAdjustment", this.fcurRDTIAdjustment);
    __sqoop$field_map.put("fcurRDTIRemainingAdjustment", this.fcurRDTIRemainingAdjustment);
    __sqoop$field_map.put("fcurICAAdjustment", this.fcurICAAdjustment);
    __sqoop$field_map.put("fcurCoreTax", this.fcurCoreTax);
    __sqoop$field_map.put("fblnCommitted", this.fblnCommitted);
    __sqoop$field_map.put("fblnGPCommitted", this.fblnGPCommitted);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fintSeq", this.fintSeq);
    __sqoop$field_map.put("fstrPostingType", this.fstrPostingType);
    __sqoop$field_map.put("fdtmPostingDate", this.fdtmPostingDate);
    __sqoop$field_map.put("fcurTaxOriginal", this.fcurTaxOriginal);
    __sqoop$field_map.put("fcurTaxAfter", this.fcurTaxAfter);
    __sqoop$field_map.put("fcurTaxDelta", this.fcurTaxDelta);
    __sqoop$field_map.put("fcurLossAdjustment", this.fcurLossAdjustment);
    __sqoop$field_map.put("fcurRentalAdjustment", this.fcurRentalAdjustment);
    __sqoop$field_map.put("fcurRDTIAdjustment", this.fcurRDTIAdjustment);
    __sqoop$field_map.put("fcurRDTIRemainingAdjustment", this.fcurRDTIRemainingAdjustment);
    __sqoop$field_map.put("fcurICAAdjustment", this.fcurICAAdjustment);
    __sqoop$field_map.put("fcurCoreTax", this.fcurCoreTax);
    __sqoop$field_map.put("fblnCommitted", this.fblnCommitted);
    __sqoop$field_map.put("fblnGPCommitted", this.fblnGPCommitted);
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
