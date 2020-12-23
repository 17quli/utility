// ORM class for table 'tblnz_accpso'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:11:22 NZDT 2020
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

public class tblnz_accpso extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnIR56", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fblnIR56 = (Integer)value;
      }
    });
    setters.put("fstrIR56Activity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fstrIR56Activity = (String)value;
      }
    });
    setters.put("fstrIR56ActivityOther", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fstrIR56ActivityOther = (String)value;
      }
    });
    setters.put("fstrFilingOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fstrFilingOption = (String)value;
      }
    });
    setters.put("fblnPayDayFiler", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fblnPayDayFiler = (Integer)value;
      }
    });
    setters.put("fstrPayDay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fstrPayDay = (String)value;
      }
    });
    setters.put("fstrPayPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fstrPayPeriod = (String)value;
      }
    });
    setters.put("fdtmPayDayFilerStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fdtmPayDayFilerStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrBatchToFIRST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fstrBatchToFIRST = (String)value;
      }
    });
    setters.put("fblnCSE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fblnCSE = (Integer)value;
      }
    });
    setters.put("fblnSLE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fblnSLE = (Integer)value;
      }
    });
    setters.put("fblnKSE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fblnKSE = (Integer)value;
      }
    });
    setters.put("fblnKSR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fblnKSR = (Integer)value;
      }
    });
    setters.put("fblnSSC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fblnSSC = (Integer)value;
      }
    });
    setters.put("fblnIndividualisedFunding", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fblnIndividualisedFunding = (Integer)value;
      }
    });
    setters.put("fstrEmployerGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fstrEmployerGroup = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_accpso.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_accpso() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_accpso with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnIR56;
  public Integer get_fblnIR56() {
    return fblnIR56;
  }
  public void set_fblnIR56(Integer fblnIR56) {
    this.fblnIR56 = fblnIR56;
  }
  public tblnz_accpso with_fblnIR56(Integer fblnIR56) {
    this.fblnIR56 = fblnIR56;
    return this;
  }
  private String fstrIR56Activity;
  public String get_fstrIR56Activity() {
    return fstrIR56Activity;
  }
  public void set_fstrIR56Activity(String fstrIR56Activity) {
    this.fstrIR56Activity = fstrIR56Activity;
  }
  public tblnz_accpso with_fstrIR56Activity(String fstrIR56Activity) {
    this.fstrIR56Activity = fstrIR56Activity;
    return this;
  }
  private String fstrIR56ActivityOther;
  public String get_fstrIR56ActivityOther() {
    return fstrIR56ActivityOther;
  }
  public void set_fstrIR56ActivityOther(String fstrIR56ActivityOther) {
    this.fstrIR56ActivityOther = fstrIR56ActivityOther;
  }
  public tblnz_accpso with_fstrIR56ActivityOther(String fstrIR56ActivityOther) {
    this.fstrIR56ActivityOther = fstrIR56ActivityOther;
    return this;
  }
  private String fstrFilingOption;
  public String get_fstrFilingOption() {
    return fstrFilingOption;
  }
  public void set_fstrFilingOption(String fstrFilingOption) {
    this.fstrFilingOption = fstrFilingOption;
  }
  public tblnz_accpso with_fstrFilingOption(String fstrFilingOption) {
    this.fstrFilingOption = fstrFilingOption;
    return this;
  }
  private Integer fblnPayDayFiler;
  public Integer get_fblnPayDayFiler() {
    return fblnPayDayFiler;
  }
  public void set_fblnPayDayFiler(Integer fblnPayDayFiler) {
    this.fblnPayDayFiler = fblnPayDayFiler;
  }
  public tblnz_accpso with_fblnPayDayFiler(Integer fblnPayDayFiler) {
    this.fblnPayDayFiler = fblnPayDayFiler;
    return this;
  }
  private String fstrPayDay;
  public String get_fstrPayDay() {
    return fstrPayDay;
  }
  public void set_fstrPayDay(String fstrPayDay) {
    this.fstrPayDay = fstrPayDay;
  }
  public tblnz_accpso with_fstrPayDay(String fstrPayDay) {
    this.fstrPayDay = fstrPayDay;
    return this;
  }
  private String fstrPayPeriod;
  public String get_fstrPayPeriod() {
    return fstrPayPeriod;
  }
  public void set_fstrPayPeriod(String fstrPayPeriod) {
    this.fstrPayPeriod = fstrPayPeriod;
  }
  public tblnz_accpso with_fstrPayPeriod(String fstrPayPeriod) {
    this.fstrPayPeriod = fstrPayPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmPayDayFilerStart;
  public java.sql.Timestamp get_fdtmPayDayFilerStart() {
    return fdtmPayDayFilerStart;
  }
  public void set_fdtmPayDayFilerStart(java.sql.Timestamp fdtmPayDayFilerStart) {
    this.fdtmPayDayFilerStart = fdtmPayDayFilerStart;
  }
  public tblnz_accpso with_fdtmPayDayFilerStart(java.sql.Timestamp fdtmPayDayFilerStart) {
    this.fdtmPayDayFilerStart = fdtmPayDayFilerStart;
    return this;
  }
  private String fstrBatchToFIRST;
  public String get_fstrBatchToFIRST() {
    return fstrBatchToFIRST;
  }
  public void set_fstrBatchToFIRST(String fstrBatchToFIRST) {
    this.fstrBatchToFIRST = fstrBatchToFIRST;
  }
  public tblnz_accpso with_fstrBatchToFIRST(String fstrBatchToFIRST) {
    this.fstrBatchToFIRST = fstrBatchToFIRST;
    return this;
  }
  private Integer fblnCSE;
  public Integer get_fblnCSE() {
    return fblnCSE;
  }
  public void set_fblnCSE(Integer fblnCSE) {
    this.fblnCSE = fblnCSE;
  }
  public tblnz_accpso with_fblnCSE(Integer fblnCSE) {
    this.fblnCSE = fblnCSE;
    return this;
  }
  private Integer fblnSLE;
  public Integer get_fblnSLE() {
    return fblnSLE;
  }
  public void set_fblnSLE(Integer fblnSLE) {
    this.fblnSLE = fblnSLE;
  }
  public tblnz_accpso with_fblnSLE(Integer fblnSLE) {
    this.fblnSLE = fblnSLE;
    return this;
  }
  private Integer fblnKSE;
  public Integer get_fblnKSE() {
    return fblnKSE;
  }
  public void set_fblnKSE(Integer fblnKSE) {
    this.fblnKSE = fblnKSE;
  }
  public tblnz_accpso with_fblnKSE(Integer fblnKSE) {
    this.fblnKSE = fblnKSE;
    return this;
  }
  private Integer fblnKSR;
  public Integer get_fblnKSR() {
    return fblnKSR;
  }
  public void set_fblnKSR(Integer fblnKSR) {
    this.fblnKSR = fblnKSR;
  }
  public tblnz_accpso with_fblnKSR(Integer fblnKSR) {
    this.fblnKSR = fblnKSR;
    return this;
  }
  private Integer fblnSSC;
  public Integer get_fblnSSC() {
    return fblnSSC;
  }
  public void set_fblnSSC(Integer fblnSSC) {
    this.fblnSSC = fblnSSC;
  }
  public tblnz_accpso with_fblnSSC(Integer fblnSSC) {
    this.fblnSSC = fblnSSC;
    return this;
  }
  private Integer fblnIndividualisedFunding;
  public Integer get_fblnIndividualisedFunding() {
    return fblnIndividualisedFunding;
  }
  public void set_fblnIndividualisedFunding(Integer fblnIndividualisedFunding) {
    this.fblnIndividualisedFunding = fblnIndividualisedFunding;
  }
  public tblnz_accpso with_fblnIndividualisedFunding(Integer fblnIndividualisedFunding) {
    this.fblnIndividualisedFunding = fblnIndividualisedFunding;
    return this;
  }
  private String fstrEmployerGroup;
  public String get_fstrEmployerGroup() {
    return fstrEmployerGroup;
  }
  public void set_fstrEmployerGroup(String fstrEmployerGroup) {
    this.fstrEmployerGroup = fstrEmployerGroup;
  }
  public tblnz_accpso with_fstrEmployerGroup(String fstrEmployerGroup) {
    this.fstrEmployerGroup = fstrEmployerGroup;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_accpso with_fstrWho(String fstrWho) {
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
  public tblnz_accpso with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accpso)) {
      return false;
    }
    tblnz_accpso that = (tblnz_accpso) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnIR56 == null ? that.fblnIR56 == null : this.fblnIR56.equals(that.fblnIR56));
    equal = equal && (this.fstrIR56Activity == null ? that.fstrIR56Activity == null : this.fstrIR56Activity.equals(that.fstrIR56Activity));
    equal = equal && (this.fstrIR56ActivityOther == null ? that.fstrIR56ActivityOther == null : this.fstrIR56ActivityOther.equals(that.fstrIR56ActivityOther));
    equal = equal && (this.fstrFilingOption == null ? that.fstrFilingOption == null : this.fstrFilingOption.equals(that.fstrFilingOption));
    equal = equal && (this.fblnPayDayFiler == null ? that.fblnPayDayFiler == null : this.fblnPayDayFiler.equals(that.fblnPayDayFiler));
    equal = equal && (this.fstrPayDay == null ? that.fstrPayDay == null : this.fstrPayDay.equals(that.fstrPayDay));
    equal = equal && (this.fstrPayPeriod == null ? that.fstrPayPeriod == null : this.fstrPayPeriod.equals(that.fstrPayPeriod));
    equal = equal && (this.fdtmPayDayFilerStart == null ? that.fdtmPayDayFilerStart == null : this.fdtmPayDayFilerStart.equals(that.fdtmPayDayFilerStart));
    equal = equal && (this.fstrBatchToFIRST == null ? that.fstrBatchToFIRST == null : this.fstrBatchToFIRST.equals(that.fstrBatchToFIRST));
    equal = equal && (this.fblnCSE == null ? that.fblnCSE == null : this.fblnCSE.equals(that.fblnCSE));
    equal = equal && (this.fblnSLE == null ? that.fblnSLE == null : this.fblnSLE.equals(that.fblnSLE));
    equal = equal && (this.fblnKSE == null ? that.fblnKSE == null : this.fblnKSE.equals(that.fblnKSE));
    equal = equal && (this.fblnKSR == null ? that.fblnKSR == null : this.fblnKSR.equals(that.fblnKSR));
    equal = equal && (this.fblnSSC == null ? that.fblnSSC == null : this.fblnSSC.equals(that.fblnSSC));
    equal = equal && (this.fblnIndividualisedFunding == null ? that.fblnIndividualisedFunding == null : this.fblnIndividualisedFunding.equals(that.fblnIndividualisedFunding));
    equal = equal && (this.fstrEmployerGroup == null ? that.fstrEmployerGroup == null : this.fstrEmployerGroup.equals(that.fstrEmployerGroup));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_accpso)) {
      return false;
    }
    tblnz_accpso that = (tblnz_accpso) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnIR56 == null ? that.fblnIR56 == null : this.fblnIR56.equals(that.fblnIR56));
    equal = equal && (this.fstrIR56Activity == null ? that.fstrIR56Activity == null : this.fstrIR56Activity.equals(that.fstrIR56Activity));
    equal = equal && (this.fstrIR56ActivityOther == null ? that.fstrIR56ActivityOther == null : this.fstrIR56ActivityOther.equals(that.fstrIR56ActivityOther));
    equal = equal && (this.fstrFilingOption == null ? that.fstrFilingOption == null : this.fstrFilingOption.equals(that.fstrFilingOption));
    equal = equal && (this.fblnPayDayFiler == null ? that.fblnPayDayFiler == null : this.fblnPayDayFiler.equals(that.fblnPayDayFiler));
    equal = equal && (this.fstrPayDay == null ? that.fstrPayDay == null : this.fstrPayDay.equals(that.fstrPayDay));
    equal = equal && (this.fstrPayPeriod == null ? that.fstrPayPeriod == null : this.fstrPayPeriod.equals(that.fstrPayPeriod));
    equal = equal && (this.fdtmPayDayFilerStart == null ? that.fdtmPayDayFilerStart == null : this.fdtmPayDayFilerStart.equals(that.fdtmPayDayFilerStart));
    equal = equal && (this.fstrBatchToFIRST == null ? that.fstrBatchToFIRST == null : this.fstrBatchToFIRST.equals(that.fstrBatchToFIRST));
    equal = equal && (this.fblnCSE == null ? that.fblnCSE == null : this.fblnCSE.equals(that.fblnCSE));
    equal = equal && (this.fblnSLE == null ? that.fblnSLE == null : this.fblnSLE.equals(that.fblnSLE));
    equal = equal && (this.fblnKSE == null ? that.fblnKSE == null : this.fblnKSE.equals(that.fblnKSE));
    equal = equal && (this.fblnKSR == null ? that.fblnKSR == null : this.fblnKSR.equals(that.fblnKSR));
    equal = equal && (this.fblnSSC == null ? that.fblnSSC == null : this.fblnSSC.equals(that.fblnSSC));
    equal = equal && (this.fblnIndividualisedFunding == null ? that.fblnIndividualisedFunding == null : this.fblnIndividualisedFunding.equals(that.fblnIndividualisedFunding));
    equal = equal && (this.fstrEmployerGroup == null ? that.fstrEmployerGroup == null : this.fstrEmployerGroup.equals(that.fstrEmployerGroup));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnIR56 = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrIR56Activity = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrIR56ActivityOther = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrFilingOption = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnPayDayFiler = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrPayDay = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPayPeriod = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmPayDayFilerStart = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrBatchToFIRST = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnCSE = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnSLE = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnKSE = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnKSR = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnSSC = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnIndividualisedFunding = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrEmployerGroup = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnIR56 = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrIR56Activity = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrIR56ActivityOther = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrFilingOption = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnPayDayFiler = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrPayDay = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPayPeriod = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmPayDayFilerStart = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fstrBatchToFIRST = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnCSE = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnSLE = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnKSE = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnKSR = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnSSC = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnIndividualisedFunding = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrEmployerGroup = JdbcWritableBridge.readString(17, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIR56, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrIR56Activity, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIR56ActivityOther, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingOption, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayDayFiler, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayDay, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayPeriod, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayFilerStart, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBatchToFIRST, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCSE, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSLE, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnKSE, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnKSR, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSSC, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIndividualisedFunding, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerGroup, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIR56, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrIR56Activity, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIR56ActivityOther, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingOption, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayDayFiler, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayDay, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayPeriod, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPayDayFilerStart, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrBatchToFIRST, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCSE, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSLE, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnKSE, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnKSR, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSSC, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIndividualisedFunding, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmployerGroup, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
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
        this.fblnIR56 = null;
    } else {
    this.fblnIR56 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIR56Activity = null;
    } else {
    this.fstrIR56Activity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIR56ActivityOther = null;
    } else {
    this.fstrIR56ActivityOther = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingOption = null;
    } else {
    this.fstrFilingOption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPayDayFiler = null;
    } else {
    this.fblnPayDayFiler = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayDay = null;
    } else {
    this.fstrPayDay = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayPeriod = null;
    } else {
    this.fstrPayPeriod = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPayDayFilerStart = null;
    } else {
    this.fdtmPayDayFilerStart = new Timestamp(__dataIn.readLong());
    this.fdtmPayDayFilerStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBatchToFIRST = null;
    } else {
    this.fstrBatchToFIRST = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCSE = null;
    } else {
    this.fblnCSE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSLE = null;
    } else {
    this.fblnSLE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnKSE = null;
    } else {
    this.fblnKSE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnKSR = null;
    } else {
    this.fblnKSR = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSSC = null;
    } else {
    this.fblnSSC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIndividualisedFunding = null;
    } else {
    this.fblnIndividualisedFunding = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmployerGroup = null;
    } else {
    this.fstrEmployerGroup = Text.readString(__dataIn);
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
    if (null == this.fblnIR56) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIR56);
    }
    if (null == this.fstrIR56Activity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIR56Activity);
    }
    if (null == this.fstrIR56ActivityOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIR56ActivityOther);
    }
    if (null == this.fstrFilingOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingOption);
    }
    if (null == this.fblnPayDayFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayDayFiler);
    }
    if (null == this.fstrPayDay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayDay);
    }
    if (null == this.fstrPayPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayPeriod);
    }
    if (null == this.fdtmPayDayFilerStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayFilerStart.getTime());
    __dataOut.writeInt(this.fdtmPayDayFilerStart.getNanos());
    }
    if (null == this.fstrBatchToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBatchToFIRST);
    }
    if (null == this.fblnCSE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCSE);
    }
    if (null == this.fblnSLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSLE);
    }
    if (null == this.fblnKSE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnKSE);
    }
    if (null == this.fblnKSR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnKSR);
    }
    if (null == this.fblnSSC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSSC);
    }
    if (null == this.fblnIndividualisedFunding) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIndividualisedFunding);
    }
    if (null == this.fstrEmployerGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerGroup);
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
    if (null == this.fblnIR56) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIR56);
    }
    if (null == this.fstrIR56Activity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIR56Activity);
    }
    if (null == this.fstrIR56ActivityOther) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIR56ActivityOther);
    }
    if (null == this.fstrFilingOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingOption);
    }
    if (null == this.fblnPayDayFiler) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayDayFiler);
    }
    if (null == this.fstrPayDay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayDay);
    }
    if (null == this.fstrPayPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayPeriod);
    }
    if (null == this.fdtmPayDayFilerStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPayDayFilerStart.getTime());
    __dataOut.writeInt(this.fdtmPayDayFilerStart.getNanos());
    }
    if (null == this.fstrBatchToFIRST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBatchToFIRST);
    }
    if (null == this.fblnCSE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCSE);
    }
    if (null == this.fblnSLE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSLE);
    }
    if (null == this.fblnKSE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnKSE);
    }
    if (null == this.fblnKSR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnKSR);
    }
    if (null == this.fblnSSC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSSC);
    }
    if (null == this.fblnIndividualisedFunding) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIndividualisedFunding);
    }
    if (null == this.fstrEmployerGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmployerGroup);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIR56==null?"\\N":"" + fblnIR56, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIR56Activity==null?"\\N":fstrIR56Activity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIR56ActivityOther==null?"\\N":fstrIR56ActivityOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingOption==null?"\\N":fstrFilingOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayDayFiler==null?"\\N":"" + fblnPayDayFiler, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayDay==null?"\\N":fstrPayDay, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayPeriod==null?"\\N":fstrPayPeriod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayFilerStart==null?"\\N":"" + fdtmPayDayFilerStart, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBatchToFIRST==null?"\\N":fstrBatchToFIRST, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCSE==null?"\\N":"" + fblnCSE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSLE==null?"\\N":"" + fblnSLE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnKSE==null?"\\N":"" + fblnKSE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnKSR==null?"\\N":"" + fblnKSR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSSC==null?"\\N":"" + fblnSSC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIndividualisedFunding==null?"\\N":"" + fblnIndividualisedFunding, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerGroup==null?"\\N":fstrEmployerGroup, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIR56==null?"\\N":"" + fblnIR56, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIR56Activity==null?"\\N":fstrIR56Activity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIR56ActivityOther==null?"\\N":fstrIR56ActivityOther, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingOption==null?"\\N":fstrFilingOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayDayFiler==null?"\\N":"" + fblnPayDayFiler, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayDay==null?"\\N":fstrPayDay, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayPeriod==null?"\\N":fstrPayPeriod, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPayDayFilerStart==null?"\\N":"" + fdtmPayDayFilerStart, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBatchToFIRST==null?"\\N":fstrBatchToFIRST, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCSE==null?"\\N":"" + fblnCSE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSLE==null?"\\N":"" + fblnSLE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnKSE==null?"\\N":"" + fblnKSE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnKSR==null?"\\N":"" + fblnKSR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSSC==null?"\\N":"" + fblnSSC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIndividualisedFunding==null?"\\N":"" + fblnIndividualisedFunding, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmployerGroup==null?"\\N":fstrEmployerGroup, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIR56 = null; } else {
      this.fblnIR56 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIR56Activity = null; } else {
      this.fstrIR56Activity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIR56ActivityOther = null; } else {
      this.fstrIR56ActivityOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingOption = null; } else {
      this.fstrFilingOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayDayFiler = null; } else {
      this.fblnPayDayFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayDay = null; } else {
      this.fstrPayDay = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayPeriod = null; } else {
      this.fstrPayPeriod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayFilerStart = null; } else {
      this.fdtmPayDayFilerStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBatchToFIRST = null; } else {
      this.fstrBatchToFIRST = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCSE = null; } else {
      this.fblnCSE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSLE = null; } else {
      this.fblnSLE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnKSE = null; } else {
      this.fblnKSE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnKSR = null; } else {
      this.fblnKSR = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSSC = null; } else {
      this.fblnSSC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIndividualisedFunding = null; } else {
      this.fblnIndividualisedFunding = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerGroup = null; } else {
      this.fstrEmployerGroup = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIR56 = null; } else {
      this.fblnIR56 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIR56Activity = null; } else {
      this.fstrIR56Activity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIR56ActivityOther = null; } else {
      this.fstrIR56ActivityOther = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingOption = null; } else {
      this.fstrFilingOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayDayFiler = null; } else {
      this.fblnPayDayFiler = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayDay = null; } else {
      this.fstrPayDay = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayPeriod = null; } else {
      this.fstrPayPeriod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPayDayFilerStart = null; } else {
      this.fdtmPayDayFilerStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBatchToFIRST = null; } else {
      this.fstrBatchToFIRST = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCSE = null; } else {
      this.fblnCSE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSLE = null; } else {
      this.fblnSLE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnKSE = null; } else {
      this.fblnKSE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnKSR = null; } else {
      this.fblnKSR = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSSC = null; } else {
      this.fblnSSC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIndividualisedFunding = null; } else {
      this.fblnIndividualisedFunding = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmployerGroup = null; } else {
      this.fstrEmployerGroup = __cur_str;
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
    tblnz_accpso o = (tblnz_accpso) super.clone();
    o.fdtmPayDayFilerStart = (o.fdtmPayDayFilerStart != null) ? (java.sql.Timestamp) o.fdtmPayDayFilerStart.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_accpso o) throws CloneNotSupportedException {
    o.fdtmPayDayFilerStart = (o.fdtmPayDayFilerStart != null) ? (java.sql.Timestamp) o.fdtmPayDayFilerStart.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnIR56", this.fblnIR56);
    __sqoop$field_map.put("fstrIR56Activity", this.fstrIR56Activity);
    __sqoop$field_map.put("fstrIR56ActivityOther", this.fstrIR56ActivityOther);
    __sqoop$field_map.put("fstrFilingOption", this.fstrFilingOption);
    __sqoop$field_map.put("fblnPayDayFiler", this.fblnPayDayFiler);
    __sqoop$field_map.put("fstrPayDay", this.fstrPayDay);
    __sqoop$field_map.put("fstrPayPeriod", this.fstrPayPeriod);
    __sqoop$field_map.put("fdtmPayDayFilerStart", this.fdtmPayDayFilerStart);
    __sqoop$field_map.put("fstrBatchToFIRST", this.fstrBatchToFIRST);
    __sqoop$field_map.put("fblnCSE", this.fblnCSE);
    __sqoop$field_map.put("fblnSLE", this.fblnSLE);
    __sqoop$field_map.put("fblnKSE", this.fblnKSE);
    __sqoop$field_map.put("fblnKSR", this.fblnKSR);
    __sqoop$field_map.put("fblnSSC", this.fblnSSC);
    __sqoop$field_map.put("fblnIndividualisedFunding", this.fblnIndividualisedFunding);
    __sqoop$field_map.put("fstrEmployerGroup", this.fstrEmployerGroup);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnIR56", this.fblnIR56);
    __sqoop$field_map.put("fstrIR56Activity", this.fstrIR56Activity);
    __sqoop$field_map.put("fstrIR56ActivityOther", this.fstrIR56ActivityOther);
    __sqoop$field_map.put("fstrFilingOption", this.fstrFilingOption);
    __sqoop$field_map.put("fblnPayDayFiler", this.fblnPayDayFiler);
    __sqoop$field_map.put("fstrPayDay", this.fstrPayDay);
    __sqoop$field_map.put("fstrPayPeriod", this.fstrPayPeriod);
    __sqoop$field_map.put("fdtmPayDayFilerStart", this.fdtmPayDayFilerStart);
    __sqoop$field_map.put("fstrBatchToFIRST", this.fstrBatchToFIRST);
    __sqoop$field_map.put("fblnCSE", this.fblnCSE);
    __sqoop$field_map.put("fblnSLE", this.fblnSLE);
    __sqoop$field_map.put("fblnKSE", this.fblnKSE);
    __sqoop$field_map.put("fblnKSR", this.fblnKSR);
    __sqoop$field_map.put("fblnSSC", this.fblnSSC);
    __sqoop$field_map.put("fblnIndividualisedFunding", this.fblnIndividualisedFunding);
    __sqoop$field_map.put("fstrEmployerGroup", this.fstrEmployerGroup);
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
