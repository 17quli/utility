// ORM class for table 'tblcontrolusageactionlog'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Dec 13 09:32:26 NZDT 2020
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

public class tblcontrolusageactionlog extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64ControlUsageActionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fi64ControlUsageActionKey = (Long)value;
      }
    });
    setters.put("fi64ControlUsageKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fi64ControlUsageKey = (Long)value;
      }
    });
    setters.put("flngSequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.flngSequence = (Integer)value;
      }
    });
    setters.put("fstrAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrAction = (String)value;
      }
    });
    setters.put("fdtmOccurred", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fdtmOccurred = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrSourceDoc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrSourceDoc = (String)value;
      }
    });
    setters.put("fstrSourceDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrSourceDocType = (String)value;
      }
    });
    setters.put("fintSourceDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fintSourceDocVer = (Integer)value;
      }
    });
    setters.put("fstrSourceView", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrSourceView = (String)value;
      }
    });
    setters.put("fstrSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrSource = (String)value;
      }
    });
    setters.put("flngSourceIndex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.flngSourceIndex = (Integer)value;
      }
    });
    setters.put("fstrSourceCaption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrSourceCaption = (String)value;
      }
    });
    setters.put("fstrDest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrDest = (String)value;
      }
    });
    setters.put("flngDestIndex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.flngDestIndex = (Integer)value;
      }
    });
    setters.put("fstrDestCaption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrDestCaption = (String)value;
      }
    });
    setters.put("flngDuration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.flngDuration = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontrolusageactionlog.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcontrolusageactionlog() {
    init0();
  }
  private Long fi64ControlUsageActionKey;
  public Long get_fi64ControlUsageActionKey() {
    return fi64ControlUsageActionKey;
  }
  public void set_fi64ControlUsageActionKey(Long fi64ControlUsageActionKey) {
    this.fi64ControlUsageActionKey = fi64ControlUsageActionKey;
  }
  public tblcontrolusageactionlog with_fi64ControlUsageActionKey(Long fi64ControlUsageActionKey) {
    this.fi64ControlUsageActionKey = fi64ControlUsageActionKey;
    return this;
  }
  private Long fi64ControlUsageKey;
  public Long get_fi64ControlUsageKey() {
    return fi64ControlUsageKey;
  }
  public void set_fi64ControlUsageKey(Long fi64ControlUsageKey) {
    this.fi64ControlUsageKey = fi64ControlUsageKey;
  }
  public tblcontrolusageactionlog with_fi64ControlUsageKey(Long fi64ControlUsageKey) {
    this.fi64ControlUsageKey = fi64ControlUsageKey;
    return this;
  }
  private Integer flngSequence;
  public Integer get_flngSequence() {
    return flngSequence;
  }
  public void set_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
  }
  public tblcontrolusageactionlog with_flngSequence(Integer flngSequence) {
    this.flngSequence = flngSequence;
    return this;
  }
  private String fstrAction;
  public String get_fstrAction() {
    return fstrAction;
  }
  public void set_fstrAction(String fstrAction) {
    this.fstrAction = fstrAction;
  }
  public tblcontrolusageactionlog with_fstrAction(String fstrAction) {
    this.fstrAction = fstrAction;
    return this;
  }
  private java.sql.Timestamp fdtmOccurred;
  public java.sql.Timestamp get_fdtmOccurred() {
    return fdtmOccurred;
  }
  public void set_fdtmOccurred(java.sql.Timestamp fdtmOccurred) {
    this.fdtmOccurred = fdtmOccurred;
  }
  public tblcontrolusageactionlog with_fdtmOccurred(java.sql.Timestamp fdtmOccurred) {
    this.fdtmOccurred = fdtmOccurred;
    return this;
  }
  private String fstrSourceDoc;
  public String get_fstrSourceDoc() {
    return fstrSourceDoc;
  }
  public void set_fstrSourceDoc(String fstrSourceDoc) {
    this.fstrSourceDoc = fstrSourceDoc;
  }
  public tblcontrolusageactionlog with_fstrSourceDoc(String fstrSourceDoc) {
    this.fstrSourceDoc = fstrSourceDoc;
    return this;
  }
  private String fstrSourceDocType;
  public String get_fstrSourceDocType() {
    return fstrSourceDocType;
  }
  public void set_fstrSourceDocType(String fstrSourceDocType) {
    this.fstrSourceDocType = fstrSourceDocType;
  }
  public tblcontrolusageactionlog with_fstrSourceDocType(String fstrSourceDocType) {
    this.fstrSourceDocType = fstrSourceDocType;
    return this;
  }
  private Integer fintSourceDocVer;
  public Integer get_fintSourceDocVer() {
    return fintSourceDocVer;
  }
  public void set_fintSourceDocVer(Integer fintSourceDocVer) {
    this.fintSourceDocVer = fintSourceDocVer;
  }
  public tblcontrolusageactionlog with_fintSourceDocVer(Integer fintSourceDocVer) {
    this.fintSourceDocVer = fintSourceDocVer;
    return this;
  }
  private String fstrSourceView;
  public String get_fstrSourceView() {
    return fstrSourceView;
  }
  public void set_fstrSourceView(String fstrSourceView) {
    this.fstrSourceView = fstrSourceView;
  }
  public tblcontrolusageactionlog with_fstrSourceView(String fstrSourceView) {
    this.fstrSourceView = fstrSourceView;
    return this;
  }
  private String fstrSource;
  public String get_fstrSource() {
    return fstrSource;
  }
  public void set_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
  }
  public tblcontrolusageactionlog with_fstrSource(String fstrSource) {
    this.fstrSource = fstrSource;
    return this;
  }
  private Integer flngSourceIndex;
  public Integer get_flngSourceIndex() {
    return flngSourceIndex;
  }
  public void set_flngSourceIndex(Integer flngSourceIndex) {
    this.flngSourceIndex = flngSourceIndex;
  }
  public tblcontrolusageactionlog with_flngSourceIndex(Integer flngSourceIndex) {
    this.flngSourceIndex = flngSourceIndex;
    return this;
  }
  private String fstrSourceCaption;
  public String get_fstrSourceCaption() {
    return fstrSourceCaption;
  }
  public void set_fstrSourceCaption(String fstrSourceCaption) {
    this.fstrSourceCaption = fstrSourceCaption;
  }
  public tblcontrolusageactionlog with_fstrSourceCaption(String fstrSourceCaption) {
    this.fstrSourceCaption = fstrSourceCaption;
    return this;
  }
  private String fstrDest;
  public String get_fstrDest() {
    return fstrDest;
  }
  public void set_fstrDest(String fstrDest) {
    this.fstrDest = fstrDest;
  }
  public tblcontrolusageactionlog with_fstrDest(String fstrDest) {
    this.fstrDest = fstrDest;
    return this;
  }
  private Integer flngDestIndex;
  public Integer get_flngDestIndex() {
    return flngDestIndex;
  }
  public void set_flngDestIndex(Integer flngDestIndex) {
    this.flngDestIndex = flngDestIndex;
  }
  public tblcontrolusageactionlog with_flngDestIndex(Integer flngDestIndex) {
    this.flngDestIndex = flngDestIndex;
    return this;
  }
  private String fstrDestCaption;
  public String get_fstrDestCaption() {
    return fstrDestCaption;
  }
  public void set_fstrDestCaption(String fstrDestCaption) {
    this.fstrDestCaption = fstrDestCaption;
  }
  public tblcontrolusageactionlog with_fstrDestCaption(String fstrDestCaption) {
    this.fstrDestCaption = fstrDestCaption;
    return this;
  }
  private Integer flngDuration;
  public Integer get_flngDuration() {
    return flngDuration;
  }
  public void set_flngDuration(Integer flngDuration) {
    this.flngDuration = flngDuration;
  }
  public tblcontrolusageactionlog with_flngDuration(Integer flngDuration) {
    this.flngDuration = flngDuration;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblcontrolusageactionlog with_fstrWho(String fstrWho) {
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
  public tblcontrolusageactionlog with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcontrolusageactionlog)) {
      return false;
    }
    tblcontrolusageactionlog that = (tblcontrolusageactionlog) o;
    boolean equal = true;
    equal = equal && (this.fi64ControlUsageActionKey == null ? that.fi64ControlUsageActionKey == null : this.fi64ControlUsageActionKey.equals(that.fi64ControlUsageActionKey));
    equal = equal && (this.fi64ControlUsageKey == null ? that.fi64ControlUsageKey == null : this.fi64ControlUsageKey.equals(that.fi64ControlUsageKey));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.fstrAction == null ? that.fstrAction == null : this.fstrAction.equals(that.fstrAction));
    equal = equal && (this.fdtmOccurred == null ? that.fdtmOccurred == null : this.fdtmOccurred.equals(that.fdtmOccurred));
    equal = equal && (this.fstrSourceDoc == null ? that.fstrSourceDoc == null : this.fstrSourceDoc.equals(that.fstrSourceDoc));
    equal = equal && (this.fstrSourceDocType == null ? that.fstrSourceDocType == null : this.fstrSourceDocType.equals(that.fstrSourceDocType));
    equal = equal && (this.fintSourceDocVer == null ? that.fintSourceDocVer == null : this.fintSourceDocVer.equals(that.fintSourceDocVer));
    equal = equal && (this.fstrSourceView == null ? that.fstrSourceView == null : this.fstrSourceView.equals(that.fstrSourceView));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.flngSourceIndex == null ? that.flngSourceIndex == null : this.flngSourceIndex.equals(that.flngSourceIndex));
    equal = equal && (this.fstrSourceCaption == null ? that.fstrSourceCaption == null : this.fstrSourceCaption.equals(that.fstrSourceCaption));
    equal = equal && (this.fstrDest == null ? that.fstrDest == null : this.fstrDest.equals(that.fstrDest));
    equal = equal && (this.flngDestIndex == null ? that.flngDestIndex == null : this.flngDestIndex.equals(that.flngDestIndex));
    equal = equal && (this.fstrDestCaption == null ? that.fstrDestCaption == null : this.fstrDestCaption.equals(that.fstrDestCaption));
    equal = equal && (this.flngDuration == null ? that.flngDuration == null : this.flngDuration.equals(that.flngDuration));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcontrolusageactionlog)) {
      return false;
    }
    tblcontrolusageactionlog that = (tblcontrolusageactionlog) o;
    boolean equal = true;
    equal = equal && (this.fi64ControlUsageActionKey == null ? that.fi64ControlUsageActionKey == null : this.fi64ControlUsageActionKey.equals(that.fi64ControlUsageActionKey));
    equal = equal && (this.fi64ControlUsageKey == null ? that.fi64ControlUsageKey == null : this.fi64ControlUsageKey.equals(that.fi64ControlUsageKey));
    equal = equal && (this.flngSequence == null ? that.flngSequence == null : this.flngSequence.equals(that.flngSequence));
    equal = equal && (this.fstrAction == null ? that.fstrAction == null : this.fstrAction.equals(that.fstrAction));
    equal = equal && (this.fdtmOccurred == null ? that.fdtmOccurred == null : this.fdtmOccurred.equals(that.fdtmOccurred));
    equal = equal && (this.fstrSourceDoc == null ? that.fstrSourceDoc == null : this.fstrSourceDoc.equals(that.fstrSourceDoc));
    equal = equal && (this.fstrSourceDocType == null ? that.fstrSourceDocType == null : this.fstrSourceDocType.equals(that.fstrSourceDocType));
    equal = equal && (this.fintSourceDocVer == null ? that.fintSourceDocVer == null : this.fintSourceDocVer.equals(that.fintSourceDocVer));
    equal = equal && (this.fstrSourceView == null ? that.fstrSourceView == null : this.fstrSourceView.equals(that.fstrSourceView));
    equal = equal && (this.fstrSource == null ? that.fstrSource == null : this.fstrSource.equals(that.fstrSource));
    equal = equal && (this.flngSourceIndex == null ? that.flngSourceIndex == null : this.flngSourceIndex.equals(that.flngSourceIndex));
    equal = equal && (this.fstrSourceCaption == null ? that.fstrSourceCaption == null : this.fstrSourceCaption.equals(that.fstrSourceCaption));
    equal = equal && (this.fstrDest == null ? that.fstrDest == null : this.fstrDest.equals(that.fstrDest));
    equal = equal && (this.flngDestIndex == null ? that.flngDestIndex == null : this.flngDestIndex.equals(that.flngDestIndex));
    equal = equal && (this.fstrDestCaption == null ? that.fstrDestCaption == null : this.fstrDestCaption.equals(that.fstrDestCaption));
    equal = equal && (this.flngDuration == null ? that.flngDuration == null : this.flngDuration.equals(that.flngDuration));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64ControlUsageActionKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ControlUsageKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAction = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmOccurred = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrSourceDoc = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrSourceDocType = JdbcWritableBridge.readString(7, __dbResults);
    this.fintSourceDocVer = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrSourceView = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(10, __dbResults);
    this.flngSourceIndex = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrSourceCaption = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrDest = JdbcWritableBridge.readString(13, __dbResults);
    this.flngDestIndex = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrDestCaption = JdbcWritableBridge.readString(15, __dbResults);
    this.flngDuration = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64ControlUsageActionKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.fi64ControlUsageKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.flngSequence = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrAction = JdbcWritableBridge.readString(4, __dbResults);
    this.fdtmOccurred = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.fstrSourceDoc = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrSourceDocType = JdbcWritableBridge.readString(7, __dbResults);
    this.fintSourceDocVer = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrSourceView = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrSource = JdbcWritableBridge.readString(10, __dbResults);
    this.flngSourceIndex = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrSourceCaption = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrDest = JdbcWritableBridge.readString(13, __dbResults);
    this.flngDestIndex = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrDestCaption = JdbcWritableBridge.readString(15, __dbResults);
    this.flngDuration = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(18, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64ControlUsageActionKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ControlUsageKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOccurred, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceDoc, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceDocType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSourceDocVer, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceView, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceIndex, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceCaption, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDest, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDestIndex, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestCaption, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDuration, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64ControlUsageActionKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64ControlUsageKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSequence, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAction, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmOccurred, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceDoc, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceDocType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSourceDocVer, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceView, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSource, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSourceIndex, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceCaption, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDest, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDestIndex, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDestCaption, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDuration, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 18 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64ControlUsageActionKey = null;
    } else {
    this.fi64ControlUsageActionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64ControlUsageKey = null;
    } else {
    this.fi64ControlUsageKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngSequence = null;
    } else {
    this.flngSequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAction = null;
    } else {
    this.fstrAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmOccurred = null;
    } else {
    this.fdtmOccurred = new Timestamp(__dataIn.readLong());
    this.fdtmOccurred.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceDoc = null;
    } else {
    this.fstrSourceDoc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceDocType = null;
    } else {
    this.fstrSourceDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintSourceDocVer = null;
    } else {
    this.fintSourceDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceView = null;
    } else {
    this.fstrSourceView = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSource = null;
    } else {
    this.fstrSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSourceIndex = null;
    } else {
    this.flngSourceIndex = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceCaption = null;
    } else {
    this.fstrSourceCaption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDest = null;
    } else {
    this.fstrDest = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngDestIndex = null;
    } else {
    this.flngDestIndex = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDestCaption = null;
    } else {
    this.fstrDestCaption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngDuration = null;
    } else {
    this.flngDuration = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64ControlUsageActionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ControlUsageActionKey);
    }
    if (null == this.fi64ControlUsageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ControlUsageKey);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.fstrAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction);
    }
    if (null == this.fdtmOccurred) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmOccurred.getTime());
    __dataOut.writeInt(this.fdtmOccurred.getNanos());
    }
    if (null == this.fstrSourceDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceDoc);
    }
    if (null == this.fstrSourceDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceDocType);
    }
    if (null == this.fintSourceDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSourceDocVer);
    }
    if (null == this.fstrSourceView) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceView);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.flngSourceIndex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceIndex);
    }
    if (null == this.fstrSourceCaption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceCaption);
    }
    if (null == this.fstrDest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDest);
    }
    if (null == this.flngDestIndex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDestIndex);
    }
    if (null == this.fstrDestCaption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestCaption);
    }
    if (null == this.flngDuration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDuration);
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
    if (null == this.fi64ControlUsageActionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ControlUsageActionKey);
    }
    if (null == this.fi64ControlUsageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ControlUsageKey);
    }
    if (null == this.flngSequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSequence);
    }
    if (null == this.fstrAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAction);
    }
    if (null == this.fdtmOccurred) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmOccurred.getTime());
    __dataOut.writeInt(this.fdtmOccurred.getNanos());
    }
    if (null == this.fstrSourceDoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceDoc);
    }
    if (null == this.fstrSourceDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceDocType);
    }
    if (null == this.fintSourceDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSourceDocVer);
    }
    if (null == this.fstrSourceView) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceView);
    }
    if (null == this.fstrSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSource);
    }
    if (null == this.flngSourceIndex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSourceIndex);
    }
    if (null == this.fstrSourceCaption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceCaption);
    }
    if (null == this.fstrDest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDest);
    }
    if (null == this.flngDestIndex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDestIndex);
    }
    if (null == this.fstrDestCaption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDestCaption);
    }
    if (null == this.flngDuration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDuration);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ControlUsageActionKey==null?"\\N":"" + fi64ControlUsageActionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ControlUsageKey==null?"\\N":"" + fi64ControlUsageKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction==null?"\\N":fstrAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmOccurred==null?"\\N":"" + fdtmOccurred, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceDoc==null?"\\N":fstrSourceDoc, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceDocType==null?"\\N":fstrSourceDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSourceDocVer==null?"\\N":"" + fintSourceDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceView==null?"\\N":fstrSourceView, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceIndex==null?"\\N":"" + flngSourceIndex, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceCaption==null?"\\N":fstrSourceCaption, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDest==null?"\\N":fstrDest, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDestIndex==null?"\\N":"" + flngDestIndex, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestCaption==null?"\\N":fstrDestCaption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDuration==null?"\\N":"" + flngDuration, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ControlUsageActionKey==null?"\\N":"" + fi64ControlUsageActionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ControlUsageKey==null?"\\N":"" + fi64ControlUsageKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSequence==null?"\\N":"" + flngSequence, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAction==null?"\\N":fstrAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmOccurred==null?"\\N":"" + fdtmOccurred, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceDoc==null?"\\N":fstrSourceDoc, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceDocType==null?"\\N":fstrSourceDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSourceDocVer==null?"\\N":"" + fintSourceDocVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceView==null?"\\N":fstrSourceView, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSource==null?"\\N":fstrSource, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSourceIndex==null?"\\N":"" + flngSourceIndex, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceCaption==null?"\\N":fstrSourceCaption, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDest==null?"\\N":fstrDest, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDestIndex==null?"\\N":"" + flngDestIndex, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDestCaption==null?"\\N":fstrDestCaption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDuration==null?"\\N":"" + flngDuration, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ControlUsageActionKey = null; } else {
      this.fi64ControlUsageActionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ControlUsageKey = null; } else {
      this.fi64ControlUsageKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAction = null; } else {
      this.fstrAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmOccurred = null; } else {
      this.fdtmOccurred = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceDoc = null; } else {
      this.fstrSourceDoc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceDocType = null; } else {
      this.fstrSourceDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSourceDocVer = null; } else {
      this.fintSourceDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceView = null; } else {
      this.fstrSourceView = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceIndex = null; } else {
      this.flngSourceIndex = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceCaption = null; } else {
      this.fstrSourceCaption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDest = null; } else {
      this.fstrDest = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDestIndex = null; } else {
      this.flngDestIndex = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestCaption = null; } else {
      this.fstrDestCaption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDuration = null; } else {
      this.flngDuration = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ControlUsageActionKey = null; } else {
      this.fi64ControlUsageActionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ControlUsageKey = null; } else {
      this.fi64ControlUsageKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrAction = null; } else {
      this.fstrAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmOccurred = null; } else {
      this.fdtmOccurred = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceDoc = null; } else {
      this.fstrSourceDoc = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceDocType = null; } else {
      this.fstrSourceDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSourceDocVer = null; } else {
      this.fintSourceDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceView = null; } else {
      this.fstrSourceView = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSourceIndex = null; } else {
      this.flngSourceIndex = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceCaption = null; } else {
      this.fstrSourceCaption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDest = null; } else {
      this.fstrDest = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDestIndex = null; } else {
      this.flngDestIndex = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDestCaption = null; } else {
      this.fstrDestCaption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDuration = null; } else {
      this.flngDuration = Integer.valueOf(__cur_str);
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
    tblcontrolusageactionlog o = (tblcontrolusageactionlog) super.clone();
    o.fdtmOccurred = (o.fdtmOccurred != null) ? (java.sql.Timestamp) o.fdtmOccurred.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcontrolusageactionlog o) throws CloneNotSupportedException {
    o.fdtmOccurred = (o.fdtmOccurred != null) ? (java.sql.Timestamp) o.fdtmOccurred.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64ControlUsageActionKey", this.fi64ControlUsageActionKey);
    __sqoop$field_map.put("fi64ControlUsageKey", this.fi64ControlUsageKey);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("fstrAction", this.fstrAction);
    __sqoop$field_map.put("fdtmOccurred", this.fdtmOccurred);
    __sqoop$field_map.put("fstrSourceDoc", this.fstrSourceDoc);
    __sqoop$field_map.put("fstrSourceDocType", this.fstrSourceDocType);
    __sqoop$field_map.put("fintSourceDocVer", this.fintSourceDocVer);
    __sqoop$field_map.put("fstrSourceView", this.fstrSourceView);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("flngSourceIndex", this.flngSourceIndex);
    __sqoop$field_map.put("fstrSourceCaption", this.fstrSourceCaption);
    __sqoop$field_map.put("fstrDest", this.fstrDest);
    __sqoop$field_map.put("flngDestIndex", this.flngDestIndex);
    __sqoop$field_map.put("fstrDestCaption", this.fstrDestCaption);
    __sqoop$field_map.put("flngDuration", this.flngDuration);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64ControlUsageActionKey", this.fi64ControlUsageActionKey);
    __sqoop$field_map.put("fi64ControlUsageKey", this.fi64ControlUsageKey);
    __sqoop$field_map.put("flngSequence", this.flngSequence);
    __sqoop$field_map.put("fstrAction", this.fstrAction);
    __sqoop$field_map.put("fdtmOccurred", this.fdtmOccurred);
    __sqoop$field_map.put("fstrSourceDoc", this.fstrSourceDoc);
    __sqoop$field_map.put("fstrSourceDocType", this.fstrSourceDocType);
    __sqoop$field_map.put("fintSourceDocVer", this.fintSourceDocVer);
    __sqoop$field_map.put("fstrSourceView", this.fstrSourceView);
    __sqoop$field_map.put("fstrSource", this.fstrSource);
    __sqoop$field_map.put("flngSourceIndex", this.flngSourceIndex);
    __sqoop$field_map.put("fstrSourceCaption", this.fstrSourceCaption);
    __sqoop$field_map.put("fstrDest", this.fstrDest);
    __sqoop$field_map.put("flngDestIndex", this.flngDestIndex);
    __sqoop$field_map.put("fstrDestCaption", this.fstrDestCaption);
    __sqoop$field_map.put("flngDuration", this.flngDuration);
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
