// ORM class for table 'tblnz_casfdbk'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:05:28 NZDT 2020
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

public class tblnz_casfdbk extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fdtmReceived", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fdtmReceived = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRaisedBy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrRaisedBy = (String)value;
      }
    });
    setters.put("fstrCallerType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrCallerType = (String)value;
      }
    });
    setters.put("fstrLodgementMethod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrLodgementMethod = (String)value;
      }
    });
    setters.put("fstrRelatedTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrRelatedTo = (String)value;
      }
    });
    setters.put("fstrBriefDescrip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrBriefDescrip = (String)value;
      }
    });
    setters.put("fstrDetailsFdbk", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrDetailsFdbk = (String)value;
      }
    });
    setters.put("fstrActions", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrActions = (String)value;
      }
    });
    setters.put("fstrResolution", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrResolution = (String)value;
      }
    });
    setters.put("fstrLearningIdentified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrLearningIdentified = (String)value;
      }
    });
    setters.put("fstrDetailsLearning", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrDetailsLearning = (String)value;
      }
    });
    setters.put("fblnUpheld", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fblnUpheld = (Integer)value;
      }
    });
    setters.put("fblnNotUpheld", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fblnNotUpheld = (Integer)value;
      }
    });
    setters.put("fblnPartialUpheld", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fblnPartialUpheld = (Integer)value;
      }
    });
    setters.put("fstrName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrName = (String)value;
      }
    });
    setters.put("fstrEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrEmail = (String)value;
      }
    });
    setters.put("fstrAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrAddress = (String)value;
      }
    });
    setters.put("fstrPhone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrPhone = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_casfdbk.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_casfdbk() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_casfdbk with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private java.sql.Timestamp fdtmReceived;
  public java.sql.Timestamp get_fdtmReceived() {
    return fdtmReceived;
  }
  public void set_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
  }
  public tblnz_casfdbk with_fdtmReceived(java.sql.Timestamp fdtmReceived) {
    this.fdtmReceived = fdtmReceived;
    return this;
  }
  private String fstrRaisedBy;
  public String get_fstrRaisedBy() {
    return fstrRaisedBy;
  }
  public void set_fstrRaisedBy(String fstrRaisedBy) {
    this.fstrRaisedBy = fstrRaisedBy;
  }
  public tblnz_casfdbk with_fstrRaisedBy(String fstrRaisedBy) {
    this.fstrRaisedBy = fstrRaisedBy;
    return this;
  }
  private String fstrCallerType;
  public String get_fstrCallerType() {
    return fstrCallerType;
  }
  public void set_fstrCallerType(String fstrCallerType) {
    this.fstrCallerType = fstrCallerType;
  }
  public tblnz_casfdbk with_fstrCallerType(String fstrCallerType) {
    this.fstrCallerType = fstrCallerType;
    return this;
  }
  private String fstrLodgementMethod;
  public String get_fstrLodgementMethod() {
    return fstrLodgementMethod;
  }
  public void set_fstrLodgementMethod(String fstrLodgementMethod) {
    this.fstrLodgementMethod = fstrLodgementMethod;
  }
  public tblnz_casfdbk with_fstrLodgementMethod(String fstrLodgementMethod) {
    this.fstrLodgementMethod = fstrLodgementMethod;
    return this;
  }
  private String fstrRelatedTo;
  public String get_fstrRelatedTo() {
    return fstrRelatedTo;
  }
  public void set_fstrRelatedTo(String fstrRelatedTo) {
    this.fstrRelatedTo = fstrRelatedTo;
  }
  public tblnz_casfdbk with_fstrRelatedTo(String fstrRelatedTo) {
    this.fstrRelatedTo = fstrRelatedTo;
    return this;
  }
  private String fstrBriefDescrip;
  public String get_fstrBriefDescrip() {
    return fstrBriefDescrip;
  }
  public void set_fstrBriefDescrip(String fstrBriefDescrip) {
    this.fstrBriefDescrip = fstrBriefDescrip;
  }
  public tblnz_casfdbk with_fstrBriefDescrip(String fstrBriefDescrip) {
    this.fstrBriefDescrip = fstrBriefDescrip;
    return this;
  }
  private String fstrDetailsFdbk;
  public String get_fstrDetailsFdbk() {
    return fstrDetailsFdbk;
  }
  public void set_fstrDetailsFdbk(String fstrDetailsFdbk) {
    this.fstrDetailsFdbk = fstrDetailsFdbk;
  }
  public tblnz_casfdbk with_fstrDetailsFdbk(String fstrDetailsFdbk) {
    this.fstrDetailsFdbk = fstrDetailsFdbk;
    return this;
  }
  private String fstrActions;
  public String get_fstrActions() {
    return fstrActions;
  }
  public void set_fstrActions(String fstrActions) {
    this.fstrActions = fstrActions;
  }
  public tblnz_casfdbk with_fstrActions(String fstrActions) {
    this.fstrActions = fstrActions;
    return this;
  }
  private String fstrResolution;
  public String get_fstrResolution() {
    return fstrResolution;
  }
  public void set_fstrResolution(String fstrResolution) {
    this.fstrResolution = fstrResolution;
  }
  public tblnz_casfdbk with_fstrResolution(String fstrResolution) {
    this.fstrResolution = fstrResolution;
    return this;
  }
  private String fstrLearningIdentified;
  public String get_fstrLearningIdentified() {
    return fstrLearningIdentified;
  }
  public void set_fstrLearningIdentified(String fstrLearningIdentified) {
    this.fstrLearningIdentified = fstrLearningIdentified;
  }
  public tblnz_casfdbk with_fstrLearningIdentified(String fstrLearningIdentified) {
    this.fstrLearningIdentified = fstrLearningIdentified;
    return this;
  }
  private String fstrDetailsLearning;
  public String get_fstrDetailsLearning() {
    return fstrDetailsLearning;
  }
  public void set_fstrDetailsLearning(String fstrDetailsLearning) {
    this.fstrDetailsLearning = fstrDetailsLearning;
  }
  public tblnz_casfdbk with_fstrDetailsLearning(String fstrDetailsLearning) {
    this.fstrDetailsLearning = fstrDetailsLearning;
    return this;
  }
  private Integer fblnUpheld;
  public Integer get_fblnUpheld() {
    return fblnUpheld;
  }
  public void set_fblnUpheld(Integer fblnUpheld) {
    this.fblnUpheld = fblnUpheld;
  }
  public tblnz_casfdbk with_fblnUpheld(Integer fblnUpheld) {
    this.fblnUpheld = fblnUpheld;
    return this;
  }
  private Integer fblnNotUpheld;
  public Integer get_fblnNotUpheld() {
    return fblnNotUpheld;
  }
  public void set_fblnNotUpheld(Integer fblnNotUpheld) {
    this.fblnNotUpheld = fblnNotUpheld;
  }
  public tblnz_casfdbk with_fblnNotUpheld(Integer fblnNotUpheld) {
    this.fblnNotUpheld = fblnNotUpheld;
    return this;
  }
  private Integer fblnPartialUpheld;
  public Integer get_fblnPartialUpheld() {
    return fblnPartialUpheld;
  }
  public void set_fblnPartialUpheld(Integer fblnPartialUpheld) {
    this.fblnPartialUpheld = fblnPartialUpheld;
  }
  public tblnz_casfdbk with_fblnPartialUpheld(Integer fblnPartialUpheld) {
    this.fblnPartialUpheld = fblnPartialUpheld;
    return this;
  }
  private String fstrName;
  public String get_fstrName() {
    return fstrName;
  }
  public void set_fstrName(String fstrName) {
    this.fstrName = fstrName;
  }
  public tblnz_casfdbk with_fstrName(String fstrName) {
    this.fstrName = fstrName;
    return this;
  }
  private String fstrEmail;
  public String get_fstrEmail() {
    return fstrEmail;
  }
  public void set_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
  }
  public tblnz_casfdbk with_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
    return this;
  }
  private String fstrAddress;
  public String get_fstrAddress() {
    return fstrAddress;
  }
  public void set_fstrAddress(String fstrAddress) {
    this.fstrAddress = fstrAddress;
  }
  public tblnz_casfdbk with_fstrAddress(String fstrAddress) {
    this.fstrAddress = fstrAddress;
    return this;
  }
  private String fstrPhone;
  public String get_fstrPhone() {
    return fstrPhone;
  }
  public void set_fstrPhone(String fstrPhone) {
    this.fstrPhone = fstrPhone;
  }
  public tblnz_casfdbk with_fstrPhone(String fstrPhone) {
    this.fstrPhone = fstrPhone;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_casfdbk with_fstrWho(String fstrWho) {
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
  public tblnz_casfdbk with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_casfdbk)) {
      return false;
    }
    tblnz_casfdbk that = (tblnz_casfdbk) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fstrRaisedBy == null ? that.fstrRaisedBy == null : this.fstrRaisedBy.equals(that.fstrRaisedBy));
    equal = equal && (this.fstrCallerType == null ? that.fstrCallerType == null : this.fstrCallerType.equals(that.fstrCallerType));
    equal = equal && (this.fstrLodgementMethod == null ? that.fstrLodgementMethod == null : this.fstrLodgementMethod.equals(that.fstrLodgementMethod));
    equal = equal && (this.fstrRelatedTo == null ? that.fstrRelatedTo == null : this.fstrRelatedTo.equals(that.fstrRelatedTo));
    equal = equal && (this.fstrBriefDescrip == null ? that.fstrBriefDescrip == null : this.fstrBriefDescrip.equals(that.fstrBriefDescrip));
    equal = equal && (this.fstrDetailsFdbk == null ? that.fstrDetailsFdbk == null : this.fstrDetailsFdbk.equals(that.fstrDetailsFdbk));
    equal = equal && (this.fstrActions == null ? that.fstrActions == null : this.fstrActions.equals(that.fstrActions));
    equal = equal && (this.fstrResolution == null ? that.fstrResolution == null : this.fstrResolution.equals(that.fstrResolution));
    equal = equal && (this.fstrLearningIdentified == null ? that.fstrLearningIdentified == null : this.fstrLearningIdentified.equals(that.fstrLearningIdentified));
    equal = equal && (this.fstrDetailsLearning == null ? that.fstrDetailsLearning == null : this.fstrDetailsLearning.equals(that.fstrDetailsLearning));
    equal = equal && (this.fblnUpheld == null ? that.fblnUpheld == null : this.fblnUpheld.equals(that.fblnUpheld));
    equal = equal && (this.fblnNotUpheld == null ? that.fblnNotUpheld == null : this.fblnNotUpheld.equals(that.fblnNotUpheld));
    equal = equal && (this.fblnPartialUpheld == null ? that.fblnPartialUpheld == null : this.fblnPartialUpheld.equals(that.fblnPartialUpheld));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrAddress == null ? that.fstrAddress == null : this.fstrAddress.equals(that.fstrAddress));
    equal = equal && (this.fstrPhone == null ? that.fstrPhone == null : this.fstrPhone.equals(that.fstrPhone));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_casfdbk)) {
      return false;
    }
    tblnz_casfdbk that = (tblnz_casfdbk) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fdtmReceived == null ? that.fdtmReceived == null : this.fdtmReceived.equals(that.fdtmReceived));
    equal = equal && (this.fstrRaisedBy == null ? that.fstrRaisedBy == null : this.fstrRaisedBy.equals(that.fstrRaisedBy));
    equal = equal && (this.fstrCallerType == null ? that.fstrCallerType == null : this.fstrCallerType.equals(that.fstrCallerType));
    equal = equal && (this.fstrLodgementMethod == null ? that.fstrLodgementMethod == null : this.fstrLodgementMethod.equals(that.fstrLodgementMethod));
    equal = equal && (this.fstrRelatedTo == null ? that.fstrRelatedTo == null : this.fstrRelatedTo.equals(that.fstrRelatedTo));
    equal = equal && (this.fstrBriefDescrip == null ? that.fstrBriefDescrip == null : this.fstrBriefDescrip.equals(that.fstrBriefDescrip));
    equal = equal && (this.fstrDetailsFdbk == null ? that.fstrDetailsFdbk == null : this.fstrDetailsFdbk.equals(that.fstrDetailsFdbk));
    equal = equal && (this.fstrActions == null ? that.fstrActions == null : this.fstrActions.equals(that.fstrActions));
    equal = equal && (this.fstrResolution == null ? that.fstrResolution == null : this.fstrResolution.equals(that.fstrResolution));
    equal = equal && (this.fstrLearningIdentified == null ? that.fstrLearningIdentified == null : this.fstrLearningIdentified.equals(that.fstrLearningIdentified));
    equal = equal && (this.fstrDetailsLearning == null ? that.fstrDetailsLearning == null : this.fstrDetailsLearning.equals(that.fstrDetailsLearning));
    equal = equal && (this.fblnUpheld == null ? that.fblnUpheld == null : this.fblnUpheld.equals(that.fblnUpheld));
    equal = equal && (this.fblnNotUpheld == null ? that.fblnNotUpheld == null : this.fblnNotUpheld.equals(that.fblnNotUpheld));
    equal = equal && (this.fblnPartialUpheld == null ? that.fblnPartialUpheld == null : this.fblnPartialUpheld.equals(that.fblnPartialUpheld));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrAddress == null ? that.fstrAddress == null : this.fstrAddress.equals(that.fstrAddress));
    equal = equal && (this.fstrPhone == null ? that.fstrPhone == null : this.fstrPhone.equals(that.fstrPhone));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fstrRaisedBy = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrCallerType = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrLodgementMethod = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRelatedTo = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrBriefDescrip = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDetailsFdbk = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrActions = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrResolution = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrLearningIdentified = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrDetailsLearning = JdbcWritableBridge.readString(12, __dbResults);
    this.fblnUpheld = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnNotUpheld = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnPartialUpheld = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrAddress = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrPhone = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fdtmReceived = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.fstrRaisedBy = JdbcWritableBridge.readString(3, __dbResults);
    this.fstrCallerType = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrLodgementMethod = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRelatedTo = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrBriefDescrip = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrDetailsFdbk = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrActions = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrResolution = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrLearningIdentified = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrDetailsLearning = JdbcWritableBridge.readString(12, __dbResults);
    this.fblnUpheld = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnNotUpheld = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnPartialUpheld = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrAddress = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrPhone = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
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
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRaisedBy, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallerType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLodgementMethod, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRelatedTo, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBriefDescrip, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDetailsFdbk, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrActions, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResolution, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLearningIdentified, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDetailsLearning, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpheld, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNotUpheld, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPartialUpheld, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddress, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhone, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
    return 21;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReceived, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRaisedBy, 3 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCallerType, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLodgementMethod, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRelatedTo, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrBriefDescrip, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDetailsFdbk, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrActions, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResolution, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLearningIdentified, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDetailsLearning, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpheld, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNotUpheld, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPartialUpheld, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddress, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhone, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
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
        this.fdtmReceived = null;
    } else {
    this.fdtmReceived = new Timestamp(__dataIn.readLong());
    this.fdtmReceived.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRaisedBy = null;
    } else {
    this.fstrRaisedBy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCallerType = null;
    } else {
    this.fstrCallerType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLodgementMethod = null;
    } else {
    this.fstrLodgementMethod = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRelatedTo = null;
    } else {
    this.fstrRelatedTo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrBriefDescrip = null;
    } else {
    this.fstrBriefDescrip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDetailsFdbk = null;
    } else {
    this.fstrDetailsFdbk = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrActions = null;
    } else {
    this.fstrActions = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrResolution = null;
    } else {
    this.fstrResolution = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLearningIdentified = null;
    } else {
    this.fstrLearningIdentified = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDetailsLearning = null;
    } else {
    this.fstrDetailsLearning = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUpheld = null;
    } else {
    this.fblnUpheld = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNotUpheld = null;
    } else {
    this.fblnNotUpheld = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPartialUpheld = null;
    } else {
    this.fblnPartialUpheld = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrName = null;
    } else {
    this.fstrName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmail = null;
    } else {
    this.fstrEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddress = null;
    } else {
    this.fstrAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhone = null;
    } else {
    this.fstrPhone = Text.readString(__dataIn);
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
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fstrRaisedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRaisedBy);
    }
    if (null == this.fstrCallerType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallerType);
    }
    if (null == this.fstrLodgementMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLodgementMethod);
    }
    if (null == this.fstrRelatedTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRelatedTo);
    }
    if (null == this.fstrBriefDescrip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBriefDescrip);
    }
    if (null == this.fstrDetailsFdbk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDetailsFdbk);
    }
    if (null == this.fstrActions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActions);
    }
    if (null == this.fstrResolution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResolution);
    }
    if (null == this.fstrLearningIdentified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLearningIdentified);
    }
    if (null == this.fstrDetailsLearning) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDetailsLearning);
    }
    if (null == this.fblnUpheld) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpheld);
    }
    if (null == this.fblnNotUpheld) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNotUpheld);
    }
    if (null == this.fblnPartialUpheld) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPartialUpheld);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddress);
    }
    if (null == this.fstrPhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhone);
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
    if (null == this.fdtmReceived) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReceived.getTime());
    __dataOut.writeInt(this.fdtmReceived.getNanos());
    }
    if (null == this.fstrRaisedBy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRaisedBy);
    }
    if (null == this.fstrCallerType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCallerType);
    }
    if (null == this.fstrLodgementMethod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLodgementMethod);
    }
    if (null == this.fstrRelatedTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRelatedTo);
    }
    if (null == this.fstrBriefDescrip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrBriefDescrip);
    }
    if (null == this.fstrDetailsFdbk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDetailsFdbk);
    }
    if (null == this.fstrActions) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrActions);
    }
    if (null == this.fstrResolution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResolution);
    }
    if (null == this.fstrLearningIdentified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLearningIdentified);
    }
    if (null == this.fstrDetailsLearning) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDetailsLearning);
    }
    if (null == this.fblnUpheld) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpheld);
    }
    if (null == this.fblnNotUpheld) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNotUpheld);
    }
    if (null == this.fblnPartialUpheld) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPartialUpheld);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddress);
    }
    if (null == this.fstrPhone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhone);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRaisedBy==null?"\\N":fstrRaisedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallerType==null?"\\N":fstrCallerType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLodgementMethod==null?"\\N":fstrLodgementMethod, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRelatedTo==null?"\\N":fstrRelatedTo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBriefDescrip==null?"\\N":fstrBriefDescrip, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDetailsFdbk==null?"\\N":fstrDetailsFdbk, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActions==null?"\\N":fstrActions, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResolution==null?"\\N":fstrResolution, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLearningIdentified==null?"\\N":fstrLearningIdentified, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDetailsLearning==null?"\\N":fstrDetailsLearning, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpheld==null?"\\N":"" + fblnUpheld, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNotUpheld==null?"\\N":"" + fblnNotUpheld, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPartialUpheld==null?"\\N":"" + fblnPartialUpheld, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddress==null?"\\N":fstrAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhone==null?"\\N":fstrPhone, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReceived==null?"\\N":"" + fdtmReceived, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRaisedBy==null?"\\N":fstrRaisedBy, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCallerType==null?"\\N":fstrCallerType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLodgementMethod==null?"\\N":fstrLodgementMethod, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRelatedTo==null?"\\N":fstrRelatedTo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrBriefDescrip==null?"\\N":fstrBriefDescrip, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDetailsFdbk==null?"\\N":fstrDetailsFdbk, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrActions==null?"\\N":fstrActions, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResolution==null?"\\N":fstrResolution, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLearningIdentified==null?"\\N":fstrLearningIdentified, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDetailsLearning==null?"\\N":fstrDetailsLearning, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpheld==null?"\\N":"" + fblnUpheld, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNotUpheld==null?"\\N":"" + fblnNotUpheld, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPartialUpheld==null?"\\N":"" + fblnPartialUpheld, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddress==null?"\\N":fstrAddress, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhone==null?"\\N":fstrPhone, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRaisedBy = null; } else {
      this.fstrRaisedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCallerType = null; } else {
      this.fstrCallerType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLodgementMethod = null; } else {
      this.fstrLodgementMethod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRelatedTo = null; } else {
      this.fstrRelatedTo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBriefDescrip = null; } else {
      this.fstrBriefDescrip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDetailsFdbk = null; } else {
      this.fstrDetailsFdbk = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActions = null; } else {
      this.fstrActions = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResolution = null; } else {
      this.fstrResolution = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLearningIdentified = null; } else {
      this.fstrLearningIdentified = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDetailsLearning = null; } else {
      this.fstrDetailsLearning = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpheld = null; } else {
      this.fblnUpheld = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNotUpheld = null; } else {
      this.fblnNotUpheld = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPartialUpheld = null; } else {
      this.fblnPartialUpheld = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddress = null; } else {
      this.fstrAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhone = null; } else {
      this.fstrPhone = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReceived = null; } else {
      this.fdtmReceived = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRaisedBy = null; } else {
      this.fstrRaisedBy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCallerType = null; } else {
      this.fstrCallerType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLodgementMethod = null; } else {
      this.fstrLodgementMethod = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRelatedTo = null; } else {
      this.fstrRelatedTo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrBriefDescrip = null; } else {
      this.fstrBriefDescrip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDetailsFdbk = null; } else {
      this.fstrDetailsFdbk = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrActions = null; } else {
      this.fstrActions = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResolution = null; } else {
      this.fstrResolution = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLearningIdentified = null; } else {
      this.fstrLearningIdentified = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDetailsLearning = null; } else {
      this.fstrDetailsLearning = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpheld = null; } else {
      this.fblnUpheld = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNotUpheld = null; } else {
      this.fblnNotUpheld = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPartialUpheld = null; } else {
      this.fblnPartialUpheld = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddress = null; } else {
      this.fstrAddress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhone = null; } else {
      this.fstrPhone = __cur_str;
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
    tblnz_casfdbk o = (tblnz_casfdbk) super.clone();
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_casfdbk o) throws CloneNotSupportedException {
    o.fdtmReceived = (o.fdtmReceived != null) ? (java.sql.Timestamp) o.fdtmReceived.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fstrRaisedBy", this.fstrRaisedBy);
    __sqoop$field_map.put("fstrCallerType", this.fstrCallerType);
    __sqoop$field_map.put("fstrLodgementMethod", this.fstrLodgementMethod);
    __sqoop$field_map.put("fstrRelatedTo", this.fstrRelatedTo);
    __sqoop$field_map.put("fstrBriefDescrip", this.fstrBriefDescrip);
    __sqoop$field_map.put("fstrDetailsFdbk", this.fstrDetailsFdbk);
    __sqoop$field_map.put("fstrActions", this.fstrActions);
    __sqoop$field_map.put("fstrResolution", this.fstrResolution);
    __sqoop$field_map.put("fstrLearningIdentified", this.fstrLearningIdentified);
    __sqoop$field_map.put("fstrDetailsLearning", this.fstrDetailsLearning);
    __sqoop$field_map.put("fblnUpheld", this.fblnUpheld);
    __sqoop$field_map.put("fblnNotUpheld", this.fblnNotUpheld);
    __sqoop$field_map.put("fblnPartialUpheld", this.fblnPartialUpheld);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrAddress", this.fstrAddress);
    __sqoop$field_map.put("fstrPhone", this.fstrPhone);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fdtmReceived", this.fdtmReceived);
    __sqoop$field_map.put("fstrRaisedBy", this.fstrRaisedBy);
    __sqoop$field_map.put("fstrCallerType", this.fstrCallerType);
    __sqoop$field_map.put("fstrLodgementMethod", this.fstrLodgementMethod);
    __sqoop$field_map.put("fstrRelatedTo", this.fstrRelatedTo);
    __sqoop$field_map.put("fstrBriefDescrip", this.fstrBriefDescrip);
    __sqoop$field_map.put("fstrDetailsFdbk", this.fstrDetailsFdbk);
    __sqoop$field_map.put("fstrActions", this.fstrActions);
    __sqoop$field_map.put("fstrResolution", this.fstrResolution);
    __sqoop$field_map.put("fstrLearningIdentified", this.fstrLearningIdentified);
    __sqoop$field_map.put("fstrDetailsLearning", this.fstrDetailsLearning);
    __sqoop$field_map.put("fblnUpheld", this.fblnUpheld);
    __sqoop$field_map.put("fblnNotUpheld", this.fblnNotUpheld);
    __sqoop$field_map.put("fblnPartialUpheld", this.fblnPartialUpheld);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrAddress", this.fstrAddress);
    __sqoop$field_map.put("fstrPhone", this.fstrPhone);
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
