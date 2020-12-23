// ORM class for table 'rfrnz_filing'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:55:31 NZDT 2020
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

public class rfrnz_filing extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrFiling", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fstrFiling = (String)value;
      }
    });
    setters.put("fblnPoliced", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fblnPoliced = (Integer)value;
      }
    });
    setters.put("fstrRegularFrequency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fstrRegularFrequency = (String)value;
      }
    });
    setters.put("fintRecurringBillingPeriods", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fintRecurringBillingPeriods = (Integer)value;
      }
    });
    setters.put("fblnFIRSTActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fblnFIRSTActive = (Integer)value;
      }
    });
    setters.put("fstrHeritageCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fstrHeritageCode = (String)value;
      }
    });
    setters.put("fblnIrregular", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fblnIrregular = (Integer)value;
      }
    });
    setters.put("fblnPayDay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fblnPayDay = (Integer)value;
      }
    });
    setters.put("fblnElectronic", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fblnElectronic = (Integer)value;
      }
    });
    setters.put("fstrDocSetDoc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fstrDocSetDoc = (String)value;
      }
    });
    setters.put("fblnIncomeOnly", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fblnIncomeOnly = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_filing.this.fblnActive = (Integer)value;
      }
    });
  }
  public rfrnz_filing() {
    init0();
  }
  private String fstrFiling;
  public String get_fstrFiling() {
    return fstrFiling;
  }
  public void set_fstrFiling(String fstrFiling) {
    this.fstrFiling = fstrFiling;
  }
  public rfrnz_filing with_fstrFiling(String fstrFiling) {
    this.fstrFiling = fstrFiling;
    return this;
  }
  private Integer fblnPoliced;
  public Integer get_fblnPoliced() {
    return fblnPoliced;
  }
  public void set_fblnPoliced(Integer fblnPoliced) {
    this.fblnPoliced = fblnPoliced;
  }
  public rfrnz_filing with_fblnPoliced(Integer fblnPoliced) {
    this.fblnPoliced = fblnPoliced;
    return this;
  }
  private String fstrRegularFrequency;
  public String get_fstrRegularFrequency() {
    return fstrRegularFrequency;
  }
  public void set_fstrRegularFrequency(String fstrRegularFrequency) {
    this.fstrRegularFrequency = fstrRegularFrequency;
  }
  public rfrnz_filing with_fstrRegularFrequency(String fstrRegularFrequency) {
    this.fstrRegularFrequency = fstrRegularFrequency;
    return this;
  }
  private Integer fintRecurringBillingPeriods;
  public Integer get_fintRecurringBillingPeriods() {
    return fintRecurringBillingPeriods;
  }
  public void set_fintRecurringBillingPeriods(Integer fintRecurringBillingPeriods) {
    this.fintRecurringBillingPeriods = fintRecurringBillingPeriods;
  }
  public rfrnz_filing with_fintRecurringBillingPeriods(Integer fintRecurringBillingPeriods) {
    this.fintRecurringBillingPeriods = fintRecurringBillingPeriods;
    return this;
  }
  private Integer fblnFIRSTActive;
  public Integer get_fblnFIRSTActive() {
    return fblnFIRSTActive;
  }
  public void set_fblnFIRSTActive(Integer fblnFIRSTActive) {
    this.fblnFIRSTActive = fblnFIRSTActive;
  }
  public rfrnz_filing with_fblnFIRSTActive(Integer fblnFIRSTActive) {
    this.fblnFIRSTActive = fblnFIRSTActive;
    return this;
  }
  private String fstrHeritageCode;
  public String get_fstrHeritageCode() {
    return fstrHeritageCode;
  }
  public void set_fstrHeritageCode(String fstrHeritageCode) {
    this.fstrHeritageCode = fstrHeritageCode;
  }
  public rfrnz_filing with_fstrHeritageCode(String fstrHeritageCode) {
    this.fstrHeritageCode = fstrHeritageCode;
    return this;
  }
  private Integer fblnIrregular;
  public Integer get_fblnIrregular() {
    return fblnIrregular;
  }
  public void set_fblnIrregular(Integer fblnIrregular) {
    this.fblnIrregular = fblnIrregular;
  }
  public rfrnz_filing with_fblnIrregular(Integer fblnIrregular) {
    this.fblnIrregular = fblnIrregular;
    return this;
  }
  private Integer fblnPayDay;
  public Integer get_fblnPayDay() {
    return fblnPayDay;
  }
  public void set_fblnPayDay(Integer fblnPayDay) {
    this.fblnPayDay = fblnPayDay;
  }
  public rfrnz_filing with_fblnPayDay(Integer fblnPayDay) {
    this.fblnPayDay = fblnPayDay;
    return this;
  }
  private Integer fblnElectronic;
  public Integer get_fblnElectronic() {
    return fblnElectronic;
  }
  public void set_fblnElectronic(Integer fblnElectronic) {
    this.fblnElectronic = fblnElectronic;
  }
  public rfrnz_filing with_fblnElectronic(Integer fblnElectronic) {
    this.fblnElectronic = fblnElectronic;
    return this;
  }
  private String fstrDocSetDoc;
  public String get_fstrDocSetDoc() {
    return fstrDocSetDoc;
  }
  public void set_fstrDocSetDoc(String fstrDocSetDoc) {
    this.fstrDocSetDoc = fstrDocSetDoc;
  }
  public rfrnz_filing with_fstrDocSetDoc(String fstrDocSetDoc) {
    this.fstrDocSetDoc = fstrDocSetDoc;
    return this;
  }
  private Integer fblnIncomeOnly;
  public Integer get_fblnIncomeOnly() {
    return fblnIncomeOnly;
  }
  public void set_fblnIncomeOnly(Integer fblnIncomeOnly) {
    this.fblnIncomeOnly = fblnIncomeOnly;
  }
  public rfrnz_filing with_fblnIncomeOnly(Integer fblnIncomeOnly) {
    this.fblnIncomeOnly = fblnIncomeOnly;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public rfrnz_filing with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrnz_filing)) {
      return false;
    }
    rfrnz_filing that = (rfrnz_filing) o;
    boolean equal = true;
    equal = equal && (this.fstrFiling == null ? that.fstrFiling == null : this.fstrFiling.equals(that.fstrFiling));
    equal = equal && (this.fblnPoliced == null ? that.fblnPoliced == null : this.fblnPoliced.equals(that.fblnPoliced));
    equal = equal && (this.fstrRegularFrequency == null ? that.fstrRegularFrequency == null : this.fstrRegularFrequency.equals(that.fstrRegularFrequency));
    equal = equal && (this.fintRecurringBillingPeriods == null ? that.fintRecurringBillingPeriods == null : this.fintRecurringBillingPeriods.equals(that.fintRecurringBillingPeriods));
    equal = equal && (this.fblnFIRSTActive == null ? that.fblnFIRSTActive == null : this.fblnFIRSTActive.equals(that.fblnFIRSTActive));
    equal = equal && (this.fstrHeritageCode == null ? that.fstrHeritageCode == null : this.fstrHeritageCode.equals(that.fstrHeritageCode));
    equal = equal && (this.fblnIrregular == null ? that.fblnIrregular == null : this.fblnIrregular.equals(that.fblnIrregular));
    equal = equal && (this.fblnPayDay == null ? that.fblnPayDay == null : this.fblnPayDay.equals(that.fblnPayDay));
    equal = equal && (this.fblnElectronic == null ? that.fblnElectronic == null : this.fblnElectronic.equals(that.fblnElectronic));
    equal = equal && (this.fstrDocSetDoc == null ? that.fstrDocSetDoc == null : this.fstrDocSetDoc.equals(that.fstrDocSetDoc));
    equal = equal && (this.fblnIncomeOnly == null ? that.fblnIncomeOnly == null : this.fblnIncomeOnly.equals(that.fblnIncomeOnly));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrnz_filing)) {
      return false;
    }
    rfrnz_filing that = (rfrnz_filing) o;
    boolean equal = true;
    equal = equal && (this.fstrFiling == null ? that.fstrFiling == null : this.fstrFiling.equals(that.fstrFiling));
    equal = equal && (this.fblnPoliced == null ? that.fblnPoliced == null : this.fblnPoliced.equals(that.fblnPoliced));
    equal = equal && (this.fstrRegularFrequency == null ? that.fstrRegularFrequency == null : this.fstrRegularFrequency.equals(that.fstrRegularFrequency));
    equal = equal && (this.fintRecurringBillingPeriods == null ? that.fintRecurringBillingPeriods == null : this.fintRecurringBillingPeriods.equals(that.fintRecurringBillingPeriods));
    equal = equal && (this.fblnFIRSTActive == null ? that.fblnFIRSTActive == null : this.fblnFIRSTActive.equals(that.fblnFIRSTActive));
    equal = equal && (this.fstrHeritageCode == null ? that.fstrHeritageCode == null : this.fstrHeritageCode.equals(that.fstrHeritageCode));
    equal = equal && (this.fblnIrregular == null ? that.fblnIrregular == null : this.fblnIrregular.equals(that.fblnIrregular));
    equal = equal && (this.fblnPayDay == null ? that.fblnPayDay == null : this.fblnPayDay.equals(that.fblnPayDay));
    equal = equal && (this.fblnElectronic == null ? that.fblnElectronic == null : this.fblnElectronic.equals(that.fblnElectronic));
    equal = equal && (this.fstrDocSetDoc == null ? that.fstrDocSetDoc == null : this.fstrDocSetDoc.equals(that.fstrDocSetDoc));
    equal = equal && (this.fblnIncomeOnly == null ? that.fblnIncomeOnly == null : this.fblnIncomeOnly.equals(that.fblnIncomeOnly));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrFiling = JdbcWritableBridge.readString(1, __dbResults);
    this.fblnPoliced = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrRegularFrequency = JdbcWritableBridge.readString(3, __dbResults);
    this.fintRecurringBillingPeriods = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnFIRSTActive = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrHeritageCode = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnIrregular = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnPayDay = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnElectronic = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrDocSetDoc = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnIncomeOnly = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrFiling = JdbcWritableBridge.readString(1, __dbResults);
    this.fblnPoliced = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fstrRegularFrequency = JdbcWritableBridge.readString(3, __dbResults);
    this.fintRecurringBillingPeriods = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnFIRSTActive = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrHeritageCode = JdbcWritableBridge.readString(6, __dbResults);
    this.fblnIrregular = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnPayDay = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnElectronic = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrDocSetDoc = JdbcWritableBridge.readString(10, __dbResults);
    this.fblnIncomeOnly = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(12, __dbResults);
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
    JdbcWritableBridge.writeString(fstrFiling, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPoliced, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegularFrequency, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRecurringBillingPeriods, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTActive, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrHeritageCode, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIrregular, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayDay, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronic, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocSetDoc, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIncomeOnly, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 12 + __off, -6, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrFiling, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPoliced, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegularFrequency, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRecurringBillingPeriods, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnFIRSTActive, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrHeritageCode, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIrregular, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPayDay, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronic, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocSetDoc, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIncomeOnly, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 12 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrFiling = null;
    } else {
    this.fstrFiling = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPoliced = null;
    } else {
    this.fblnPoliced = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRegularFrequency = null;
    } else {
    this.fstrRegularFrequency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintRecurringBillingPeriods = null;
    } else {
    this.fintRecurringBillingPeriods = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnFIRSTActive = null;
    } else {
    this.fblnFIRSTActive = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrHeritageCode = null;
    } else {
    this.fstrHeritageCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIrregular = null;
    } else {
    this.fblnIrregular = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPayDay = null;
    } else {
    this.fblnPayDay = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnElectronic = null;
    } else {
    this.fblnElectronic = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocSetDoc = null;
    } else {
    this.fstrDocSetDoc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIncomeOnly = null;
    } else {
    this.fblnIncomeOnly = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrFiling) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFiling);
    }
    if (null == this.fblnPoliced) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPoliced);
    }
    if (null == this.fstrRegularFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegularFrequency);
    }
    if (null == this.fintRecurringBillingPeriods) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRecurringBillingPeriods);
    }
    if (null == this.fblnFIRSTActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFIRSTActive);
    }
    if (null == this.fstrHeritageCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHeritageCode);
    }
    if (null == this.fblnIrregular) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIrregular);
    }
    if (null == this.fblnPayDay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayDay);
    }
    if (null == this.fblnElectronic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnElectronic);
    }
    if (null == this.fstrDocSetDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocSetDoc);
    }
    if (null == this.fblnIncomeOnly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIncomeOnly);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrFiling) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFiling);
    }
    if (null == this.fblnPoliced) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPoliced);
    }
    if (null == this.fstrRegularFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegularFrequency);
    }
    if (null == this.fintRecurringBillingPeriods) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRecurringBillingPeriods);
    }
    if (null == this.fblnFIRSTActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnFIRSTActive);
    }
    if (null == this.fstrHeritageCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrHeritageCode);
    }
    if (null == this.fblnIrregular) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIrregular);
    }
    if (null == this.fblnPayDay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPayDay);
    }
    if (null == this.fblnElectronic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnElectronic);
    }
    if (null == this.fstrDocSetDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocSetDoc);
    }
    if (null == this.fblnIncomeOnly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIncomeOnly);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFiling==null?"\\N":fstrFiling, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPoliced==null?"\\N":"" + fblnPoliced, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegularFrequency==null?"\\N":fstrRegularFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRecurringBillingPeriods==null?"\\N":"" + fintRecurringBillingPeriods, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFIRSTActive==null?"\\N":"" + fblnFIRSTActive, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHeritageCode==null?"\\N":fstrHeritageCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIrregular==null?"\\N":"" + fblnIrregular, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayDay==null?"\\N":"" + fblnPayDay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnElectronic==null?"\\N":"" + fblnElectronic, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocSetDoc==null?"\\N":fstrDocSetDoc, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIncomeOnly==null?"\\N":"" + fblnIncomeOnly, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFiling==null?"\\N":fstrFiling, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPoliced==null?"\\N":"" + fblnPoliced, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegularFrequency==null?"\\N":fstrRegularFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRecurringBillingPeriods==null?"\\N":"" + fintRecurringBillingPeriods, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnFIRSTActive==null?"\\N":"" + fblnFIRSTActive, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrHeritageCode==null?"\\N":fstrHeritageCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIrregular==null?"\\N":"" + fblnIrregular, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPayDay==null?"\\N":"" + fblnPayDay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnElectronic==null?"\\N":"" + fblnElectronic, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocSetDoc==null?"\\N":fstrDocSetDoc, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIncomeOnly==null?"\\N":"" + fblnIncomeOnly, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrFiling = null; } else {
      this.fstrFiling = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPoliced = null; } else {
      this.fblnPoliced = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRegularFrequency = null; } else {
      this.fstrRegularFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRecurringBillingPeriods = null; } else {
      this.fintRecurringBillingPeriods = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFIRSTActive = null; } else {
      this.fblnFIRSTActive = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHeritageCode = null; } else {
      this.fstrHeritageCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIrregular = null; } else {
      this.fblnIrregular = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayDay = null; } else {
      this.fblnPayDay = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnElectronic = null; } else {
      this.fblnElectronic = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocSetDoc = null; } else {
      this.fstrDocSetDoc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIncomeOnly = null; } else {
      this.fblnIncomeOnly = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrFiling = null; } else {
      this.fstrFiling = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPoliced = null; } else {
      this.fblnPoliced = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRegularFrequency = null; } else {
      this.fstrRegularFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRecurringBillingPeriods = null; } else {
      this.fintRecurringBillingPeriods = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnFIRSTActive = null; } else {
      this.fblnFIRSTActive = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrHeritageCode = null; } else {
      this.fstrHeritageCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIrregular = null; } else {
      this.fblnIrregular = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPayDay = null; } else {
      this.fblnPayDay = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnElectronic = null; } else {
      this.fblnElectronic = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocSetDoc = null; } else {
      this.fstrDocSetDoc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIncomeOnly = null; } else {
      this.fblnIncomeOnly = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    rfrnz_filing o = (rfrnz_filing) super.clone();
    return o;
  }

  public void clone0(rfrnz_filing o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrFiling", this.fstrFiling);
    __sqoop$field_map.put("fblnPoliced", this.fblnPoliced);
    __sqoop$field_map.put("fstrRegularFrequency", this.fstrRegularFrequency);
    __sqoop$field_map.put("fintRecurringBillingPeriods", this.fintRecurringBillingPeriods);
    __sqoop$field_map.put("fblnFIRSTActive", this.fblnFIRSTActive);
    __sqoop$field_map.put("fstrHeritageCode", this.fstrHeritageCode);
    __sqoop$field_map.put("fblnIrregular", this.fblnIrregular);
    __sqoop$field_map.put("fblnPayDay", this.fblnPayDay);
    __sqoop$field_map.put("fblnElectronic", this.fblnElectronic);
    __sqoop$field_map.put("fstrDocSetDoc", this.fstrDocSetDoc);
    __sqoop$field_map.put("fblnIncomeOnly", this.fblnIncomeOnly);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrFiling", this.fstrFiling);
    __sqoop$field_map.put("fblnPoliced", this.fblnPoliced);
    __sqoop$field_map.put("fstrRegularFrequency", this.fstrRegularFrequency);
    __sqoop$field_map.put("fintRecurringBillingPeriods", this.fintRecurringBillingPeriods);
    __sqoop$field_map.put("fblnFIRSTActive", this.fblnFIRSTActive);
    __sqoop$field_map.put("fstrHeritageCode", this.fstrHeritageCode);
    __sqoop$field_map.put("fblnIrregular", this.fblnIrregular);
    __sqoop$field_map.put("fblnPayDay", this.fblnPayDay);
    __sqoop$field_map.put("fblnElectronic", this.fblnElectronic);
    __sqoop$field_map.put("fstrDocSetDoc", this.fstrDocSetDoc);
    __sqoop$field_map.put("fblnIncomeOnly", this.fblnIncomeOnly);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
