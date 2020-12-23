// ORM class for table 'tblnz_summaryofearnings'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:30:29 NZDT 2020
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

public class tblnz_summaryofearnings extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fdtmIncomeYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fdtmIncomeYear = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngEmployerCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.flngEmployerCustomerKey = (Integer)value;
      }
    });
    setters.put("flngActivityNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.flngActivityNumber = (Integer)value;
      }
    });
    setters.put("fdtmStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fdtmStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmStop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fdtmStop = (java.sql.Timestamp)value;
      }
    });
    setters.put("fcurGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fcurGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurEarnings", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fcurEarnings = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPAYE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fcurPAYE = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurStudentLoan", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fcurStudentLoan = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTaxCreditsExtinguish", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fcurTaxCreditsExtinguish = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFamilyTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fcurFamilyTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmIssueDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fdtmIssueDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngFileKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.flngFileKey = (Integer)value;
      }
    });
    setters.put("flngFileRowNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.flngFileRowNumber = (Integer)value;
      }
    });
    setters.put("fdtmFileOut", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fdtmFileOut = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmLetterProcessed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fdtmLetterProcessed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_summaryofearnings.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_summaryofearnings() {
    init0();
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_summaryofearnings with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private java.sql.Timestamp fdtmIncomeYear;
  public java.sql.Timestamp get_fdtmIncomeYear() {
    return fdtmIncomeYear;
  }
  public void set_fdtmIncomeYear(java.sql.Timestamp fdtmIncomeYear) {
    this.fdtmIncomeYear = fdtmIncomeYear;
  }
  public tblnz_summaryofearnings with_fdtmIncomeYear(java.sql.Timestamp fdtmIncomeYear) {
    this.fdtmIncomeYear = fdtmIncomeYear;
    return this;
  }
  private Integer flngEmployerCustomerKey;
  public Integer get_flngEmployerCustomerKey() {
    return flngEmployerCustomerKey;
  }
  public void set_flngEmployerCustomerKey(Integer flngEmployerCustomerKey) {
    this.flngEmployerCustomerKey = flngEmployerCustomerKey;
  }
  public tblnz_summaryofearnings with_flngEmployerCustomerKey(Integer flngEmployerCustomerKey) {
    this.flngEmployerCustomerKey = flngEmployerCustomerKey;
    return this;
  }
  private Integer flngActivityNumber;
  public Integer get_flngActivityNumber() {
    return flngActivityNumber;
  }
  public void set_flngActivityNumber(Integer flngActivityNumber) {
    this.flngActivityNumber = flngActivityNumber;
  }
  public tblnz_summaryofearnings with_flngActivityNumber(Integer flngActivityNumber) {
    this.flngActivityNumber = flngActivityNumber;
    return this;
  }
  private java.sql.Timestamp fdtmStart;
  public java.sql.Timestamp get_fdtmStart() {
    return fdtmStart;
  }
  public void set_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
  }
  public tblnz_summaryofearnings with_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
    return this;
  }
  private java.sql.Timestamp fdtmStop;
  public java.sql.Timestamp get_fdtmStop() {
    return fdtmStop;
  }
  public void set_fdtmStop(java.sql.Timestamp fdtmStop) {
    this.fdtmStop = fdtmStop;
  }
  public tblnz_summaryofearnings with_fdtmStop(java.sql.Timestamp fdtmStop) {
    this.fdtmStop = fdtmStop;
    return this;
  }
  private java.math.BigDecimal fcurGross;
  public java.math.BigDecimal get_fcurGross() {
    return fcurGross;
  }
  public void set_fcurGross(java.math.BigDecimal fcurGross) {
    this.fcurGross = fcurGross;
  }
  public tblnz_summaryofearnings with_fcurGross(java.math.BigDecimal fcurGross) {
    this.fcurGross = fcurGross;
    return this;
  }
  private java.math.BigDecimal fcurEarnings;
  public java.math.BigDecimal get_fcurEarnings() {
    return fcurEarnings;
  }
  public void set_fcurEarnings(java.math.BigDecimal fcurEarnings) {
    this.fcurEarnings = fcurEarnings;
  }
  public tblnz_summaryofearnings with_fcurEarnings(java.math.BigDecimal fcurEarnings) {
    this.fcurEarnings = fcurEarnings;
    return this;
  }
  private java.math.BigDecimal fcurPAYE;
  public java.math.BigDecimal get_fcurPAYE() {
    return fcurPAYE;
  }
  public void set_fcurPAYE(java.math.BigDecimal fcurPAYE) {
    this.fcurPAYE = fcurPAYE;
  }
  public tblnz_summaryofearnings with_fcurPAYE(java.math.BigDecimal fcurPAYE) {
    this.fcurPAYE = fcurPAYE;
    return this;
  }
  private java.math.BigDecimal fcurStudentLoan;
  public java.math.BigDecimal get_fcurStudentLoan() {
    return fcurStudentLoan;
  }
  public void set_fcurStudentLoan(java.math.BigDecimal fcurStudentLoan) {
    this.fcurStudentLoan = fcurStudentLoan;
  }
  public tblnz_summaryofearnings with_fcurStudentLoan(java.math.BigDecimal fcurStudentLoan) {
    this.fcurStudentLoan = fcurStudentLoan;
    return this;
  }
  private java.math.BigDecimal fcurTaxCreditsExtinguish;
  public java.math.BigDecimal get_fcurTaxCreditsExtinguish() {
    return fcurTaxCreditsExtinguish;
  }
  public void set_fcurTaxCreditsExtinguish(java.math.BigDecimal fcurTaxCreditsExtinguish) {
    this.fcurTaxCreditsExtinguish = fcurTaxCreditsExtinguish;
  }
  public tblnz_summaryofearnings with_fcurTaxCreditsExtinguish(java.math.BigDecimal fcurTaxCreditsExtinguish) {
    this.fcurTaxCreditsExtinguish = fcurTaxCreditsExtinguish;
    return this;
  }
  private java.math.BigDecimal fcurFamilyTaxCredits;
  public java.math.BigDecimal get_fcurFamilyTaxCredits() {
    return fcurFamilyTaxCredits;
  }
  public void set_fcurFamilyTaxCredits(java.math.BigDecimal fcurFamilyTaxCredits) {
    this.fcurFamilyTaxCredits = fcurFamilyTaxCredits;
  }
  public tblnz_summaryofearnings with_fcurFamilyTaxCredits(java.math.BigDecimal fcurFamilyTaxCredits) {
    this.fcurFamilyTaxCredits = fcurFamilyTaxCredits;
    return this;
  }
  private java.sql.Timestamp fdtmIssueDate;
  public java.sql.Timestamp get_fdtmIssueDate() {
    return fdtmIssueDate;
  }
  public void set_fdtmIssueDate(java.sql.Timestamp fdtmIssueDate) {
    this.fdtmIssueDate = fdtmIssueDate;
  }
  public tblnz_summaryofearnings with_fdtmIssueDate(java.sql.Timestamp fdtmIssueDate) {
    this.fdtmIssueDate = fdtmIssueDate;
    return this;
  }
  private Integer flngFileKey;
  public Integer get_flngFileKey() {
    return flngFileKey;
  }
  public void set_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
  }
  public tblnz_summaryofearnings with_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
    return this;
  }
  private Integer flngFileRowNumber;
  public Integer get_flngFileRowNumber() {
    return flngFileRowNumber;
  }
  public void set_flngFileRowNumber(Integer flngFileRowNumber) {
    this.flngFileRowNumber = flngFileRowNumber;
  }
  public tblnz_summaryofearnings with_flngFileRowNumber(Integer flngFileRowNumber) {
    this.flngFileRowNumber = flngFileRowNumber;
    return this;
  }
  private java.sql.Timestamp fdtmFileOut;
  public java.sql.Timestamp get_fdtmFileOut() {
    return fdtmFileOut;
  }
  public void set_fdtmFileOut(java.sql.Timestamp fdtmFileOut) {
    this.fdtmFileOut = fdtmFileOut;
  }
  public tblnz_summaryofearnings with_fdtmFileOut(java.sql.Timestamp fdtmFileOut) {
    this.fdtmFileOut = fdtmFileOut;
    return this;
  }
  private java.sql.Timestamp fdtmLetterProcessed;
  public java.sql.Timestamp get_fdtmLetterProcessed() {
    return fdtmLetterProcessed;
  }
  public void set_fdtmLetterProcessed(java.sql.Timestamp fdtmLetterProcessed) {
    this.fdtmLetterProcessed = fdtmLetterProcessed;
  }
  public tblnz_summaryofearnings with_fdtmLetterProcessed(java.sql.Timestamp fdtmLetterProcessed) {
    this.fdtmLetterProcessed = fdtmLetterProcessed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_summaryofearnings with_fstrWho(String fstrWho) {
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
  public tblnz_summaryofearnings with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_summaryofearnings)) {
      return false;
    }
    tblnz_summaryofearnings that = (tblnz_summaryofearnings) o;
    boolean equal = true;
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fdtmIncomeYear == null ? that.fdtmIncomeYear == null : this.fdtmIncomeYear.equals(that.fdtmIncomeYear));
    equal = equal && (this.flngEmployerCustomerKey == null ? that.flngEmployerCustomerKey == null : this.flngEmployerCustomerKey.equals(that.flngEmployerCustomerKey));
    equal = equal && (this.flngActivityNumber == null ? that.flngActivityNumber == null : this.flngActivityNumber.equals(that.flngActivityNumber));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmStop == null ? that.fdtmStop == null : this.fdtmStop.equals(that.fdtmStop));
    equal = equal && (this.fcurGross == null ? that.fcurGross == null : this.fcurGross.equals(that.fcurGross));
    equal = equal && (this.fcurEarnings == null ? that.fcurEarnings == null : this.fcurEarnings.equals(that.fcurEarnings));
    equal = equal && (this.fcurPAYE == null ? that.fcurPAYE == null : this.fcurPAYE.equals(that.fcurPAYE));
    equal = equal && (this.fcurStudentLoan == null ? that.fcurStudentLoan == null : this.fcurStudentLoan.equals(that.fcurStudentLoan));
    equal = equal && (this.fcurTaxCreditsExtinguish == null ? that.fcurTaxCreditsExtinguish == null : this.fcurTaxCreditsExtinguish.equals(that.fcurTaxCreditsExtinguish));
    equal = equal && (this.fcurFamilyTaxCredits == null ? that.fcurFamilyTaxCredits == null : this.fcurFamilyTaxCredits.equals(that.fcurFamilyTaxCredits));
    equal = equal && (this.fdtmIssueDate == null ? that.fdtmIssueDate == null : this.fdtmIssueDate.equals(that.fdtmIssueDate));
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.flngFileRowNumber == null ? that.flngFileRowNumber == null : this.flngFileRowNumber.equals(that.flngFileRowNumber));
    equal = equal && (this.fdtmFileOut == null ? that.fdtmFileOut == null : this.fdtmFileOut.equals(that.fdtmFileOut));
    equal = equal && (this.fdtmLetterProcessed == null ? that.fdtmLetterProcessed == null : this.fdtmLetterProcessed.equals(that.fdtmLetterProcessed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_summaryofearnings)) {
      return false;
    }
    tblnz_summaryofearnings that = (tblnz_summaryofearnings) o;
    boolean equal = true;
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fdtmIncomeYear == null ? that.fdtmIncomeYear == null : this.fdtmIncomeYear.equals(that.fdtmIncomeYear));
    equal = equal && (this.flngEmployerCustomerKey == null ? that.flngEmployerCustomerKey == null : this.flngEmployerCustomerKey.equals(that.flngEmployerCustomerKey));
    equal = equal && (this.flngActivityNumber == null ? that.flngActivityNumber == null : this.flngActivityNumber.equals(that.flngActivityNumber));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmStop == null ? that.fdtmStop == null : this.fdtmStop.equals(that.fdtmStop));
    equal = equal && (this.fcurGross == null ? that.fcurGross == null : this.fcurGross.equals(that.fcurGross));
    equal = equal && (this.fcurEarnings == null ? that.fcurEarnings == null : this.fcurEarnings.equals(that.fcurEarnings));
    equal = equal && (this.fcurPAYE == null ? that.fcurPAYE == null : this.fcurPAYE.equals(that.fcurPAYE));
    equal = equal && (this.fcurStudentLoan == null ? that.fcurStudentLoan == null : this.fcurStudentLoan.equals(that.fcurStudentLoan));
    equal = equal && (this.fcurTaxCreditsExtinguish == null ? that.fcurTaxCreditsExtinguish == null : this.fcurTaxCreditsExtinguish.equals(that.fcurTaxCreditsExtinguish));
    equal = equal && (this.fcurFamilyTaxCredits == null ? that.fcurFamilyTaxCredits == null : this.fcurFamilyTaxCredits.equals(that.fcurFamilyTaxCredits));
    equal = equal && (this.fdtmIssueDate == null ? that.fdtmIssueDate == null : this.fdtmIssueDate.equals(that.fdtmIssueDate));
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.flngFileRowNumber == null ? that.flngFileRowNumber == null : this.flngFileRowNumber.equals(that.flngFileRowNumber));
    equal = equal && (this.fdtmFileOut == null ? that.fdtmFileOut == null : this.fdtmFileOut.equals(that.fdtmFileOut));
    equal = equal && (this.fdtmLetterProcessed == null ? that.fdtmLetterProcessed == null : this.fdtmLetterProcessed.equals(that.fdtmLetterProcessed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngCustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmIncomeYear = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.flngEmployerCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngActivityNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmStop = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fcurGross = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurEarnings = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurPAYE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurStudentLoan = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTaxCreditsExtinguish = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurFamilyTaxCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fdtmIssueDate = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.flngFileKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngFileRowNumber = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmFileOut = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmLetterProcessed = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngCustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmIncomeYear = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.flngEmployerCustomerKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngActivityNumber = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fdtmStop = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fcurGross = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurEarnings = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurPAYE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurStudentLoan = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurTaxCreditsExtinguish = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurFamilyTaxCredits = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fdtmIssueDate = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.flngFileKey = JdbcWritableBridge.readInteger(14, __dbResults);
    this.flngFileRowNumber = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fdtmFileOut = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fdtmLetterProcessed = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngCustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIncomeYear, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngActivityNumber, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStop, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGross, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEarnings, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPAYE, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurStudentLoan, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditsExtinguish, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFamilyTaxCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIssueDate, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFileKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFileRowNumber, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFileOut, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLetterProcessed, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngCustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIncomeYear, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerCustomerKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngActivityNumber, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStop, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGross, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurEarnings, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPAYE, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurStudentLoan, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTaxCreditsExtinguish, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFamilyTaxCredits, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmIssueDate, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFileKey, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFileRowNumber, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFileOut, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLetterProcessed, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmIncomeYear = null;
    } else {
    this.fdtmIncomeYear = new Timestamp(__dataIn.readLong());
    this.fdtmIncomeYear.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerCustomerKey = null;
    } else {
    this.flngEmployerCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngActivityNumber = null;
    } else {
    this.flngActivityNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStart = null;
    } else {
    this.fdtmStart = new Timestamp(__dataIn.readLong());
    this.fdtmStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStop = null;
    } else {
    this.fdtmStop = new Timestamp(__dataIn.readLong());
    this.fdtmStop.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGross = null;
    } else {
    this.fcurGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurEarnings = null;
    } else {
    this.fcurEarnings = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPAYE = null;
    } else {
    this.fcurPAYE = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurStudentLoan = null;
    } else {
    this.fcurStudentLoan = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTaxCreditsExtinguish = null;
    } else {
    this.fcurTaxCreditsExtinguish = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFamilyTaxCredits = null;
    } else {
    this.fcurFamilyTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmIssueDate = null;
    } else {
    this.fdtmIssueDate = new Timestamp(__dataIn.readLong());
    this.fdtmIssueDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFileKey = null;
    } else {
    this.flngFileKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFileRowNumber = null;
    } else {
    this.flngFileRowNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFileOut = null;
    } else {
    this.fdtmFileOut = new Timestamp(__dataIn.readLong());
    this.fdtmFileOut.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLetterProcessed = null;
    } else {
    this.fdtmLetterProcessed = new Timestamp(__dataIn.readLong());
    this.fdtmLetterProcessed.setNanos(__dataIn.readInt());
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fdtmIncomeYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIncomeYear.getTime());
    __dataOut.writeInt(this.fdtmIncomeYear.getNanos());
    }
    if (null == this.flngEmployerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerCustomerKey);
    }
    if (null == this.flngActivityNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngActivityNumber);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStop.getTime());
    __dataOut.writeInt(this.fdtmStop.getNanos());
    }
    if (null == this.fcurGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGross, __dataOut);
    }
    if (null == this.fcurEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEarnings, __dataOut);
    }
    if (null == this.fcurPAYE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPAYE, __dataOut);
    }
    if (null == this.fcurStudentLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurStudentLoan, __dataOut);
    }
    if (null == this.fcurTaxCreditsExtinguish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditsExtinguish, __dataOut);
    }
    if (null == this.fcurFamilyTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFamilyTaxCredits, __dataOut);
    }
    if (null == this.fdtmIssueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIssueDate.getTime());
    __dataOut.writeInt(this.fdtmIssueDate.getNanos());
    }
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.flngFileRowNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileRowNumber);
    }
    if (null == this.fdtmFileOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFileOut.getTime());
    __dataOut.writeInt(this.fdtmFileOut.getNanos());
    }
    if (null == this.fdtmLetterProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLetterProcessed.getTime());
    __dataOut.writeInt(this.fdtmLetterProcessed.getNanos());
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
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fdtmIncomeYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIncomeYear.getTime());
    __dataOut.writeInt(this.fdtmIncomeYear.getNanos());
    }
    if (null == this.flngEmployerCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerCustomerKey);
    }
    if (null == this.flngActivityNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngActivityNumber);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStop.getTime());
    __dataOut.writeInt(this.fdtmStop.getNanos());
    }
    if (null == this.fcurGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGross, __dataOut);
    }
    if (null == this.fcurEarnings) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurEarnings, __dataOut);
    }
    if (null == this.fcurPAYE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPAYE, __dataOut);
    }
    if (null == this.fcurStudentLoan) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurStudentLoan, __dataOut);
    }
    if (null == this.fcurTaxCreditsExtinguish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTaxCreditsExtinguish, __dataOut);
    }
    if (null == this.fcurFamilyTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFamilyTaxCredits, __dataOut);
    }
    if (null == this.fdtmIssueDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmIssueDate.getTime());
    __dataOut.writeInt(this.fdtmIssueDate.getNanos());
    }
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.flngFileRowNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileRowNumber);
    }
    if (null == this.fdtmFileOut) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFileOut.getTime());
    __dataOut.writeInt(this.fdtmFileOut.getNanos());
    }
    if (null == this.fdtmLetterProcessed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLetterProcessed.getTime());
    __dataOut.writeInt(this.fdtmLetterProcessed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIncomeYear==null?"\\N":"" + fdtmIncomeYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerCustomerKey==null?"\\N":"" + flngEmployerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngActivityNumber==null?"\\N":"" + flngActivityNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStop==null?"\\N":"" + fdtmStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGross==null?"\\N":fcurGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEarnings==null?"\\N":fcurEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPAYE==null?"\\N":fcurPAYE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurStudentLoan==null?"\\N":fcurStudentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditsExtinguish==null?"\\N":fcurTaxCreditsExtinguish.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFamilyTaxCredits==null?"\\N":fcurFamilyTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIssueDate==null?"\\N":"" + fdtmIssueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileRowNumber==null?"\\N":"" + flngFileRowNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFileOut==null?"\\N":"" + fdtmFileOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLetterProcessed==null?"\\N":"" + fdtmLetterProcessed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIncomeYear==null?"\\N":"" + fdtmIncomeYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerCustomerKey==null?"\\N":"" + flngEmployerCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngActivityNumber==null?"\\N":"" + flngActivityNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStop==null?"\\N":"" + fdtmStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGross==null?"\\N":fcurGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurEarnings==null?"\\N":fcurEarnings.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPAYE==null?"\\N":fcurPAYE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurStudentLoan==null?"\\N":fcurStudentLoan.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTaxCreditsExtinguish==null?"\\N":fcurTaxCreditsExtinguish.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFamilyTaxCredits==null?"\\N":fcurFamilyTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmIssueDate==null?"\\N":"" + fdtmIssueDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileRowNumber==null?"\\N":"" + flngFileRowNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFileOut==null?"\\N":"" + fdtmFileOut, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLetterProcessed==null?"\\N":"" + fdtmLetterProcessed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIncomeYear = null; } else {
      this.fdtmIncomeYear = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerCustomerKey = null; } else {
      this.flngEmployerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngActivityNumber = null; } else {
      this.flngActivityNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStop = null; } else {
      this.fdtmStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGross = null; } else {
      this.fcurGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEarnings = null; } else {
      this.fcurEarnings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPAYE = null; } else {
      this.fcurPAYE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurStudentLoan = null; } else {
      this.fcurStudentLoan = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditsExtinguish = null; } else {
      this.fcurTaxCreditsExtinguish = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFamilyTaxCredits = null; } else {
      this.fcurFamilyTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIssueDate = null; } else {
      this.fdtmIssueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileKey = null; } else {
      this.flngFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileRowNumber = null; } else {
      this.flngFileRowNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFileOut = null; } else {
      this.fdtmFileOut = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLetterProcessed = null; } else {
      this.fdtmLetterProcessed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIncomeYear = null; } else {
      this.fdtmIncomeYear = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerCustomerKey = null; } else {
      this.flngEmployerCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngActivityNumber = null; } else {
      this.flngActivityNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStop = null; } else {
      this.fdtmStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGross = null; } else {
      this.fcurGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurEarnings = null; } else {
      this.fcurEarnings = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPAYE = null; } else {
      this.fcurPAYE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurStudentLoan = null; } else {
      this.fcurStudentLoan = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTaxCreditsExtinguish = null; } else {
      this.fcurTaxCreditsExtinguish = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFamilyTaxCredits = null; } else {
      this.fcurFamilyTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmIssueDate = null; } else {
      this.fdtmIssueDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileKey = null; } else {
      this.flngFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileRowNumber = null; } else {
      this.flngFileRowNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFileOut = null; } else {
      this.fdtmFileOut = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLetterProcessed = null; } else {
      this.fdtmLetterProcessed = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_summaryofearnings o = (tblnz_summaryofearnings) super.clone();
    o.fdtmIncomeYear = (o.fdtmIncomeYear != null) ? (java.sql.Timestamp) o.fdtmIncomeYear.clone() : null;
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmStop = (o.fdtmStop != null) ? (java.sql.Timestamp) o.fdtmStop.clone() : null;
    o.fdtmIssueDate = (o.fdtmIssueDate != null) ? (java.sql.Timestamp) o.fdtmIssueDate.clone() : null;
    o.fdtmFileOut = (o.fdtmFileOut != null) ? (java.sql.Timestamp) o.fdtmFileOut.clone() : null;
    o.fdtmLetterProcessed = (o.fdtmLetterProcessed != null) ? (java.sql.Timestamp) o.fdtmLetterProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_summaryofearnings o) throws CloneNotSupportedException {
    o.fdtmIncomeYear = (o.fdtmIncomeYear != null) ? (java.sql.Timestamp) o.fdtmIncomeYear.clone() : null;
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmStop = (o.fdtmStop != null) ? (java.sql.Timestamp) o.fdtmStop.clone() : null;
    o.fdtmIssueDate = (o.fdtmIssueDate != null) ? (java.sql.Timestamp) o.fdtmIssueDate.clone() : null;
    o.fdtmFileOut = (o.fdtmFileOut != null) ? (java.sql.Timestamp) o.fdtmFileOut.clone() : null;
    o.fdtmLetterProcessed = (o.fdtmLetterProcessed != null) ? (java.sql.Timestamp) o.fdtmLetterProcessed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fdtmIncomeYear", this.fdtmIncomeYear);
    __sqoop$field_map.put("flngEmployerCustomerKey", this.flngEmployerCustomerKey);
    __sqoop$field_map.put("flngActivityNumber", this.flngActivityNumber);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmStop", this.fdtmStop);
    __sqoop$field_map.put("fcurGross", this.fcurGross);
    __sqoop$field_map.put("fcurEarnings", this.fcurEarnings);
    __sqoop$field_map.put("fcurPAYE", this.fcurPAYE);
    __sqoop$field_map.put("fcurStudentLoan", this.fcurStudentLoan);
    __sqoop$field_map.put("fcurTaxCreditsExtinguish", this.fcurTaxCreditsExtinguish);
    __sqoop$field_map.put("fcurFamilyTaxCredits", this.fcurFamilyTaxCredits);
    __sqoop$field_map.put("fdtmIssueDate", this.fdtmIssueDate);
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("flngFileRowNumber", this.flngFileRowNumber);
    __sqoop$field_map.put("fdtmFileOut", this.fdtmFileOut);
    __sqoop$field_map.put("fdtmLetterProcessed", this.fdtmLetterProcessed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fdtmIncomeYear", this.fdtmIncomeYear);
    __sqoop$field_map.put("flngEmployerCustomerKey", this.flngEmployerCustomerKey);
    __sqoop$field_map.put("flngActivityNumber", this.flngActivityNumber);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmStop", this.fdtmStop);
    __sqoop$field_map.put("fcurGross", this.fcurGross);
    __sqoop$field_map.put("fcurEarnings", this.fcurEarnings);
    __sqoop$field_map.put("fcurPAYE", this.fcurPAYE);
    __sqoop$field_map.put("fcurStudentLoan", this.fcurStudentLoan);
    __sqoop$field_map.put("fcurTaxCreditsExtinguish", this.fcurTaxCreditsExtinguish);
    __sqoop$field_map.put("fcurFamilyTaxCredits", this.fcurFamilyTaxCredits);
    __sqoop$field_map.put("fdtmIssueDate", this.fdtmIssueDate);
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("flngFileRowNumber", this.flngFileRowNumber);
    __sqoop$field_map.put("fdtmFileOut", this.fdtmFileOut);
    __sqoop$field_map.put("fdtmLetterProcessed", this.fdtmLetterProcessed);
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
