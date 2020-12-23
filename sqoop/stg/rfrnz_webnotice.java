// ORM class for table 'rfrnz_webnotice'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:56:31 NZDT 2020
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

public class rfrnz_webnotice extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrWebNoticeType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fstrWebNoticeType = (String)value;
      }
    });
    setters.put("fstrEmailSubject", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fstrEmailSubject = (String)value;
      }
    });
    setters.put("fstrEmailMessage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fstrEmailMessage = (String)value;
      }
    });
    setters.put("fstrEmailGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fstrEmailGroup = (String)value;
      }
    });
    setters.put("fstrSMSType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fstrSMSType = (String)value;
      }
    });
    setters.put("fblnAlwaysEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fblnAlwaysEmail = (Integer)value;
      }
    });
    setters.put("fblnBundle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fblnBundle = (Integer)value;
      }
    });
    setters.put("fblnDoNothing", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fblnDoNothing = (Integer)value;
      }
    });
    setters.put("fblnCanReply", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fblnCanReply = (Integer)value;
      }
    });
    setters.put("fblnTaxPrepCanReply", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fblnTaxPrepCanReply = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rfrnz_webnotice.this.fblnActive = (Integer)value;
      }
    });
  }
  public rfrnz_webnotice() {
    init0();
  }
  private String fstrWebNoticeType;
  public String get_fstrWebNoticeType() {
    return fstrWebNoticeType;
  }
  public void set_fstrWebNoticeType(String fstrWebNoticeType) {
    this.fstrWebNoticeType = fstrWebNoticeType;
  }
  public rfrnz_webnotice with_fstrWebNoticeType(String fstrWebNoticeType) {
    this.fstrWebNoticeType = fstrWebNoticeType;
    return this;
  }
  private String fstrEmailSubject;
  public String get_fstrEmailSubject() {
    return fstrEmailSubject;
  }
  public void set_fstrEmailSubject(String fstrEmailSubject) {
    this.fstrEmailSubject = fstrEmailSubject;
  }
  public rfrnz_webnotice with_fstrEmailSubject(String fstrEmailSubject) {
    this.fstrEmailSubject = fstrEmailSubject;
    return this;
  }
  private String fstrEmailMessage;
  public String get_fstrEmailMessage() {
    return fstrEmailMessage;
  }
  public void set_fstrEmailMessage(String fstrEmailMessage) {
    this.fstrEmailMessage = fstrEmailMessage;
  }
  public rfrnz_webnotice with_fstrEmailMessage(String fstrEmailMessage) {
    this.fstrEmailMessage = fstrEmailMessage;
    return this;
  }
  private String fstrEmailGroup;
  public String get_fstrEmailGroup() {
    return fstrEmailGroup;
  }
  public void set_fstrEmailGroup(String fstrEmailGroup) {
    this.fstrEmailGroup = fstrEmailGroup;
  }
  public rfrnz_webnotice with_fstrEmailGroup(String fstrEmailGroup) {
    this.fstrEmailGroup = fstrEmailGroup;
    return this;
  }
  private String fstrSMSType;
  public String get_fstrSMSType() {
    return fstrSMSType;
  }
  public void set_fstrSMSType(String fstrSMSType) {
    this.fstrSMSType = fstrSMSType;
  }
  public rfrnz_webnotice with_fstrSMSType(String fstrSMSType) {
    this.fstrSMSType = fstrSMSType;
    return this;
  }
  private Integer fblnAlwaysEmail;
  public Integer get_fblnAlwaysEmail() {
    return fblnAlwaysEmail;
  }
  public void set_fblnAlwaysEmail(Integer fblnAlwaysEmail) {
    this.fblnAlwaysEmail = fblnAlwaysEmail;
  }
  public rfrnz_webnotice with_fblnAlwaysEmail(Integer fblnAlwaysEmail) {
    this.fblnAlwaysEmail = fblnAlwaysEmail;
    return this;
  }
  private Integer fblnBundle;
  public Integer get_fblnBundle() {
    return fblnBundle;
  }
  public void set_fblnBundle(Integer fblnBundle) {
    this.fblnBundle = fblnBundle;
  }
  public rfrnz_webnotice with_fblnBundle(Integer fblnBundle) {
    this.fblnBundle = fblnBundle;
    return this;
  }
  private Integer fblnDoNothing;
  public Integer get_fblnDoNothing() {
    return fblnDoNothing;
  }
  public void set_fblnDoNothing(Integer fblnDoNothing) {
    this.fblnDoNothing = fblnDoNothing;
  }
  public rfrnz_webnotice with_fblnDoNothing(Integer fblnDoNothing) {
    this.fblnDoNothing = fblnDoNothing;
    return this;
  }
  private Integer fblnCanReply;
  public Integer get_fblnCanReply() {
    return fblnCanReply;
  }
  public void set_fblnCanReply(Integer fblnCanReply) {
    this.fblnCanReply = fblnCanReply;
  }
  public rfrnz_webnotice with_fblnCanReply(Integer fblnCanReply) {
    this.fblnCanReply = fblnCanReply;
    return this;
  }
  private Integer fblnTaxPrepCanReply;
  public Integer get_fblnTaxPrepCanReply() {
    return fblnTaxPrepCanReply;
  }
  public void set_fblnTaxPrepCanReply(Integer fblnTaxPrepCanReply) {
    this.fblnTaxPrepCanReply = fblnTaxPrepCanReply;
  }
  public rfrnz_webnotice with_fblnTaxPrepCanReply(Integer fblnTaxPrepCanReply) {
    this.fblnTaxPrepCanReply = fblnTaxPrepCanReply;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public rfrnz_webnotice with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrnz_webnotice)) {
      return false;
    }
    rfrnz_webnotice that = (rfrnz_webnotice) o;
    boolean equal = true;
    equal = equal && (this.fstrWebNoticeType == null ? that.fstrWebNoticeType == null : this.fstrWebNoticeType.equals(that.fstrWebNoticeType));
    equal = equal && (this.fstrEmailSubject == null ? that.fstrEmailSubject == null : this.fstrEmailSubject.equals(that.fstrEmailSubject));
    equal = equal && (this.fstrEmailMessage == null ? that.fstrEmailMessage == null : this.fstrEmailMessage.equals(that.fstrEmailMessage));
    equal = equal && (this.fstrEmailGroup == null ? that.fstrEmailGroup == null : this.fstrEmailGroup.equals(that.fstrEmailGroup));
    equal = equal && (this.fstrSMSType == null ? that.fstrSMSType == null : this.fstrSMSType.equals(that.fstrSMSType));
    equal = equal && (this.fblnAlwaysEmail == null ? that.fblnAlwaysEmail == null : this.fblnAlwaysEmail.equals(that.fblnAlwaysEmail));
    equal = equal && (this.fblnBundle == null ? that.fblnBundle == null : this.fblnBundle.equals(that.fblnBundle));
    equal = equal && (this.fblnDoNothing == null ? that.fblnDoNothing == null : this.fblnDoNothing.equals(that.fblnDoNothing));
    equal = equal && (this.fblnCanReply == null ? that.fblnCanReply == null : this.fblnCanReply.equals(that.fblnCanReply));
    equal = equal && (this.fblnTaxPrepCanReply == null ? that.fblnTaxPrepCanReply == null : this.fblnTaxPrepCanReply.equals(that.fblnTaxPrepCanReply));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rfrnz_webnotice)) {
      return false;
    }
    rfrnz_webnotice that = (rfrnz_webnotice) o;
    boolean equal = true;
    equal = equal && (this.fstrWebNoticeType == null ? that.fstrWebNoticeType == null : this.fstrWebNoticeType.equals(that.fstrWebNoticeType));
    equal = equal && (this.fstrEmailSubject == null ? that.fstrEmailSubject == null : this.fstrEmailSubject.equals(that.fstrEmailSubject));
    equal = equal && (this.fstrEmailMessage == null ? that.fstrEmailMessage == null : this.fstrEmailMessage.equals(that.fstrEmailMessage));
    equal = equal && (this.fstrEmailGroup == null ? that.fstrEmailGroup == null : this.fstrEmailGroup.equals(that.fstrEmailGroup));
    equal = equal && (this.fstrSMSType == null ? that.fstrSMSType == null : this.fstrSMSType.equals(that.fstrSMSType));
    equal = equal && (this.fblnAlwaysEmail == null ? that.fblnAlwaysEmail == null : this.fblnAlwaysEmail.equals(that.fblnAlwaysEmail));
    equal = equal && (this.fblnBundle == null ? that.fblnBundle == null : this.fblnBundle.equals(that.fblnBundle));
    equal = equal && (this.fblnDoNothing == null ? that.fblnDoNothing == null : this.fblnDoNothing.equals(that.fblnDoNothing));
    equal = equal && (this.fblnCanReply == null ? that.fblnCanReply == null : this.fblnCanReply.equals(that.fblnCanReply));
    equal = equal && (this.fblnTaxPrepCanReply == null ? that.fblnTaxPrepCanReply == null : this.fblnTaxPrepCanReply.equals(that.fblnTaxPrepCanReply));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrWebNoticeType = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrEmailSubject = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrEmailMessage = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrEmailGroup = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSMSType = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnAlwaysEmail = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnBundle = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnDoNothing = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnCanReply = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnTaxPrepCanReply = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrWebNoticeType = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrEmailSubject = JdbcWritableBridge.readString(2, __dbResults);
    this.fstrEmailMessage = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrEmailGroup = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrSMSType = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnAlwaysEmail = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnBundle = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnDoNothing = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnCanReply = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnTaxPrepCanReply = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(11, __dbResults);
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
    JdbcWritableBridge.writeString(fstrWebNoticeType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailSubject, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailMessage, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailGroup, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlwaysEmail, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBundle, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDoNothing, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanReply, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTaxPrepCanReply, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 11 + __off, -6, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrWebNoticeType, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailSubject, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailMessage, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailGroup, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSMSType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlwaysEmail, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBundle, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDoNothing, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanReply, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTaxPrepCanReply, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 11 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrWebNoticeType = null;
    } else {
    this.fstrWebNoticeType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmailSubject = null;
    } else {
    this.fstrEmailSubject = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmailMessage = null;
    } else {
    this.fstrEmailMessage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmailGroup = null;
    } else {
    this.fstrEmailGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSMSType = null;
    } else {
    this.fstrSMSType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAlwaysEmail = null;
    } else {
    this.fblnAlwaysEmail = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnBundle = null;
    } else {
    this.fblnBundle = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDoNothing = null;
    } else {
    this.fblnDoNothing = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanReply = null;
    } else {
    this.fblnCanReply = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTaxPrepCanReply = null;
    } else {
    this.fblnTaxPrepCanReply = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrWebNoticeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebNoticeType);
    }
    if (null == this.fstrEmailSubject) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailSubject);
    }
    if (null == this.fstrEmailMessage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailMessage);
    }
    if (null == this.fstrEmailGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailGroup);
    }
    if (null == this.fstrSMSType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSType);
    }
    if (null == this.fblnAlwaysEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlwaysEmail);
    }
    if (null == this.fblnBundle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBundle);
    }
    if (null == this.fblnDoNothing) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDoNothing);
    }
    if (null == this.fblnCanReply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanReply);
    }
    if (null == this.fblnTaxPrepCanReply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTaxPrepCanReply);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrWebNoticeType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWebNoticeType);
    }
    if (null == this.fstrEmailSubject) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailSubject);
    }
    if (null == this.fstrEmailMessage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailMessage);
    }
    if (null == this.fstrEmailGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailGroup);
    }
    if (null == this.fstrSMSType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSMSType);
    }
    if (null == this.fblnAlwaysEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlwaysEmail);
    }
    if (null == this.fblnBundle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBundle);
    }
    if (null == this.fblnDoNothing) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDoNothing);
    }
    if (null == this.fblnCanReply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanReply);
    }
    if (null == this.fblnTaxPrepCanReply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTaxPrepCanReply);
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
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebNoticeType==null?"\\N":fstrWebNoticeType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailSubject==null?"\\N":fstrEmailSubject, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailMessage==null?"\\N":fstrEmailMessage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailGroup==null?"\\N":fstrEmailGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSType==null?"\\N":fstrSMSType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlwaysEmail==null?"\\N":"" + fblnAlwaysEmail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBundle==null?"\\N":"" + fblnBundle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDoNothing==null?"\\N":"" + fblnDoNothing, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanReply==null?"\\N":"" + fblnCanReply, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTaxPrepCanReply==null?"\\N":"" + fblnTaxPrepCanReply, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWebNoticeType==null?"\\N":fstrWebNoticeType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailSubject==null?"\\N":fstrEmailSubject, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailMessage==null?"\\N":fstrEmailMessage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailGroup==null?"\\N":fstrEmailGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSMSType==null?"\\N":fstrSMSType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlwaysEmail==null?"\\N":"" + fblnAlwaysEmail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBundle==null?"\\N":"" + fblnBundle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDoNothing==null?"\\N":"" + fblnDoNothing, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanReply==null?"\\N":"" + fblnCanReply, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTaxPrepCanReply==null?"\\N":"" + fblnTaxPrepCanReply, delimiters));
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
    if (__cur_str.equals("null")) { this.fstrWebNoticeType = null; } else {
      this.fstrWebNoticeType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailSubject = null; } else {
      this.fstrEmailSubject = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailMessage = null; } else {
      this.fstrEmailMessage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailGroup = null; } else {
      this.fstrEmailGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSType = null; } else {
      this.fstrSMSType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlwaysEmail = null; } else {
      this.fblnAlwaysEmail = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBundle = null; } else {
      this.fblnBundle = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDoNothing = null; } else {
      this.fblnDoNothing = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanReply = null; } else {
      this.fblnCanReply = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTaxPrepCanReply = null; } else {
      this.fblnTaxPrepCanReply = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrWebNoticeType = null; } else {
      this.fstrWebNoticeType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailSubject = null; } else {
      this.fstrEmailSubject = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailMessage = null; } else {
      this.fstrEmailMessage = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailGroup = null; } else {
      this.fstrEmailGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSMSType = null; } else {
      this.fstrSMSType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlwaysEmail = null; } else {
      this.fblnAlwaysEmail = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBundle = null; } else {
      this.fblnBundle = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDoNothing = null; } else {
      this.fblnDoNothing = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanReply = null; } else {
      this.fblnCanReply = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTaxPrepCanReply = null; } else {
      this.fblnTaxPrepCanReply = Integer.valueOf(__cur_str);
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
    rfrnz_webnotice o = (rfrnz_webnotice) super.clone();
    return o;
  }

  public void clone0(rfrnz_webnotice o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrWebNoticeType", this.fstrWebNoticeType);
    __sqoop$field_map.put("fstrEmailSubject", this.fstrEmailSubject);
    __sqoop$field_map.put("fstrEmailMessage", this.fstrEmailMessage);
    __sqoop$field_map.put("fstrEmailGroup", this.fstrEmailGroup);
    __sqoop$field_map.put("fstrSMSType", this.fstrSMSType);
    __sqoop$field_map.put("fblnAlwaysEmail", this.fblnAlwaysEmail);
    __sqoop$field_map.put("fblnBundle", this.fblnBundle);
    __sqoop$field_map.put("fblnDoNothing", this.fblnDoNothing);
    __sqoop$field_map.put("fblnCanReply", this.fblnCanReply);
    __sqoop$field_map.put("fblnTaxPrepCanReply", this.fblnTaxPrepCanReply);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrWebNoticeType", this.fstrWebNoticeType);
    __sqoop$field_map.put("fstrEmailSubject", this.fstrEmailSubject);
    __sqoop$field_map.put("fstrEmailMessage", this.fstrEmailMessage);
    __sqoop$field_map.put("fstrEmailGroup", this.fstrEmailGroup);
    __sqoop$field_map.put("fstrSMSType", this.fstrSMSType);
    __sqoop$field_map.put("fblnAlwaysEmail", this.fblnAlwaysEmail);
    __sqoop$field_map.put("fblnBundle", this.fblnBundle);
    __sqoop$field_map.put("fblnDoNothing", this.fblnDoNothing);
    __sqoop$field_map.put("fblnCanReply", this.fblnCanReply);
    __sqoop$field_map.put("fblnTaxPrepCanReply", this.fblnTaxPrepCanReply);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
