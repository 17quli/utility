// ORM class for table 'rfrprofiletype'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:58:23 NZDT 2020
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

public class rfrprofiletype extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrProfileType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fstrProfileType = (String)value;
      }
    });
    setters.put("fblnOneForCustomer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fblnOneForCustomer = (Integer)value;
      }
    });
    setters.put("fblnUpdateProfileInfo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fblnUpdateProfileInfo = (Integer)value;
      }
    });
    setters.put("fblnCanBeParent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fblnCanBeParent = (Integer)value;
      }
    });
    setters.put("fblnCanBeChild", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fblnCanBeChild = (Integer)value;
      }
    });
    setters.put("fblnCanTransfer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fblnCanTransfer = (Integer)value;
      }
    });
    setters.put("fblnCommenceCease", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fblnCommenceCease = (Integer)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fstrAttributePrePop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fstrAttributePrePop = (String)value;
      }
    });
    setters.put("fstrPostProcessBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fstrPostProcessBo = (String)value;
      }
    });
    setters.put("flngFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.flngFunction = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrprofiletype.this.fblnActive = (Integer)value;
      }
    });
  }
  public rfrprofiletype() {
    init0();
  }
  private String fstrProfileType;
  public String get_fstrProfileType() {
    return fstrProfileType;
  }
  public void set_fstrProfileType(String fstrProfileType) {
    this.fstrProfileType = fstrProfileType;
  }
  public rfrprofiletype with_fstrProfileType(String fstrProfileType) {
    this.fstrProfileType = fstrProfileType;
    return this;
  }
  private Integer fblnOneForCustomer;
  public Integer get_fblnOneForCustomer() {
    return fblnOneForCustomer;
  }
  public void set_fblnOneForCustomer(Integer fblnOneForCustomer) {
    this.fblnOneForCustomer = fblnOneForCustomer;
  }
  public rfrprofiletype with_fblnOneForCustomer(Integer fblnOneForCustomer) {
    this.fblnOneForCustomer = fblnOneForCustomer;
    return this;
  }
  private Integer fblnUpdateProfileInfo;
  public Integer get_fblnUpdateProfileInfo() {
    return fblnUpdateProfileInfo;
  }
  public void set_fblnUpdateProfileInfo(Integer fblnUpdateProfileInfo) {
    this.fblnUpdateProfileInfo = fblnUpdateProfileInfo;
  }
  public rfrprofiletype with_fblnUpdateProfileInfo(Integer fblnUpdateProfileInfo) {
    this.fblnUpdateProfileInfo = fblnUpdateProfileInfo;
    return this;
  }
  private Integer fblnCanBeParent;
  public Integer get_fblnCanBeParent() {
    return fblnCanBeParent;
  }
  public void set_fblnCanBeParent(Integer fblnCanBeParent) {
    this.fblnCanBeParent = fblnCanBeParent;
  }
  public rfrprofiletype with_fblnCanBeParent(Integer fblnCanBeParent) {
    this.fblnCanBeParent = fblnCanBeParent;
    return this;
  }
  private Integer fblnCanBeChild;
  public Integer get_fblnCanBeChild() {
    return fblnCanBeChild;
  }
  public void set_fblnCanBeChild(Integer fblnCanBeChild) {
    this.fblnCanBeChild = fblnCanBeChild;
  }
  public rfrprofiletype with_fblnCanBeChild(Integer fblnCanBeChild) {
    this.fblnCanBeChild = fblnCanBeChild;
    return this;
  }
  private Integer fblnCanTransfer;
  public Integer get_fblnCanTransfer() {
    return fblnCanTransfer;
  }
  public void set_fblnCanTransfer(Integer fblnCanTransfer) {
    this.fblnCanTransfer = fblnCanTransfer;
  }
  public rfrprofiletype with_fblnCanTransfer(Integer fblnCanTransfer) {
    this.fblnCanTransfer = fblnCanTransfer;
    return this;
  }
  private Integer fblnCommenceCease;
  public Integer get_fblnCommenceCease() {
    return fblnCommenceCease;
  }
  public void set_fblnCommenceCease(Integer fblnCommenceCease) {
    this.fblnCommenceCease = fblnCommenceCease;
  }
  public rfrprofiletype with_fblnCommenceCease(Integer fblnCommenceCease) {
    this.fblnCommenceCease = fblnCommenceCease;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public rfrprofiletype with_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
    return this;
  }
  private Integer fintDocVer;
  public Integer get_fintDocVer() {
    return fintDocVer;
  }
  public void set_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
  }
  public rfrprofiletype with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private String fstrAttributePrePop;
  public String get_fstrAttributePrePop() {
    return fstrAttributePrePop;
  }
  public void set_fstrAttributePrePop(String fstrAttributePrePop) {
    this.fstrAttributePrePop = fstrAttributePrePop;
  }
  public rfrprofiletype with_fstrAttributePrePop(String fstrAttributePrePop) {
    this.fstrAttributePrePop = fstrAttributePrePop;
    return this;
  }
  private String fstrPostProcessBo;
  public String get_fstrPostProcessBo() {
    return fstrPostProcessBo;
  }
  public void set_fstrPostProcessBo(String fstrPostProcessBo) {
    this.fstrPostProcessBo = fstrPostProcessBo;
  }
  public rfrprofiletype with_fstrPostProcessBo(String fstrPostProcessBo) {
    this.fstrPostProcessBo = fstrPostProcessBo;
    return this;
  }
  private Integer flngFunction;
  public Integer get_flngFunction() {
    return flngFunction;
  }
  public void set_flngFunction(Integer flngFunction) {
    this.flngFunction = flngFunction;
  }
  public rfrprofiletype with_flngFunction(Integer flngFunction) {
    this.flngFunction = flngFunction;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public rfrprofiletype with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrprofiletype)) {
      return false;
    }
    rfrprofiletype that = (rfrprofiletype) o;
    boolean equal = true;
    equal = equal && (this.fstrProfileType == null ? that.fstrProfileType == null : this.fstrProfileType.equals(that.fstrProfileType));
    equal = equal && (this.fblnOneForCustomer == null ? that.fblnOneForCustomer == null : this.fblnOneForCustomer.equals(that.fblnOneForCustomer));
    equal = equal && (this.fblnUpdateProfileInfo == null ? that.fblnUpdateProfileInfo == null : this.fblnUpdateProfileInfo.equals(that.fblnUpdateProfileInfo));
    equal = equal && (this.fblnCanBeParent == null ? that.fblnCanBeParent == null : this.fblnCanBeParent.equals(that.fblnCanBeParent));
    equal = equal && (this.fblnCanBeChild == null ? that.fblnCanBeChild == null : this.fblnCanBeChild.equals(that.fblnCanBeChild));
    equal = equal && (this.fblnCanTransfer == null ? that.fblnCanTransfer == null : this.fblnCanTransfer.equals(that.fblnCanTransfer));
    equal = equal && (this.fblnCommenceCease == null ? that.fblnCommenceCease == null : this.fblnCommenceCease.equals(that.fblnCommenceCease));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fstrAttributePrePop == null ? that.fstrAttributePrePop == null : this.fstrAttributePrePop.equals(that.fstrAttributePrePop));
    equal = equal && (this.fstrPostProcessBo == null ? that.fstrPostProcessBo == null : this.fstrPostProcessBo.equals(that.fstrPostProcessBo));
    equal = equal && (this.flngFunction == null ? that.flngFunction == null : this.flngFunction.equals(that.flngFunction));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrprofiletype)) {
      return false;
    }
    rfrprofiletype that = (rfrprofiletype) o;
    boolean equal = true;
    equal = equal && (this.fstrProfileType == null ? that.fstrProfileType == null : this.fstrProfileType.equals(that.fstrProfileType));
    equal = equal && (this.fblnOneForCustomer == null ? that.fblnOneForCustomer == null : this.fblnOneForCustomer.equals(that.fblnOneForCustomer));
    equal = equal && (this.fblnUpdateProfileInfo == null ? that.fblnUpdateProfileInfo == null : this.fblnUpdateProfileInfo.equals(that.fblnUpdateProfileInfo));
    equal = equal && (this.fblnCanBeParent == null ? that.fblnCanBeParent == null : this.fblnCanBeParent.equals(that.fblnCanBeParent));
    equal = equal && (this.fblnCanBeChild == null ? that.fblnCanBeChild == null : this.fblnCanBeChild.equals(that.fblnCanBeChild));
    equal = equal && (this.fblnCanTransfer == null ? that.fblnCanTransfer == null : this.fblnCanTransfer.equals(that.fblnCanTransfer));
    equal = equal && (this.fblnCommenceCease == null ? that.fblnCommenceCease == null : this.fblnCommenceCease.equals(that.fblnCommenceCease));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fstrAttributePrePop == null ? that.fstrAttributePrePop == null : this.fstrAttributePrePop.equals(that.fstrAttributePrePop));
    equal = equal && (this.fstrPostProcessBo == null ? that.fstrPostProcessBo == null : this.fstrPostProcessBo.equals(that.fstrPostProcessBo));
    equal = equal && (this.flngFunction == null ? that.flngFunction == null : this.flngFunction.equals(that.flngFunction));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrProfileType = JdbcWritableBridge.readString(1, __dbResults);
    this.fblnOneForCustomer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnUpdateProfileInfo = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnCanBeParent = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnCanBeChild = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnCanTransfer = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnCommenceCease = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(8, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrAttributePrePop = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrPostProcessBo = JdbcWritableBridge.readString(11, __dbResults);
    this.flngFunction = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrProfileType = JdbcWritableBridge.readString(1, __dbResults);
    this.fblnOneForCustomer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnUpdateProfileInfo = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnCanBeParent = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnCanBeChild = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnCanTransfer = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnCommenceCease = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(8, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fstrAttributePrePop = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrPostProcessBo = JdbcWritableBridge.readString(11, __dbResults);
    this.flngFunction = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(13, __dbResults);
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
    JdbcWritableBridge.writeString(fstrProfileType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOneForCustomer, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpdateProfileInfo, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanBeParent, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanBeChild, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanTransfer, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommenceCease, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttributePrePop, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostProcessBo, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFunction, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 13 + __off, -6, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrProfileType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnOneForCustomer, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpdateProfileInfo, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanBeParent, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanBeChild, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanTransfer, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCommenceCease, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttributePrePop, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostProcessBo, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFunction, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 13 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrProfileType = null;
    } else {
    this.fstrProfileType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnOneForCustomer = null;
    } else {
    this.fblnOneForCustomer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUpdateProfileInfo = null;
    } else {
    this.fblnUpdateProfileInfo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanBeParent = null;
    } else {
    this.fblnCanBeParent = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanBeChild = null;
    } else {
    this.fblnCanBeChild = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanTransfer = null;
    } else {
    this.fblnCanTransfer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCommenceCease = null;
    } else {
    this.fblnCommenceCease = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocType = null;
    } else {
    this.fstrDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocVer = null;
    } else {
    this.fintDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAttributePrePop = null;
    } else {
    this.fstrAttributePrePop = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPostProcessBo = null;
    } else {
    this.fstrPostProcessBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngFunction = null;
    } else {
    this.flngFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrProfileType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProfileType);
    }
    if (null == this.fblnOneForCustomer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOneForCustomer);
    }
    if (null == this.fblnUpdateProfileInfo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpdateProfileInfo);
    }
    if (null == this.fblnCanBeParent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanBeParent);
    }
    if (null == this.fblnCanBeChild) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanBeChild);
    }
    if (null == this.fblnCanTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanTransfer);
    }
    if (null == this.fblnCommenceCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommenceCease);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fstrAttributePrePop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttributePrePop);
    }
    if (null == this.fstrPostProcessBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostProcessBo);
    }
    if (null == this.flngFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFunction);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrProfileType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrProfileType);
    }
    if (null == this.fblnOneForCustomer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnOneForCustomer);
    }
    if (null == this.fblnUpdateProfileInfo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpdateProfileInfo);
    }
    if (null == this.fblnCanBeParent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanBeParent);
    }
    if (null == this.fblnCanBeChild) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanBeChild);
    }
    if (null == this.fblnCanTransfer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanTransfer);
    }
    if (null == this.fblnCommenceCease) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCommenceCease);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fstrAttributePrePop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttributePrePop);
    }
    if (null == this.fstrPostProcessBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostProcessBo);
    }
    if (null == this.flngFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFunction);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProfileType==null?"\\N":fstrProfileType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOneForCustomer==null?"\\N":"" + fblnOneForCustomer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpdateProfileInfo==null?"\\N":"" + fblnUpdateProfileInfo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanBeParent==null?"\\N":"" + fblnCanBeParent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanBeChild==null?"\\N":"" + fblnCanBeChild, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanTransfer==null?"\\N":"" + fblnCanTransfer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommenceCease==null?"\\N":"" + fblnCommenceCease, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttributePrePop==null?"\\N":fstrAttributePrePop, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostProcessBo==null?"\\N":fstrPostProcessBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFunction==null?"\\N":"" + flngFunction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrProfileType==null?"\\N":fstrProfileType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnOneForCustomer==null?"\\N":"" + fblnOneForCustomer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpdateProfileInfo==null?"\\N":"" + fblnUpdateProfileInfo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanBeParent==null?"\\N":"" + fblnCanBeParent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanBeChild==null?"\\N":"" + fblnCanBeChild, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanTransfer==null?"\\N":"" + fblnCanTransfer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCommenceCease==null?"\\N":"" + fblnCommenceCease, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttributePrePop==null?"\\N":fstrAttributePrePop, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostProcessBo==null?"\\N":fstrPostProcessBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFunction==null?"\\N":"" + flngFunction, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrProfileType = null; } else {
      this.fstrProfileType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOneForCustomer = null; } else {
      this.fblnOneForCustomer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpdateProfileInfo = null; } else {
      this.fblnUpdateProfileInfo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanBeParent = null; } else {
      this.fblnCanBeParent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanBeChild = null; } else {
      this.fblnCanBeChild = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanTransfer = null; } else {
      this.fblnCanTransfer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommenceCease = null; } else {
      this.fblnCommenceCease = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttributePrePop = null; } else {
      this.fstrAttributePrePop = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostProcessBo = null; } else {
      this.fstrPostProcessBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFunction = null; } else {
      this.flngFunction = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrProfileType = null; } else {
      this.fstrProfileType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnOneForCustomer = null; } else {
      this.fblnOneForCustomer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpdateProfileInfo = null; } else {
      this.fblnUpdateProfileInfo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanBeParent = null; } else {
      this.fblnCanBeParent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanBeChild = null; } else {
      this.fblnCanBeChild = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanTransfer = null; } else {
      this.fblnCanTransfer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCommenceCease = null; } else {
      this.fblnCommenceCease = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttributePrePop = null; } else {
      this.fstrAttributePrePop = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostProcessBo = null; } else {
      this.fstrPostProcessBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFunction = null; } else {
      this.flngFunction = Integer.valueOf(__cur_str);
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
    rfrprofiletype o = (rfrprofiletype) super.clone();
    return o;
  }

  public void clone0(rfrprofiletype o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrProfileType", this.fstrProfileType);
    __sqoop$field_map.put("fblnOneForCustomer", this.fblnOneForCustomer);
    __sqoop$field_map.put("fblnUpdateProfileInfo", this.fblnUpdateProfileInfo);
    __sqoop$field_map.put("fblnCanBeParent", this.fblnCanBeParent);
    __sqoop$field_map.put("fblnCanBeChild", this.fblnCanBeChild);
    __sqoop$field_map.put("fblnCanTransfer", this.fblnCanTransfer);
    __sqoop$field_map.put("fblnCommenceCease", this.fblnCommenceCease);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fstrAttributePrePop", this.fstrAttributePrePop);
    __sqoop$field_map.put("fstrPostProcessBo", this.fstrPostProcessBo);
    __sqoop$field_map.put("flngFunction", this.flngFunction);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrProfileType", this.fstrProfileType);
    __sqoop$field_map.put("fblnOneForCustomer", this.fblnOneForCustomer);
    __sqoop$field_map.put("fblnUpdateProfileInfo", this.fblnUpdateProfileInfo);
    __sqoop$field_map.put("fblnCanBeParent", this.fblnCanBeParent);
    __sqoop$field_map.put("fblnCanBeChild", this.fblnCanBeChild);
    __sqoop$field_map.put("fblnCanTransfer", this.fblnCanTransfer);
    __sqoop$field_map.put("fblnCommenceCease", this.fblnCommenceCease);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fstrAttributePrePop", this.fstrAttributePrePop);
    __sqoop$field_map.put("fstrPostProcessBo", this.fstrPostProcessBo);
    __sqoop$field_map.put("flngFunction", this.flngFunction);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
