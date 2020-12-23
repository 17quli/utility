// ORM class for table 'rfraddresstype'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:54:08 NZDT 2020
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

public class rfraddresstype extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("FSTRADDRESSTYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.FSTRADDRESSTYPE = (String)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fstrSource = (String)value;
      }
    });
    setters.put("FSTRDISTRICTOFFICERULE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.FSTRDISTRICTOFFICERULE = (String)value;
      }
    });
    setters.put("fblnCanCai", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fblnCanCai = (Integer)value;
      }
    });
    setters.put("fblnLocationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fblnLocationCode = (Integer)value;
      }
    });
    setters.put("fstrLocationCodeMask", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fstrLocationCodeMask = (String)value;
      }
    });
    setters.put("fstrFormatString", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fstrFormatString = (String)value;
      }
    });
    setters.put("fintAllowBlank", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fintAllowBlank = (Integer)value;
      }
    });
    setters.put("fblnSearchIndex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fblnSearchIndex = (Integer)value;
      }
    });
    setters.put("fblnCanInactivate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fblnCanInactivate = (Integer)value;
      }
    });
    setters.put("fblnCommenceInFuture", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fblnCommenceInFuture = (Integer)value;
      }
    });
    setters.put("fblnCeaseInFuture", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.fblnCeaseInFuture = (Integer)value;
      }
    });
    setters.put("FBLNACTIVE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfraddresstype.this.FBLNACTIVE = (Integer)value;
      }
    });
  }
  public rfraddresstype() {
    init0();
  }
  private String FSTRADDRESSTYPE;
  public String get_FSTRADDRESSTYPE() {
    return FSTRADDRESSTYPE;
  }
  public void set_FSTRADDRESSTYPE(String FSTRADDRESSTYPE) {
    this.FSTRADDRESSTYPE = FSTRADDRESSTYPE;
  }
  public rfraddresstype with_FSTRADDRESSTYPE(String FSTRADDRESSTYPE) {
    this.FSTRADDRESSTYPE = FSTRADDRESSTYPE;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public rfraddresstype with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private String FSTRDISTRICTOFFICERULE;
  public String get_FSTRDISTRICTOFFICERULE() {
    return FSTRDISTRICTOFFICERULE;
  }
  public void set_FSTRDISTRICTOFFICERULE(String FSTRDISTRICTOFFICERULE) {
    this.FSTRDISTRICTOFFICERULE = FSTRDISTRICTOFFICERULE;
  }
  public rfraddresstype with_FSTRDISTRICTOFFICERULE(String FSTRDISTRICTOFFICERULE) {
    this.FSTRDISTRICTOFFICERULE = FSTRDISTRICTOFFICERULE;
    return this;
  }
  private Integer fblnCanCai;
  public Integer get_fblnCanCai() {
    return fblnCanCai;
  }
  public void set_fblnCanCai(Integer fblnCanCai) {
    this.fblnCanCai = fblnCanCai;
  }
  public rfraddresstype with_fblnCanCai(Integer fblnCanCai) {
    this.fblnCanCai = fblnCanCai;
    return this;
  }
  private Integer fblnLocationCode;
  public Integer get_fblnLocationCode() {
    return fblnLocationCode;
  }
  public void set_fblnLocationCode(Integer fblnLocationCode) {
    this.fblnLocationCode = fblnLocationCode;
  }
  public rfraddresstype with_fblnLocationCode(Integer fblnLocationCode) {
    this.fblnLocationCode = fblnLocationCode;
    return this;
  }
  private String fstrLocationCodeMask;
  public String get_fstrLocationCodeMask() {
    return fstrLocationCodeMask;
  }
  public void set_fstrLocationCodeMask(String fstrLocationCodeMask) {
    this.fstrLocationCodeMask = fstrLocationCodeMask;
  }
  public rfraddresstype with_fstrLocationCodeMask(String fstrLocationCodeMask) {
    this.fstrLocationCodeMask = fstrLocationCodeMask;
    return this;
  }
  private String fstrFormatString;
  public String get_fstrFormatString() {
    return fstrFormatString;
  }
  public void set_fstrFormatString(String fstrFormatString) {
    this.fstrFormatString = fstrFormatString;
  }
  public rfraddresstype with_fstrFormatString(String fstrFormatString) {
    this.fstrFormatString = fstrFormatString;
    return this;
  }
  private Integer fintAllowBlank;
  public Integer get_fintAllowBlank() {
    return fintAllowBlank;
  }
  public void set_fintAllowBlank(Integer fintAllowBlank) {
    this.fintAllowBlank = fintAllowBlank;
  }
  public rfraddresstype with_fintAllowBlank(Integer fintAllowBlank) {
    this.fintAllowBlank = fintAllowBlank;
    return this;
  }
  private Integer fblnSearchIndex;
  public Integer get_fblnSearchIndex() {
    return fblnSearchIndex;
  }
  public void set_fblnSearchIndex(Integer fblnSearchIndex) {
    this.fblnSearchIndex = fblnSearchIndex;
  }
  public rfraddresstype with_fblnSearchIndex(Integer fblnSearchIndex) {
    this.fblnSearchIndex = fblnSearchIndex;
    return this;
  }
  private Integer fblnCanInactivate;
  public Integer get_fblnCanInactivate() {
    return fblnCanInactivate;
  }
  public void set_fblnCanInactivate(Integer fblnCanInactivate) {
    this.fblnCanInactivate = fblnCanInactivate;
  }
  public rfraddresstype with_fblnCanInactivate(Integer fblnCanInactivate) {
    this.fblnCanInactivate = fblnCanInactivate;
    return this;
  }
  private Integer fblnCommenceInFuture;
  public Integer get_fblnCommenceInFuture() {
    return fblnCommenceInFuture;
  }
  public void set_fblnCommenceInFuture(Integer fblnCommenceInFuture) {
    this.fblnCommenceInFuture = fblnCommenceInFuture;
  }
  public rfraddresstype with_fblnCommenceInFuture(Integer fblnCommenceInFuture) {
    this.fblnCommenceInFuture = fblnCommenceInFuture;
    return this;
  }
  private Integer fblnCeaseInFuture;
  public Integer get_fblnCeaseInFuture() {
    return fblnCeaseInFuture;
  }
  public void set_fblnCeaseInFuture(Integer fblnCeaseInFuture) {
    this.fblnCeaseInFuture = fblnCeaseInFuture;
  }
  public rfraddresstype with_fblnCeaseInFuture(Integer fblnCeaseInFuture) {
    this.fblnCeaseInFuture = fblnCeaseInFuture;
    return this;
  }
  private Integer FBLNACTIVE;
  public Integer get_FBLNACTIVE() {
    return FBLNACTIVE;
  }
  public void set_FBLNACTIVE(Integer FBLNACTIVE) {
    this.FBLNACTIVE = FBLNACTIVE;
  }
  public rfraddresstype with_FBLNACTIVE(Integer FBLNACTIVE) {
    this.FBLNACTIVE = FBLNACTIVE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfraddresstype)) {
      return false;
    }
    rfraddresstype that = (rfraddresstype) o;
    boolean equal = true;
    equal = equal && (this.FSTRADDRESSTYPE == null ? that.FSTRADDRESSTYPE == null : this.FSTRADDRESSTYPE.equals(that.FSTRADDRESSTYPE));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.FSTRDISTRICTOFFICERULE == null ? that.FSTRDISTRICTOFFICERULE == null : this.FSTRDISTRICTOFFICERULE.equals(that.FSTRDISTRICTOFFICERULE));
    equal = equal && (this.fblnCanCai == null ? that.fblnCanCai == null : this.fblnCanCai.equals(that.fblnCanCai));
    equal = equal && (this.fblnLocationCode == null ? that.fblnLocationCode == null : this.fblnLocationCode.equals(that.fblnLocationCode));
    equal = equal && (this.fstrLocationCodeMask == null ? that.fstrLocationCodeMask == null : this.fstrLocationCodeMask.equals(that.fstrLocationCodeMask));
    equal = equal && (this.fstrFormatString == null ? that.fstrFormatString == null : this.fstrFormatString.equals(that.fstrFormatString));
    equal = equal && (this.fintAllowBlank == null ? that.fintAllowBlank == null : this.fintAllowBlank.equals(that.fintAllowBlank));
    equal = equal && (this.fblnSearchIndex == null ? that.fblnSearchIndex == null : this.fblnSearchIndex.equals(that.fblnSearchIndex));
    equal = equal && (this.fblnCanInactivate == null ? that.fblnCanInactivate == null : this.fblnCanInactivate.equals(that.fblnCanInactivate));
    equal = equal && (this.fblnCommenceInFuture == null ? that.fblnCommenceInFuture == null : this.fblnCommenceInFuture.equals(that.fblnCommenceInFuture));
    equal = equal && (this.fblnCeaseInFuture == null ? that.fblnCeaseInFuture == null : this.fblnCeaseInFuture.equals(that.fblnCeaseInFuture));
    equal = equal && (this.FBLNACTIVE == null ? that.FBLNACTIVE == null : this.FBLNACTIVE.equals(that.FBLNACTIVE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfraddresstype)) {
      return false;
    }
    rfraddresstype that = (rfraddresstype) o;
    boolean equal = true;
    equal = equal && (this.FSTRADDRESSTYPE == null ? that.FSTRADDRESSTYPE == null : this.FSTRADDRESSTYPE.equals(that.FSTRADDRESSTYPE));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.FSTRDISTRICTOFFICERULE == null ? that.FSTRDISTRICTOFFICERULE == null : this.FSTRDISTRICTOFFICERULE.equals(that.FSTRDISTRICTOFFICERULE));
    equal = equal && (this.fblnCanCai == null ? that.fblnCanCai == null : this.fblnCanCai.equals(that.fblnCanCai));
    equal = equal && (this.fblnLocationCode == null ? that.fblnLocationCode == null : this.fblnLocationCode.equals(that.fblnLocationCode));
    equal = equal && (this.fstrLocationCodeMask == null ? that.fstrLocationCodeMask == null : this.fstrLocationCodeMask.equals(that.fstrLocationCodeMask));
    equal = equal && (this.fstrFormatString == null ? that.fstrFormatString == null : this.fstrFormatString.equals(that.fstrFormatString));
    equal = equal && (this.fintAllowBlank == null ? that.fintAllowBlank == null : this.fintAllowBlank.equals(that.fintAllowBlank));
    equal = equal && (this.fblnSearchIndex == null ? that.fblnSearchIndex == null : this.fblnSearchIndex.equals(that.fblnSearchIndex));
    equal = equal && (this.fblnCanInactivate == null ? that.fblnCanInactivate == null : this.fblnCanInactivate.equals(that.fblnCanInactivate));
    equal = equal && (this.fblnCommenceInFuture == null ? that.fblnCommenceInFuture == null : this.fblnCommenceInFuture.equals(that.fblnCommenceInFuture));
    equal = equal && (this.fblnCeaseInFuture == null ? that.fblnCeaseInFuture == null : this.fblnCeaseInFuture.equals(that.fblnCeaseInFuture));
    equal = equal && (this.FBLNACTIVE == null ? that.FBLNACTIVE == null : this.FBLNACTIVE.equals(that.FBLNACTIVE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FSTRADDRESSTYPE = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRDISTRICTOFFICERULE = JdbcWritableBridge.readString(3, __dbResults);
    this.fblnCanCai = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnLocationCode = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrLocationCodeMask = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrFormatString = JdbcWritableBridge.readString(7, __dbResults);
    this.fintAllowBlank = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnSearchIndex = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnCanInactivate = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnCommenceInFuture = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnCeaseInFuture = JdbcWritableBridge.readInteger(12, __dbResults);
    this.FBLNACTIVE = JdbcWritableBridge.readInteger(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FSTRADDRESSTYPE = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(2, __dbResults);
    this.FSTRDISTRICTOFFICERULE = JdbcWritableBridge.readString(3, __dbResults);
    this.fblnCanCai = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnLocationCode = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrLocationCodeMask = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrFormatString = JdbcWritableBridge.readString(7, __dbResults);
    this.fintAllowBlank = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnSearchIndex = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnCanInactivate = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnCommenceInFuture = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnCeaseInFuture = JdbcWritableBridge.readInteger(12, __dbResults);
    this.FBLNACTIVE = JdbcWritableBridge.readInteger(13, __dbResults);
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
    JdbcWritableBridge.writeString(FSTRADDRESSTYPE, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDISTRICTOFFICERULE, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanCai, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLocationCode, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCodeMask, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormatString, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAllowBlank, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSearchIndex, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanInactivate, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommenceInFuture, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCeaseInFuture, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNACTIVE, 13 + __off, -6, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FSTRADDRESSTYPE, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(FSTRDISTRICTOFFICERULE, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanCai, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLocationCode, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCodeMask, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFormatString, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAllowBlank, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSearchIndex, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanInactivate, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommenceInFuture, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCeaseInFuture, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FBLNACTIVE, 13 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FSTRADDRESSTYPE = null;
    } else {
    this.FSTRADDRESSTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FSTRDISTRICTOFFICERULE = null;
    } else {
    this.FSTRDISTRICTOFFICERULE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanCai = null;
    } else {
    this.fblnCanCai = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLocationCode = null;
    } else {
    this.fblnLocationCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLocationCodeMask = null;
    } else {
    this.fstrLocationCodeMask = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFormatString = null;
    } else {
    this.fstrFormatString = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintAllowBlank = null;
    } else {
    this.fintAllowBlank = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSearchIndex = null;
    } else {
    this.fblnSearchIndex = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanInactivate = null;
    } else {
    this.fblnCanInactivate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCommenceInFuture = null;
    } else {
    this.fblnCommenceInFuture = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCeaseInFuture = null;
    } else {
    this.fblnCeaseInFuture = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FBLNACTIVE = null;
    } else {
    this.FBLNACTIVE = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FSTRADDRESSTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRADDRESSTYPE);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.FSTRDISTRICTOFFICERULE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDISTRICTOFFICERULE);
    }
    if (null == this.fblnCanCai) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanCai);
    }
    if (null == this.fblnLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLocationCode);
    }
    if (null == this.fstrLocationCodeMask) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCodeMask);
    }
    if (null == this.fstrFormatString) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormatString);
    }
    if (null == this.fintAllowBlank) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAllowBlank);
    }
    if (null == this.fblnSearchIndex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSearchIndex);
    }
    if (null == this.fblnCanInactivate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanInactivate);
    }
    if (null == this.fblnCommenceInFuture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommenceInFuture);
    }
    if (null == this.fblnCeaseInFuture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCeaseInFuture);
    }
    if (null == this.FBLNACTIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNACTIVE);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FSTRADDRESSTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRADDRESSTYPE);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.FSTRDISTRICTOFFICERULE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FSTRDISTRICTOFFICERULE);
    }
    if (null == this.fblnCanCai) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanCai);
    }
    if (null == this.fblnLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLocationCode);
    }
    if (null == this.fstrLocationCodeMask) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCodeMask);
    }
    if (null == this.fstrFormatString) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFormatString);
    }
    if (null == this.fintAllowBlank) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAllowBlank);
    }
    if (null == this.fblnSearchIndex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSearchIndex);
    }
    if (null == this.fblnCanInactivate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanInactivate);
    }
    if (null == this.fblnCommenceInFuture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommenceInFuture);
    }
    if (null == this.fblnCeaseInFuture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCeaseInFuture);
    }
    if (null == this.FBLNACTIVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FBLNACTIVE);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRADDRESSTYPE==null?"\\N":FSTRADDRESSTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDISTRICTOFFICERULE==null?"\\N":FSTRDISTRICTOFFICERULE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanCai==null?"\\N":"" + fblnCanCai, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLocationCode==null?"\\N":"" + fblnLocationCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCodeMask==null?"\\N":fstrLocationCodeMask, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormatString==null?"\\N":fstrFormatString, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAllowBlank==null?"\\N":"" + fintAllowBlank, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSearchIndex==null?"\\N":"" + fblnSearchIndex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanInactivate==null?"\\N":"" + fblnCanInactivate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommenceInFuture==null?"\\N":"" + fblnCommenceInFuture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCeaseInFuture==null?"\\N":"" + fblnCeaseInFuture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNACTIVE==null?"\\N":"" + FBLNACTIVE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRADDRESSTYPE==null?"\\N":FSTRADDRESSTYPE, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(FSTRDISTRICTOFFICERULE==null?"\\N":FSTRDISTRICTOFFICERULE, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanCai==null?"\\N":"" + fblnCanCai, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLocationCode==null?"\\N":"" + fblnLocationCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCodeMask==null?"\\N":fstrLocationCodeMask, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFormatString==null?"\\N":fstrFormatString, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAllowBlank==null?"\\N":"" + fintAllowBlank, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSearchIndex==null?"\\N":"" + fblnSearchIndex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanInactivate==null?"\\N":"" + fblnCanInactivate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommenceInFuture==null?"\\N":"" + fblnCommenceInFuture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCeaseInFuture==null?"\\N":"" + fblnCeaseInFuture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FBLNACTIVE==null?"\\N":"" + FBLNACTIVE, delimiters));
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
    if (__cur_str.equals("null")) { this.FSTRADDRESSTYPE = null; } else {
      this.FSTRADDRESSTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDISTRICTOFFICERULE = null; } else {
      this.FSTRDISTRICTOFFICERULE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanCai = null; } else {
      this.fblnCanCai = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLocationCode = null; } else {
      this.fblnLocationCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLocationCodeMask = null; } else {
      this.fstrLocationCodeMask = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormatString = null; } else {
      this.fstrFormatString = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAllowBlank = null; } else {
      this.fintAllowBlank = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSearchIndex = null; } else {
      this.fblnSearchIndex = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanInactivate = null; } else {
      this.fblnCanInactivate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommenceInFuture = null; } else {
      this.fblnCommenceInFuture = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCeaseInFuture = null; } else {
      this.fblnCeaseInFuture = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNACTIVE = null; } else {
      this.FBLNACTIVE = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.FSTRADDRESSTYPE = null; } else {
      this.FSTRADDRESSTYPE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSource = null; } else {
      this.fstrSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.FSTRDISTRICTOFFICERULE = null; } else {
      this.FSTRDISTRICTOFFICERULE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanCai = null; } else {
      this.fblnCanCai = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLocationCode = null; } else {
      this.fblnLocationCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLocationCodeMask = null; } else {
      this.fstrLocationCodeMask = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFormatString = null; } else {
      this.fstrFormatString = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAllowBlank = null; } else {
      this.fintAllowBlank = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSearchIndex = null; } else {
      this.fblnSearchIndex = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanInactivate = null; } else {
      this.fblnCanInactivate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommenceInFuture = null; } else {
      this.fblnCommenceInFuture = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCeaseInFuture = null; } else {
      this.fblnCeaseInFuture = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FBLNACTIVE = null; } else {
      this.FBLNACTIVE = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    rfraddresstype o = (rfraddresstype) super.clone();
    return o;
  }

  public void clone0(rfraddresstype o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("FSTRADDRESSTYPE", this.FSTRADDRESSTYPE);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("FSTRDISTRICTOFFICERULE", this.FSTRDISTRICTOFFICERULE);
    __sqoop$field_map.put("fblnCanCai", this.fblnCanCai);
    __sqoop$field_map.put("fblnLocationCode", this.fblnLocationCode);
    __sqoop$field_map.put("fstrLocationCodeMask", this.fstrLocationCodeMask);
    __sqoop$field_map.put("fstrFormatString", this.fstrFormatString);
    __sqoop$field_map.put("fintAllowBlank", this.fintAllowBlank);
    __sqoop$field_map.put("fblnSearchIndex", this.fblnSearchIndex);
    __sqoop$field_map.put("fblnCanInactivate", this.fblnCanInactivate);
    __sqoop$field_map.put("fblnCommenceInFuture", this.fblnCommenceInFuture);
    __sqoop$field_map.put("fblnCeaseInFuture", this.fblnCeaseInFuture);
    __sqoop$field_map.put("FBLNACTIVE", this.FBLNACTIVE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FSTRADDRESSTYPE", this.FSTRADDRESSTYPE);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("FSTRDISTRICTOFFICERULE", this.FSTRDISTRICTOFFICERULE);
    __sqoop$field_map.put("fblnCanCai", this.fblnCanCai);
    __sqoop$field_map.put("fblnLocationCode", this.fblnLocationCode);
    __sqoop$field_map.put("fstrLocationCodeMask", this.fstrLocationCodeMask);
    __sqoop$field_map.put("fstrFormatString", this.fstrFormatString);
    __sqoop$field_map.put("fintAllowBlank", this.fintAllowBlank);
    __sqoop$field_map.put("fblnSearchIndex", this.fblnSearchIndex);
    __sqoop$field_map.put("fblnCanInactivate", this.fblnCanInactivate);
    __sqoop$field_map.put("fblnCommenceInFuture", this.fblnCommenceInFuture);
    __sqoop$field_map.put("fblnCeaseInFuture", this.fblnCeaseInFuture);
    __sqoop$field_map.put("FBLNACTIVE", this.FBLNACTIVE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
