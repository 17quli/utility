// ORM class for table 'tblnz_bankfile'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 06:19:44 NZDT 2020
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

public class tblnz_bankfile extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngFileKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.flngFileKey = (Integer)value;
      }
    });
    setters.put("fstrRecordType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fstrRecordType = (String)value;
      }
    });
    setters.put("flngSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.flngSequence = (Integer)value;
      }
    });
    setters.put("fstrLine", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fstrLine = (String)value;
      }
    });
    setters.put("flngChildFileKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.flngChildFileKey = (Integer)value;
      }
    });
    setters.put("fstrBankAccount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fstrBankAccount = (String)value;
      }
    });
    setters.put("fstrPRN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fstrPRN = (String)value;
      }
    });
    setters.put("fstrChildFile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fstrChildFile = (String)value;
      }
    });
    setters.put("fcurCredit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fcurCredit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDebit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fcurDebit = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurGroupBalance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fcurGroupBalance = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrTransCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fstrTransCode = (String)value;
      }
    });
    setters.put("fstrMTSCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fstrMTSCode = (String)value;
      }
    });
    setters.put("fdtmProcessDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fdtmProcessDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_bankfile.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_bankfile() {
    init0();
  }
  private Integer flngFileKey;
  public Integer get_flngFileKey() {
    return flngFileKey;
  }
  public void set_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
  }
  public tblnz_bankfile with_flngFileKey(Integer flngFileKey) {
    this.flngFileKey = flngFileKey;
    return this;
  }
  private String fstrRecordType;
  public String get_fstrRecordType() {
    return fstrRecordType;
  }
  public void set_fstrRecordType(String fstrRecordType) {
    this.fstrRecordType = fstrRecordType;
  }
  public tblnz_bankfile with_fstrRecordType(String fstrRecordType) {
    this.fstrRecordType = fstrRecordType;
    return this;
  }
  private Integer flngSequence;
  public Integer get_flngSequence() {
    return flngSequence;
  }
  public void set_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
  }
  public tblnz_bankfile with_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
    return this;
  }
  private String fstrLine;
  public String get_fstrLine() {
    return fstrLine;
  }
  public void set_fstrLine(String fstrLine) {
    this.fstrLine = fstrLine;
  }
  public tblnz_bankfile with_fstrLine(String fstrLine) {
    this.fstrLine = fstrLine;
    return this;
  }
  private Integer flngChildFileKey;
  public Integer get_flngChildFileKey() {
    return flngChildFileKey;
  }
  public void set_flngChildFileKey(Integer flngChildFileKey) {
    this.flngChildFileKey = flngChildFileKey;
  }
  public tblnz_bankfile with_flngChildFileKey(Integer flngChildFileKey) {
    this.flngChildFileKey = flngChildFileKey;
    return this;
  }
  private String fstrBankAccount;
  public String get_fstrBankAccount() {
    return fstrBankAccount;
  }
  public void set_fstrBankAccount(String fstrBankAccount) {
    this.fstrBankAccount = fstrBankAccount;
  }
  public tblnz_bankfile with_fstrBankAccount(String fstrBankAccount) {
    this.fstrBankAccount = fstrBankAccount;
    return this;
  }
  private String fstrPRN;
  public String get_fstrPRN() {
    return fstrPRN;
  }
  public void set_fstrPRN(String fstrPRN) {
    this.fstrPRN = fstrPRN;
  }
  public tblnz_bankfile with_fstrPRN(String fstrPRN) {
    this.fstrPRN = fstrPRN;
    return this;
  }
  private String fstrChildFile;
  public String get_fstrChildFile() {
    return fstrChildFile;
  }
  public void set_fstrChildFile(String fstrChildFile) {
    this.fstrChildFile = fstrChildFile;
  }
  public tblnz_bankfile with_fstrChildFile(String fstrChildFile) {
    this.fstrChildFile = fstrChildFile;
    return this;
  }
  private java.math.BigDecimal fcurCredit;
  public java.math.BigDecimal get_fcurCredit() {
    return fcurCredit;
  }
  public void set_fcurCredit(java.math.BigDecimal fcurCredit) {
    this.fcurCredit = fcurCredit;
  }
  public tblnz_bankfile with_fcurCredit(java.math.BigDecimal fcurCredit) {
    this.fcurCredit = fcurCredit;
    return this;
  }
  private java.math.BigDecimal fcurDebit;
  public java.math.BigDecimal get_fcurDebit() {
    return fcurDebit;
  }
  public void set_fcurDebit(java.math.BigDecimal fcurDebit) {
    this.fcurDebit = fcurDebit;
  }
  public tblnz_bankfile with_fcurDebit(java.math.BigDecimal fcurDebit) {
    this.fcurDebit = fcurDebit;
    return this;
  }
  private java.math.BigDecimal fcurGroupBalance;
  public java.math.BigDecimal get_fcurGroupBalance() {
    return fcurGroupBalance;
  }
  public void set_fcurGroupBalance(java.math.BigDecimal fcurGroupBalance) {
    this.fcurGroupBalance = fcurGroupBalance;
  }
  public tblnz_bankfile with_fcurGroupBalance(java.math.BigDecimal fcurGroupBalance) {
    this.fcurGroupBalance = fcurGroupBalance;
    return this;
  }
  private String fstrTransCode;
  public String get_fstrTransCode() {
    return fstrTransCode;
  }
  public void set_fstrTransCode(String fstrTransCode) {
    this.fstrTransCode = fstrTransCode;
  }
  public tblnz_bankfile with_fstrTransCode(String fstrTransCode) {
    this.fstrTransCode = fstrTransCode;
    return this;
  }
  private String fstrMTSCode;
  public String get_fstrMTSCode() {
    return fstrMTSCode;
  }
  public void set_fstrMTSCode(String fstrMTSCode) {
    this.fstrMTSCode = fstrMTSCode;
  }
  public tblnz_bankfile with_fstrMTSCode(String fstrMTSCode) {
    this.fstrMTSCode = fstrMTSCode;
    return this;
  }
  private java.sql.Timestamp fdtmProcessDate;
  public java.sql.Timestamp get_fdtmProcessDate() {
    return fdtmProcessDate;
  }
  public void set_fdtmProcessDate(java.sql.Timestamp fdtmProcessDate) {
    this.fdtmProcessDate = fdtmProcessDate;
  }
  public tblnz_bankfile with_fdtmProcessDate(java.sql.Timestamp fdtmProcessDate) {
    this.fdtmProcessDate = fdtmProcessDate;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_bankfile with_fstrWho(String fstrWho) {
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
  public tblnz_bankfile with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_bankfile)) {
      return false;
    }
    tblnz_bankfile that = (tblnz_bankfile) o;
    boolean equal = true;
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.fstrRecordType == null ? that.fstrRecordType == null : this.fstrRecordType.equals(that.fstrRecordType));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.fstrLine == null ? that.fstrLine == null : this.fstrLine.equals(that.fstrLine));
    equal = equal && (this.flngChildFileKey == null ? that.flngChildFileKey == null : this.flngChildFileKey.equals(that.flngChildFileKey));
    equal = equal && (this.fstrBankAccount == null ? that.fstrBankAccount == null : this.fstrBankAccount.equals(that.fstrBankAccount));
    equal = equal && (this.fstrPRN == null ? that.fstrPRN == null : this.fstrPRN.equals(that.fstrPRN));
    equal = equal && (this.fstrChildFile == null ? that.fstrChildFile == null : this.fstrChildFile.equals(that.fstrChildFile));
    equal = equal && (this.fcurCredit == null ? that.fcurCredit == null : this.fcurCredit.equals(that.fcurCredit));
    equal = equal && (this.fcurDebit == null ? that.fcurDebit == null : this.fcurDebit.equals(that.fcurDebit));
    equal = equal && (this.fcurGroupBalance == null ? that.fcurGroupBalance == null : this.fcurGroupBalance.equals(that.fcurGroupBalance));
    equal = equal && (this.fstrTransCode == null ? that.fstrTransCode == null : this.fstrTransCode.equals(that.fstrTransCode));
    equal = equal && (this.fstrMTSCode == null ? that.fstrMTSCode == null : this.fstrMTSCode.equals(that.fstrMTSCode));
    equal = equal && (this.fdtmProcessDate == null ? that.fdtmProcessDate == null : this.fdtmProcessDate.equals(that.fdtmProcessDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_bankfile)) {
      return false;
    }
    tblnz_bankfile that = (tblnz_bankfile) o;
    boolean equal = true;
    equal = equal && (this.flngFileKey == null ? that.flngFileKey == null : this.flngFileKey.equals(that.flngFileKey));
    equal = equal && (this.fstrRecordType == null ? that.fstrRecordType == null : this.fstrRecordType.equals(that.fstrRecordType));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.fstrLine == null ? that.fstrLine == null : this.fstrLine.equals(that.fstrLine));
    equal = equal && (this.flngChildFileKey == null ? that.flngChildFileKey == null : this.flngChildFileKey.equals(that.flngChildFileKey));
    equal = equal && (this.fstrBankAccount == null ? that.fstrBankAccount == null : this.fstrBankAccount.equals(that.fstrBankAccount));
    equal = equal && (this.fstrPRN == null ? that.fstrPRN == null : this.fstrPRN.equals(that.fstrPRN));
    equal = equal && (this.fstrChildFile == null ? that.fstrChildFile == null : this.fstrChildFile.equals(that.fstrChildFile));
    equal = equal && (this.fcurCredit == null ? that.fcurCredit == null : this.fcurCredit.equals(that.fcurCredit));
    equal = equal && (this.fcurDebit == null ? that.fcurDebit == null : this.fcurDebit.equals(that.fcurDebit));
    equal = equal && (this.fcurGroupBalance == null ? that.fcurGroupBalance == null : this.fcurGroupBalance.equals(that.fcurGroupBalance));
    equal = equal && (this.fstrTransCode == null ? that.fstrTransCode == null : this.fstrTransCode.equals(that.fstrTransCode));
    equal = equal && (this.fstrMTSCode == null ? that.fstrMTSCode == null : this.fstrMTSCode.equals(that.fstrMTSCode));
    equal = equal && (this.fdtmProcessDate == null ? that.fdtmProcessDate == null : this.fdtmProcessDate.equals(that.fdtmProcessDate));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngFileKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRecordType = JdbcWritableBridge.readString(2, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrLine = JdbcWritableBridge.readString(4, __dbResults);
    this.flngChildFileKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrBankAccount = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPRN = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrChildFile = JdbcWritableBridge.readString(8, __dbResults);
    this.fcurCredit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurDebit = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurGroupBalance = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fstrTransCode = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrMTSCode = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmProcessDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngFileKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fstrRecordType = JdbcWritableBridge.readString(2, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrLine = JdbcWritableBridge.readString(4, __dbResults);
    this.flngChildFileKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrBankAccount = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPRN = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrChildFile = JdbcWritableBridge.readString(8, __dbResults);
    this.fcurCredit = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurDebit = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurGroupBalance = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fstrTransCode = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrMTSCode = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmProcessDate = JdbcWritableBridge.readTimestamp(14, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFileKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecordType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLine, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngChildFileKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccount, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPRN, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChildFile, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCredit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebit, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGroupBalance, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransCode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMTSCode, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngFileKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecordType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLine, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngChildFileKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrBankAccount, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPRN, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrChildFile, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCredit, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDebit, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurGroupBalance, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrTransCode, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMTSCode, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmProcessDate, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 16 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngFileKey = null;
    } else {
    this.flngFileKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecordType = null;
    } else {
    this.fstrRecordType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSequence = null;
    } else {
    this.flngSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLine = null;
    } else {
    this.fstrLine = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngChildFileKey = null;
    } else {
    this.flngChildFileKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBankAccount = null;
    } else {
    this.fstrBankAccount = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPRN = null;
    } else {
    this.fstrPRN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrChildFile = null;
    } else {
    this.fstrChildFile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCredit = null;
    } else {
    this.fcurCredit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDebit = null;
    } else {
    this.fcurDebit = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurGroupBalance = null;
    } else {
    this.fcurGroupBalance = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTransCode = null;
    } else {
    this.fstrTransCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMTSCode = null;
    } else {
    this.fstrMTSCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmProcessDate = null;
    } else {
    this.fdtmProcessDate = new Timestamp(__dataIn.readLong());
    this.fdtmProcessDate.setNanos(__dataIn.readInt());
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
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.fstrRecordType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecordType);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.fstrLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLine);
    }
    if (null == this.flngChildFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngChildFileKey);
    }
    if (null == this.fstrBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccount);
    }
    if (null == this.fstrPRN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPRN);
    }
    if (null == this.fstrChildFile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChildFile);
    }
    if (null == this.fcurCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCredit, __dataOut);
    }
    if (null == this.fcurDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebit, __dataOut);
    }
    if (null == this.fcurGroupBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGroupBalance, __dataOut);
    }
    if (null == this.fstrTransCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransCode);
    }
    if (null == this.fstrMTSCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMTSCode);
    }
    if (null == this.fdtmProcessDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessDate.getTime());
    __dataOut.writeInt(this.fdtmProcessDate.getNanos());
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
    if (null == this.flngFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFileKey);
    }
    if (null == this.fstrRecordType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecordType);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.fstrLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLine);
    }
    if (null == this.flngChildFileKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngChildFileKey);
    }
    if (null == this.fstrBankAccount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBankAccount);
    }
    if (null == this.fstrPRN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPRN);
    }
    if (null == this.fstrChildFile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrChildFile);
    }
    if (null == this.fcurCredit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCredit, __dataOut);
    }
    if (null == this.fcurDebit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDebit, __dataOut);
    }
    if (null == this.fcurGroupBalance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurGroupBalance, __dataOut);
    }
    if (null == this.fstrTransCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTransCode);
    }
    if (null == this.fstrMTSCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMTSCode);
    }
    if (null == this.fdtmProcessDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmProcessDate.getTime());
    __dataOut.writeInt(this.fdtmProcessDate.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecordType==null?"\\N":fstrRecordType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLine==null?"\\N":fstrLine, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngChildFileKey==null?"\\N":"" + flngChildFileKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccount==null?"\\N":fstrBankAccount, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPRN==null?"\\N":fstrPRN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChildFile==null?"\\N":fstrChildFile, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCredit==null?"\\N":fcurCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebit==null?"\\N":fcurDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGroupBalance==null?"\\N":fcurGroupBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransCode==null?"\\N":fstrTransCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMTSCode==null?"\\N":fstrMTSCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessDate==null?"\\N":"" + fdtmProcessDate, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFileKey==null?"\\N":"" + flngFileKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecordType==null?"\\N":fstrRecordType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLine==null?"\\N":fstrLine, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngChildFileKey==null?"\\N":"" + flngChildFileKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBankAccount==null?"\\N":fstrBankAccount, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPRN==null?"\\N":fstrPRN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrChildFile==null?"\\N":fstrChildFile, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCredit==null?"\\N":fcurCredit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDebit==null?"\\N":fcurDebit.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurGroupBalance==null?"\\N":fcurGroupBalance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTransCode==null?"\\N":fstrTransCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMTSCode==null?"\\N":fstrMTSCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmProcessDate==null?"\\N":"" + fdtmProcessDate, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileKey = null; } else {
      this.flngFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecordType = null; } else {
      this.fstrRecordType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSequence = null; } else {
      this.flngSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLine = null; } else {
      this.fstrLine = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngChildFileKey = null; } else {
      this.flngChildFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccount = null; } else {
      this.fstrBankAccount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPRN = null; } else {
      this.fstrPRN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChildFile = null; } else {
      this.fstrChildFile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCredit = null; } else {
      this.fcurCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebit = null; } else {
      this.fcurDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGroupBalance = null; } else {
      this.fcurGroupBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransCode = null; } else {
      this.fstrTransCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMTSCode = null; } else {
      this.fstrMTSCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessDate = null; } else {
      this.fdtmProcessDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFileKey = null; } else {
      this.flngFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecordType = null; } else {
      this.fstrRecordType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSequence = null; } else {
      this.flngSequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLine = null; } else {
      this.fstrLine = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngChildFileKey = null; } else {
      this.flngChildFileKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBankAccount = null; } else {
      this.fstrBankAccount = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPRN = null; } else {
      this.fstrPRN = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrChildFile = null; } else {
      this.fstrChildFile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCredit = null; } else {
      this.fcurCredit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDebit = null; } else {
      this.fcurDebit = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurGroupBalance = null; } else {
      this.fcurGroupBalance = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTransCode = null; } else {
      this.fstrTransCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMTSCode = null; } else {
      this.fstrMTSCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmProcessDate = null; } else {
      this.fdtmProcessDate = java.sql.Timestamp.valueOf(__cur_str);
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
    tblnz_bankfile o = (tblnz_bankfile) super.clone();
    o.fdtmProcessDate = (o.fdtmProcessDate != null) ? (java.sql.Timestamp) o.fdtmProcessDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_bankfile o) throws CloneNotSupportedException {
    o.fdtmProcessDate = (o.fdtmProcessDate != null) ? (java.sql.Timestamp) o.fdtmProcessDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("fstrRecordType", this.fstrRecordType);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("fstrLine", this.fstrLine);
    __sqoop$field_map.put("flngChildFileKey", this.flngChildFileKey);
    __sqoop$field_map.put("fstrBankAccount", this.fstrBankAccount);
    __sqoop$field_map.put("fstrPRN", this.fstrPRN);
    __sqoop$field_map.put("fstrChildFile", this.fstrChildFile);
    __sqoop$field_map.put("fcurCredit", this.fcurCredit);
    __sqoop$field_map.put("fcurDebit", this.fcurDebit);
    __sqoop$field_map.put("fcurGroupBalance", this.fcurGroupBalance);
    __sqoop$field_map.put("fstrTransCode", this.fstrTransCode);
    __sqoop$field_map.put("fstrMTSCode", this.fstrMTSCode);
    __sqoop$field_map.put("fdtmProcessDate", this.fdtmProcessDate);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngFileKey", this.flngFileKey);
    __sqoop$field_map.put("fstrRecordType", this.fstrRecordType);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("fstrLine", this.fstrLine);
    __sqoop$field_map.put("flngChildFileKey", this.flngChildFileKey);
    __sqoop$field_map.put("fstrBankAccount", this.fstrBankAccount);
    __sqoop$field_map.put("fstrPRN", this.fstrPRN);
    __sqoop$field_map.put("fstrChildFile", this.fstrChildFile);
    __sqoop$field_map.put("fcurCredit", this.fcurCredit);
    __sqoop$field_map.put("fcurDebit", this.fcurDebit);
    __sqoop$field_map.put("fcurGroupBalance", this.fcurGroupBalance);
    __sqoop$field_map.put("fstrTransCode", this.fstrTransCode);
    __sqoop$field_map.put("fstrMTSCode", this.fstrMTSCode);
    __sqoop$field_map.put("fdtmProcessDate", this.fdtmProcessDate);
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
